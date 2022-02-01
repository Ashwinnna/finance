package org.abstraction;

public class SecondClass implements FullyAbstraction {

	private void user() {
System.out.println("User Output");
	}

	@Override
	public void login() {
System.out.println("Login ID");		
	}

	@Override
	public void password() {
System.out.println("Password to be");		
	}
public static void main(String[] args) {
	SecondClass a=new SecondClass();
	a.login();a.password();a.user();
}	
}
