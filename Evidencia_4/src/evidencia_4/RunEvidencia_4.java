/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package evidencia_4;
import java.util.Scanner;
import java.util.ArrayList; //importamos para poder usar Arraylist

/**
 *
 * @author erick
 */
public class RunEvidencia_4 {
    

    public static void main(String[] args) {
        
        //Diferentes variables escaner para ingresar datos
        Scanner number = new Scanner(System.in);
        Scanner text = new Scanner(System.in);
        Scanner bolean = new Scanner(System.in);
        
        boolean salir = true; //variable de control del do while
        ArrayList<empleado> empleados = new ArrayList<empleado>(); //Lista de empleados de tipo empleado por ser la clase padre
        //do while
        do{
            System.out.println("Ingresara Programador(0) o Empleado(1)?");
            //Ingresar Programador
            if(number.nextInt() == 0){
                programador prog = new programador();
                
                System.out.println("Ingrese nombre: ");
                prog.setNombre(text.nextLine());
                System.out.println("Ingrese cedula: ");
                prog.setCedula(text.nextLine());
                do{
                    System.out.println("Ingrese edad: ");
                    prog.setEdad(number.nextInt());
                    if(prog.getEdad()< 18 || prog.getEdad() > 45 ){
                        System.out.println("Edad invalida \nDebe ser entre 18 y 45");
                    }
                }while(prog.getEdad()< 18 || prog.getEdad() > 45 );
                System.out.println("Ingrese Estado Civil: (Soltero = true / Casado u otro = false)");
                prog.setEstCivSol(bolean.nextBoolean());
                System.out.println("Ingrese salario: ");
                prog.setSalario(number.nextDouble());
                System.out.println("Ingrese Lenguaje Dominante: ");
                prog.setLenguajeDominante(text.nextLine());
                System.out.println("Ingrese Lineas de codigo por hora: ");
                prog.setLinCodPorHora(number.nextInt());
                prog.asignarClasif();
                
                empleados.add(prog); //se agrega el elemento al arraylist
            }
            //Ingresar Empleado
            else{
                empleado emp = new empleado();
                
                System.out.println("Ingrese nombre: ");
                emp.setNombre(text.nextLine());
                System.out.println("Ingrese cedula: ");
                emp.setCedula(text.nextLine());
                do{
                    System.out.println("Ingrese edad: ");
                    emp.setEdad(number.nextInt());
                    if(emp.getEdad()< 18 || emp.getEdad() > 45 ){
                        System.out.println("Edad invalida \nDebe ser entre 18 y 45");
                    }
                }while(emp.getEdad()< 18 || emp.getEdad() > 45 );
                System.out.println("Ingrese Estado Civil: (Soltero = true / Casado u otro = false)");
                emp.setEstCivSol(bolean.nextBoolean());
                System.out.println("Ingrese salario: ");
                emp.setSalario(number.nextDouble());
                emp.asignarClasif();
                
                empleados.add(emp); //se agrega el elemento al arraylist
            }
            
            
            System.out.println("Desea ingresar otro registro?: (true/false) ");
            salir = bolean.nextBoolean();
        }while(salir);
        
        //se imprime la lista de empleados
        System.out.println("\n\nLista de Empleados:\n");
        int i = 0;
        //uso del for each para imprimir el arraylist
        for(empleado aux:empleados){
            System.out.println("\nEmpleado " + (i+1) + ":");
            System.out.println(aux.toString());
            i++;
        }
        
    }
    
}
