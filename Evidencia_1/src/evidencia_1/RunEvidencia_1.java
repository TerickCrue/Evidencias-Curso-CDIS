/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package evidencia_1;
import java.util.Scanner;



/**
 *
 * @author erick
 */
public class RunEvidencia_1 {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //objeto scanner para permitir input
        Scanner scan = new Scanner(System.in);
        
        //Declaradas y leidas las 3 variables
        System.out.println("Ingresa tu nombre: ");
        String nom = scan.nextLine();
        
        System.out.println("Ingresa un numero entero: ");
        int a = scan.nextInt();
        
        System.out.println("Ingresa un numero decimal: ");
        double b = scan.nextDouble();
       // scan.nextLine();
        
        System.out.println("Hola " + nom + ", el resultado de la suma entre " + a + " y " + b + " es = " + (a+b));
        
    }
    
}
