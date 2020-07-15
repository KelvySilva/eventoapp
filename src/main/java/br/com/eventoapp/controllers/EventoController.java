package br.com.eventoapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EventoController {

    @RequestMapping("/cadastrarEvento")
    public ModelAndView form() {
        return new ModelAndView("evento/formEvento");
    }
}
