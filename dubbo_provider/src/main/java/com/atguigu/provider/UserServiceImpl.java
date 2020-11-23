package com.atguigu.provider;

import com.alibaba.dubbo.config.annotation.Service;
import com.atguigu.common.UserService;
import org.springframework.stereotype.Component;

/**
 * @author WZhaokang
 * @date 2020/11/23 18:16
 */
@Service  //将这个接口对外暴露让其访问
@Component
public class UserServiceImpl implements UserService {

    @Override
    public String sayHello(String name) {
        return "hello" + name;
    }
}
