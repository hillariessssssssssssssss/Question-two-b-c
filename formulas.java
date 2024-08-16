/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vu.examqn2;

/**
 *
 * @author HILARY UGO453
 */
public class formulas {
    double radius;
    final double PI = 22.0 / 7.0;

    public formulas(double r) {
        this.radius = r;
    }

    public double calculateArea() {
        return PI * radius * radius;
    }

    public double calculateCircumference() {
        return 2 * PI * radius;
    }
}
