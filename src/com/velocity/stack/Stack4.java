package com.velocity.stack;

import java.util.Iterator;
import java.util.Stack;

public class Stack4 {

	public static void main(String[] args) {

		Stack<String> stack = new Stack<String>();
		stack.add("pune");
		stack.add("mumbai");
		// using for each loop
		for (String s : stack) {
			System.out.println(s);
		}
	}
}
