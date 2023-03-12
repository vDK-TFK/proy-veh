package com.avance2.Controller;

import com.avance2.Domain.domain;
import com.avance2.Service.UsuarioService;
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
    UsuarioService usuarioService;
    
    @GetMapping("/")
    public String inicio(Model model) {
        var usuarios = usuarioService.getUsuario();
        model.addAttribute("usuarios", usuarios);
        
               
        return "index";
    }   
    
    @GetMapping("/nuevoUsuario")
    public String nuevoUsuario(domain usuario){
        return "modificarUsuario";
    }
    
    @PostMapping("/guardarUsuario")
    public String guardarUsuario(domain usuario) {
        usuarioService.save(usuario);
        return "redirect:/";
    }
    
    @GetMapping("/modificarUsuario/{idUsuario}")
    public String modificarUsuario(domain usuario, Model model){
        usuario = usuarioService.getUsuario(usuario);
        model.addAttribute("cliente", usuario);
        return "modificarUsuario";
    }
    
    @GetMapping("/eliminarUsuario/{idUsuario}")
    public String eliminarUsuario(domain usuario){
        usuarioService.delete(usuario);
        return "redirect:/";
    }
}