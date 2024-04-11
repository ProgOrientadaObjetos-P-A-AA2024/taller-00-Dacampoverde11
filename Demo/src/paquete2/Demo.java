/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;
import paquete3.Informacion;
import paquete1.Mensaje;


public class Demo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // importar los metodos de los diferentes paquetes, para invocarlos 
        // desde el printf y poder mostrar el mensaje solictado
        System.out.printf("%s con %d\n", Mensaje.obtenerMensaje()
                , Informacion.obtenerHabitantes());
        // usar printf;
    }
    
}
