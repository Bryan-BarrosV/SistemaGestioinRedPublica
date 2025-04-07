package ec.edu.ups.poo.clases;

import java.util.List;

public class Administrativa {
    private List<String> cargos;
    private List<String> administrativo;

    public List<String> getCargos() {
        return cargos;
    }
    public void setCargos(List<String> cargos) {
        this.cargos = cargos;
    }
    public List<String> getAdministrativo() {
        return administrativo;
    }
    public void setAdministrativo(List<String> administrativo) {
        this.administrativo = administrativo;
    }
}