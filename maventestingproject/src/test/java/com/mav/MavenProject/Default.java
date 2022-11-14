package com.mav.MavenProject;

interface message {

	default void say() {
		System.out.println("Hello, this is default method");
	}

	void say1(String s);
}

public class Default implements message {
	public void say1(String s) {
		System.out.println(s);
	}

	public static void main(String[] args) {
		Default d = new Default();
		d.say();
		d.say1("Hello, this is normal method");
	}

}
