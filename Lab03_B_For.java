package lab.pkg3;
import java.util.Scanner; 

public class Lab03_B_For{ 
public Lab03_B_For(){ 

try{ 
Scanner kb = new Scanner(System.in); 
System.out.print ("Input the first number: "); 
int firstNum = kb.nextInt(); 

int secondNum=0; 
for(;;){ 
System.out.print ("Input the second number: "); 
secondNum = kb.nextInt(); 
if(secondNum<firstNum) { 
System.out.println ("Second number must be greater than :"+firstNum); 
} 
else { 
break; 
} 
} 
oddNums(firstNum,secondNum); 
SumOfEven(firstNum,secondNum); 


} 
catch(Exception e){ 
e.printStackTrace(); 
} 
} 
public void oddNums(int firstNum, int secondNum){ 
System.out.println ("All odd numbers between "+firstNum+" and "+secondNum); 
for(int x=firstNum;x<=secondNum;x++){ 
if(x%2!=0){ 
System.out.print(x+", "); 
} 
} 
} 
public void SumOfEven(int firstNum, int secondNum){ 
int sum=0; 
for(int x=firstNum;x<=secondNum;x++){ 
if(x%2==0){ 
sum+=x; 
} 
} 
System.out.println ("Sum of all the even numbers between "+firstNum+" and "+secondNum);
System.out.print(sum);
} 
 
public static void main(String[] args) { 
new Lab03_B_For(); 
} 
}
