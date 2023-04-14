/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package evidencia_6;

/**
 *
 * @author erick
 */
public class RunEvidencia_6 {
    
    //MAIN
    public static void main(String[] args) {
        
        //Declaramos los objetos de cada clase
        //Los objetos se declaran con sus respectivos parametros de constructor, para setear sus datos de una vez
        piloto pilot = new piloto("checo","20/10/2028");
        desarrollador dev = new desarrollador("erick","spring");
        cocinero chef = new cocinero("yokoi","sushi");
        
        //Imprimimos los metodos heredados de la interface
        System.out.println("\nPiloto: ");
        System.out.println("-" + pilot.encenderObjeto());
        System.out.println("-" + pilot.maniobrarHerramienta());
        System.out.println("-" + pilot.apagarObjeto());
        
        System.out.println("\nDesarrollador: ");
        System.out.println("-" + dev.encenderObjeto());
        System.out.println("-" + dev.maniobrarHerramienta());
        System.out.println("-" + dev.apagarObjeto());
        
        System.out.println("\nCocinero: ");
        System.out.println("-" + chef.encenderObjeto());
        System.out.println("-" + chef.maniobrarHerramienta());
        System.out.println("-" + chef.apagarObjeto());
        
        
    }
    
}
