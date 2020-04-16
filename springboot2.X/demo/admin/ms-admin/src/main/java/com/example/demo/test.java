package com.example.demo;

import org.omg.Messaging.SYNC_WITH_TRANSPORT;
import sun.security.util.Length;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.List;

public class test {

    public static void main(String[] agr){
        try {

        MessageDigest ms = MessageDigest.getInstance("MD5");
        ms.update("123".getBytes());
            String string = new BigInteger(1, ms.digest()).toString(16);
            String strings = "202cb962ac59075b964b07152d234b70";
            System.out.println(string);
        }catch (Exception e){

        }
    }

}
