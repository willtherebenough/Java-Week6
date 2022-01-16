// Kern D. Atherley					                      *
// Assignment 4 Java 2265
// CommissionEmployee.java

// CommissionEmployee class extends Employee.

 

public class CommissionEmployee extends Employee

{

   private double grossSales; // gross weekly sales

   private double commissionRate; // commission percentage

 

   // six-argument constructor

   public CommissionEmployee( String first, String last, String ssn, Date BD,

      double sales, double rate )

   {

      super(first,last,ssn,BD);

      setGrossSales( sales );

      setCommissionRate( rate );

   } // end six-argument CommissionEmployee constructor

 

   // set commission rate

   public void setCommissionRate( double rate )

   {

      commissionRate = ( rate > 0.0 && rate < 1.0 ) ? rate : 0.0;

   } // end method setCommissionRate

 

   // return commission rate

   public double getCommissionRate()

   {

      return commissionRate;

   } // end method getCommissionRate

 

   // set gross sales amount

   public void setGrossSales( double sales )

   {

      grossSales = ( sales < 0.0 ) ? 0.0 : sales;

   } // end method setGrossSales

 

   // return gross sales amount

   public double getGrossSales()

   {

      return grossSales;

   } // end method getGrossSales

 

   // calculate earnings; override abstract method earnings in Employee

   public double earnings()

   {

      return getCommissionRate() * getGrossSales();

   } // end method earnings

 

   // return String representation of CommissionEmployee object

   public String toString()

   {
	
      return String.format( "%s: %s\n%s: %s\n%s: $%,.2f; %s: %.2f",

         "commission employee", super.toString(),
	"\nDate of Birth", getbirthDate(),

         "gross sales", getGrossSales(),

         "commission rate", getCommissionRate() );

   } // end method toString

} // end class CommissionEmployee