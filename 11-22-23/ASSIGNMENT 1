package week9;

import java.lang.Class;
import java.lang.reflect.*;

class Test {
		private String s;
	
	public Test() {
		this.s="Programming languages";
	}
	
	public void method1() {
		System.out.println(s);
	}
	public void method2(int n) {
		System.out.println(n);
	}
	public void method3() {
		System.out.println("Private method is invoked");
	}
}
	public class Ass1 {

	public static void main(String[] args) {
		Test test=new Test();
		Class cls = test.getClass();
		System.out.println("The name of the class is "+cls.getName());
		try {
			Constructor constructor = cls.getConstructor();
			System.out.println("The name of the constructor is "+constructor.getName());
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		} catch (SecurityException e) {
			e.printStackTrace();
		}
		
		Method[] methods = cls.getMethods();
		System.out.println(methods[0]);
		System.out.println(methods[1]);
		System.out.println(methods[2]);
		System.out.println(methods[3]);
		System.out.println(methods[4]);
		System.out.println(methods[5]);
		System.out.println(methods[6]);
		System.out.println(methods[7]);
		System.out.println(methods[8]);
		System.out.println(methods[9]);
	}

}
