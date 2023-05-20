package ar.edu.unju.fi.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import ar.edu.unju.fi.model.Dog;

@Controller
public class DogWalkController {

    private List<Dog> dogList = new ArrayList<>(); // Lista para almacenar los perros programados

    @GetMapping("/paseo")
    public String mostrarFormularioPaseo() {
        return "formulario_paseo";
    }

    @PostMapping("/paseo")
    public String programarPaseo(@RequestParam("nombre") String nombre,
                                @RequestParam("altura") int altura,
                                @RequestParam("peso") double peso,
                                @RequestParam("edad") int edad,
                                @RequestParam("diaPaseo") String diaPaseo,
                                @RequestParam("horarioPaseo") String horarioPaseo,
                                Model model) {

        // Verificar si el turno está disponible
        boolean turnoDisponible = true; // Inicialmente se asume que el turno está disponible

        for (Dog dog : dogList) {
            if (dog.getDia().equals(diaPaseo) && dog.getHorario().equals(horarioPaseo)) {
                turnoDisponible = false; // El turno ya está ocupado
                break;
            }
        }

        if (turnoDisponible) {
            // Asignar el día y horario del paseo al objeto Dog
            Dog newDog = new Dog(nombre, altura, peso, edad, diaPaseo, horarioPaseo);
            dogList.add(newDog); // Agregar el nuevo perro a la lista

            // Pasar los datos al modelo para mostrar en la vista confirmacion_paseo.html
            model.addAttribute("nombrePerro", nombre);
            model.addAttribute("horarioPaseo", horarioPaseo);
            model.addAttribute("diaPaseo", diaPaseo);
            model.addAttribute("turnoOcupado", false); // Agregar el atributo turnoOcupado al modelo

            return "confirmacion_paseo";
        } else {
            model.addAttribute("turnoOcupado", true); // Agregar el atributo turnoOcupado al modelo
            return "confirmacion_paseo";
        }
    }
}
