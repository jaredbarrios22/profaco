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
@Table(name="pro_ventas")
public class venentity {
   @Id
   Integer codigo_venta;
   Integer no_pedido;
   Integer cantidad;
   Date fecha;
   Integer monto;
    
   public venentity(){
       
    }
   
   public venentity(Integer codigo_venta, Integer no_pedido, Integer cantidad, Date fecha, Integer monto){
        this.codigo_venta = codigo_venta;
        this.no_pedido = no_pedido;
        this.cantidad = cantidad;
        this.fecha = fecha;
        this.monto = monto;
   }

    public Integer getCodigo_venta() {
        return codigo_venta;
    }

    public void setCodigo_venta(Integer codigo_venta) {
        this.codigo_venta = codigo_venta;
    }

    public Integer getNo_pedido() {
        return no_pedido;
    }

    public void setNo_pedido(Integer no_pedido) {
        this.no_pedido = no_pedido;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Integer getMonto() {
        return monto;
    }

    public void setMonto(Integer monto) {
        this.monto = monto;
    }
   
   
   
}
