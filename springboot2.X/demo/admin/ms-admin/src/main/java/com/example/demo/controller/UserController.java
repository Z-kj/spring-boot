package com.example.demo.controller;

import com.example.demo.entity.User;
import com.example.demo.mapper.UserMapper;
import com.example.demo.service.userService;
import com.example.util.CommonResponse;
import com.example.util.Response;
import com.example.util.StringUtil;
import com.example.util.TokenUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;

@Controller
@RequestMapping("/userApi/userController")
public class UserController {

    @Autowired
    userService userService;
    @Autowired
    UserMapper userMapper;

    @RequestMapping(value = "/adminLogin")
    @ResponseBody
    public CommonResponse login(String userPhone, String password) {
        HashMap<String , Object> token = new HashMap<>();
        if (StringUtil.isEmpty(userPhone)) {
            return Response.ssucceed("登录失败 ， 账号不能为空");
        }
        if (StringUtil.isEmpty(password)) {
            return Response.ssucceed("登录失败， 密码不能为空");
        }
        try {
            User user = new User();
            user.setUserPhone(userPhone);
            user.setPassword(StringUtil.md5(password));
            User selectOne = userMapper.selectOne(user);
            if(null == selectOne){
                return Response.ssucceed("登录失败 ， 账号或密码有误!");
            }
            token.put("userId" , selectOne.getId());
            token.put("userPhone" , selectOne.getUserPhone());
            String creatToken = TokenUtil.creatToken(token);
            return Response.ssucceed();
        }catch (Exception e){
            return Response.exception(e.getMessage());
        }
    }

}
