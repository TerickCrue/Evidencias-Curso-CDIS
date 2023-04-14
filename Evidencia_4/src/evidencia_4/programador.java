/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package evidencia_4;

/**
 *
 * @author erick
 */
public class programador extends empleado{
    
    //Declaramos atributos
    private String lenguajeDominante = "";
    private int linCodPorHora = 0;
    
    //Encapsulamos los atributos
    /**
     * @return the lenguajeDominante
     */
    public String getLenguajeDominante() {
        return lenguajeDominante;
    }

    /**
     * @param lenguajeDominante the lenguajeDominante to set
     */
    public void setLenguajeDominante(String lenguajeDominante) {
        this.lenguajeDominante = lenguajeDominante;
    }

    /**
     * @return the linCodPorHora
     */
    public int getLinCodPorHora() {
        return linCodPorHora;
    }

    /**
     * @param linCodPorHora the linCodPorHora to set
     */
    public void setLinCodPorHora(int linCodPorHora) {
        this.linCodPorHora = linCodPorHora;
    }
    
    //Sobreescribimos los metodos heredados de la clase padre
    @Override
    public void setSalario(double salario) {
        super.setSalario(salario); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public double getSalario() {
        return super.getSalario(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public void setEstCivSol(boolean EstCivSol) {
        super.setEstCivSol(EstCivSol); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public boolean getEstCivSol() {
        return super.getEstCivSol(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public void setEdad(int edad) {
        super.setEdad(edad); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public int getEdad() {
        return super.getEdad(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public void setCedula(String cedula) {
        super.setCedula(cedula); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public String getCedula() {
        return super.getCedula(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public void setNombre(String nombre) {
        super.setNombre(nombre); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public String getNombre() {
        return super.getNombre(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public void setClasif(String clasif) {
        super.setClasif(clasif); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public String getClasif() {
        return super.getClasif(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public String toString() {
        return super.toString() + "\nlineas de codigo por hora = " + this.getLinCodPorHora() + "\nlenguaje dominante = " + this.getLenguajeDominante();
    }
    
    
}
