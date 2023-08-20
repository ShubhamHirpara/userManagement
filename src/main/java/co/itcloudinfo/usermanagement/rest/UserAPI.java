package co.itcloudinfo.usermanagement.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserAPI {

    @GetMapping("/get")
    public String getUser(){
        return "Shubham Hirpara";
    }
}
