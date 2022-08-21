//
package proyectoFinal;
//
import java.io.Serializable;
//import java.date;
//
public class Cuentahabiente implements Serializable{
    private String nombres, apellidoPaterno, apellidoMaterno, ciudad, correoElectronico, numeroTelefonico;
    private long numeroTarjetaCuenta;
    private int nip;
    private double saldo;
    
    private int intentos;
    private boolean estado;

    //private static String transacciones;
    
    
    public Cuentahabiente() {
        this.intentos=3;
        this.estado=true;
    }

    public Cuentahabiente(String nombres, String apellidoPaterno, String apellidoMaterno, String ciudad, String correoElectronico, String numeroTelefonico, long numeroTarjetaCuenta, int nip, double saldo) {
        this.nombres = nombres;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.ciudad = ciudad;
        this.correoElectronico = correoElectronico;
        this.numeroTelefonico = numeroTelefonico;
        this.numeroTarjetaCuenta = numeroTarjetaCuenta;
        this.nip = nip;
        this.saldo = saldo;
        
        this.intentos=3;
        this.estado=true;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public String getNumeroTelefonico() {
        return numeroTelefonico;
    }

    public void setNumeroTelefonico(String numeroTelefonico) {
        this.numeroTelefonico = numeroTelefonico;
    }

    public long getNumeroTarjetaCuenta() {
        return numeroTarjetaCuenta;
    }

    public void setNumeroTarjetaCuenta(long numeroTarjetaCuenta) {
        this.numeroTarjetaCuenta = numeroTarjetaCuenta;
    }

    public int getNip() {
        return nip;
    }

    public void setNip(int nip) {
        this.nip = nip;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getIntentos() {
        return intentos;
    }

    public void setIntentos(int intentos) {
        this.intentos = intentos;
    }
    
    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    
    @Override
    public String toString() {
        return "Cuenta Habiente:\n" +
                "\nNombre: " + nombres +
                "\nApellido Paterno: " + apellidoPaterno +
                "\nApellido Maternos: " + apellidoMaterno +
                "\nCiudad: " + ciudad +
                "\nCorreo Electronico: " + correoElectronico +
                "\nNumero Telefonico: " + numeroTelefonico +
                "\nNumero Tarjeta Cuenta: " + numeroTarjetaCuenta +
                "\nNIP: " + nip +
                "\nSaldo: " + saldo +
                "\nIntentos: " + intentos +
                "\nEstado: " + estado;
    }    
}
