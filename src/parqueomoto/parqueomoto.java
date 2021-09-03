/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parqueomoto;

/**
 *
 * @author KATHE
 */
public class parqueomoto {

public class parqueo {
 
    private Moto[] motos = new Moto[20];

 /**
  * Método para parquear una moto.
  * Se busca una posición disponible y si se encuentra se guarda 
  * la moto y se retorna true, indicando que se pudo parquear. 
  * Si no se encuentra ninguna posición disponible se retorna false,
  * indicado que no se pudo parquear la moto.
  * @param moto la moto que se desea parquear
  * @return  true si se pudo parquear o false en caso contrario
  */
 public boolean parquearMoto (Moto moto) 
 {
  for (int i = 0; i < motos.length; i++) 
  {
   if (motos[i] == null)
   {
    motos[i] = moto;
    return true;
   }
  }
  return false;
 }
 

 /**
  * Método para sacar una moto del parqueadero, dada su placa.
  * Si se encuentra la moto se retira del parqueadero y 
  * se retorna true, indicando que si se pudo sacar la moto.
  * Si  no se encuentra la moto, se retorna false.
  * @param placa la placa de la moto que se desea sacar del paqueadero
  * @return  true si se pudo sacar la moto o false en caso contrario
  */
 public boolean sacarMoto(String placa)
 {
  for (int i = 0; i < motos.length; i++) 
  {
   if (motos[i] != null)
   {
    if (motos[i].getPlaca().equals(placa))
    {
     motos[i] = null;
     return true;
    }
   }
  }
  return false;
 }
 
 
 /**
  * Método para buscar la moto en el parqueadero, dada la placa.
  * @param placa la placa de la moto que se desea buscar
  * @return  la moto (si se encuentra) o null si no se encuentra
  */
 public Moto buscarMoto(String placa)
 {
  for (int i = 0; i < motos.length; i++) 
  {
   if (motos[i] != null)
   {
    if (motos[i].getPlaca().equals(placa))
    {
     return motos[i];
    }
   }
  }
  return null;
 }

} 

}
