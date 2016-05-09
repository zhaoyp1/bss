package com.drpeng.modelCommon.util;

import java.util.UUID;

/**
 * @className: UuidUtil 
 * @description: UUID工具类
 * @author zhaoyp
 */
public class UuidUtil {

	public static String get32UUID() {
		String uuid = UUID.randomUUID().toString().trim().replaceAll("-", "");
		return uuid;
	}

	public static void main(String[] args) {
		System.out.println(get32UUID());
	}
}
