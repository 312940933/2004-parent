package com.qf.client;

import com.qf.student;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Map;
@FeignClient(serviceId = "2004-student",fallback = StudentFallBackMethod.class)
public interface StudentClient {
    @RequestMapping("/findAll")
    public List<student> findAll();

    @RequestMapping("/findById")
    public student findById(@RequestBody Map map);

    @RequestMapping("/delete")
    public String delete(@RequestBody Map map);

    @RequestMapping("/addAndUpdate")
    public String addAndUpdate(@RequestBody student stu);


}
