/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author lab21
 */
public class bibliotecario extends persona {
    
    private int idBibliotecario;

    public bibliotecario() {
    }

    public bibliotecario(int idBibliotecario) {
        this.idBibliotecario = idBibliotecario;
    }

    public bibliotecario(int idBibliotecario, int rut, String nombre, int telefono, String direccion) {
        super(rut, nombre, telefono, direccion);
        this.idBibliotecario = idBibliotecario;
    }

    public int getIdBibliotecario() {
        return idBibliotecario;
    }

    public void setIdBibliotecario(int idBibliotecario) {
        this.idBibliotecario = idBibliotecario;
    }

    public int getRut() {
        return rut;
    }

    public void setRut(int rut) {
        this.rut = rut;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    
    
    
    
}
