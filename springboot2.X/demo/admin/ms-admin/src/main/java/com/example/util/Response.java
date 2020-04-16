package com.example.util;

public class Response {

    public static CommonResponse ssucceed() {
        CommonResponse res = new CommonResponse();
        res.setCode(Constant.RESCODE_SUCCESS);
        res.setMsg("请求成功");
        return res;
    }

    public static CommonResponse ssucceed(String msg) {
        CommonResponse res = new CommonResponse();
        res.setCode(Constant.RESCODE_SUCCESS);
        res.setMsg(msg);
        return res;
    }

    public static CommonResponse ssucceed(Object obj) {
        CommonResponse res = new CommonResponse();
        res.setCode(Constant.RESCODE_SUCCESS);
        res.setMsg("请求成功");
        res.setDada(obj);
        return res;
    }

    public static CommonResponse exception(String msg) {
        CommonResponse res = new CommonResponse();
        res.setCode(Constant.RESCODE_EXCEPTION);
        res.setMsg(msg);
        return res;
    }
}
