/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
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
@RequestMapping(path="/pedidos")
public class pedcontroller {
    
     @Autowired
    private pedrepository pedrepository;
    
    
    @GetMapping("/hola")
    @ResponseBody
    public String hola() {
 
        return "hola";
 
    }
    
    @GetMapping("/reporte")
    public List<pedentity> getTodosPedidos(){
        return pedrepository.findAll();
    }
 
    @GetMapping("/consulta/{no_pedido}")
    public Optional<pedentity> getPedido(@PathVariable Integer no_pedido){
        return pedrepository.findById(no_pedido);
    }
    
    @PostMapping("/registrar")
    public pedentity create(@RequestBody pedentity nuevoPedido){
        return pedrepository.save(nuevoPedido);
    }
}
