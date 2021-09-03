/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menuparqueadero;

/**
 * Clase para hacer la gestión de un parqueadero a través de un menú básico de opciones
 * @author KATHE
 */
public class menuparqueadero {
    Parqueadero parquea = new Parqueadero();
    
    /**
     * Método para parquear un vehiculo:
     * Primero se verifica que existan puestos disponibles. Si hay puestos 
     * se piden los datos del vehiculo y se parquea.
     * En caso de no tener puestos disponibles se muestra un mensaje indicando esto.
     */
    
      public void parquearCarro() 
    {
            String placa = JOptionPane.showInputDialog("Placa del vehiculo:");
            // Verifica que el carro ya no esté parqueadao
            if (parquea.buscarVehiculo(placa) == null) 
            {
                String marca = JOptionPane.showInputDialog("Marca del vehiculo:");
                String modeloCadena = JOptionPane.showInputDialog("Modelo del vehiculo:");
                int modelo = Integer.parseInt(modeloCadena);
                Vehiculo nuevo = new Vehiculo(placa, marca);
                boolean pudoParquear = parquea.parquearVehiculo(nuevo);
                if (pudoParquear) 
                {
                JOptionPane.showMessageDialog(null,"El vehiculo fue parqueado exitosamente.");
                }
                else 
                {
                    JOptionPane.showMessageDialog(null,"No fue posible parquear el vehiculo. Intente más tarde");
                }
            }
            else 
            {
                JOptionPane.showMessageDialog(null,"Ya hay un vehiculo parqueado con esa placa.");
            }
    }
      
       /**
     * Método que permite buscar un vehiculo en el parqueadero y mostrar sus datos.
     * Para buscar el vehiculo es necesario solicitar al usuario la placa.
     * Si el vehiculo no se encuentra se debe mostrar un mensaje indicando esto.
     */
      
      public void buscarVehiculo() {
        String placa = JOptionPane.showInputDialog("Placa del vehiculo:");
        Vehiculo vehiculo = parquea.buscarVehiculo(placa);
        if (vehiculo == null) 
        {
            JOptionPane.showMessageDialog(null,"No se encuentra parqueado un vehiculo con esa placa");
        }
        else
        {
             JOptionPane.showMessageDialog(null,"Los datos del vehiculo son:  \n" +
                                    "Placa: "+ vehiculo.getPlaca() + "\n"+
                                    "Marca: "+ vehiculo.getMarca());
        }
    }
       /**
     * Método que permite sacar un vehiculo del parqueadero.
     * Para sacar el vehiculo se debe pedir la placa y luego se debe mostrar un mensaje
     * indicando si fue posible sacar el vehiculo o si no se encontraba en el parqueadero. 
     */
      
      public void sacarVehiculo() {
        String placa = JOptionPane.showInputDialog("Placa del vehiculo:");
        boolean pudoSacar = parquea.sacarVehiculo(placa);
        if (pudoSacar) 
        {
            JOptionPane.showMessageDialog(null,"El vehiculo se retiró del parqueadero exitosamente");
        }
        else 
        {
            JOptionPane.showMessageDialog(null,"No se encuentra parqueado el vehiculo con esa placa");
        }
    }
      
       /**
     * Método que muestra el menú del parqueadero al usuario, para que seleccione
     * lo que desea realizar: parquear un vehiculo, buscar un vehiculo o sacar un vehiculo.
     */
      
      public void menu() {
        
        int opcion=-1;
        do {
            // Menú con las opciones disponibles
            String valorSeleccionado = 
            JOptionPane.showInputDialog(" ---- MENU PARQUEADERO ---  \n" +
                        "1.Parquear un vehiculo    \n" +
                        "2.Buscar un vehiculo  \n" +
                        "3.Sacar un vehiculo   \n" +
                        "0.Terminar     \n\n" +
                        "Opción seleccionada: ");
            try 
            {
                
                opcion = Integer.parseInt(valorSeleccionado);
                switch (opcion){
                    // Opcion 1: Parquear un vehiculo
                    case 1: parquearVehiculo();
                            break;
                    
                    // Opcion 2: Buscar un vehiculo y mostrar sus datos 
                    case 2: buscarVehiculo();
                            break;
                            
                     // Opcion 3: Sacar un vehiculo del parqueadero
                    case 3: sacarVehiculo();
                            break;
    
                    case 0: break;
                    
                    default: JOptionPane.showMessageDialog(null,"Opción no disponible");    
                }
            }
            catch (NumberFormatException errorIngreso)
            {
                JOptionPane.showMessageDialog(null,"Dato ingresado incorrecto. Debe ser numérico");   
            }
        }
        while (opcion != 0);
        JOptionPane.showMessageDialog(null," - Terminación exitosa -");
      }
      
            }//Fin de la clase menuparqueadero
