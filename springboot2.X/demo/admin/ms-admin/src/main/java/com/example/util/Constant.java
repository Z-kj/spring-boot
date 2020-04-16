package com.example.util;

public class Constant {

    /**
     * 数据请求返回码
     */
    public static final int RESCODE_SUCCESS = 1000;                //成功
    public static final int RESCODE_EXCEPTION = 1001;            //请求抛出异常
    public static final int RESCODE_NOLOGIN = 1002;                //未登陆状态
    public static final int RESCODE_NOEXIST = 1003;                //查询结果为空
    public static final int RESCODE_NOAUTH = 1004;                //无操作权限
    public static final int RESCODE_NOT_FOUND = 1005;                //未找到
    public static final int RESCODE_SERVER_ERROR = 1005;                //服务器错误
    public static final int RESCODE_CHARGE_ERROR = 1006;                //充电异常
}
