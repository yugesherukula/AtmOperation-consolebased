Simple ATM Operation – Java Console Application
This is a basic ATM simulation program in Java that demonstrates how core banking services can be accessed through a menu-driven console interface. 
It includes common operations such as Deposit, Withdraw, and PIN Change. The design is modular, making it easy to expand or integrate into larger systems.

🔹 Features
✅ Deposit money to the account
✅ Withdraw money from the account (with balance check)
✅ Change ATM PIN securely
❌ Handles invalid inputs with proper error messages

📋 Displays transaction details at the end
🔸 Program Flow
User is greeted with a welcome message
Menu is displayed with options:
deposit
withdraw
pinchange
User input is taken, and based on the input:
The corresponding method is invoked
If the input is invalid, the user is shown:
Invalid operation. Try again.
After the transaction, details like amount and updated balance are shown.

🔧 Core Methods
depositMethod()
Prompts for deposit amount
Adds it to the balance
Displays confirmation and updated balance

withdrawMethod()
Prompts for withdrawal amount
Checks if the amount is less than or equal to the current balance
Deducts from balance if valid, otherwise shows "Insufficient Balance"

pinChangeMethod()
Prompts user to enter current PIN
If correct, allows user to set a new PIN
Confirms success or failure based on input

📌 Sample Console Output

WELCOME TO THE ATM
Enter operation (deposit / withdraw / pinchange):
> deposit
Enter amount to deposit: 3000
₹3000 successfully deposited.
Updated Balance: ₹8000

Thank you for using our ATM.
🧩 Concepts Used
Conditional statements (if, else)
Scanner for user input
Method creation and calling
Basic input validation
Console output formatting

📂 How to Run
Make sure you have:
Java installed (JDK 8+)
A terminal or IDE (like IntelliJ, Eclipse, or VS Code)

Compile and run:
javac ATMApp.java
java ATMApp

Ideal For
Java beginners practicing methods and conditionals
Learning menu-driven programming
Simulating real-world banking operations in cod
