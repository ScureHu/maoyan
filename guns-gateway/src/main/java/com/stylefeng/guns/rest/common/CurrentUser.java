package com.stylefeng.guns.rest.common;

/**
 * @author: huruilei
 * @date: 2020/5/29
 * @description:
 * @return
 */
public class CurrentUser {
    //线程绑定存储空间
    private static final ThreadLocal<String> threadLocal = new ThreadLocal<>();

    public static void saveUserId(String userId){
        threadLocal.set(userId);
    }

    public static String getCurrentUser(){
        return threadLocal.get();
    }
}
