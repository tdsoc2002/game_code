package luogu;

import java.util.Scanner;

public class P5735 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double result=0;
        double a1= scanner.nextDouble();
        double a2= scanner.nextDouble();
        double b1= scanner.nextDouble();
        double b2= scanner.nextDouble();
        double c1= scanner.nextDouble();
        double c2= scanner.nextDouble();
        result+=run(a1,a2,b1,b2);
        result+=run(c1,c2,b1,b2);
        result+=run(c1,c2,a1,a2);
        System.out.println(result);
    }
    public static double run(double x1,double y1,double x2,double y2){
        double result=0;
        double num1 =  Math.pow(x2-x1,2);
        double num2 =  Math.pow(y2-y1,2);
        result= Math.sqrt(num1-num2);
        System.out.println(result);
        return result;
    }
}
