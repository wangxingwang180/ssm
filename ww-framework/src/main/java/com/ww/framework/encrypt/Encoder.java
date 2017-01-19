package com.ww.framework.encrypt;

public interface Encoder {
	/**
	 * 默认密码
	 */
	public final static String DEFAULT_PASSWORD = "123456";

	/**
	 * 加密字符串
	 * 
	 * @param password 密码
	 * @return String
	 */
	public String encrypt(String password);

	/**
	 * 加密字符串
	 * 
	 * @param password 密码
	 * @param salt 盐值
	 * @return String
	 */
	public String encrypt(String password, String salt);

	/**
	 * 解密字符串
	 * 
	 * @param password 密码
	 * @param key 钥匙
	 * @return String
	 */
	public String decrypt(String password, String key);
}
