package logica;

import java.util.Date;

public class PaginaWeb {

    private int idUsuario;
    private String numeroDocumento;

    public PaginaWeb() {
    }

    public PaginaWeb(int idUsuario, String numeroDocumento) {
        this.idUsuario = idUsuario;
        this.numeroDocumento = numeroDocumento;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

}
