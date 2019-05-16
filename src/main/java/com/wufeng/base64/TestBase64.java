package com.wufeng.base64;

import java.util.Base64;

/**
 * @Author wangkai
 * @CreateTime 2019-05-15 23:38
 **/
public class TestBase64 {
    public static void main(String[] args) {

//        encoder("8888");
//        System.out.println();


    }

    public static String decode(String Ciphertext) {
        Base64.Decoder decoder = Base64.getDecoder();
        byte[] contentOfByte = decoder.decode(Ciphertext.getBytes());
        return new String(contentOfByte);
    }

    public static String encoder(String clearText) {
        Base64.Encoder encoder = Base64.getEncoder();
        byte[] contentOfByte = clearText.getBytes();
        return encoder.encodeToString(contentOfByte);
    }




}
