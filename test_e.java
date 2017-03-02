package test;



public class c {
	 public static void main(String[] args) { 
		    B b = new B();
	 }
}

		 class A {
			  public A() {
			    System.out.println(
			      "The default constructor of A is invoked");
			  }
			}
			class B extends A {
			  public B() {
			    System.out.println(
			      "The default constructor of B is invoked");
			  }
			}
