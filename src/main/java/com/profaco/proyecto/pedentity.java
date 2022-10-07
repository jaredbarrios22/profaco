/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.profaco.proyecto;


import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="pro_pedido")
public class pedentity {
     @Id
     Integer no_pedido;
     String estado_pedido;
     Integer producto;
     Integer cantidad;
     Date fecha_pedido;
     String nombre_cliente;
     String apellido_cliente;
     Integer telefono;
     String email;
     String direccion;
     Integer municipio;
     Integer zona;
     String departamento;
     
   
     public pedentity(){
    }

    public pedentity(Integer no_pedido,
     String estado_pedido,
     Integer producto,
     Integer cantidad,
     Date fecha_pedido,
     String nombre_cliente,
     String apellido_cliente,
     Integer telefono, String email, String direccion,Integer municipio, Integer zona, String departamento){
        super();     
        this.no_pedido = no_pedido;
        this.estado_pedido = estado_pedido;
        this.producto = producto;
        this.cantidad = cantidad;
        this.fecha_pedido = fecha_pedido;
        this.nombre_cliente = nombre_cliente;
        this.apellido_cliente = apellido_cliente;
        this.telefono = telefono;
        this.email = email;
        this.direccion = direccion;
        this.municipio = municipio;
        this.zona = zona;
        this.departamento = departamento;
    }

    public Integer getNo_pedido() {
        return no_pedido;
    }

    public void setNo_pedido(Integer no_pedido) {
        this.no_pedido = no_pedido;
    }

    public String getEstado_pedido() {
        return estado_pedido;
    }

    public void setEstado_pedido(String estado_pedido) {
        this.estado_pedido = estado_pedido;
    }

    public Integer getProducto() {
        return producto;
    }

    public void setProducto(Integer producto) {
        this.producto = producto;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Date getFecha_pedido() {
        return fecha_pedido;
    }

    public void setFecha_pedido(Date fecha_pedido) {
        this.fecha_pedido = fecha_pedido;
    }

    public String getNombre_cliente() {
        return nombre_cliente;
    }

    public void setNombre_cliente(String nombre_cliente) {
        this.nombre_cliente = nombre_cliente;
    }

    public String getApellido_cliente() {
        return apellido_cliente;
    }

    public void setApellido_cliente(String apellido_cliente) {
        this.apellido_cliente = apellido_cliente;
    }

    public Integer getTelefono() {
        return telefono;
    }

    public void setTelefono(Integer telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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

    public Integer getZona() {
        return zona;
    }

    public void setZona(Integer zona) {
        this.zona = zona;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    
}
