import java.util.Scanner; 

public class Lab03_B_While{ 
public Lab03_B_While(){ 

try{ 
Scanner nums = new Scanner(System.in); 
System.out.print ("Input the first number: "); 
int firstNum = nums.nextInt(); 

int secondNum=0; 
while(true){ 
System.out.print ("Input the second number: "); 
secondNum = nums.nextInt(); 
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



int x=firstNum; 
while(x<=secondNum) 
{ 
if(x%2!=0){ 
System.out.print(x+", "); 
} 
x++; 
} 



} 
public void SumOfEven(int firstNum, int secondNum){ 
int sum=0; 


int x=firstNum; 
while(x<=secondNum) 
{ 
if(x%2==0){ 
sum+=x; 
} 
x++; 

} 


System.out.println ("Sum of all even numbers between "+firstNum+" and "+secondNum); 
System.out.print(sum);
} 

public static void main(String[] args) { 
    new Lab03_B_While();

     
} 
} 
