// Kern D. Atherley					                      
// Assignment 4 Java 2265
// HourlyEmployee.java

// HourlyEmployee class extends Employee.

 

public class HourlyEmployee extends Employee

{

   private double wage; // wage per hour

   private double hours; // hours worked for week

 

   // five-argument constructor

   public HourlyEmployee( String first, String last, String ssn, Date BD,

      double hourlyWage, double hoursWorked)

   {

      super( first, last, ssn, BD );

      setWage( hourlyWage ); // validate and store hourly wage

      setHours( hoursWorked ); // validate and store hours worked

   } // end five-argument HourlyEmployee constructor

 

   // set wage

   public void setWage( double hourlyWage )

   {

      wage = ( hourlyWage < 0.0 ) ? 0.0 : hourlyWage;

   } // end method setWage

 

   // return wage

   public double getWage()

   {

      return wage;

   } // end method getWage

 

   // set hours worked

   public void setHours( double hoursWorked )

   {

      hours = ( ( hoursWorked >= 0.0 ) && ( hoursWorked <= 168.0 ) ) ?

         hoursWorked : 0.0;

   } // end method setHours

 

   // return hours worked

   public double getHours()

   {

      return hours;

   } // end method getHours

 

   // calculate earnings; override abstract method earnings in Employee

   public double earnings()

   {

      if ( getHours() <= 40 ) // no overtime

         return getWage() * getHours();

      else

         return 40 * getWage() + ( getHours() - 40 ) * getWage() * 1.5;

   } // end method earnings

 

   // return String representation of HourlyEmployee object

   public String toString()

   {
	Date dob = getbirthDate();

      return String.format( "hourly employee:  %s\n%s: %s\n%s: $%,.2f; %s: %,.2f",

         super.toString(), "\nDate of Birth", dob.toString(), "hourly wage", getWage(),

         "hours worked", getHours() );

   } // end method toString

} // end class HourlyEmployee