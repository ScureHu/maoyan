package com.huruilei.user.api;

import com.huruilei.user.vo.UserInfoModel;
import com.huruilei.user.vo.UserModel;

/**
 * @author: huruilei
 * @date: 2020/5/26
 * @description:
 * @return
 */
public interface UserAPI {

    int login(String username,String password);

    boolean register(UserModel userModel);

    boolean checkUsername(String username);

    UserInfoModel getUserInfo(int uuid);

    UserInfoModel updateUserInfo(UserInfoModel userInfoModel);

}
