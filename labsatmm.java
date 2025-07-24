/* 1. Design a simple ATM operation menu-driven program that allows the user to choose one of the following banking services:
 > Deposit
 > Withdraw
 > PIN Change

Based on the user's input, the program should execute the corresponding method and inside the method you should perform related operations. If the user enters an invalid operation, the system must display an appropriate error message.

ex:
-> If the user enters "deposit" → Call the method depositMethod()
-> If the user enters "withdraw" → Call the method withdrawMethod()
-> If the user enters "pinchange" → Call the method pinChangeMethod()
-> If the user enters anything 
-> else → Display:
"Invalid operation. Try again."

Print the Transaction details at last. */
package javalabs;
import methods.AtmOperation;
public class labsatmm {
    static{
        System.out.println("WELCOME TO THE ATM");
    }
    public static void main(String[] args) {
        AtmOperation operat = new AtmOperation();
        operat.AtmOperations();
    }
}
    



