package com.zhang.utils;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class MessageDigestUtils {
    private MessageDigestUtils() {}

    /**
     * 加密。支持MD5和SHA
     * @param algorithm 加密类型，如MD5、SHA、SHA-256、SHA-512.
     * @param data 要加密的数据。是一个字节数组，不仅仅可加密字符串资源。
     * @param isUpperCase 是否将其中的十六进制符号转换成大写的。
     * @return 加密的字符串值
     */
    public static String encrypt(String algorithm, byte[] data, boolean isUpperCase) {
        MessageDigest messageDigest = null;
        StringBuilder sb = new StringBuilder();
        try {
            messageDigest = MessageDigest.getInstance(algorithm);
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
        byte[] encByte = messageDigest.digest(data);
        for (byte b : encByte) {
            int i = 0xff & b;
            if (i < 16) {
                sb.append("0");
            }
            sb.append(Integer.toHexString(i));
        }
        return isUpperCase ? sb.toString().toUpperCase() : sb.toString(); // 这样写，因为默认十六进制就是小写的
    }
}
