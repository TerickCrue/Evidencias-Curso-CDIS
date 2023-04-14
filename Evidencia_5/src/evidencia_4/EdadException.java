/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package evidencia_4;

/**
 *
 * @author erick
 */
public class EdadException extends Exception{
    
    
    
    public EdadException(){
        
    }
    
    public EdadException(String mensaje){
        super(mensaje);
    }
    
    public EdadException(int edad) throws EdadException{
       this.validarEdad(edad);
    }
    
    
    public void validarEdad(int edad) throws EdadException{
        if(!(edad>=18 && edad<=45)){
            System.out.println("Edad fuera del rango permitido (18-45)");
            throw new EdadException("Error en la edad");
        }
    }
    
    
    
    
}
