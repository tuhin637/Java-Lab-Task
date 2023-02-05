

package com.mycompany.equation;


public class Equation {

    public static void main(String[] args) {
        int A=10;
        int B=16;
        int C=25;
        int D=13;
        
        int result1= (A * B - C * D);
        int result2= (2*A - B + 3*D);
        int result3= (A*2 + B*2 - C*2 + D*2);
        int result4= (A*3 + B - C*2);
        
        System.out.println("Result :" +result1);
        System.out.println("Result :" +result2);
        System.out.println("Result :" +result3);
        System.out.println("Result :" +result4);
    }
}
