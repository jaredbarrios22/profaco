package com.profaco.proyecto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="pro_municipio")
public class MUNentity {
    @Id
    Integer codigo_municipio;
    String nombre_municipio;
    String departamento;
    
    public MUNentity(){
        
    }
    
    public MUNentity(Integer codigo_municipio, String nombre_municipio, String departamento){
        super();
        this.codigo_municipio = codigo_municipio;
        this.nombre_municipio = nombre_municipio;
        this.departamento = departamento;
    }

    public Integer getCodigo_municipio() {
        return codigo_municipio;
    }

    public void setCodigo_municipio(Integer codigo_municipio) {
        this.codigo_municipio = codigo_municipio;
    }

    public String getNombre_municipio() {
        return nombre_municipio;
    }

    public void setNombre_municipio(String nombre_municipio) {
        this.nombre_municipio = nombre_municipio;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }


    
    
}
