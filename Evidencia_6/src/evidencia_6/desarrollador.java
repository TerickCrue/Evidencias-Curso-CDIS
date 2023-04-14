/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package evidencia_6;

/**
 *
 * @author erick
 */
public class desarrollador implements IProfesion {
    
    //Constructores
    public desarrollador(){
        
    }
    
    public desarrollador(String nom, String tec){
        this.setNombre(nom);
        this.setTecQueManeja(tec);
        
    }
    
    //Atributos
    private String nombre;
    private String tecQueManeja;
    
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
     * @return the tecQueManeja
     */
    public String getTecQueManeja() {
        return tecQueManeja;
    }

    /**
     * @param tecQueManeja the tecQueManeja to set
     */
    public void setTecQueManeja(String tecQueManeja) {
        this.tecQueManeja = tecQueManeja;
    }
    
    //Sobreescritura de los metodos heredados de la interface
    @Override
    public String encenderObjeto() {
        return "Yo soy el desarrollador " + this.getNombre() + " y soy el mejor usando " + this.getTecQueManeja();
    }

    @Override
    public String maniobrarHerramienta() {
        return "Observen mientras uso " + this.getTecQueManeja() + " como todo un experto";
    }

    @Override
    public String apagarObjeto() {
        return "Ya pasaron mis 8 horas, con su permiso se retira el desarrollador " + this.getNombre();
    }
    
}
