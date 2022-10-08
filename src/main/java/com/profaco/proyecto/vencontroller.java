package com.profaco.proyecto;

import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.PostConstruct;
import java.util.Arrays;
import java.util.List;



//@CrossOrigin(origins = "http://localhost:4200")
@CrossOrigin(origins = "https://profacofe.azurewebsites.net")
@RestController
@RequestMapping(path="/ventas")
public class vencontroller {
    
   
    
    @Autowired
    private venrepository venrepository;
           
    @GetMapping("/reporte")
    public List<venentity> getVentas(){
            return venrepository.findAll();
    }
    
    
    
    
    
}
