package com.profaco.proyecto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="pro_estado")
public class ESTentity {
    @Id
    Integer codigo_estado;
    String descripcion;
    
    public ESTentity(){
        
    }
    
    public ESTentity(Integer codigo_estado, String descripcion){
        super();
        this.codigo_estado = codigo_estado;
        this.descripcion = descripcion;
    }

    public Integer getCodigo_estado() {
        return codigo_estado;
    }

    public void setCodigo_estado(Integer codigo_estado) {
        this.codigo_estado = codigo_estado;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    
}
