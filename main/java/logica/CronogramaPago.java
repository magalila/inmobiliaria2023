package logica;

import java.util.Date;

public class CronogramaPago {

    private int idCronograma;
    private int idContrato;
    private int nroCuota;
    private int monto;
    private Date primerFechaPago;
    private Date segundaFechaPago;

    public CronogramaPago() {
    }

    public CronogramaPago(int idCronograma, int idContrato, int nroCuota, int monto, Date primerFechaPago, Date segundaFechaPago) {
        this.idCronograma = idCronograma;
        this.idContrato = idContrato;
        this.nroCuota = nroCuota;
        this.monto = monto;
        this.primerFechaPago = primerFechaPago;
        this.segundaFechaPago = segundaFechaPago;
    }

    public int getIdCronograma() {
        return idCronograma;
    }

    public void setIdCronograma(int idCronograma) {
        this.idCronograma = idCronograma;
    }

    public int getIdContrato() {
        return idContrato;
    }

    public void setIdContrato(int idContrato) {
        this.idContrato = idContrato;
    }

    public int getNroCuota() {
        return nroCuota;
    }

    public void setNroCuota(int nroCuota) {
        this.nroCuota = nroCuota;
    }

    public int getMonto() {
        return monto;
    }

    public void setMonto(int monto) {
        this.monto = monto;
    }

    public Date getPrimerFechaPago() {
        return primerFechaPago;
    }

    public void setPrimerFechaPago(Date primerFechaPago) {
        this.primerFechaPago = primerFechaPago;
    }

    public Date getSegundaFechaPago() {
        return segundaFechaPago;
    }

    public void setSegundaFechaPago(Date segundaFechaPago) {
        this.segundaFechaPago = segundaFechaPago;
    }

}
