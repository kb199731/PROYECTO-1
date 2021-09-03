/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carro;

/**
 *
 * @author KATHE
 */
public class carro {
    
    private String placa;
    private String marca;
    
    /**
     *  Constructor de objetos Carro
     * @param   placa   placa que identifica cada carro
     * @param   marca   la marca del carro, ej: Toyota, Mazda, etc.
     */
    public carro(String placa, String marca) 
    {
        this.placa = placa;
        this.marca = marca;
    }
    
    /**
     * Método para consultar la placa
     * @return  la placa del carro
     */
    public String getPlaca() 
    {
        return placa;
    }
    /**
     * Método para consultar la marca
     * @return  la marca del carro
     */
    public String getMarca() 
    {
        return marca;
    }
}
