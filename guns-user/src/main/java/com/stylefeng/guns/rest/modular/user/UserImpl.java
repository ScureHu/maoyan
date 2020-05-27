package com.stylefeng.guns.rest.modular.user;

import com.alibaba.dubbo.config.annotation.Service;
import com.huruilei.api.UserAPI;
import org.springframework.stereotype.Component;
/**
 * @author: huruilei
 * @date: 2020/5/26
 * @description:
 * @return
 */
@Component
@Service(interfaceClass = UserAPI.class)
public class UserImpl implements UserAPI{
    @Override
    public boolean login(String username, String password) {
        System.out.println("username: "+username+";password: "+password);
        return false;
    }
}
