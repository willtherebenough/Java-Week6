//Kern Atherley PayRoll program


// PayrollSystemTest.java

// Employee hierarchy test program.

import java.util.Scanner;
 

public class PayrollSystemTest

{

   public static void main( String args[] )

   {


	int selectionNo,nOquitters; // used for switch selection
	String firstName;
	String lastName;
	String empSSN;
	
	double  empCommission, empSales, empSalary, empHours, empWage; // employee member objects
	Date BDay = new Date(); // used to store birthdate in the format 1/1/2000
	int month, day, year;
	final int emp1 = 1;
	final int emp2 = 2;
	final int emp3 = 3;
	final int emp4 = 4;
	Scanner input = new Scanner (System.in);
	
	Employee employees[] = new Employee[5];

	int i=0;
		





System.out.print("\tEnter 1 for Salaried Employee\n" + "\tEnter 2 for Commission Employee\n"
		+ "\tEnter 3 for Hourly Employee\n" + "\tEnter 4 for Base-Salaried Commision employee\n"
		+ "\n\n\tEnter -1 to quit:\n");
selectionNo = input.nextInt();



while (selectionNo != -1) // User can choose which category to enter Employee info for employee type
			  // or -1 to end the program
	{
	
		switch(selectionNo)
		
		{
			case(emp1):
				System.out.print("Enter Salaried employee's first name: ");
				firstName = input.next();

				System.out.print("Enter Salaried employee's last name: ");
				lastName = input.next();

				System.out.print("Enter employee's ssn (ex: 111-11-1111): ");
				empSSN = input.next();

				System.out.print("Enter employee's salary: $");
				empSalary = input.nextInt();

					
				System.out.print("Enter employee's birthdate: " + "\nMonth: ");
				month = input.nextInt();
				
				System.out.print("Day: ");
				day = input.nextInt();
		
				System.out.print("Year: ");
				year = input.nextInt();
				
				BDay = new Date(month,day,year);

				SalariedEmployee salariedEmployee =
        			new SalariedEmployee(firstName, lastName, empSSN, BDay, empSalary);
				
				employees[i] = salariedEmployee; i++;
				break;
			
			case(emp2):

			
				System.out.print("Enter Commission employee's first name: ");
				firstName = input.next();

				System.out.print("Enter Commission employee's last name: ");
				lastName = input.next();

				System.out.print("Enter employee's ssn (ex: 111-11-1111): ");
				empSSN = input.next();

				System.out.print("Enter employee Gross weekly sales: $");
				empSales= input.nextDouble();

				System.out.print("Enter commision: ");
				empCommission = input.nextDouble();

				System.out.print("Enter employee's birthdate: " + "\nMonth: ");
				month = input.nextInt();
				
				System.out.print("Day: ");
				day = input.nextInt();
		
				System.out.print("Year: ");
				year = input.nextInt();
				
				BDay = new Date(month,day,year);
	
				CommissionEmployee commissionEmployee =
			        new CommissionEmployee(firstName, lastName, empSSN, BDay, empSales, empCommission);
				
				employees[i] = commissionEmployee; i++;
				break;


			case(emp3):


			
				System.out.print("Enter Hourly employee's first name: ");
				firstName = input.next();

				System.out.print("Enter Hourly employee's last name: ");
				lastName = input.next();

				System.out.print("Enter employee's ssn (ex: 111-11-1111): ");
				empSSN = input.next();

				System.out.print("Enter employee hourly wage: $");
				empWage = input.nextDouble();

				System.out.print("Enter hours worked: ");
				empHours = input.nextInt();

				System.out.print("Enter employee's birthdate: " + "\nMonth: ");
				month = input.nextInt();
				
				System.out.print("Day: ");
				day = input.nextInt();
		
				System.out.print("Year: ");
				year = input.nextInt();
				
				BDay = new Date(month,day,year);

				HourlyEmployee hourlyEmployee =  
				new HourlyEmployee(firstName, lastName, empSSN, BDay, empWage, empHours);
				
				employees[i] = hourlyEmployee; i++;
				
				break;






			case(emp4):

				
				System.out.print("Enter Base Plus Commission employee's first name: ");
				firstName = input.next();

				System.out.print("Enter Base Plus Commission employee's last name: ");
				lastName = input.next();

				System.out.print("Enter employee's ssn (ex: 111-11-1111): ");
				empSSN = input.next();

				System.out.print("Enter employee Gross weekly Sales: $");
				empSales = input.nextInt();

				System.out.print("Enter commision: ");
				empCommission = input.nextDouble();
				
				System.out.print("Enter employee base weekly salary: ");
				empSalary=input.nextInt();

				System.out.print("Enter employee's birthdate: " + "\nMonth: ");
				month = input.nextInt();
				
				System.out.print("Day: ");
				day = input.nextInt();
		
				System.out.print("Year: ");
				year = input.nextInt();
				
				BDay = new Date(month,day,year);

				BasePlusCommissionEmployee basePlusCommissionEmployee = 
				new BasePlusCommissionEmployee(firstName, lastName, empSSN, BDay, empSales, empCommission, empSalary);
				
				employees[i] = basePlusCommissionEmployee; i++;	
				break;


			default:
				System.out.println("Invalid Entry");
				break;
	}

	{
	System.out.print("\tEnter 1 for Salaried Employee\n" + "\tEnter 2 for Commission Employee\n"
		+ "\tEnter 3 for Hourly Employee\n" + "\tEnter 4 for Base-Salaried Commision employee\n"
		+ "\n\n\tEnter -1 to quit:\n");
		selectionNo = input.nextInt();


	
	}
}





 

      System.out.println( "\nEmployees processed polymorphically:\n" );

	// generically process each element in array employees

	for ( Employee currentEmployee : employees )

	{

		System.out.println( currentEmployee ); // invokes toString

		// determine whether element is a SalariedEmployee

		if ( currentEmployee instanceof SalariedEmployee )

		{

		// downcast Employee reference to   

		// SalariedEmployee reference

			SalariedEmployee employee = ( SalariedEmployee ) currentEmployee;

			double oldBaseSalary = employee.getWeeklySalary();

			employee.setWeeklySalary( 4 * oldBaseSalary );

			System.out.printf("earned $%,.2f\n", employee.earnings() );

		} // end if

		// determine whether element is a HourlyEmployee

		
		if ( currentEmployee instanceof HourlyEmployee )

		{

			// downcast Employee reference to   
		
			// HourlyEmployee reference

			HourlyEmployee employee = ( HourlyEmployee ) currentEmployee;

			double oldBaseSalary = employee.getHours()*employee.getWage();

			employee.setWage(4 * oldBaseSalary );

			System.out.printf("earned $%,.2f\n", employee.getWage() );
		
		} // end if
		// determine whether element is a CommissionEmployee

		if ( currentEmployee instanceof CommissionEmployee )

		{

		// downcast Employee reference to   

		// CommissionEmployee reference

		CommissionEmployee employee = ( CommissionEmployee ) currentEmployee;

		double oldBaseSalary = employee.getGrossSales()*employee.getCommissionRate();

		employee.setGrossSales(4 * oldBaseSalary );

		System.out.printf("earned $%,.2f\n", employee.getGrossSales() );

		} // end if

		// determine whether element is a BasePlusCommissionEmployee

		if ( currentEmployee instanceof BasePlusCommissionEmployee )

		{

		// downcast Employee reference to   

		// BasePlusCommissionEmployee reference

		BasePlusCommissionEmployee employee = ( BasePlusCommissionEmployee ) currentEmployee;

		double oldBaseSalary = employee.getBaseSalary();

		employee.setBaseSalary(4 * oldBaseSalary );

		System.out.printf("new base salary with 10%% increase is: $%,.2f\n", employee.getBaseSalary() );

		System.out.printf("base earned $%,.2f\n", employee.earnings() );

		} // end if

		System.out.println();

	} // end for

	System.out.println();

	// get type name of each object in employees array

	for ( int j = 0; j < employees.length; j++ )

	System.out.printf( "Employee %d is a %s\n", j, employees[ j ].getClass().getName() );

	}// end main

}// end class PayrollSystemTest