package com.techm.exceptions;


class Base {
	int value = 0;

	Base() 
	{
		addValue();
	}

	void addValue() {
		value += 10;
		System.out.println("value in constructor: " + value);
	}

	int getValue() {
		System.out.println("value in Base :" + value);
		return value;

	}
}

class Derived extends Base 
{
	Derived() 
	{
		addValue();
	}

	void addValue2() 
	{
		value += 20;
		System.out.println("value in derived :" + value);
	}

}
public class Overload_static_method4 {
	public static void main(String[] args) {
		Base b = new Derived();
		System.out.println(b.getValue());
	}
	
}
