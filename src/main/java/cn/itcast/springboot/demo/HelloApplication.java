package cn.itcast.springboot.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by asus on 2017/11/17.
 */
@Controller
@SpringBootApplication
public class HelloApplication {
    @RequestMapping("hello")
    @ResponseBody
    public String hello() {
        return "hello springboot";
    }

    public static void main(String[] args) {
        SpringApplication.run(HelloApplication.class, args);
    }
}


