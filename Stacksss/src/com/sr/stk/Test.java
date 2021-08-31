package com.sr.stk;
import com.sr.stk.stkk;
public class Test {
	public static void main(String[] args) {
		stkk stk=new stkk();
		int el=10;
		stk.printst();
		while(!stk.isFull()) {
			stk.push(el);
			el+=10;
			stk.printst();
		}
		while(!stk.isEmpty()) {
			stk.pop();
			stk.printst();
		}
	}

}
