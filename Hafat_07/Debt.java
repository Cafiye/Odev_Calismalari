public class Debt {
     double initialBalance;
     double initialInterestRate;

     public Debt(double initialBalance, double initialInterestRate) {
         this.initialBalance = initialBalance;
         this.initialInterestRate = initialInterestRate;
     }

     public void printBalance() {
         System.out.println( initialBalance);
     }

     public void waitOneYear(){
         initialBalance = initialBalance*initialInterestRate;
        // initialBalance = initialBalance + borc;
     }
}
