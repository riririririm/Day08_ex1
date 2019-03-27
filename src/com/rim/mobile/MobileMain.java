package com.rim.mobile;

public class MobileMain {

	public static void main(String[] args) {
		PhoneView pv = new PhoneView();
		
		Phone phone = new Phone();
		Phone phone2 = new Phone();
		//phone.brand = "apple";
		pv.view(phone);
		pv.view(phone2);
		
		
		System.out.println();

	}

}
