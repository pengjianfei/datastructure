package org.innerclass;

public class HelloWorldTest {
	private String name="zs";
	private UserInterface user = new UserInterface() {
		
		public void say() {
			System.out.println("hello world"+name);
			
		}
	};
	public void say() {
		user.say();
	}
	public static void main(String[] args) {
		
		 HelloWorldTest hello = new HelloWorldTest();
		 hello.say();
	}

}
