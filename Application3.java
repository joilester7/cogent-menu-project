import java.util.Scanner;

/**
 * 
 */

/**
 * @author: Joi
 * @date: Jan 11, 2023
 */
public class Application3 {
	public static void main(String[] args) {
		int choice = 0;
		Scanner sc = new Scanner(System.in);
		Employee emp[] = null;
		do {
			System.out.println("1 - Create a record");
			System.out.println("2 - Read all Records");
			System.out.println("3 - Update the record");
			System.out.println("4 - Delete the record");
			System.out.println("5 - Exit");
			System.out.println("Please enter your choice");
			choice = sc.nextInt();
			
			switch(choice) {
			case 1:
				System.out.println("How many records do you want to create?");
				int size = sc.nextInt();
				emp = new Employee[size];
				EmployeeDAO.create(emp, size);
				break;
			case 2:
				EmployeeDAO.read(emp);
				break;
			case 3:
				EmployeeDAO.update(emp);
				break;
			case 4:
				EmployeeDAO.delete(emp);
				break;
		}} while(choice != 5);
	}
}
