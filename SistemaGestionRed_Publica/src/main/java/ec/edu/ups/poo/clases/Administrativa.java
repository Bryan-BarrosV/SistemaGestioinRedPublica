package ec.edu.ups.poo.clases;

import java.util.List;

public class Administrativa extends Persona {
    private List<String> cargos;
    private List<String> administrativo;

    public Administrativa(String cedula, String nombre, String apellido, String telefono, String correoElectronico, List<String> cargos, List<String> administrativo) {
        super(cedula, nombre, apellido, telefono, correoElectronico);
        this.cargos = cargos;
        this.administrativo = administrativo;
    }

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
