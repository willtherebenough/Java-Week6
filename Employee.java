// Kern D. Atherley					                      *
// Assignment 4 Java 2265	

// Employee.java

// Employee abstract superclass.

 

public abstract class Employee

{

   private String firstName;

   private String lastName;

   private String socialSecurityNumber;
   
   private Date birthDate; // new private instance birthDate

 

   // seven-argument constructor

   public Employee(String first, String last, String ssn, Date BD)

   {
      

      firstName = first;

      lastName = last;

      socialSecurityNumber = ssn;
    
      birthDate = BD;

   

   } // end seven-argument Employee constructor

 
  // set birth date
 
 public void setbirthDate (Date BD)
	
  {

	 birthDate = BD;

  } // end method setbirthDate



  // return birth date

   public Date getbirthDate ()
	
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

      return String.format( "%s %s\nsocial security number: %s ",

         getFirstName(), getLastName(), getSocialSecurityNumber());

   } // end method toString



   // abstract method overridden by subclasses

   public abstract double earnings(); // no implementation here

} // end abstract class Employee





















