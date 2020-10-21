package com.qf.controller;

import com.netflix.appinfo.InstanceInfo;
import com.netflix.discovery.EurekaClient;
import com.qf.client.StudentClient;
import com.qf.student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Map;

@RestController
public class UserController {
    //接口直接调用 用Feign实现远程调用 feign是resttemplate（）和ribbon（负载均衡）的合成
    @Autowired
    StudentClient studentClient;

    @RequestMapping("/findAll")
    public List<student> findAll(){

        /*InstanceInfo nextServerFromEureka = eurekaClient.getNextServerFromEureka("2004-student", false);
        //获取地址和端口号
        String homePageUrl = nextServerFromEureka.getHomePageUrl();
        System.out.println(homePageUrl);
        String forObject = restTemplate.getForObject(homePageUrl+"findAll", String.class);*/

       /* String instanId = "2004-student";
        //远程调用购物车服务获取查询全部
        String forObject = restTemplate.getForObject("http://"+instanId+"/findAll", String.class);*/

        return studentClient.findAll();
    }
    @RequestMapping("/findById")
    public student findById(@RequestBody Map map){

       /* String instanId = "2004-student";
        String forObject = restTemplate.postForObject("http://"+instanId+"/findById",map,String.class);*/

        return studentClient.findById(map);
    }
    @RequestMapping("/delete")
    public String delete(@RequestBody Map map){
        /*String instanId = "2004-student";
        String forObject = restTemplate.postForObject("http://"+instanId+"/delete",map,String.class);*/
        return studentClient.delete(map);
    }
    @RequestMapping("/addAndUpdate")
    public String addAndUpdate(@RequestBody student stu){

       /* String serviceId = "2004-student";
        String s = restTemplate.postForObject("http://" + serviceId + "/addAndUpdate", stu, String.class);*/

        return studentClient.addAndUpdate(stu);
    }

}
