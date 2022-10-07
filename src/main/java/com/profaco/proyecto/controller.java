package com.profaco.proyecto;

import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.PostConstruct;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;



//@CrossOrigin(origins = "http://localhost:4200")
//@CrossOrigin(origins = "")
@RestController
@RequestMapping(path="/usuario")
public class controller {
    
      
    @Autowired
    private torepository torepository;
    
    @GetMapping("/ingreso")
    public List<toentity> getTodos(){
        return torepository.findAll();
    }
 
    @GetMapping("/ingreso/{usuario}")
    public Optional<toentity> getusuario(@PathVariable String usuario){
        return torepository.findById(usuario);
    }
    
    @PostMapping("/registrar")
    public toentity create(@RequestBody toentity nuevoUsuario){
        return torepository.save(nuevoUsuario);
    }
    
}
