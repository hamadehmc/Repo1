public class Account {
    int id;
    double annualInterestRate;
    double balance;
    String customerName;
    
    Account(){}
    
//    Account(String custName, int newId, double newBalance, double iRate){
//    customerName=custName;
//    id=newId;
//    balance=newBalance;
//    annualInterestRate=iRate;
//    }
    
    Account(int nId){
    id=nId;
    }
   
    Account(int newId,String custName){
    customerName=custName;
    id=newId;
    }
    void deposit(double dAmount){
    balance=balance+dAmount;
        System.out.println("Your new balance is: "+balance);
    }
    
   void withdraw(double wAmount){
       if(wAmount >balance){
           System.out.println("You can not withdraw that amount\nYour current balance is: $" +balance);
       } else{
    balance=balance-wAmount;
    System.out.println("Your new balance is: $"+balance);
    }
   }
   
   double monthlyInterest(){
       System.out.printf("Monthly interest earned: $%.2f", ((balance*getAnnualInterestRate())/12));
       System.out.println();
   return (balance*getAnnualInterestRate())/12;
   }
   
   //Getters and Setters
       public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public double getBalance() {
        System.out.println("Account Balance: $"+balance);
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        System.out.println("Customer: "+customerName);
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
   
   
}
