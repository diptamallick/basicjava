package com.acc;

abstract class Human {
	
	int age;
	int weight;
	void respirate()
	{
		System.out.println("every human respirates");
	}

	void eat(){
		System.out.println("every human eats");
	}
	abstract void run();
}
