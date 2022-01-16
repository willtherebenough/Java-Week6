// PayrollSystemTest.java

// Employee hierarchy test program.

import java.util.Scanner;
 

public class KDAPayrollSystemTest

{

   public static void main( String args[] )

   {


	int selectionNo,nOquitters;
	String firstName, SurName, empSSN;
	int empSal, empBirthDate;
	final int emp1 = 1;
	final int emp2 = 2;
	final int emp3 = 3;
	final int emp4 = 4;
	Scanner input = new Scanner (System.in);
		

      // create subclass objects

      SalariedEmployee salariedEmployee =

         new SalariedEmployee();

      HourlyEmployee hourlyEmployee =

         new HourlyEmployee();

      CommissionEmployee commissionEmployee =

         new CommissionEmployee();

      BasePlusCommissionEmployee basePlusCommissionEmployee =

         new BasePlusCommissionEmployee();






system.out.print("\t Enter 1 for Salaried Employee\n" + "\t Enter 2 for Hourly Employee\n"
		+ "\t Enter 3 for Commission Employee\n" + "\t Enter 4 for Base-Salaried Commision employee");
selectionNo = input.nextInt();
system.out.print("\n\n\t Enter -1 to quit");
nOquitters = input.nextInt();

while (nOquitters != -1)
{
	while (selectionNo  >=1 || selectionNo <=4)
	{
	
		switch(selectionNo)
		
		{
			case(emp1):
				System.out.print("Enter Salaried employee first name: ");
				firstName = keyboard.nextString();

				System.out.print("Enter Salaried employee last name: ");
				SurName = keyboard.nextString();

				System.out.print("Enter employee ssn (ex: 111-11-1111): ");
				empSSN = keyboard.nextString();

				System.out.print("Enter employee salary: $");
				empSal= keyboard.nextInt();

				System.out.print(" Enter birthdate: (numbers only, m/d/y) ");
				super.getbirthDate()= keyboard.nextInt();
				
				empBirthDate = super.getbirthDate();
				salariedEmployee() = firstName, SurName, empSSN, empSal;
				break;
			
			case(emp2):

			
				System.out.print("Enter Commission employee first name: ");
				firstName = keyboard.nextString();

				System.out.print("Enter Commission employee last name: ");
				SurName = keyboard.nextString();

				System.out.print("Enter employee ssn: (ex: 111-11-1111) ");
				empSSN = keyboard.nextString();

				System.out.print("Enter employee weekly salary: $");
				empSal= keyboard.nextInt();

				System.out.print("Enter commision: ");
				empCom = keyboard.nextDouble();

				System.out.print(" Enter birthdate: (numbers only, m/d/y) ");
				super.getbirthDate()= keyboard.nextInt();
				
				empBirthDate = super.getbirthDate();
	
				CommissionEmployee() = firstName, SurName, empSSN, empSal, empCom;


			case(emp3):


			
				System.out.print("Enter Hourly employee first name: ");
				firstName = keyboard.nextString();

				System.out.print("Enter Hourly employee last name: ");
				SurName = keyboard.nextString();

				System.out.print("Enter employee ssn: (ex: 111-11-1111) ");
				empSSN = keyboard.nextString();

				System.out.print("Enter employee hourly wage: $");
				empWage = keyboard.nextDouble();

				System.out.print("Enter hours worked: ");
				empHours = keyboard.nextInt();

				System.out.print(" Enter birthdate: (numbers only, m/d/y) ");
				super.getbirthDate()= keyboard.nextInt();
				
				empBirthDate = super.getbirthDate();
				HourlyEmployee() = firstName, SurName, empSSN, empWage, empHours;







			case(emp4):

				
				System.out.print("Enter BasePlusCommission employee first name: ");
				firstName = keyboard.nextString();

				System.out.print("Enter BasePlusCommission  employee last name: ");
				SurName = keyboard.nextString();
				
				System.out.print("Enter employee ssn: (ex: 111-11-1111) ");
				empSSN = keyboard.nextString();

				System.out.print("Enter employee weekly salary: $");
				empSal= keyboard.nextInt();

				System.out.print("Enter commision: ");
				empCom = keyboard.nextDouble();

				System.out.print(" Enter birthdate: (numbers only, m/d/y) ");
				super.getbirthDate()= keyboard.nextInt();
				
				empBirthDate = super.getbirthDate();	
				CommissionEmployee() = firstName, SurName, empSSN, empSal, empCom;




		}
	}
}





 

      System.out.println( "Employees processed individually:\n" );

     

      System.out.printf( "%s\n%s: $%,.2f\n\n",

         salariedEmployee, "earned", salariedEmployee.earnings() );

      System.out.printf( "%s\n%s: $%,.2f\n\n",

         hourlyEmployee, "earned", hourlyEmployee.earnings() );

      System.out.printf( "%s\n%s: $%,.2f\n\n",

         commissionEmployee, "earned", commissionEmployee.earnings() );

      System.out.printf( "%s\n%s: $%,.2f\n\n",

         basePlusCommissionEmployee,

         "earned", basePlusCommissionEmployee.earnings() );

 

      // create four-element Employee array

      Employee employees[] = new Employee[ 4 ];

 

      // initialize array with Employees

      employees[ 0 ] = salariedEmployee;

      employees[ 1 ] = hourlyEmployee;

      employees[ 2 ] = commissionEmployee;

      employees[ 3 ] = basePlusCommissionEmployee;

 

      System.out.println( "Employees processed polymorphically:\n" );

     

      // generically process each element in array employees

      for ( Employee currentEmployee : employees )

      {

         System.out.println( currentEmployee ); // invokes toString

 

         // determine whether element is a BasePlusCommissionEmployee

         if ( currentEmployee instanceof BasePlusCommissionEmployee )

         {

            // downcast Employee reference to

            // BasePlusCommissionEmployee reference

            BasePlusCommissionEmployee employee =

               ( BasePlusCommissionEmployee ) currentEmployee;

 

            double oldBaseSalary = employee.getBaseSalary();

            employee.setBaseSalary( 1.10 * oldBaseSalary );

            System.out.printf(

               "new base salary with 10%% increase is: $%,.2f\n",

               employee.getBaseSalary() );

         } // end if

 

         System.out.printf(

            "earned $%,.2f\n\n", currentEmployee.earnings() );

      } // end for

 

      // get type name of each object in employees array

      for ( int j = 0; j < employees.length; j++ )

         System.out.printf( "Employee %d is a %s\n", j,

            employees[ j ].getClass().getName() );

   } // end main

} // end class PayrollSystemTest