package com.cg.staticmembers;

public class UsingStatic {
	
	int varInstance;
	static int varStatic;
		
	public UsingStatic() {
		super();
		System.out.println("customer invoked");
	}
	public void methodx() {
		varInstance=7;
		varStatic=8;
		System.out.println("static: " +varStatic + "\nNon-static:" + varInstance);
		
	}
		public static void main(String[] args) {
			
		UsingStatic obj1 = new UsingStatic();
		obj1.varInstance=4;
		varStatic=5;
		System.out.println("static: " +varStatic + "\nNon-static:" + obj1.varInstance);
		
		
	}

}
