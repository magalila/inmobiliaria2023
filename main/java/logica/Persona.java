package logica;

import java.util.Date;
import java.util.List;

public class Persona {

    private String numeroDocumento;
    private String nombre;
    private String apellido;
    private String nroDocumento;
    private String tipoDocumento;
    private String estadoCivil;
    private String domicilio;
    private String telefono;
    private String correo;
    private String tipoActividad;
    private String ultimoRecibo;
    private String comprobantesMonotributo;
    private PaginaWeb unaWeb; //relacion 1 a 1
    private List<CuentaCorriente>listaCC;//relacion 1 a n

    public Persona() {
    }

    public Persona(String numeroDocumento, String nombre, String apellido, String nroDocumento, String tipoDocumento, String estadoCivil, String domicilio, String telefono, String correo, String tipoActividad, String ultimoRecibo, String comprobantesMonotributo) {
        this.numeroDocumento = numeroDocumento;
        this.nombre = nombre;
        this.apellido = apellido;
        this.nroDocumento = nroDocumento;
        this.tipoDocumento = tipoDocumento;
        this.estadoCivil = estadoCivil;
        this.domicilio = domicilio;
        this.telefono = telefono;
        this.correo = correo;
        this.tipoActividad = tipoActividad;
        this.ultimoRecibo = ultimoRecibo;
        this.comprobantesMonotributo = comprobantesMonotributo;
    }

    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNroDocumento() {
        return nroDocumento;
    }

    public void setNroDocumento(String nroDocumento) {
        this.nroDocumento = nroDocumento;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTipoActividad() {
        return tipoActividad;
    }

    public void setTipoActividad(String tipoActividad) {
        this.tipoActividad = tipoActividad;
    }

    public String getUltimoRecibo() {
        return ultimoRecibo;
    }

    public void setUltimoRecibo(String ultimoRecibo) {
        this.ultimoRecibo = ultimoRecibo;
    }

    public String getComprobantesMonotributo() {
        return comprobantesMonotributo;
    }

    public void setComprobantesMonotributo(String comprobantesMonotributo) {
        this.comprobantesMonotributo = comprobantesMonotributo;
    }

}
