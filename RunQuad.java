/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package runquad;

/**
 *
 * @author renzj
 */
import java.util.Scanner;

public class RunQuad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Press R for Rectangle or S for Square: ");
        String choice = scanner.nextLine().toUpperCase();

        if (choice.equals("R")) {
            Rectangle rectangle = new Rectangle();
            System.out.println("A rectangle:");
            rectangle.showDescription();
        } else if (choice.equals("S")) {
            Square square = new Square();
            System.out.println("A square:");
            square.showDescription();
        } else {
            System.out.println("Invalid choice. Please press R or S.");
        }
    }
}
