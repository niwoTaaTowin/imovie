package com.imovie.common.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SysNoUtil {

	private static SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmssSSS");

	public static String getSysNo(){
		Long timeMillis = System.currentTimeMillis();
        return simpleDateFormat.format(new Date(timeMillis))+(int) ((Math.random()*9+1) * 10000);
	}
		
}
