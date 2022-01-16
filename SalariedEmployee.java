// Kern D. Atherley					                   
// Assignment 4 Java 2265
// SalariedEmployee.java

// SalariedEmployee class extends Employee.

 

public class SalariedEmployee extends Employee

{

   private double weeklySalary;

 

   // five-argument constructor

   public SalariedEmployee( String first, String last, String ssn, Date BD,

      double salary )

   {

      super( first, last, ssn, BD ); // pass to Employee constructor

      setWeeklySalary( salary ); // validate and store salary

   } // end five-argument SalariedEmployee constructor

 

   // set salary

   public void setWeeklySalary( double salary )

   {

      weeklySalary = salary < 0.0 ? 0.0 : salary;

   } // end method setWeeklySalary

 

   // return salary

   public double getWeeklySalary()

   {

      return weeklySalary;

   } // end method getWeeklySalary

 

   // calculate earnings; override abstract method earnings in Employee

   public double earnings()

   {

      return getWeeklySalary();

   } // end method earnings

 

   // return String representation of SalariedEmployee object

   public String toString()

   {
	Date dob = getbirthDate();
      return String.format( "salaried employee: %s\n%s: %s\n%s$%,.2f",

         super.toString(), "\nDate of birth", dob.toString(), "weekly salary", getWeeklySalary() );

   } // end method toString

} // end class SalariedEmployee