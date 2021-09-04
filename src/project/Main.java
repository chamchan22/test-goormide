package project;
import java.util.Scanner;
import java.lang.Math;

public class Main {
    
    public static void main(String args[]) {
        Scanner stdIn = new Scanner(System.in);
        
        System.out.print("실수값 : ");
        double x = stdIn.nextDouble();
        
        System.out.println("절댓값 : " + Math.abs(x));
        System.out.println("제곱근 : " + Math.sqrt(x));
        System.out.println("원의 면적 : " + Math.PI * x * x);
    }
}