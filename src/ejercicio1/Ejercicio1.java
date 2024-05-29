/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio1;

/**
 *
 * @author Claudio Bustamanate
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FabricadeSoldados fabricaHumana = new FabricaSoldadosHumanos();
        
        Soldado JineteHumanos = fabricaHumana.crearTirador();
        Soldado TiradorHumano = fabricaHumana.crearJinete();
        
        FabricadeSoldados fabricaOrca = new FabricaSoldadosOrcos();
        
        Soldado JineteOrcos = fabricaOrca.crearJinete();
        Soldado TiradorOrcos = fabricaOrca.crearTirador();
        
    }
    
}
