package logica;

import java.util.Date;

public class Inmueble {

    private int idInmueble;
    private String tipoInmueble;
    private String ubicacion;
    private String estado;
    private String descripcion;

    public Inmueble() {
    }

    public Inmueble(int idInmueble, String tipoInmueble, String ubicacion, String estado, String descripcion) {
        this.idInmueble = idInmueble;
        this.tipoInmueble = tipoInmueble;
        this.ubicacion = ubicacion;
        this.estado = estado;
        this.descripcion = descripcion;
    }

    public int getIdInmueble() {
        return idInmueble;
    }

    public void setIdInmueble(int idInmueble) {
        this.idInmueble = idInmueble;
    }

    public String getTipoInmueble() {
        return tipoInmueble;
    }

    public void setTipoInmueble(String tipoInmueble) {
        this.tipoInmueble = tipoInmueble;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

}
