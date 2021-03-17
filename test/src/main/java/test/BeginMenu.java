package test;
import java.util.Scanner;

public class BeginMenu {
	
	public void welcome(Scanner scanner) {
		System.out.println("Welcome to the family tree");
		System.out.println("Would you like to add a person or view the tree?");
		System.out.println("Type 'add' or 'view' or 'update'.");
		String welcome = scanner.nextLine();
		if (welcome.equals("add")) {
			CreatePersonPostgres create = new CreatePersonPostgres();
			create.register(scanner);
		} else if (welcome.equals("view")) {
			ViewTreePostgres view = new ViewTreePostgres();
			view.printPersons();			
		} else if (welcome.equals("update")) {
			UpdatePersonPostgres update = new UpdatePersonPostgres();
			update.update(scanner);		
		}else {
			System.out.println("We didn't quite get that please try again.");
			BeginMenu begin = new BeginMenu();
			begin.welcome(scanner);
		}				
	}
}
