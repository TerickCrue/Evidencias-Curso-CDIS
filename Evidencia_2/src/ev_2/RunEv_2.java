/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ev_2;
import java.util.Scanner;

/**
 *
 * @author erick
 */
public class RunEv_2 {
    
    
    public static double PI = 3.1416;
    
    public static double calcularCircunferencia(int radio){
        double circunferencia = 2*PI*radio;
        return circunferencia;
    }
    
    public static double calcularArea(int radio){
        double area = PI*(Math.pow(radio, 2));
        return area;
    }
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingresa el valor del radio: ");
        int radio = scan.nextInt();
        
        System.out.println("Circunferencia: " + calcularCircunferencia(radio) + "unidades cuadradas.");
        System.out.println("Area: " + calcularArea(radio)+ "unidades cuadradas.");
        
        
    }
    
}
