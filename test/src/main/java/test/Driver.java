package test;

import java.util.Scanner;

public class Driver {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		BeginMenu welcome = new BeginMenu();
		welcome.welcome(scanner);
		
		//Person person = new Person("jim","bob");
		//PersonPostgres p = new PersonPostgres();
		//p.createUser(person);
		//System.out.println(p.getIDByName("jim","bob"));
		
		
		//Person p = new Person("jim","bob");
		//System.out.println(p.getFirstName());
		//System.out.println(p.getLastName());
		
	}
	
	
}
