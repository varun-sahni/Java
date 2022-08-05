import java.util.*;

public class Java_Calculator {

   
    public static void main(String[] args) {
        int choice;
        double num1,num2,res;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number:");
        num1=sc.nextDouble();
         System.out.println("Enter Second number:");
        num2=sc.nextDouble();
        System.out.println("Calculation List\n 1.Addition\n 2.Substration\n 3.Multiply\n 4.Division");
        System.out.println("Enter Choice of Calculation from above menu:");
        choice=sc.nextInt();
        
        switch(choice){
        
        case 1:
        res=num1+num2;
        System.out.println("Addition:"+res);
        break;
         case 2:
        res=num1-num2;
        System.out.println("Substration:"+res);
        break;
         case 3:
        res=num1*num2;
        System.out.println("Multiply:"+res);
        break;
         case 4:
        res=num1/num2;
        System.out.println("Division:"+res);
        break;
    }
    }
    
}
