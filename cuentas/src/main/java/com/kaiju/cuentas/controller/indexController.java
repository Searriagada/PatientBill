package com.kaiju.cuentas.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author Sebastián Arriagada
 * @version 1.0
 *
 * */
@Controller
public class indexController {
    @GetMapping({"/","index"})
    public String inicio(Model model){
        return "index";
    }

}
