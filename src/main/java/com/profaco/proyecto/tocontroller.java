package com.profaco.proyecto;

import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;
import java.util.Arrays;

@RestController
public class tocontroller {
    
    private final torepository torepository;

    public tocontroller(torepository torepository){
        this.torepository = torepository;
    }


   

    @GetMapping("/ingreso")
    public Iterable<toentity> getTodos(){
        return torepository.findAll();
    }

}
