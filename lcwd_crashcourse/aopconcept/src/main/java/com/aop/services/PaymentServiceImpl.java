package com.aop.services;

public class PaymentServiceImpl implements PaymentService {

	//This is JoinPoint for the Aspect
	public void makePayment() {
		System.out.println("Amount debited..");
		System.out.println("Amount credited..");
	}

	@Override
	public void makePayment(int amount) {
		System.out.println(amount + "Amount debited..");
		System.out.println(amount + "Amount credited..");
	}

}
