package ec.edu.ups.poo.clases;

import ec.edu.ups.poo.enums.Rol;

import java.util.GregorianCalendar;

public class Asignacion {
    private Persona persona;
    private GregorianCalendar fecha;
    private Rol rol;

    public Asignacion(Persona persona, GregorianCalendar fecha, Rol rol) {
        this.persona = persona;
        this.fecha = fecha;
        this.rol = rol;
    }

    public Asignacion(Visitante visitante, GregorianCalendar fecha, Rol rol) {
    }

    // Getters y Setters
    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public GregorianCalendar getFecha() {
        return fecha;
    }

    public void setFecha(GregorianCalendar fecha) {
        this.fecha = fecha;
    }

    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }
}