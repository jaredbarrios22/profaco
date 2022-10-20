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
@RequestMapping(path="/municipios")
public class MUNcontroller {
   
        @Autowired
    private MUNrepo MUNrepo;
    
    @GetMapping("/municipio")
    public List<MUNentity> getTodos(){
        return MUNrepo.findAll();
    }    
    
}
