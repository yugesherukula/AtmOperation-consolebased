
package methods;

import java.util.Scanner;

public class AtmOperation {
    int atmpin;
    double balance;
    String bankname;
    public static  Scanner sc = new Scanner(System.in);
    
    public AtmOperation(){
        System.out.println("ENter banking name :");
        this.bankname=sc.nextLine();
        System.out.println("Enter ATM PIN :");
        this.atmpin=sc.nextInt();
        System.out.println("Enter the balance :");
        this.balance=sc.nextDouble();

    }
    public void AtmOperations(){
        //alternate code which is in comments
    /*  System.out.println("SELECT Option to make the operation:");
        System.out.println("Enter 1 to make deposit ");
        System.out.println("Enter 2 to withdraw the amount ");
        System.out.println("enter 3 to change PIN");
        System.out.println("enter 4 to exit ");
        System.out.println("enter the number to perform the operation :");
        int opt = sc.nextInt();*/
        System.out.println("enter the Operation to be performed :");
        String operat = sc.nextLine();
        //if(opt==1){
        if(operat.equalsIgnoreCase("deposit")){
            depositMethod();
            System.out.println("Thank for the banking");
        }
        //else if(opt==2){
        else if(operat.equalsIgnoreCase("withdraw")){
            withdrawMethod();
            System.out.println("Thank for the banking");
        }
        //else if(opt==3){
        else if(operat.equalsIgnoreCase("pinchange")){
            pinChangeMethod();
            System.out.println("Thank for the banking");
        }
        //else if (opt==4){
        else if(operat.equalsIgnoreCase("exit")){
            exitFromAppilication();
        }else{
            System.out.println("Enter correct input to proceed");
            System.out.println("Enter yes or no make a transcation :");
            char repeat = sc.next().charAt(0);
            if(repeat=='y'){
                AtmOperations();
            }
            else{
                exitFromAppilication();
            }
        }
        displaydetails();
    }
    // deposit method
    void depositMethod(){
        System.out.println("enter The amount to be deposited ");
        double amount =sc.nextDouble();
        System.out.println("enter the your atm pin ");
        int pin=sc.nextInt();
        if (this.atmpin==pin){
            this.balance +=amount;
            System.out.println("Deposited succesfully !!");   
        }
        else{
            System.out.println("SORRY!!!! enter wrong pin ");
        }
    }
    //withdraw method
    void withdrawMethod(){
        System.out.println("enter the amount to withdraw ");
        double amount =sc.nextDouble();
        System.out.println("enter the your atm pin ");
        int pin=sc.nextInt();
        if (this.atmpin==pin){
            if (amount >this.balance){
                System.out.println("cannot withdraw insufficient amount ");
            }
            else{
                this.balance-=amount;
                System.out.println("amount withdrawn successfully");
            }
        }
        else{
            System.out.println("Enter the correct pin :");
        }
    }
    //pin change method
    void pinChangeMethod(){
        System.out.println("Enter old pin :");
        int oldpin = sc.nextInt();
        if (oldpin==atmpin){
            System.out.println("enter new atm pin :");
            int newpin=sc.nextInt();
            if (newpin==oldpin){
            System.out.println("NEW PIn cannot be same as OLD PIN");
            }
            else{
                this.atmpin=newpin;
                System.out.println("ATm pin successfully changed");
            }
        }else{
            System.out.println("cannot chhange the pin entered wrong pin ");
        }
    }
    void exitFromAppilication(){
        System.out.println("Thank for the banking");
    }
    //display details methods
    void displaydetails(){
        System.out.println("Bank name :"+bankname);
        System.out.println("Bank Balance :"+balance);
    }
}
