// Kern D. Atherley					                      
// Assignment 4 Java 2265
// BasePlusCommissionEmployee.java

// BasePlusCommissionEmployee class extends CommissionEmployee.

 

public class BasePlusCommissionEmployee extends CommissionEmployee

{

   private double baseSalary; // base salary per week

 

   // seven-argument constructor

   public BasePlusCommissionEmployee( String first, String last,

      String ssn, Date BD , double sales, double rate, double salary)

   {

      super( first, last, ssn, BD, sales, rate );

      setBaseSalary( salary ); // validate and store base salary

   } // end seven-argument BasePlusCommissionEmployee constructor

 

   // set base salary

   public void setBaseSalary( double salary )

   {

      baseSalary = ( salary < 0.0 ) ? 0.0 : salary; // non-negative

   } // end method setBaseSalary

 

   // return base salary

   public double getBaseSalary()

   {

      return baseSalary;

   } // end method getBaseSalary

 

   // calculate earnings; override method earnings in CommissionEmployee

   public double earnings()

   {

      return getBaseSalary() + super.earnings();

   } // end method earnings

 

   // return String representation of BasePlusCommissionEmployee object

   public String toString()

   {

      return String.format( "%s %s; %s: $%,.2f",

         "base-salaried", super.toString(),

         "base salary", getBaseSalary() );

   } // end method toString  

} // end class BasePlusCommissionEmployee