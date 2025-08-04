import java.util.Scanner;

public class Calculator{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);


        System.out.println("enter first number");
        double num1=sc.nextDouble();

        System.out.println("enter the operator");
        char operator=sc.next().charAt(0);

        System.out.println("enter second number");
        double num2=sc.nextDouble();

        double result;

        switch(operator){
            case '+':
                   result=num1+num2;
                   System.out.println("result" +result);
                   break;


            case '-':
                  result=num1-num2;
                  System.out.println("result"+result);
                  break;
                  
                  
            case '*':
                  result=num1*num2;
                  System.out.println("result"+result);
                  break;
                  
            case '/':
                  if(num2!=0){
                  result=num1/num2;
                  System.out.println("result"+result);
                 
                }else{
                System.out.println("cannot divide by zero");
                }
            break;

            default:

        System.out.println("invalid operator");
     }

    sc.close();
}

}

