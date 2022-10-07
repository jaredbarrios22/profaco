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
@Table(name="pro_producto")
public class prodentity {
    @Id
    Integer codigo_producto;
    String nombre_producto;
    String descripcion_producto;
    Integer cantidad;
    Integer estado_producto;
    
    public prodentity(){
        
    }
    
    
     public prodentity(
    Integer codigo_producto,
    String nombre_producto,
    String descripcion_producto,
    Integer cantidad,
    Integer estado_producto){
        this.codigo_producto = codigo_producto;
        this.nombre_producto = nombre_producto;
        this.descripcion_producto = descripcion_producto;
        this.cantidad = cantidad;
        this.estado_producto = estado_producto;
   }

    public Integer getCodigo_producto() {
        return codigo_producto;
    }

    public void setCodigo_producto(Integer codigo_producto) {
        this.codigo_producto = codigo_producto;
    }

    public String getNombre_producto() {
        return nombre_producto;
    }

    public void setNombre_producto(String nombre_producto) {
        this.nombre_producto = nombre_producto;
    }

    public String getDescripcion_producto() {
        return descripcion_producto;
    }

    public void setDescripcion_producto(String descripcion_producto) {
        this.descripcion_producto = descripcion_producto;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Integer getEstado_producto() {
        return estado_producto;
    }

    public void setEstado_producto(Integer estado_producto) {
        this.estado_producto = estado_producto;
    }

     
     
    
}
