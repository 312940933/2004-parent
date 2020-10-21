package com.qf.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.qf.sevice.StuService;
import com.qf.sevice.StudentService;
import com.qf.student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class StudentController {
    @Autowired
    StudentService studentService;
    @Autowired
    StuService stuService;
    @RequestMapping("/findAll")
    //标注当前接口开启熔断，如果出现问题，走hyysticCommand中的fallbackMethod的方法。
    @HystrixCommand(fallbackMethod = "findAllFallBack")
    public List<student> findAll() {
       // int i=1/0;
        return studentService.findAll();
    }

    @RequestMapping("/findById")
    public student findById(@RequestBody Map map){
        Integer uid = (Integer)map.get("uid");
        student byId = studentService.findById(uid);
        return byId;
    }
    @RequestMapping("/delete")
    public String delete(@RequestBody Map map){
        Integer uid = (Integer)map.get("uid");
        String s = studentService.delete(uid);
        return s;
    }
    @RequestMapping("/addAndUpdate")
    public String addAndUpdate(@RequestBody student stu){
        String s = stuService.saveAndUpdateStudent(stu);
        return s;
    }

    public List<student> findAllFallBack(){
        System.out.println("进入了熔断方法，快速失败");
        return null;
    }

}
