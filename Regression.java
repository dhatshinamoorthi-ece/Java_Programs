import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        
        System.out.print("Enter slope(m)");
        double m=sc.nextDouble();
        
        System.out.print("Enter interception(c)");
        double c=sc.nextDouble();
    
    
        System.out.print("Enter value(x)");
        double x=sc.nextDouble();
        
       double  y=(m*x)+c;
        
        System.out.println("Predicted value(y): "+y);
        
        sc.close();
        
        
    }
    
}
