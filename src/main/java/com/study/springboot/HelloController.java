package com.study.springboot;

import com.bean.Account;
import com.config.Student;
import com.config.TestConfig;
import com.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.UnsupportedEncodingException;

/**
 * HelloController
 *
 * @author jiajunkang
 * @version 1.0.0
 **/
@RestController
@EnableConfigurationProperties(Student.class)
//@PropertySource(value = "classpath:application.yml", ignoreResourceNotFound = true)
public class HelloController {

    @Autowired
    private Student student;
    @Autowired
    private AccountService accountService;

    @Autowired
    private TestConfig testConfig;
   // @Value("${name}")
    //private String servername;

    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }

    @RequestMapping("hello")
    public String hello() throws UnsupportedEncodingException {
        //System.out.println(new String(servername.getBytes("iso8859-1"),"utf-8"));
        System.out.println(student.getName());
        return testConfig.getAge()+"";
    }
    @RequestMapping("find")
    public Account find(int id){
        return accountService.findAccount(id);
    }
}
