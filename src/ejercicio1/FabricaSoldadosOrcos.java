/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio1;

/**
 *
 * @author callu
 */
public class FabricaSoldadosOrcos implements FabricadeSoldados {

    @Override
    public Soldado crearTirador() {
        return new TiradorOrcos();
    }

    @Override
    public Soldado crearJinete() {
        return new JineteOrcos();
    }
    
}
