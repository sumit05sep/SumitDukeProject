package com.ojas.util;

import java.util.Random;

public class AccountNumberGenerated {

	public static String acccountNumGenerator() {

		Random rand = new Random();

		int rand_int1 = rand.nextInt(1000);

		String accountnumber = "87634551" + rand_int1;

		if (accountnumber.length() == 11) {

			return accountnumber;

		} else {

			acccountNumGenerator();
		}

		return accountnumber;
	}

}
