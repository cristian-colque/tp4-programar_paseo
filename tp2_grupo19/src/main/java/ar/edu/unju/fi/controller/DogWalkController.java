package ar.edu.unju.fi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DogWalkController {
    
    @GetMapping("/paseo")
    public String mostrarFormularioPaseo() {
        return "formulario_paseo";
    }

    @PostMapping("/paseo")
    public String programarPaseo(@RequestParam("nombre") String nombre,
                                @RequestParam("altura") int altura,
                                @RequestParam("peso") double peso,
                                @RequestParam("edad") int edad,
                                Model model) {
        
        
        
        String horarioPaseo = "10:00 AM"; // Ejemplo de horario asignado
        
        model.addAttribute("nombrePerro", nombre);
        model.addAttribute("horarioPaseo", horarioPaseo);
        
        return "confirmacion_paseo";
    }
}
