// Employee.java

// Employee abstract superclass.

 

public abstract class Employee extends Date

{

   private String firstName;

   private String lastName;

   private String socialSecurityNumber;
   
   private int birthDate;

 

   // four-argument constructor

   public Employee(int month, int year, int day, String first, String last, String ssn, int BD)

   {
      super(month, day, year);

      firstName = first;

      lastName = last;

      socialSecurityNumber = ssn;
    
      birthDate = BD;

   

   } // end four-argument Employee constructor

 
  // set birth date
 
 public void setbirthDate (int BD)
	
  {

	 birthDate = BD;

  } // end method setbirthDate



  // return birth date

   public int getbirthDate ()
	
   {

	 return birthDate;

   } // end method getbirthDate




   // set first name

   public void setFirstName( String first )

   {

      firstName = first;

   } // end method setFirstName

 
 

   // return first name

   public String getFirstName()

   {

      return firstName;

   } // end method getFirstName

 

   // set last name

   public void setLastName( String last )

   {

      lastName = last;

   } // end method setLastName

 

   // return last name

   public String getLastName()

   {

      return lastName;

   } // end method getLastName

 

   // set social security number

   public void setSocialSecurityNumber( String ssn )

   {

      socialSecurityNumber = ssn; // should validate

   } // end method setSocialSecurityNumber

 

   // return social security number

   public String getSocialSecurityNumber()

   {

      return socialSecurityNumber;

   } // end method getSocialSecurityNumber

 

   // return String representation of Employee object

   public String toString()

   {

      return String.format( "%s %s\nsocial security number: %s %i",

         getFirstName(), getLastName(), getSocialSecurityNumber(), super.getbirthDate() );

   } // end method toString

/*	
   // return employee Birth Date
   public int toInt()
   {

	return int.format("Employee birth date is: %i",
	super.getbirthDate()); 

   }
*/ 

   // abstract method overridden by subclasses

   public abstract double earnings(); // no implementation here

} // end abstract class Employee





















