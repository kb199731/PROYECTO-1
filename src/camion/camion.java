/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package camion;

/**
 *
 * @author KATHE
 */
public class camion {
    private String placa;
    private String marca;
    
    /**
     *  Constructor de objetos Carro
     * @param   placa   placa que identifica cada camion
     * @param   marca   la marca del carro, ej: Hino, Jac, etc.
     */
    public camion(String placa, String marca)
    {
        this.placa = placa;
        this.marca = marca;
    }
    
    /**
     * Método para consultar la placa
     * @return  la placa del camion 
     */
    public String getPlaca() 
    {
        return placa;
    }
    /**
     * Método para consultar la marca
     * @return  la marca del camion
     */
    public String getMarca() 
    {
        return marca;
    }

}
