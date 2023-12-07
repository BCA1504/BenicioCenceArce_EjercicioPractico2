package com.FideFlights.controller;

import com.FideFlights.service.VuelosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/Vuelos")
public class VuelosController {

    @Autowired
    private VuelosService vuelosService;

    @GetMapping("/Vuelos")
    public String getVuelos(Model model) {
        model.addAttribute("vuelos", vuelosService.getAllVuelos());
        return "/Vuelos/Vuelos";
    }
}