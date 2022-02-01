package org.abstraction;

public class NonAbstract extends PartialAbstraction{

	private void users() {
System.out.println("USer output");
	}
	
	
	@Override
	public void bmethod() {
System.out.println(" B Method");		
	}

	@Override
	public void cmethod() {
System.out.println("C Method");		
	}

	public static void main(String[] args) {
		NonAbstract a=new NonAbstract();
		a.users();
		a.bmethod();
		a.cmethod();
		a.amethod();
	}
	
}
