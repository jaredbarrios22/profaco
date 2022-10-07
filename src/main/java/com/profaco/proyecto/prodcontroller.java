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
@RequestMapping(path="/productos")
public class prodcontroller {
    
    @Autowired
    private prodrepo prodrepo;
 
    
        @GetMapping("/reporte")
    public List<prodentity> getProductos(){
        return prodrepo.findAll();
    }
 
    @GetMapping("/producto/{codigo_producto}")
    public Optional<prodentity> getusuario(@PathVariable String codigo_producto){
        return prodrepo.findById(codigo_producto);
    }
    
    @PostMapping("/ingresar")
    public prodentity create(@RequestBody prodentity nuevoProducto){
        return prodrepo.save(nuevoProducto);
    }
    
}
