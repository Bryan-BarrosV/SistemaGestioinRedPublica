package ec.edu.ups.poo.clases;
import java.util.ArrayList;
import java.util.List;

public class Persona {
    private String cedula;
    private String nombre;
    private String apellido;
    private String telefono;
    private String correo;
    private List<Direccion> direcciones;

    public Persona(String cedula, String nombre, String apellido, String telefono, String correoElectronico) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.correo = correoElectronico;
        this.direcciones = new ArrayList<Direccion>();
    }

    public Persona() {
        this.direcciones = new ArrayList<Direccion>();
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
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



    public void setDirecciones(List<Direccion> direcciones) {
        this.direcciones = direcciones;

    }
    public void addDireccion(Direccion direccion) {
        // objetivo: ir agregando la direccion una a una a la lista de direcciones
        direcciones.add(direccion);
    }
    public List<Direccion> getDirecciones() {
        return direcciones;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "cedula='" + cedula + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", telefono='" + telefono + '\'' +
                ", correo='" + correo + '\'' +
                ", direcciones=" + direcciones +
                '}';
    }
}