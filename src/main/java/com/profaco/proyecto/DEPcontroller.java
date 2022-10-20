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
@RequestMapping(path="/departamentos")
public class DEPcontroller {
   
        @Autowired
    private DEPrepo DEPrepo;
    
    @GetMapping("/departamento")
    public List<DEPentity> getTodos(){
        return DEPrepo.findAll();
    }    
    
}
