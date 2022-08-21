//
package proyectoFinal;
//
import java.io.*;
import javax.swing.JOptionPane;
//
public class cuentasAccionesAnexas {
    public void crearCuentas(String c1,String c2,String c3,String c4,String c5,String c6,long c7,int c8,double c9) throws FileNotFoundException, IOException {        
        Cuentahabiente cliente = new Cuentahabiente(c1, c2, c3, c4, c5, c6, c7, c8, c9);
        JOptionPane.showMessageDialog(null, "Cliente: " + cliente);//(Opcional)
        try {
            FileOutputStream archivoF = new FileOutputStream(c7+".dat");
            try (ObjectOutputStream archivoO = new ObjectOutputStream(archivoF)) {
                archivoO.writeObject(cliente);
                archivoO.close();
            }
        } catch (FileNotFoundException ex) {
            System.err.println("Error: " + ex);
        } catch (IOException ex) {
            System.err.println("Error: " + ex);
        }
    }
    
    public void reestablecerIntentosEstatusCuenta(long numeroTarjetaCuentaCambiarEstatus) throws FileNotFoundException, IOException {
        Cuentahabiente cuentahabiente = new Cuentahabiente();
        try (ObjectInputStream arch = new ObjectInputStream(new FileInputStream(numeroTarjetaCuentaCambiarEstatus + ".dat"))) {
            try {
                do {
                    cuentahabiente = (Cuentahabiente) arch.readObject();
                    //JOptionPane.showMessageDialog(null,"Cliente: "+cuentahabiente);//(Temporal)
                } while (true);
            } catch (EOFException e) {
                //System.out.println("Error: "+e);
            } catch (ClassNotFoundException e) {
                System.out.println("Error: " + e);
            }
            arch.close();
        }
        cuentahabiente.setIntentos(3);
        cuentahabiente.setEstado(true);
        try {
            FileOutputStream archivoF = new FileOutputStream(numeroTarjetaCuentaCambiarEstatus + ".dat");
            try (ObjectOutputStream archivoO = new ObjectOutputStream(archivoF)) {
                archivoO.writeObject(cuentahabiente);
                //JOptionPane.showMessageDialog(null,"Cliente: "+cuentahabiente);//(Temporal)
                archivoO.close();
            }
        } catch (FileNotFoundException ex) {
            System.err.println("Error: " + ex);
        } catch (IOException ex) {
            System.err.println("Error: " + ex);
        }
    }
}
