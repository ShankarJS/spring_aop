package com.aop.services;

public class PaymentServiceImpl implements PaymentService {

	public void makePayment() {
		// TODO Auto-generated method stub
		System.out.println("Amount debited..");

		System.out.println("Amount credited..");
	}

	@Override
	public void makePayment(int amount) {
		// TODO Auto-generated method stub

		System.out.println(amount + "Amount debited..");

		System.out.println(amount + "Amount credited..");

	}

}
