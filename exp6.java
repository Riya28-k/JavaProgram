import java.util.*;
class oddNumberException extends Exception{
@Override
public String toString(){
return"odd number is not valid";
}
}
class exp6{
public static void main(String args[]){
int number;
try{
Scanner scanner = new Scanner(System.in);
System.out.println("Enter your number: ");
int num = scanner.nextInt();
if(num % 2 != 0){
throw new oddNumberException();
}
else{
System.out.println("Number is even");
}
}
catch(oddNumberException e){
System.out.println(e);
}
}
}
