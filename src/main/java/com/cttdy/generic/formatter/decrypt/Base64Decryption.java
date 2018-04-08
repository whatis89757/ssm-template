package com.cttdy.generic.formatter.decrypt;

import com.cttdy.generic.util.Base64Utils;
import com.cttdy.generic.util.Base64Utils;

import java.io.UnsupportedEncodingException;


/**
 * BASE64解密
 *
 * @author what
 */
public class Base64Decryption implements Decryption {
    @Override
    public String decrypt(String data) {
        if (data == null) {
            return null;
        } else {
            try {
                String result = new String(Base64Utils.decode(data, true), "UTF-8");
                return result;
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
                return data;
            }
        }
    }
}
