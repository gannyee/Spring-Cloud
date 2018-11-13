package com.gannyee.hello.spring.cloud.web.admin.feign.service.hystrix;

import com.gannyee.hello.spring.cloud.web.admin.feign.service.AdminService;
import org.springframework.stereotype.Component;


@Component
public class AdminServiceHystrix implements AdminService {
    @Override
    public String sayHi(String message) {
        return String.format("Hi your message is %s, bur request is bad", message);
    }
}
