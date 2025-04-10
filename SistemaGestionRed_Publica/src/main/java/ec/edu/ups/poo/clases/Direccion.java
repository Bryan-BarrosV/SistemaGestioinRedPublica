package ec.edu.ups.poo.clases;

import ec.edu.ups.poo.enums.TipoDireccion;

public class Direccion {
    private TipoDireccion tipo;
    private String calle;
    private String numero;
    private String ciudad;
    private String provincia;
    private String pais;

    public Direccion(TipoDireccion tipo, String calle, String numero, String ciudad, String provincia, String pais) {
        this.tipo = tipo;
        this.calle = calle;
        this.numero = numero;
        this.ciudad = ciudad;
        this.provincia = provincia;
        this.pais = pais;
    }

    public TipoDireccion getTipo() {
        return tipo;
    }

    public void setTipo(TipoDireccion tipo) {
        this.tipo = tipo;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }
}

 