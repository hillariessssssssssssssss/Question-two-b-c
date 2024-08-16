/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package vu.examqn2;

/**
 *
 * @author HILARY UGO453
 */
import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();
                
            
        formulas circle = new formulas(radius);
        double area = circle.calculateArea();
        double circumference = circle.calculateCircumference();

 
        System.out.println("Area of the circle: " + area);
        System.out.println("Circumference of the circle: " + circumference);
    }
}

        
        
    

