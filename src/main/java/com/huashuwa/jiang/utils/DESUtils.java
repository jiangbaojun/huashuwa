package com.huashuwa.jiang.utils;

import java.security.*;
import javax.crypto.*;

/**
 * 类名称：	DESUtils  
 * 类描述：	DES加密工具类
 * 创建人：  	姜宝俊
 * 创建时间：	2017年7月22日 下午4:27:57  
 * 修改人：
 * 修改时间：
 * @version 1.0.0
 */
public class DESUtils {
	
	public static void main(String[] args) throws Exception {
		System.out.println(DESUtils.encryption("aaabbb123", "1234567890"));	//1J2gPXjjMYVBnwB4PCg6Fw^^
		System.out.println(DESUtils.decryption("1J2gPXjjMYVBnwB4PCg6Fw^^", "1234567890"));	//aaabbb123
	}
	
	static class Base64Utils {

		public static String encode(byte data[]) {
			char out[] = new char[((data.length + 2) / 3) * 4];
			int i = 0;
			for (int index = 0; i < data.length; index += 4) {
				boolean quad = false;
				boolean trip = false;
				int val = 255 & data[i];
				val <<= 8;
				if (i + 1 < data.length) {
					val |= 255 & data[i + 1];
					trip = true;
				}
				val <<= 8;
				if (i + 2 < data.length) {
					val |= 255 & data[i + 2];
					quad = true;
				}
				out[index + 3] = alphabet[quad ? val & 63 : 64];
				val >>= 6;
				out[index + 2] = alphabet[trip ? val & 63 : 64];
				val >>= 6;
				out[index + 1] = alphabet[val & 63];
				val >>= 6;
				out[index + 0] = alphabet[val & 63];
				i += 3;
			}

			return new String(out);
		}

		public static byte[] decode(char data[]) {
			int len = ((data.length + 3) / 4) * 3;
			if (data.length > 0 && data[data.length - 1] == '^')
				len--;
			if (data.length > 1 && data[data.length - 2] == '^')
				len--;
			byte out[] = new byte[len];
			int shift = 0;
			int accum = 0;
			int index = 0;
			for (int ix = 0; ix < data.length; ix++) {
				int value = codes[data[ix] & 255];
				if (value >= 0) {
					accum <<= 6;
					shift += 6;
					accum |= value;
					if (shift >= 8) {
						shift -= 8;
						out[index++] = (byte) (accum >> shift & 255);
					}
				}
			}

			if (index != out.length)
				throw new Error("miscalculated data length!");
			else
				return out;
		}

		private static char alphabet[] = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/^"
				.toCharArray();
		private static byte codes[];

		static {
			codes = new byte[256];
			for (int i = 0; i < 256; i++)
				codes[i] = -1;

			for (int i = 65; i <= 90; i++)
				codes[i] = (byte) (i - 65);

			for (int i = 97; i <= 122; i++)
				codes[i] = (byte) ((26 + i) - 97);

			for (int i = 48; i <= 57; i++)
				codes[i] = (byte) ((52 + i) - 48);

			codes[43] = 62;
			codes[47] = 63;
		}

		Base64Utils() {
		}
	}

	public DESUtils() {
	}

	public static String encryption(String plainData, String secretKey) throws Exception {
		Cipher cipher = null;
		try {
			cipher = Cipher.getInstance("DES");
			cipher.init(1, generateKey(secretKey));
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		} catch (NoSuchPaddingException e) {
			e.printStackTrace();
		} catch (InvalidKeyException invalidkeyexception) {
		}
		try {
			byte buf[] = cipher.doFinal(plainData.getBytes());
			return Base64Utils.encode(buf);
		} catch (IllegalBlockSizeException e) {
			e.printStackTrace();
			throw new Exception("IllegalBlockSizeException", e);
		} catch (BadPaddingException e) {
			e.printStackTrace();
			throw new Exception("BadPaddingException", e);
		}
	}

	public static String decryption(String secretData, String secretKey) throws Exception {
		Cipher cipher = null;
		try {
			cipher = Cipher.getInstance("DES");
			cipher.init(2, generateKey(secretKey));
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
			throw new Exception("NoSuchAlgorithmException", e);
		} catch (NoSuchPaddingException e) {
			e.printStackTrace();
			throw new Exception("NoSuchPaddingException", e);
		} catch (InvalidKeyException e) {
			e.printStackTrace();
			throw new Exception("InvalidKeyException", e);
		}
		try {
			byte buf[] = cipher.doFinal(Base64Utils.decode(secretData.toCharArray()));
			return new String(buf);
		} catch (IllegalBlockSizeException e) {
			e.printStackTrace();
			throw new Exception("IllegalBlockSizeException", e);
		} catch (BadPaddingException e) {
			e.printStackTrace();
			throw new Exception("BadPaddingException", e);
		}
	}

	private static SecretKey generateKey(String secretKey) throws NoSuchAlgorithmException {
		SecureRandom secureRandom = SecureRandom.getInstance("SHA1PRNG");
		secureRandom.setSeed(secretKey.getBytes());
		KeyGenerator kg = null;
		try {
			kg = KeyGenerator.getInstance("DES");
		} catch (NoSuchAlgorithmException nosuchalgorithmexception) {
		}
		kg.init(secureRandom);
		return kg.generateKey();
	}

	private static final String DES_ALGORITHM = "DES";
}