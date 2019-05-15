package com.wufeng.base64;

import java.util.Base64;

/**
 * @Author wangkai
 * @CreateTime 2019-05-15 23:38
 **/
public class TestBase64 {
    public static void main(String[] args) {
//        Base64.Decoder decoder = Base64.getDecoder();
        Base64.Encoder encoder = Base64.getEncoder();
        byte[] contentOfByte = "8888".getBytes();
        String temp = encoder.encodeToString(contentOfByte);
        System.out.println(temp);
    }
}
