package com.avance2.Controller;

import com.avance2.Domain.domain;
import com.avance2.Service.EstadoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Slf4j
@Controller
public class IndexController {

    @Autowired
    EstadoService estadoService;
    
    @GetMapping("/")
    public String inicio(Model model) {
        var estados = estadoService.getEstados();
        model.addAttribute("estados", estados);
        
               
        return "index";
    }   
    
    @GetMapping("/nuevoEstado")
    public String nuevoEstado(domain estado){
        return "modificarEstado";
    }
    
    @PostMapping("/guardarEstado")
    public String guardarEstado(domain estado) {
        estadoService.save(estado);
        return "redirect:/";
    }
    
    @GetMapping("/modificarEstado/{idPais}")
    public String modificarEstado(domain estado, Model model){
        estado = estadoService.getEstado(estado);
        model.addAttribute("estado", estado);
        return "modificarEstado";
    }
    
    @GetMapping("/eliminarEstado/{idPais}")
    public String eliminarEstado(domain estado){
        estadoService.delete(estado);
        return "redirect:/";
    }
}