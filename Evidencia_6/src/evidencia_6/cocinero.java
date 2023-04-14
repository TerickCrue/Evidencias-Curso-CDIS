/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package evidencia_6;

/**
 *
 * @author erick
 */
public class cocinero implements IProfesion {
    
    //Constructores
    public cocinero(){
        
    }
    
    public cocinero(String nom, String esp){
        this.setNombre(nom);
        this.setEspecialidad(esp);
    }
    
    //Atributos
    private String nombre;
    private String especialidad;
    
    //Encapsulamiento
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
     * @return the especialidad
     */
    public String getEspecialidad() {
        return especialidad;
    }

    /**
     * @param especialidad the especialidad to set
     */
    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    //Sobreescritura de los metodos heredados de la interface
    @Override
    public String encenderObjeto() {
        return "Soy el cocinero " + this.getNombre() + " y me especializo en " + this.getEspecialidad();
    }

    @Override
    public String maniobrarHerramienta() {
        return "Yo, " + this.getNombre() + ", manejo mis cuchillos como todo un profesional";
    }

    @Override
    public String apagarObjeto() {
        return "Se les va el mejor cocinero de todo el mundo, "  + this.getNombre();
    }
    
}
