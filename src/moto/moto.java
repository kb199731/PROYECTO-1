/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moto;

/**
 *
 * @author KATHE
 */
public class moto {
    private String placa;
    private String marca;
    
    /**
     *  Constructor de objetos Moto
     * @param   placa   placa que identifica cada moto
     * @param   marca   la marca del carro, ej: Suzuky, Navy, etc.
     */
    public moto(String placa, String marca)  
    {
        this.placa = placa;
        this.marca = marca;
    }
    
    /**
     * Método para consultar la placa
     * @return  la placa de la moto 
     */
    public String getPlaca() 
    {
        return placa;
    }
    /**
     * Método para consultar la marca
     * @return  la marca de la moto 
     */
    public String getMarca() 
    {
        return marca;
    }
}
