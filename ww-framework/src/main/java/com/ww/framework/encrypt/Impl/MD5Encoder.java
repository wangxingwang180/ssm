package com.ww.framework.encrypt.Impl;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import com.ww.framework.encrypt.Encoder;

public class MD5Encoder implements Encoder {

	public String decrypt(String password, String key) {
		// 不支持该方法抛出UnsupportedOperationException异常
		throw new UnsupportedOperationException("Not supported the mehtod");
	}

	public String encrypt(String password, String salt) {
		
		throw new UnsupportedOperationException("Not supported the mehtod");
		
	}
	public static final String bytesToHexString(byte[] bArray) {
		StringBuffer sb = new StringBuffer(bArray.length);
		String sTemp;
		for (int i = 0; i < bArray.length; i++) {
			sTemp = Integer.toHexString(0xFF & bArray[i]);
			if (sTemp.length() < 2)
				sb.append(0);
			sb.append(sTemp.toUpperCase());
		}
		return sb.toString();
	}

	public String encrypt(String password) {
		String md5Str = "";
		try {
			MessageDigest messagedigest = MessageDigest.getInstance("MD5");
			messagedigest.update(password.getBytes());
			md5Str = bytesToHexString(messagedigest.digest());
		} catch (NoSuchAlgorithmException nosuchalgorithmexception) {
			nosuchalgorithmexception.printStackTrace();
		}
		return md5Str;
	}
	
	public static void main(String[] args) {
		System.out.println(new MD5Encoder().encrypt("root456465"));
	}
	
}