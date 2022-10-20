package com.profaco.proyecto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="pro_pedido_contenido")
public class CONTentity {
    @Id
    Integer id;
    Integer producto;
    Integer cantidad;
    Integer no_pedido;
    
    public CONTentity(){
        
    }
    
    public CONTentity(Integer id, Integer producto, Integer cantidad, Integer no_pedido){
        super();
        this.id = id;
        this.producto = producto;
        this.cantidad = cantidad;
        this.no_pedido = no_pedido;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public Integer getNo_pedido() {
        return no_pedido;
    }

    public void setNo_pedido(Integer no_pedido) {
        this.no_pedido = no_pedido;
    }
    
    
}
