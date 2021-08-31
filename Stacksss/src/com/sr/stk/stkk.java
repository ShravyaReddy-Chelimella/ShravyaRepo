package com.sr.stk;

public class stkk {
	private int data[];
	private int t;
	public static final int SZ=6;
	public stkk() {
		data=new int[SZ];
		for(int i=0;i<SZ;i++) {
			data[i]=-1;
		}
		t=-1;
	}
	public void push(int el) {
		data[++t]=el;
	}
	public int pop() {
		int td=data[t];
		data[t]=-1;
		t-=1;
		return td;
	}
	public boolean isFull() {
		if(t==SZ-1) {
			return true;
		}
		return false;
		
	}
	public boolean isEmpty() {
		if(t==-1) {
			return true;
		}
		return false;
	}
	public int peek() {
		return data[t];
	}
	public void printst() {
		for(int info:data) {
			System.out.print(" "+info);
		}
		System.out.println("==>"+t);
	}

}
