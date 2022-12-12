/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Proyecto_Web.Proyecto_Web.controller;

import com.Proyecto_Web.Proyecto_Web.controller.EmpleadoController;
import java.util.List;
import java.util.stream.Collectors;
import com.Proyecto_Web.Proyecto_Web.model.Empleado;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import com.Proyecto_Web.Proyecto_Web.service.EmpleadoService;
import jakarta.servlet.http.HttpSession;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;

/**
 *
 * @author jonha
 */
@Controller
public class EmpleadoController {
    @Autowired
    private EmpleadoService service;
    
    
    @GetMapping("/barChart")
    public String getAEmpleados(Model model){
        
        List<String> nameList = service.getAEmpleados().stream().map(x->x.getName()).collect(Collectors.toList());
        List<String> ageList = service.getAEmpleados().stream().map(x->x.getApellidos()).collect(Collectors.toList());
        
        model.addAttribute("name", nameList);
        model.addAttribute("age", ageList);
        //Html page returned para mostrar el grafico
        return "barChart";
    }
    @GetMapping("/")
    public String Inicio(Model model){
        List<Empleado> em = service.getAEmpleados();
        model.addAttribute("em", em);
        return "index";
    }
    @GetMapping("/AddEmpleado")
    public String addEmpleadoF(){
        return "AddEmpleado";
    }
    @PostMapping("/register")
    public String registroEmpleado(@ModelAttribute Empleado e, HttpSession session){
    
        service.guardarEmpleado(e);
        session.setAttribute("msg", "Empleado agregado exitosamente");
        return "redirect:/";
    }
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable int id, Model model){
    
        Empleado e = service.getEmpleadosbyId(id);
        model.addAttribute("em", e);
        return "edit";
    }
    @PostMapping("/update")
    public String updateEm(@ModelAttribute Empleado e, HttpSession session){
        service.guardarEmpleado(e);
        session.setAttribute("msg", "Empleado actualizado exitosamente");
        return "redirect:/";
    }
    
    @GetMapping("/delete/{id}")
    public String deleteEm(@PathVariable int id, HttpSession session){
        
        service.deleteEm(id);
        session.setAttribute("msg", "Empleado eliminado exitosamente");
        return "redirect:/";
    }
}
