import java.util.Scanner;

public class Lab03_A {

   
    public static void main(String[] args) {
   
        Scanner sc = new Scanner(System.in);
        System.out.print("How many pages to fax? ");
        double pages = sc.nextInt();
        double sCharge = 3;
        double numPages = .20;
        double cost;
        
        if (pages<=10)
        {
        cost= 3+pages*.20;
        System.out.println("That will cost $" + cost "0");
        }
        
        else 
            if (pages>=10)
                    {
                    cost= 3+10*0.2+(pages-10)*0.1;
                    System.out.println("That will cost $" + cost "0");
                    }
    }
}
                
