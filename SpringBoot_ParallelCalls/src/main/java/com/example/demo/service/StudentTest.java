package com.example.demo.service;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class StudentTest {

	@Async
	public void show1() throws InterruptedException {
		Thread.sleep(4000);
		System.out.println("Inside Student Test1 show1" + Thread.currentThread().getName());
	}

	@Async
	public void show2() throws InterruptedException {
		Thread.sleep(1000);
		System.out.println("Inside Student Test1 show2" + Thread.currentThread().getName());
	}

	@Async
	public void show3() throws InterruptedException {
		Thread.sleep(5000);
		System.out.println("Inside Student Test1 show3" + Thread.currentThread().getName());
	}

	@Async
	public void show4() throws InterruptedException {
		Thread.sleep(2000);
		System.out.println("Inside Student Test1 show4" + Thread.currentThread().getName());
	}
}
