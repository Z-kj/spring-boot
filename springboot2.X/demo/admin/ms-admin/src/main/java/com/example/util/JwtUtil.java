package com.example.util;

import io.jsonwebtoken.Jwts;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class JwtUtil {

    public static final String AUTHORIZATION_STARTER = "Senergy ";
    public static final String CLAIM_KEY_USERID = "userId";
    public static final String CLAIM_KEY_OPERATORID = "operatorId";

    public static final String CLAIM_KEY_PHONE = "phone";
    public static final String CLAIM_KEY_DATE = "date";
    public static final String CLAIM_KEY_TYPE = "type";
    public static final String CLAIM_KEY_BRAND = "brand";
    public static final String CLAIM_KEY_COMPANY = "company";
    public static final String CLAIM_REAL_NAME = "realName";
    public static final String SECRET = "ZXZnZWVr5b+r5LmQ5L2g55qE5Ye66KGM123";

    public static final String USER_NAME = "mas_user_name";
    public static final String USER_PHONE= "mas_user_phone";
    public static final String USER_ACCOUNT = "mas_user_account";
    public static final String USER_ID = "mas_user_id";
    public static final String ROLE_ID = "mas_role_id";
    public static final String ROLE_NAME = "mas_role_name";
    public static final String DATE = "mas_user_date";
//    public static String generateToken(String secret, String userId, String phone, String brand, String companyID) {
//        Date date = new Date();
//        return generateToken(secret, userId, phone, date.toString(), brand, companyID);
//    }

    public static String generateToken(String secret, String userId,String phone,String type) {
        Date date = new Date();
        return generateToken(secret, userId,phone, date.toString(),type);
    }

    public static String generateToken(String secret, String userId,String phone, String date,String type) {
        Map<String, Object> claims = new HashMap<>();
        claims.put(JwtUtil.CLAIM_KEY_USERID, userId);
        claims.put(JwtUtil.CLAIM_KEY_PHONE, phone);
        claims.put(JwtUtil.CLAIM_KEY_DATE, date);
        claims.put(JwtUtil.CLAIM_KEY_TYPE, type);
        System.out.println("type---------------" + type);
        return Jwts.builder()
                .setClaims(claims)
//                .setExpiration(date)
                .signWith(null, secret) //采用什么算法是可以自己选择的，不一定非要采用HS512
                .compact();
    }
}
