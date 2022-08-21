//
package proyectoFinal;
//
import java.util.*;
//
public class Transaccion {
    
    public static void main(String[] args) {
        Calendar calendario = Calendar.getInstance();
        int dia = calendario.get(Calendar.DAY_OF_MONTH);
        int mes = calendario.get(Calendar.MONTH); mes++;
        int anio = calendario.get(Calendar.YEAR);
        int hora = calendario.get(Calendar.HOUR_OF_DAY);
        int minutos = calendario.get(Calendar.MINUTE);
        int segundos = calendario.get(Calendar.SECOND);
        String fecha;
        fecha = dia+"/"+mes+"/"+anio+"  "+ hora+":"+minutos+":"+segundos;
        System.out.println("fecha = " + fecha);
        //                       HISTORIAL DE TRANSACCIONES
        //          FECHA                      CUENTA                 CANTIDAD
        //  1. 22/11/21  11:33:34        1234 1234 1234 1234        $ 100,500.00
        //  2. 1/2/21  1:2:3        1212 1212 1212 1212        $ 5.33
        //  3. 23/2/21 22:3:12        2323 2323 2323 2323        $ 500.50
    }
}
