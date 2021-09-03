/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parqueocamion;
/**
 /* Se pueden adicionar y retirar carros del Parqueadero,
 /* y se puede consultar si está un carro (por la placa) y cuántos puestos
 /* hay disponibles.
 * @author KATHE
 */
public class parqueocamion {
 
    private Camion [] camion = new Camion[20];

 /**
  * Método para parquear un camion.
  * Se busca una posición disponible y si se encuentra se guarda 
  * el camion y se retorna true, indicando que se pudo parquear. 
  * Si no se encuentra ninguna posición disponible se retorna false,
  * indicado que no se pudo parquear el camion.
  * @param camion el camion que se desea parquear
  * @return  true si se pudo parquear o false en caso contrario
  */
 public boolean parquearCamion (Camion camion) 
 {
  for (int i = 0; i < camion.length; i++) 
  {
   if (camiones[i] == null)
   {
    camiones[i] = camion;
    return true;
   }
  }
  return false;
 }
 

 /**
  * Método para sacar un camion del parqueadero, dada su placa.
  * Si se encuentra el camion se retira del parqueadero y 
  * se retorna true, indicando que si se pudo sacar el camion.
  * Si  no se encuentra el camion, se retorna false.
  * @param placa la placa del camion que se desea sacar del paqueadero
  * @return  true si se pudo sacar el camion o false en caso contrario
  */
 public boolean sacarCamion(String placa)
 {
  for (int i = 0; i < camiones.length; i++) 
  {
   if (camiones[i] != null)
   {
    if (camiones[i].getPlaca().equals(placa))
    {
     camiones[i] = null;
     return true;
    }
   }
  }
  return false;
 }
 
 
 /**
  * Método para buscar un camion el parqueadero, dada la placa.
  * @param placa la placa del camion que se desea buscar
  * @return  el camion (si se encuentra) o null si no se encuentra
  */
 public Camion buscarCamion(String placa)
 {
  for (int i = 0; i < camion.length; i++) 
  {
   if (camiones[i] != null)
   {
    if (camiones[i].getPlaca().equals(placa))
    {
     return camiones[i];
    }
   }
  }
  return null
 }

}
