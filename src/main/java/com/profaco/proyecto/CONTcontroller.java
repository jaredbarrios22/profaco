package com.profaco.proyecto;

import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.PostConstruct;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;



//@CrossOrigin(origins = "http://localhost:4200")
@CrossOrigin(origins = "https://profacofe.azurewebsites.net")
@RestController
@RequestMapping(path="/pedidos_cont")
public class CONTcontroller {
    
    @Autowired
    private CONTrepo CONTrepo;
    //consulta
    @GetMapping("/reporte")
    public List<CONTentity> getTodos(){
        return CONTrepo.findAll();
    }  
    
    //ingreso
    @PostMapping("/ingresar")
    public CONTentity create(@RequestBody CONTentity nuevoRegistro){
        return CONTrepo.save(nuevoRegistro);
    }

}
