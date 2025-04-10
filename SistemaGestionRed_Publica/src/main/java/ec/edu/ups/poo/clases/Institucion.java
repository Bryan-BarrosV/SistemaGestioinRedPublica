package ec.edu.ups.poo.clases;

import java.util.ArrayList;
import java.util.List;
import ec.edu.ups.poo.enums.TipoDireccion;

public class Institucion {
    private String nombre;
    private List<String> sedes;
    private List<Direccion> direccion;
    private List<Asignacion> asignaciones;

    public Institucion(int i, String nombre) {
        this.nombre = nombre;
        this.sedes = new ArrayList<>();
        this.direccion = new ArrayList<>();
        this.asignaciones = new ArrayList<>();
    }

    public void addDireccion(TipoDireccion tipo, String calle, String numero, String ciudad, String provincia, String pais) {
        this.direccion.add(new Direccion(tipo, calle, numero, ciudad, provincia, pais));
    }

    public String getNombre( ) {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<String> getSedes() {
        return sedes;
    }

    public List<Direccion> getDireccion() {
        return direccion;
    }

    public List<Asignacion> getAsignaciones() {
        return asignaciones;
    }
}