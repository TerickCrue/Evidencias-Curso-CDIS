/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package evidencia_4;
import java.util.Scanner;
import java.util.ArrayList; //importamos para poder usar Arraylist
import java.util.InputMismatchException;
import java.lang.Throwable;
import java.lang.Object;
/**
 *
 * @author erick
 */
public class RunEvidencia_4 {
    
    public static empleado retomarEmpleado(String fNombre, String fCedula){
        Scanner number = new Scanner(System.in);
        Scanner text = new Scanner(System.in);
        Scanner bolean = new Scanner(System.in);
        empleado empAux = new empleado();
        empAux.setNombre(fNombre);
        empAux.setCedula(fCedula);
        try{
            do{
                System.out.println("Vuelva a ingresar una edad correcta");
                empAux.setEdad(number.nextInt());
                if(empAux.getEdad()<18 || empAux.getEdad()>45){
                    System.out.println("Edad fuera de rango");
                }
            }while(empAux.getEdad()<18 || empAux.getEdad()>45);

            System.out.println("Ingrese Estado Civil: (Soltero = true / Casado u otro = false)");
            empAux.setEstCivSol(bolean.nextBoolean());
            System.out.println("Ingrese salario: ");
            empAux.setSalario(number.nextDouble());
            empAux.asignarClasif();
            
        }
        catch(InputMismatchException ex){
            System.out.println(" Tome la decision correcta ");
        }
        
        return empAux;
    }
    
    public static programador retomarProgramador(String fNombre, String fCedula){
        Scanner number = new Scanner(System.in);
        Scanner text = new Scanner(System.in);
        Scanner bolean = new Scanner(System.in);
        programador progAux = new programador();
        
        progAux.setNombre(fNombre);
        progAux.setCedula(fCedula);
        try{
            do{
                System.out.println("Vuelva a ingresar una edad correcta");
                progAux.setEdad(number.nextInt());
                if(progAux.getEdad()<18 || progAux.getEdad()>45){
                    System.out.println("Edad fuera de rango");
                }
            }while(progAux.getEdad()<18 || progAux.getEdad()>45);

            System.out.println("Ingrese Estado Civil: (Soltero = true / Casado u otro = false)");
            progAux.setEstCivSol(bolean.nextBoolean());
            System.out.println("Ingrese salario: ");
            progAux.setSalario(number.nextDouble());
            System.out.println("Ingrese Lenguaje Dominante: ");
            progAux.setLenguajeDominante(text.nextLine());
            System.out.println("Ingrese Lineas de codigo por hora: ");
            progAux.setLinCodPorHora(number.nextInt());
            progAux.asignarClasif();
            
        }
        catch(InputMismatchException ex){
            System.out.println(" Tome la decision correcta ");
        }
        
        return progAux;
    }
 
    
    
    //MAIN
    public static void main(String[] args) {
        
        //Diferentes variables escaner para ingresar datos
        Scanner number = new Scanner(System.in);
        Scanner text = new Scanner(System.in);
        Scanner bolean = new Scanner(System.in);
        
        boolean continuar = true; //variable de control del do while
        ArrayList<empleado> empleados = new ArrayList<>(); //Lista de empleados de tipo empleado por ser la clase padre
        EdadException edE = new EdadException();
        String nombreAux = "", cedulaAux = "";
        int bandera = 0;
        //do while
        do{
            bandera = 0;
            nombreAux = "";
            cedulaAux = "";
            try{
                System.out.println("Ingresara Programador(0) o Empleado(1)?");
                //Ingresar Programador
                if(number.nextInt() == 0){
                    bandera = 1;
                    programador prog = new programador();

                    System.out.println("Ingrese nombre: ");
                    prog.setNombre(text.nextLine());
                    nombreAux = prog.getNombre();
                    System.out.println("Ingrese cedula: ");
                    prog.setCedula(text.nextLine());
                    cedulaAux = prog.getCedula();
                    System.out.println("Ingrese edad: ");
                    prog.setEdad(number.nextInt());
                    edE.validarEdad(prog.getEdad());
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
                    bandera = 2;
                    empleado emp = new empleado();

                    System.out.println("Ingrese nombre: ");
                    emp.setNombre(text.nextLine());
                    nombreAux = emp.getNombre();
                    System.out.println("Ingrese cedula: ");
                    emp.setCedula(text.nextLine());
                    cedulaAux = emp.getCedula();
                    System.out.println("Ingrese edad: ");
                    emp.setEdad(number.nextInt());
                    edE.validarEdad(emp.getEdad());  
                    
                    System.out.println("Ingrese Estado Civil: (Soltero = true / Casado u otro = false)");
                    emp.setEstCivSol(bolean.nextBoolean());
                    System.out.println("Ingrese salario: ");
                    emp.setSalario(number.nextDouble());
                    emp.asignarClasif();

                    empleados.add(emp); //se agrega el elemento al arraylist
                }


                System.out.println("Desea ingresar otro registro?: (true/false) ");
                continuar = bolean.nextBoolean();

                
            }catch(InputMismatchException ex){
                System.out.println(" Tome la decision correcta ");
                continuar = true;
            }
            catch(NumberFormatException e){
                System.out.println(" Tome la decision correcta ");
                continuar = true;
            }
            catch(EdadException e){
                if(bandera == 1){
                    empleados.add(retomarProgramador(nombreAux,cedulaAux));
                }
                else if(bandera == 2){
                    empleados.add(retomarEmpleado(nombreAux,cedulaAux));
                }
                System.out.println("Desea ingresar otro registro?: (true/false) ");
                continuar = bolean.nextBoolean();
            }
            
        }while(continuar);
        
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
