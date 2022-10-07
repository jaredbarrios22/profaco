package com.profaco.proyecto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="pro_empleado")
public class toentity{
    @Id
     String usuario;
     String contrasena;
     String nombre_empleado;
     String apellido_empleado;
     String direccion;
     Integer municipio;
     String departamento;
     Integer zona;
     String email;
     Integer telefono;
   
     public toentity(){
    }

    public toentity(String usuario, String contrasena,String nombre, String apellido, String direccion, Integer municipio,
            String departamento, Integer zona, String email, Integer telefono){
        super();
        this.usuario = usuario;
        this.contrasena = contrasena;
        this.nombre_empleado = nombre;
        this.apellido_empleado = apellido;
        this.direccion = direccion;
        this.municipio = municipio;
        this.departamento = departamento;
        this.zona = zona;
        this.email = email;
        this.telefono = telefono;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getNombre_empleado() {
        return nombre_empleado;
    }

    public void setNombre_empleado(String nombre_empleado) {
        this.nombre_empleado = nombre_empleado;
    }

    public String getApellido_empleado() {
        return apellido_empleado;
    }

    public void setApellido_empleado(String apellido_empleado) {
        this.apellido_empleado = apellido_empleado;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Integer getMunicipio() {
        return municipio;
    }

    public void setMunicipio(Integer municipio) {
        this.municipio = municipio;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public Integer getZona() {
        return zona;
    }

    public void setZona(Integer zona) {
        this.zona = zona;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getTelefono() {
        return telefono;
    }

    public void setTelefono(Integer telefono) {
        this.telefono = telefono;
    }
    
    
}