package logica;

import java.util.Date;

public class BoletaPago {

    private int idBoleta;
    private int idContrato;
    private double monto;
    private String estadoPago;
    private Date fechaEmision;
    private Date FfechaVencimiento;

    public BoletaPago() {
    }

    public BoletaPago(int idBoleta, int idContrato, double monto, String estadoPago, Date fechaEmision, Date FfechaVencimiento) {
        this.idBoleta = idBoleta;
        this.idContrato = idContrato;
        this.monto = monto;
        this.estadoPago = estadoPago;
        this.fechaEmision = fechaEmision;
        this.FfechaVencimiento = FfechaVencimiento;
    }

    public int getIdBoleta() {
        return idBoleta;
    }

    public void setIdBoleta(int idBoleta) {
        this.idBoleta = idBoleta;
    }

    public int getIdContrato() {
        return idContrato;
    }

    public void setIdContrato(int idContrato) {
        this.idContrato = idContrato;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public String getEstadoPago() {
        return estadoPago;
    }

    public void setEstadoPago(String estadoPago) {
        this.estadoPago = estadoPago;
    }

    public Date getFechaEmision() {
        return fechaEmision;
    }

    public void setFechaEmision(Date fechaEmision) {
        this.fechaEmision = fechaEmision;
    }

    public Date getFfechaVencimiento() {
        return FfechaVencimiento;
    }

    public void setFfechaVencimiento(Date FfechaVencimiento) {
        this.FfechaVencimiento = FfechaVencimiento;
    }

}
