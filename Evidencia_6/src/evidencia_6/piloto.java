/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package evidencia_6;

/**
 *
 * @author erick
 */
public class piloto implements IProfesion {
    
    //Constructores
    public piloto(){
        
    }
    
    public piloto(String nom, String expLic){
        this.setNombre(nom);
        this.setExpiraLicencia(expLic);
    }
    
    //Atributos
    private String nombre;
    private String expiraLicencia;
    
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
     * @return the expiraLicencia
     */
    public String getExpiraLicencia() {
        return expiraLicencia;
    }

    /**
     * @param expiraLicencia the expiraLicencia to set
     */
    public void setExpiraLicencia(String expiraLicencia) {
        this.expiraLicencia = expiraLicencia;
    }
    
    //Sobreescritura de los metodos heredados de la interface
    @Override
    public String encenderObjeto() {
        return "Yo soy el piloto " + this.getNombre() + ", encendiendo mi nave";
    }

    @Override
    public String maniobrarHerramienta() {
        return "Mi licencia, con expiracion en " + this.getExpiraLicencia() + " me permite manejar de esta manera";
    }

    @Override
    public String apagarObjeto() {
        return this.getNombre() + ", alias El mejor piloto, se retira";
    }
    
    
}
