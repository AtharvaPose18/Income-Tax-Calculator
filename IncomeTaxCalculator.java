import java.util.Scanner;
public class IncomeTaxCalculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your annual income: Rs.");
        double income=sc.nextDouble();
        double tax=0;
        if(income<0){
            System.out.println("Please enter a valid Amount");
        }
        else{
            if (income<=300000) {
                tax=0;
            }
            else if(income<=600000) {
                tax=(income-300000)*0.05;
            }
            else if(income<=900000) {
                tax=(300000*0.05)+(income-600000)*0.10;
            }
            else {
                tax=(300000*0.05)+(300000*0.10)+(income-900000)*0.15;
            }
        System.out.println("Annual income:Rs."+income);
        System.out.println("Calculated tax: Rs."+tax);
        }
        sc.close();
    }
}
