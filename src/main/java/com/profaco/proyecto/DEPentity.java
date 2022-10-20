package com.profaco.proyecto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="pro_departamento")
public class DEPentity {
    @Id
    String departamento;
    
    public DEPentity(){
        
    }
    
    public DEPentity(String departamento){
        super();
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    
    
}
