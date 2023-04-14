/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package evidencia_4;

/**
 *
 * @author erick
 */
public class empleado {
    
    
    //declaramos atributos
    private String nombre = "";
    private String cedula = "";
    private int edad = 0;
    private boolean EstCivSol = false;
    private double salario = 0.0;
    private String clasif = "";
    
    //Encapsulamos los atributos
    /**
     * @return the clasif
     */
    public String getClasif() {
        return clasif;
    }

    /**
     * @param clasif the clasif to set
     */
    public void setClasif(String clasif) {
        this.clasif = clasif;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the cedula
     */
    public String getCedula() {
        return cedula;
    }

    /**
     * @param cedula the cedula to set
     */
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    /**
     * @return the edad
     */
    public int getEdad() {
        return edad;
    }

    /**
     * @param edad the edad to set
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * @return the EstCivSol
     */
    public boolean getEstCivSol() {
        return EstCivSol;
    }

    /**
     * @param EstCivSol the EstCivSol to set
     */
    public void setEstCivSol(boolean EstCivSol) {
        this.EstCivSol = EstCivSol;
    }

    /**
     * @return the salario
     */
    public double getSalario() {
        return salario;
    }

    /**
     * @param salario the salario to set
     */
    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    //metodo para determinar la clasificacion del empleado
    public void asignarClasif(){
        if(this.getEdad()<= 21){
            this.clasif = "Principiante";
        }
        else if(this.getEdad()>=22 && this.getEdad()<=35){
            this.clasif = "Intermedio";
        }
        else if(this.getEdad()>35){
            this.clasif = "Senior";
        }
    }
    
    //metodo para imprimir la informacion del empleado
    @Override
    public String toString(){
        return "nombre = " + nombre + "\nedad = " + edad + "\nsoltero = " + EstCivSol + "\nsalario = $" + salario + "\nclasificacion = " + clasif;
    }
}
