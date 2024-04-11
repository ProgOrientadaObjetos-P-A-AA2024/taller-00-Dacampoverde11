
package paquete2;
import java.util.Scanner;
import paquete3.Informacion;
import paquete1.Mensaje;


public class Demo002 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String cadena1= Mensaje.obtenerMensaje();
        int habitantes= Informacion.obtenerHabitantes();
        int respuesta;
        String mostrar = String.format("%s con %d\n", cadena1
                , habitantes);
        
        System.out.print("Si desea mostrar el mensaje en mayusculas ingrese "
                + "numeros del 1 al 5; caso contrario, ingrese otro valor numerico: ");
        respuesta = sc.nextInt();
        
        if(respuesta>0&&respuesta <=5){
            System.out.printf("%s ",mostrar);
            
        }else{
            System.out.printf("%s ",mostrar.toUpperCase());
            
        }

    }

}

