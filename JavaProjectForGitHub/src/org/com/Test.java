package org.com;

public class Test {
public static void main(String[] args) {
	String s="Welcome";
	String a="Welcome";
	String s1 =new String("Welcome");
	String s2 =new String("Welcome");
	
	System.out.println(System.identityHashCode(s));
	System.out.println(System.identityHashCode(a));
	System.out.println("Non literal String");
	System.out.println(System.identityHashCode(s1));
	System.out.println(System.identityHashCode(s2));
	System.out.println("Concadination");
	System.out.println(System.identityHashCode(s1.concat(s2)));

	
	System.out.println(System.identityHashCode(s2));
	System.out.println("Concadination");
	System.out.println(System.identityHashCode(s1.concat(s2)));
	
	System.out.println(System.identityHashCode(s2));
	System.out.println("Concadination");
	System.out.println(System.identityHashCode(s1.concat(s2)));
	
	System.out.println(System.identityHashCode(s2));
	System.out.println("Concadination");
	System.out.println(System.identityHashCode(s1.concat(s2)));





	System.out.println(System.identityHashCode(s));
	System.out.println(System.identityHashCode(a));
	System.out.println("Non literal String");
	System.out.println(System.identityHashCode(s1));
	System.out.println(System.identityHashCode(s2));
	System.out.println("Concadination");
	System.out.println(System.identityHashCode(s1.concat(s2)));

	
	System.out.println(System.identityHashCode(s2));
	System.out.println("Concadination");
	System.out.println(System.identityHashCode(s1.concat(s2)));
	
	System.out.println(System.identityHashCode(s2));
	System.out.println("Concadination");
	System.out.println(System.identityHashCode(s1.concat(s2)));
	
	System.out.println(System.identityHashCode(s2));
	System.out.println("Concadination");
	System.out.println(System.identityHashCode(s1.concat(s2)));







}
}
