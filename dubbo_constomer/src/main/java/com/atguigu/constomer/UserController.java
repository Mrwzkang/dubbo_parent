package com.atguigu.constomer;

import com.alibaba.dubbo.config.annotation.Reference;
import com.atguigu.common.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author WZhaokang
 * @date 2020/11/23 18:29
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Reference
    private UserService userService;

    @GetMapping("{name}")
    public String  getName(@PathVariable String name){
        String username = userService.sayHello("zhangsan");
        return username;
    }
}
