package com.profaco.proyecto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="pro_estado_pedido")
public class PESTent {
    @Id
    String descripcion;
    
    public PESTent(){
        
    }
    
    public PESTent(String descripcion){
        super();
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    
    
}
