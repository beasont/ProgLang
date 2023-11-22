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
		System.out.println("Printing the result of method 1:");
Method methodCall1 = null;
		try {
			methodCall1 = cls.getDeclaredMethod("method1");
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			methodCall1.invoke(test);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Printing the result of method 2:");
Method methodCall2 = null;
		try {
			methodCall2 = cls.getDeclaredMethod("method2",int.class);
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			methodCall2.invoke(test, 15);
			System.out.println("Print the value of s:");
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
		Field field = cls.getDeclaredField("s");
		field.setAccessible(true);
		System.out.println(field.get(test));
		System.out.println("Print the changed value of s:");
		field.set(test,"JAVA");
		methodCall1.invoke(test);
		} catch (Exception e) {
			e.printStackTrace();
		}
	
		try {
System.out.println("Printing method 3:");
Method methodCall3=cls.getDeclaredMethod("method3");
methodCall3.setAccessible(true);
methodCall3.invoke(test);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
