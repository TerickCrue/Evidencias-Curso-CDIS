/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ev_3;
import java.util.Scanner;
/**
 *
 * @author erick
 */
public class RunEv_3 {
    
    //Para este tipo de problemas lo ideal es usar Arraylist para que no tenga tamaño fijo y las operaciones sean más sencillas
    //Pero las instrucciones dicen que se debe usar un arreglo bidimensional, entonces necesitamos el tamaño exacto del arreglo
    //Supondremos el tamaño máximo en 100
    static int n = 100;
    
    //metodo para calcular el promedio de edades
    static public double promedioEdades(int n, Object[][] a){
        int sumaEdades = 0, promedioEdades;
        for(int i=0; i<n; i++){
            sumaEdades += (int) a[i][1];
        }
        promedioEdades = sumaEdades/n;
        return promedioEdades;
    }
    //Metodo para calcular el porcentaje de hombres o mujeres
    static public double porcentajeSexo(int n, Object[][] a, int op){
        int num=0;
        double porcentaje;
        //la variable op en el argumento decide si se calcula el porcentaje de hombres o mujeres
        if(op == 1){
            for(int i=0; i<n;i++){
                if(a[i][3].equals("m")){
                    num++;
                }
            }
        }
        if(op == 2){
            for(int i=0; i<n;i++){
                if(a[i][3].equals("f")){
                    num++;
                }
            }
        }
        
        porcentaje = (double)(num*100)/n;
        return porcentaje;
    }
    //Metodo para calcular el porcentaje de hombres o mujeres solteros/as o casados/as
    static public double porcentajeEstadoCivil(int n, Object[][] a, int op, int op2){
        int num=0;
        double porcentaje = 0;
        //la variable op en el argumento decide si se calcula el porcentaje de hombres o mujeres
        //la variable op2 decide si de calcula el de solteros o casados
        if(op == 1){
            if(op2 == 1){
                for(int i=0; i<n;i++){
                    if(a[i][3].equals("m") && a[i][2].equals("s")){
                        num++;
                    }
                }
            }
            if(op2 == 2){
                for(int i=0; i<n;i++){
                    if(a[i][3].equals("m") && a[i][2].equals("c")){
                        num++;
                    }
                }
            }           
        }
        
        if(op == 2){
            if(op2 == 1){
                for(int i=0; i<n;i++){
                    
                    if(a[i][3].equals("f") && a[i][2].equals("s")){
                        num++;
                    }
                }
            }
            if(op2 == 2){
                for(int i=0; i<n;i++){
                    if(a[i][3].equals("f") && a[i][2].equals("c")){
                        num++;
                    }
                }
            }           
        }
        porcentaje = (double)(num*100)/n;
        return porcentaje;
    }
    
    public static void main(String[] args) {
        
        //Arreglo bidimensional de tipo Object para que pueda almacenar varios tipos de datos
        Object[][] info = new Object[n][4];
        
        Scanner scan = new Scanner(System.in); //variable escaner para leer datos
        int i=0, opc;
        
        //do while para seguir ingresando personas hasta que ya no se desee
        do{
            System.out.println("Ingrese nombre de la persona " + (i+1) + ":");
            info[i][0] = scan.nextLine();
            System.out.println("Ingrese edad de la persona " + (i+1) + ":");
            info[i][1] = scan.nextInt();
            scan.nextLine();
            System.out.println("Ingrese estado civil de la persona " + (i+1) + ": (s = solter@/c = casad@)");
            info[i][2] = scan.nextLine();
            scan.nextLine();
            System.out.println("Ingrese sexo de la persona " + (i+1) + ": (m/f)");
            info[i][3] = scan.nextLine();
            
            i++;
            System.out.println("¿Desea agregar otra persona? (Ingrese 1 para si / Ingrese 0 o cualquier otro para no): ");
            opc = scan.nextInt();
            scan.nextLine();
        }while(opc == 1);
        
        //imprimimos lo solicitado
        System.out.println("Total de personas capturadas: " + i);
        System.out.println("Promedio de edad: " + promedioEdades(i,info) + "%");
        System.out.println("Porcentaje de hombres: " + porcentajeSexo(i,info,1)+ "%");
        System.out.println("Porcentaje de mujeres: " + porcentajeSexo(i,info,2)+ "%");
        System.out.println("Porcentaje de hombres solteros: " + porcentajeEstadoCivil(i,info,1,1)+ "%");
        System.out.println("Porcentaje de hombres casados: " + porcentajeEstadoCivil(i,info,1,2)+ "%");
        System.out.println("Porcentaje de mujeres solteras: " + porcentajeEstadoCivil(i,info,2,1)+ "%");
        System.out.println("Porcentaje de mujeres casadas: " + porcentajeEstadoCivil(i,info,2,2)+ "%");
    }
    
}
