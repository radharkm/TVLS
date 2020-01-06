package com.maaven.practice;

/**
 * CallingMethodsInSameClass!
 *
 */
public class App
{
	public static void main(String[] args) {
		printOne();
		printOne();
		printTwo();
	}

	public static void printOne() {
		System.out.println("Hello World");
	}

	public static void printTwo() {
		printOne();
		printOne();
	}
}