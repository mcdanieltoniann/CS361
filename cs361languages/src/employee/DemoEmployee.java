/**
 * 
 */
package employee;

/**
 * @author Toni-Ann McDaniel
 *
 */

// Resource: https://www.baeldung.com/java-type-casting

// Complete the provided code

public class DemoEmployee {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Employee emp1 = new Employee("John", "Smith", "123456790");

		PartTimeEmployee pEmp1 = new PartTimeEmployee("Jane", "Smith", "123456777", 17.5);

//		Employee emp2 = new Employee("Don", "Holmes", "123456799");

//		PartTimeEmployee pEmp2 = new PartTimeEmployee("Melissa", "Will", "123456666", 23.5);

		// Upcasting
		Employee emp3 = pEmp1;
		System.out.println("emp3");
		emp3.whoAmI();
		// TODO To complete
		// emp3.whoAmI() // prints ... because ...
		// emp3.whoAmI() prints "PART TIME EMPLOYEE" as the whoAmI() method defined in employee is overridden in PartTimeEmployee.
		// even though emp3 is declared as an Employee, it still refers to the object PartTimeEmployee because of the assignment Employee emp3 = pEmp1 (with pEmp1 being a PartTimeEmployee object)
		// so, the whoAmI() method in PartTimeEmployee is called instead of Employee as emp3 references the PartTimeEmployee object.
		// emp3.getHourlyRate(); // returns syntax error because ...
		// a syntax error is returned because even though emp3 refers to a PartTimeEmployee, the reference type of emp3 is Employee.
		// since Employee does not have a getHourlyRate() method, trying to call this method results in an error.

		// TODO To complete
		// Add the condition that test that emp3 is an instance of part time employee at
		// this time
		if (emp3 instanceof PartTimeEmployee) {
			System.out.println("emp3 instance of part time employee"); // printed
		} else {
			System.out.println("emp3 not instance of part time employee");
		}

		// Downcasting 1
		// TODO Uncomment and run the code
		PartTimeEmployee pEmp3 = (PartTimeEmployee) emp1;
		// TODO To complete
		// This instruction compiles
		// This instruction returns a ClassCastException at run time
		// because emp1 is not an instance of PartTimeEmployee. It cannot be downcast to PartTimeEmployee because it is an instance of Employee.

		// Downcasting 2
		// Requires the use of intanceof to avoid a run time cast exception
		// TODO Look at the solution below
		if (emp3 instanceof PartTimeEmployee) {
			System.out.println("emp3 instance of part time employee"); // printed
			PartTimeEmployee pEmp4 = (PartTimeEmployee) emp3; // cast required
			System.out.println(pEmp4.getHourlyRate());
		} else {
			System.out.println("emp3 not instance of part time employee");
		}
	}
}
