package logica;

import java.util.Date;
import java.util.List;

public class Contrato {

    private int idContrato;
    private String locadorDocumento;
    private String locatarioDocumento;
    private String garanteDocumento;
    private int idInmueble;
    private String tipoContrato;
    private Date primerFechaPago;
    private Date segundaFechaPago;
    private int duracion;
    private double arancelEspecial;
    private String tipoComision;
    private double comision;
    private double recargoFijo;
    private double valorProporcional;
    private List<CuentaCorriente> listaCc;
    private List<CronogramaPago> listaCronogramaPago;
    private List<BoletaPago> listaBoletaPago;

    public Contrato() {
    }

    public Contrato(int idContrato, String locadorDocumento, String locatarioDocumento, String garanteDocumento, int idInmueble, String tipoContrato, Date primerFechaPago, Date segundaFechaPago, int duracion, double arancelEspecial, String tipoComision, double comision, double recargoFijo, double valorProporcional) {
        this.idContrato = idContrato;
        this.locadorDocumento = locadorDocumento;
        this.locatarioDocumento = locatarioDocumento;
        this.garanteDocumento = garanteDocumento;
        this.idInmueble = idInmueble;
        this.tipoContrato = tipoContrato;
        this.primerFechaPago = primerFechaPago;
        this.segundaFechaPago = segundaFechaPago;
        this.duracion = duracion;
        this.arancelEspecial = arancelEspecial;
        this.tipoComision = tipoComision;
        this.comision = comision;
        this.recargoFijo = recargoFijo;
        this.valorProporcional = valorProporcional;
    }

    public int getIdContrato() {
        return idContrato;
    }

    public void setIdContrato(int idContrato) {
        this.idContrato = idContrato;
    }

    public String getLocadorDocumento() {
        return locadorDocumento;
    }

    public void setLocadorDocumento(String locadorDocumento) {
        this.locadorDocumento = locadorDocumento;
    }

    public String getLocatarioDocumento() {
        return locatarioDocumento;
    }

    public void setLocatarioDocumento(String locatarioDocumento) {
        this.locatarioDocumento = locatarioDocumento;
    }

    public String getGaranteDocumento() {
        return garanteDocumento;
    }

    public void setGaranteDocumento(String garanteDocumento) {
        this.garanteDocumento = garanteDocumento;
    }

    public int getIdInmueble() {
        return idInmueble;
    }

    public void setIdInmueble(int idInmueble) {
        this.idInmueble = idInmueble;
    }

    public String getTipoContrato() {
        return tipoContrato;
    }

    public void setTipoContrato(String tipoContrato) {
        this.tipoContrato = tipoContrato;
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

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public double getArancelEspecial() {
        return arancelEspecial;
    }

    public void setArancelEspecial(double arancelEspecial) {
        this.arancelEspecial = arancelEspecial;
    }

    public String getTipoComision() {
        return tipoComision;
    }

    public void setTipoComision(String tipoComision) {
        this.tipoComision = tipoComision;
    }

    public double getComision() {
        return comision;
    }

    public void setComision(double comision) {
        this.comision = comision;
    }

    public double getRecargoFijo() {
        return recargoFijo;
    }

    public void setRecargoFijo(double recargoFijo) {
        this.recargoFijo = recargoFijo;
    }

    public double getValorProporcional() {
        return valorProporcional;
    }

    public void setValorProporcional(double valorProporcional) {
        this.valorProporcional = valorProporcional;
    }

}
