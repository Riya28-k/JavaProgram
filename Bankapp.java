import java.util.*;
class lowBalanceException extends exception{
@Override
public String toString(){
return"Insufficient Balance!!";
}
}
class negativeNumberException extends exception{
@Override 
public string toString(){
return"Amount cannot be negative";
}
}
class BankAccount{
private class balance;
public BankAccount(double initialBalance){
this.balance = initialBalance;
}
public void balanceEnquiry(){
System.out.println("Current balance: "+balance);
}
public void deposite(double ammount) throws negativeNumberException{
if(amount < 0){
throw negativeNumberException();
}
balance+=amount;
System.out.println("Deposite successful !!");
}
public void withdraw(double amount) throws lowBalanceException,negativeNumberException{
if(amount < 0){
throw new negativeNumberException();
}
if(amount > balance){
throw new lowBalanceException();
}
balance-=amount;
System.out.println("Withdrawal successful !!");
}
}
public class Bankapp{
public ststic void main(string args[]){
Scanner scanner = new Scanner(System.in);
while(true){
System.out.println("1.Balance Enquiry ");
System.out.println("2.Deposite ");
System.out.println("3.Withdrawal ");
System.out.println("4.Exit ");
System.out.print("Enter your choice: ");
int choice = scanner.nextInt();
try{
switch(choice){
case 1: account.balanceEnquiry();
        break;
case 2: system.out.println("Enter ammount to deposite: ");
		 double depositAmount = scanner.nextDouble();   
         account.deposit(depositAmount);
         break;













