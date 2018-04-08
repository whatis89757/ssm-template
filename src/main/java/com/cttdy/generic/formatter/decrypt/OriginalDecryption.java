package com.cttdy.generic.formatter.decrypt;


/**
 * 原始输出，数据未加密
 *
 * @author what
 */
public class OriginalDecryption implements Decryption {
    @Override
    public String decrypt(String data) {
        return data;
    }
}
