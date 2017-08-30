package com.ojas.util;

import java.util.UUID;

public class UniquePassword {

	public  static String generateUniquePwd() {

		UUID ob = UUID.randomUUID();
		String s = ob.toString();
		String ss = s.substring(0, 8);

		return ss;
	}
	
}
