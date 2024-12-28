package com.velocity.stack;

import java.util.Iterator;
import java.util.Stack;

public class Stack3 {

	public static void main(String[] args) {

		Stack<String> stack = new Stack<String>();
		stack.add("pune");
		stack.add("mumbai");
		// using iterator
		Iterator<String> itr = stack.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		//System.out.println(stack);
	}
}
