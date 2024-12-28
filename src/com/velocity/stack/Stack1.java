package com.velocity.stack;

import java.util.Stack;

public class Stack1 {

	public static void main(String[] args) {

		Stack stack = new Stack();
		stack.add("pune");
		stack.add("mumbai");
		stack.push("bangalore");
		stack.add("pune");
		stack.add(10);
		stack.add(null);
		// 1st way
		System.out.println(stack);
	}
}
