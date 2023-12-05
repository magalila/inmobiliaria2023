package logica;

import java.util.Date;

public class CuentaCorriente {

    private int idCuenta;
    private String numeroDocumento;
    private int idContrato;
    private double saldoActual;

    public CuentaCorriente() {
    }

    public CuentaCorriente(int idCuenta, String numeroDocumento, int idContrato, double saldoActual) {
        this.idCuenta = idCuenta;
        this.numeroDocumento = numeroDocumento;
        this.idContrato = idContrato;
        this.saldoActual = saldoActual;
    }

    public int getIdCuenta() {
        return idCuenta;
    }

    public void setIdCuenta(int idCuenta) {
        this.idCuenta = idCuenta;
    }

    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    public int getIdContrato() {
        return idContrato;
    }

    public void setIdContrato(int idContrato) {
        this.idContrato = idContrato;
    }

    public double getSaldoActual() {
        return saldoActual;
    }

    public void setSaldoActual(double saldoActual) {
        this.saldoActual = saldoActual;
    }

}
