package test;
import java.util.Scanner;

public class CreatePersonPostgres {

	public void register(Scanner scanner) {

		//log.info("Registering user");
		System.out.println("Creating a Person");
		System.out.println("Enter the first name");
		String firstname = scanner.next();
		System.out.println("Enter the last name");
		String lastname = scanner.next();
				
		System.out.println("Enter your fathers first name");
		String fatherfirstname = scanner.next();
		//System.out.println("Enter your fathers last name");
		//String fatherlastname = scanner.next();
		System.out.println("Enter your mothers first name");
		String motherfirstname = scanner.next();
		//System.out.println("Enter your mothers last name");		
		//String motherlastname = scanner.next();
			
		PersonPostgres userPost = new PersonPostgres();	
		
		Person father = new Person(fatherfirstname,lastname);	
		Person mother = new Person(motherfirstname,lastname);
		
		if (userPost.getPersonByName(fatherfirstname,lastname)==null) {				
			userPost.createPerson(father);
		}
		if (userPost.getPersonByName(motherfirstname,lastname)==null) {				
			userPost.createPerson(mother);
		}
		
		Person person = new Person(firstname,lastname,userPost.getIDByName(fatherfirstname, lastname),userPost.getIDByName(motherfirstname, lastname));	
		//Person person = new Person(firstname,lastname);
		
		try {
			if (userPost.getPersonByName(firstname,lastname)==null) {				
				userPost.createPerson(person);
				Menu menu = new Menu();		
				menu.menu(person,scanner);
			}else {
				//log.info("User not available");
				System.out.println("That name is already entered please enter a different one");
				CreatePersonPostgres create = new CreatePersonPostgres();
				create.register(scanner);	
			}
		} catch (PersonNotFound e1) {
			// TODO Auto-generated catch block
		}
					
		}
	}

