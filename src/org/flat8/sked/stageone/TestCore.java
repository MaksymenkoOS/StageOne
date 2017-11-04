package org.flat8.sked.stageone;

import static org.flat8.sked.stageone.TestCore2.*;

public class TestCore {
	private int a = 5;
	private static int b = 100;
	{
		a = -5;
		System.out.println("Logical block");
	}
	public TestCore(){
		a = 10;
		System.out.println("Constructor");
	}
	static {
		System.out.println("Static block");
	}

	public static void main(String[] args) {
		System.out.println("Main");
		TestCore obj = new TestCore();
		System.out.println("a="+obj.a);
	}

}
