import java.util.Scanner;

/**
 * 
 */

/**
 * @author: Joi
 * @date: Jan 11, 2023
 */
public class EmployeeDAO {
	public static void create(Employee emp[], int size) {
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < emp.length; i++) {
			Employee emp1 = new Employee();
			System.out.println("Please enter employee number");
			int empNo = sc.nextInt();
			System.out.println("Please enter employee name");
			String empName = sc.next();
			System.out.println("Please enter employee salary");
			double sal = sc.nextDouble();
			emp1.setEmployeeNo(empNo);
			emp1.setEmployeeName(empName);
			emp1.setEmployeeSalary(sal);
			emp[i] = emp1;
		}
		System.out.println("Record created successfully");
	}
	
	public static void read(Employee emp[]) {
		for(int i = 0; i < emp.length; i++) {
			Employee emp1 = emp[i];
			System.out.println("Employee number is: " + emp1.getEmployeeNo());
			System.out.println("Employee name is: " + emp1.getEmployeeName());
			System.out.println("Employee salary is: " + emp1.getEmployeeSalary());
			System.out.println();
		}
	}
	
	public static void update(Employee emp[]) {
		Scanner sc = new Scanner(System.in);
		Employee emp1 = new Employee();
		System.out.println("Please enter employee number");
		int no = sc.nextInt();
		for(int i = 0; i < emp.length; i++) {
			if(no == emp[i].getEmployeeNo()) {
				System.out.println("1 - Update name");
				System.out.println("2 - Update salary");
				int n = sc.nextInt();
				switch(n) {
				case 1:
					System.out.println("Please enter Employee name:");
					String name = sc.next();
					emp1.setEmployeeName(name);
					break;
				case 2:
					System.out.println("Please enter Employee name:");
					double salary = sc.nextDouble();
					emp1.setEmployeeSalary(salary);
					emp[i] = emp1;
					break;
				}
			}
		}
		
		
	}
	
	public static void delete(Employee emp[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter Employee number you want to delete");
		int number = sc.nextInt();
		for(int i = 0; i < emp.length; i++) {
			if(number == emp[i].getEmployeeNo()) {
				emp[i].employeeName = null;
				emp[i].employeeSalary = 0.0;
			}
		}
	}
}
