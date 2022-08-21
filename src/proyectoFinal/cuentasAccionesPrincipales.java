//
package proyectoFinal;
//
import java.io.*;
import javax.swing.JOptionPane;
import java.util.*;
//
public class cuentasAccionesPrincipales {

    public boolean buscarCuentas(long numeroTarjetaCuentaBuscar) throws FileNotFoundException, IOException {
        File info = new File(numeroTarjetaCuentaBuscar + ".dat");
        return info.exists();
    }
    
    public int regresoIntentosCuenta(long numeroTarjetaCuentaModificar) throws FileNotFoundException, IOException {
        int intentos;
        Cuentahabiente cuentahabiente = new Cuentahabiente();
        try (ObjectInputStream arch = new ObjectInputStream(new FileInputStream(numeroTarjetaCuentaModificar + ".dat"))) {
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
        intentos = cuentahabiente.getIntentos();
        return intentos;
    }
    
    public String regresoNombreCuenta(long numeroTarjetaCuentaModificar) throws FileNotFoundException, IOException {
        String nombre;
        Cuentahabiente cuentahabiente = new Cuentahabiente();
        try (ObjectInputStream arch = new ObjectInputStream(new FileInputStream(numeroTarjetaCuentaModificar + ".dat"))) {
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
        nombre = cuentahabiente.getNombres();
        return nombre;
    }
    
    public String regresoCiudadCuenta(long numeroTarjetaCuentaModificar) throws FileNotFoundException, IOException {
        String ciudad;
        Cuentahabiente cuentahabiente = new Cuentahabiente();
        try (ObjectInputStream arch = new ObjectInputStream(new FileInputStream(numeroTarjetaCuentaModificar + ".dat"))) {
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
        ciudad = cuentahabiente.getCiudad();
        return ciudad;
    }
    
    public double regresoDineroCuenta(long numeroTarjetaCuentaModificar) throws FileNotFoundException, IOException {
        double dinero;
        Cuentahabiente cuentahabiente = new Cuentahabiente();
        try (ObjectInputStream arch = new ObjectInputStream(new FileInputStream(numeroTarjetaCuentaModificar + ".dat"))) {
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
        dinero = cuentahabiente.getSaldo();
        return dinero;
    }
    
    public void disminuirIntentosCuenta(long numeroTarjetaCuentaModificar) throws FileNotFoundException, IOException {
        int intentos;
        Cuentahabiente cuentahabiente = new Cuentahabiente();
        try (ObjectInputStream arch = new ObjectInputStream(new FileInputStream(numeroTarjetaCuentaModificar + ".dat"))) {
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
        intentos = cuentahabiente.getIntentos();
        intentos--;
        cuentahabiente.setIntentos(intentos);
        try {
            FileOutputStream archivoF = new FileOutputStream(numeroTarjetaCuentaModificar + ".dat");
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
    
    public void reestablecerIntentosCuenta(long numeroTarjetaCuentaModificar) throws FileNotFoundException, IOException {
        Cuentahabiente cuentahabiente = new Cuentahabiente();
        try (ObjectInputStream arch = new ObjectInputStream(new FileInputStream(numeroTarjetaCuentaModificar + ".dat"))) {
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
        try {
            FileOutputStream archivoF = new FileOutputStream(numeroTarjetaCuentaModificar + ".dat");
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
    
    public void bloquearCuenta(long numeroTarjetaCuentaModificar) throws FileNotFoundException, IOException {
        Cuentahabiente cuentahabiente = new Cuentahabiente();
        try (ObjectInputStream arch = new ObjectInputStream(new FileInputStream(numeroTarjetaCuentaModificar + ".dat"))) {
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
        cuentahabiente.setIntentos(0);
        cuentahabiente.setEstado(false);
        try {
            FileOutputStream archivoF = new FileOutputStream(numeroTarjetaCuentaModificar + ".dat");
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
    
    public void mostrarDatosCuenta(long numeroTarjetaCuentaModificar) throws FileNotFoundException, IOException {
        Cuentahabiente cuentahabiente = new Cuentahabiente();
        try (ObjectInputStream arch = new ObjectInputStream(new FileInputStream(numeroTarjetaCuentaModificar + ".dat"))) {
            try {
                do {
                    cuentahabiente = (Cuentahabiente) arch.readObject();
                    JOptionPane.showMessageDialog(null,"Cliente: "+cuentahabiente);
                } while (true);
            } catch (EOFException e) {
                //System.out.println("Error: "+e);
            } catch (ClassNotFoundException e) {
                System.out.println("Error: " + e);
            }
            arch.close();
        }
    }
    
    public boolean buscarCuentasMostrarMensaje(long numeroTarjetaCuentaBuscar) throws FileNotFoundException, IOException {
        File info = new File(numeroTarjetaCuentaBuscar + ".dat");
        if (!info.exists()) {
            JOptionPane.showMessageDialog(null,"El número de cuenta ingresado NO ha sido registrado!");
        }
        return info.exists();
    }
    
    public boolean ingresoCuenta(long numeroTarjetaCuenta, int nip) throws FileNotFoundException, IOException {
        Cuentahabiente cuentahabiente = new Cuentahabiente();
        try (ObjectInputStream arch = new ObjectInputStream(new FileInputStream(numeroTarjetaCuenta + ".dat"))) {
            try {
                do {
                    cuentahabiente = (Cuentahabiente) arch.readObject();
                } while (true);
            } catch (EOFException e) {
                //System.out.println("Error: "+e);
            } catch (ClassNotFoundException e) {
                System.out.println("Error: " + e);
            }
            arch.close();
        }
        if (cuentahabiente.isEstado()) {
            int intentos;
            if (nip == cuentahabiente.getNip()) {
                reestablecerIntentosCuenta(numeroTarjetaCuenta);
                //System.out.println("\nSe ha ingresado a su cuenta");//(Temp)
                return true;
            } else {
                disminuirIntentosCuenta(numeroTarjetaCuenta);
                intentos = regresoIntentosCuenta(numeroTarjetaCuenta);
                if (intentos == 0) {
                    JOptionPane.showMessageDialog(null, "Demasiados intentos.\nSu tarjeta ha sido bloqueada.");
                    bloquearCuenta(numeroTarjetaCuenta);
                } else {
                    JOptionPane.showMessageDialog(null, "Contraseña incorrecta.\nLe quedan " + intentos + " intento(s) antes de que su tarjeta sea bloqueada.");
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Su tarjeta se encuentra bloqueada.");
        }
        return false;
    }
    
    public boolean comprobarPinCambioNip(long numeroTarjetaCuenta, int nip) throws FileNotFoundException, IOException {
        Cuentahabiente cuentahabiente = new Cuentahabiente();
        try (ObjectInputStream arch = new ObjectInputStream(new FileInputStream(numeroTarjetaCuenta + ".dat"))) {
            try {
                do {
                    cuentahabiente = (Cuentahabiente) arch.readObject();
                } while (true);
            } catch (EOFException e) {
                //System.out.println("Error: "+e);
            } catch (ClassNotFoundException e) {
                System.out.println("Error: " + e);
            }
            arch.close();
        }
        if (nip == cuentahabiente.getNip()) {            
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "Pin Actual incorrecto.");
            return false;
        }
    }
    
    public void cambioNip(long numeroTarjetaCuentaModificar, int nipCambio) throws FileNotFoundException, IOException {
        Cuentahabiente cuentahabiente = new Cuentahabiente();
        try (ObjectInputStream arch = new ObjectInputStream(new FileInputStream(numeroTarjetaCuentaModificar + ".dat"))) {
            try {
                do {
                    cuentahabiente = (Cuentahabiente) arch.readObject();
                } while (true);
            } catch (EOFException e) {
                //System.out.println("Error: "+e);
            } catch (ClassNotFoundException e) {
                System.out.println("Error: " + e);
            }
            arch.close();
        }
        cuentahabiente.setNip(nipCambio); 
        try {
            FileOutputStream archivoF = new FileOutputStream(numeroTarjetaCuentaModificar + ".dat");
            try (ObjectOutputStream archivoO = new ObjectOutputStream(archivoF)) {
                archivoO.writeObject(cuentahabiente);
                archivoO.close();
            }
        } catch (FileNotFoundException ex) {
            System.err.println("Error: " + ex);
        } catch (IOException ex) {
            System.err.println("Error: " + ex);
        }
    }
    
    public void retiroEfectivo(long numeroTarjetaCuentaModificar, double dineroRetirado) throws FileNotFoundException, IOException {
        Cuentahabiente cuentahabiente = new Cuentahabiente();
        try (ObjectInputStream arch = new ObjectInputStream(new FileInputStream(numeroTarjetaCuentaModificar + ".dat"))) {
            try {
                do {
                    cuentahabiente = (Cuentahabiente) arch.readObject();
                } while (true);
            } catch (EOFException e) {
                //System.out.println("Error: "+e);
            } catch (ClassNotFoundException e) {
                System.out.println("Error: " + e);
            }
            arch.close();
        }
        double dinero;
        dinero = cuentahabiente.getSaldo();
        if (dinero<dineroRetirado) {
            JOptionPane.showMessageDialog(null,"Saldo insuficiente.");
        }else {
            dinero = dinero - dineroRetirado;
            cuentahabiente.setSaldo(dinero);
            try {
                FileOutputStream archivoF = new FileOutputStream(numeroTarjetaCuentaModificar + ".dat");
                try (ObjectOutputStream archivoO = new ObjectOutputStream(archivoF)) {
                    archivoO.writeObject(cuentahabiente);
                    archivoO.close();
                }
            } catch (FileNotFoundException ex) {
                System.err.println("Error: " + ex);
            } catch (IOException ex) {
                System.err.println("Error: " + ex);
            }
            JOptionPane.showMessageDialog(null,"Retiro exitoso.");
        }
    }
    
    public boolean comprobarTransferencia(long numeroTarjetaCuentaModificar, double dineroRestar) throws FileNotFoundException, IOException {
        Cuentahabiente cuentahabiente = new Cuentahabiente();
        try (ObjectInputStream arch = new ObjectInputStream(new FileInputStream(numeroTarjetaCuentaModificar + ".dat"))) {
            try {
                do {
                    cuentahabiente = (Cuentahabiente) arch.readObject();
                } while (true);
            } catch (EOFException e) {
                //System.out.println("Error: "+e);
            } catch (ClassNotFoundException e) {
                System.out.println("Error: " + e);
            }
            arch.close();
        }
        
        double dinero;
        dinero = cuentahabiente.getSaldo();
        if (dinero<dineroRestar) {
            JOptionPane.showMessageDialog(null,"Saldo insuficiente.");
            return false;
        }else {
            return true;
        }
    }
    
    public void realizarTransferencia(long cuentaEmisor, long cuentaReceptor, double dineroTrasnferencia) throws FileNotFoundException, IOException {
        double dineroEmisor,dineroReceptor;
        Cuentahabiente cuentahabienteEmisor = new Cuentahabiente();
        try (ObjectInputStream arch = new ObjectInputStream(new FileInputStream(cuentaEmisor + ".dat"))) {
            try {
                do {
                    cuentahabienteEmisor = (Cuentahabiente) arch.readObject();
                } while (true);
            } catch (EOFException e) {
                //System.out.println("Error: "+e);
            } catch (ClassNotFoundException e) {
                System.out.println("Error: " + e);
            }
            arch.close();
        }
        
        dineroEmisor = cuentahabienteEmisor.getSaldo();
        dineroEmisor = dineroEmisor-dineroTrasnferencia;
        cuentahabienteEmisor.setSaldo(dineroEmisor);
        
        try {
            FileOutputStream archivoF = new FileOutputStream(cuentaEmisor + ".dat");
            try (ObjectOutputStream archivoO = new ObjectOutputStream(archivoF)) {
                archivoO.writeObject(cuentahabienteEmisor);
                archivoO.close();
            }
        } catch (FileNotFoundException ex) {
            System.err.println("Error: " + ex);
        } catch (IOException ex) {
            System.err.println("Error: " + ex);
        }
        
        Cuentahabiente cuentahabienteReceptor = new Cuentahabiente();
        try (ObjectInputStream arch = new ObjectInputStream(new FileInputStream(cuentaReceptor + ".dat"))) {
            try {
                do {
                    cuentahabienteReceptor = (Cuentahabiente) arch.readObject();
                } while (true);
            } catch (EOFException e) {
                //System.out.println("Error: "+e);
            } catch (ClassNotFoundException e) {
                System.out.println("Error: " + e);
            }
            arch.close();
        }
        
        dineroReceptor = cuentahabienteReceptor.getSaldo();
        dineroReceptor = dineroReceptor+dineroTrasnferencia;
        cuentahabienteReceptor.setSaldo(dineroReceptor);
        
        try {
            FileOutputStream archivoF = new FileOutputStream(cuentaReceptor + ".dat");
            try (ObjectOutputStream archivoO = new ObjectOutputStream(archivoF)) {
                archivoO.writeObject(cuentahabienteReceptor);
                archivoO.close();
            }
        } catch (FileNotFoundException ex) {
            System.err.println("Error: " + ex);
        } catch (IOException ex) {
            System.err.println("Error: " + ex);
        }
        JOptionPane.showMessageDialog(null, "Transferencia exitosa.");
        
        boolean existenciaTransferencia;
        existenciaTransferencia = buscarArchivoTransferencia(cuentaEmisor);
        String fecha = registrarFecha();
        
        String cuentaImprimir,p1,p2,p3,p4;
        cuentaImprimir =""+cuentaReceptor;
        p1 = cuentaImprimir.substring(0, 4)+" ";
        p2 = cuentaImprimir.substring(4, 8)+" ";
        p3 = cuentaImprimir.substring(8, 12)+" ";
        p4 = cuentaImprimir.substring(12, 16);
        cuentaImprimir=p1+p2+p3+p4;
        //System.out.println("cuentaImprimir = " + cuentaImprimir);
        
        String transaccion;
        transaccion=" "+fecha+"\t"+cuentaImprimir+"\t"+"$ "+dineroTrasnferencia;//!!!!!!!!!!!!!!!!!
        
        File archivo;
        FileWriter escribir;
        PrintWriter linea;
        archivo = new File(cuentaEmisor + "_Ticket.txt");
        if (existenciaTransferencia) {
            try {
                escribir = new FileWriter(archivo,true);
                linea = new PrintWriter(escribir);
                linea.println(transaccion);
                escribir.close();
            }catch(IOException ex){
                System.out.println("Error: " + ex);
            }
        }else{
            try {
                archivo.createNewFile();
                escribir = new FileWriter(archivo,true);
                linea = new PrintWriter(escribir);
                linea.println(transaccion);
                escribir.close();
            }catch(IOException ex){
                System.out.println("Error: " + ex);
            }
        }
    }
    
    public boolean buscarArchivoTransferencia(long numeroTarjetaCuentaBuscar) throws FileNotFoundException, IOException {
        File info = new File(numeroTarjetaCuentaBuscar + "_Ticket.txt");
        return info.exists();
    }
    
    public String registrarFecha(){
        Calendar calendario = Calendar.getInstance();
        int dia = calendario.get(Calendar.DAY_OF_MONTH);
        int mes = calendario.get(Calendar.MONTH); mes++;
        int anio = calendario.get(Calendar.YEAR);
        int hora = calendario.get(Calendar.HOUR_OF_DAY);
        int minutos = calendario.get(Calendar.MINUTE);
        int segundos = calendario.get(Calendar.SECOND);
        String fecha;
        fecha = dia+"/"+mes+"/"+anio+"  "+ hora+":"+minutos+":"+segundos;
        //System.out.println("fecha = " + fecha);//(Temporal)
        return fecha;
    }
}
