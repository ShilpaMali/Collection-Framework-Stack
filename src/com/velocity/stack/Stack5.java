package com.velocity.stack;

import java.util.Stack;

public class Stack5 {

	// Design method which return stack object to that method
	public static Stack getStack() {
		Stack s1 = new Stack();
		s1.push("pune");
		s1.push(10);
		return s1;
	}

	public static void main(String[] args) {
		Stack s2 = getStack();
		System.out.println(s2);
	}
}
