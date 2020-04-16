package com.example.util;

import java.math.BigInteger;
import java.security.MessageDigest;

public class StringUtil {

    public static Boolean isEmpty(String str){
        if(null == str || 0 == str.length() || "null".equals(str)){
            return true;
        }
        return false;
    }

    public static String md5(String str){
        try {
            MessageDigest ms = MessageDigest.getInstance("MD5");
            ms.update(str.getBytes());
            return new BigInteger(1, ms.digest()).toString(16);
        }catch (Exception e){
            return null;
        }
    }
}
