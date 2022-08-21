//
package proyectoFinal;
//
import java.io.IOException;
import java.util.Scanner;
//
public class Test {
    public static void main(String[] args) throws IOException {
        cuentasAccionesAnexas cuentasAA = new cuentasAccionesAnexas();        
        //cuentasAA.crearCuentas();
        //cuentasAA.reestablecerIntentosEstatusCuenta(1234123412344321L);
            
        cuentasAccionesPrincipales cuentasAP = new cuentasAccionesPrincipales();
        cuentasAP.mostrarDatosCuenta(1234123412344321L);
        cuentasAP.mostrarDatosCuenta(1234123412341234L);
        cuentasAP.mostrarDatosCuenta(1234123412341111L);
        try {
            System.out.println("Reestablecer Intentos/Estatus Cuenta");//(Temporal)
            cuentasAA.reestablecerIntentosEstatusCuenta(1234123412344321L);
        } catch (IOException ex) {
            System.out.println("Error: " + ex);
        }
        /*int nip;
        Scanner entrada = new Scanner(System.in);//(Temp)
        for (int i = 0; i < 5; i++) {
            System.out.print("Nip: ");
            nip = entrada.nextInt();
            cuentasAP.ingresoCuenta(1234123412344321L, nip);
        }*/
    }
}
