/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Proyecto_Web.Proyecto_Web.service;

import com.Proyecto_Web.Proyecto_Web.service.EmpleadoService;
import java.util.List;
import com.Proyecto_Web.Proyecto_Web.model.Empleado;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.Proyecto_Web.Proyecto_Web.repository.EmpleadoRep;
import java.util.Optional;
/**
 *
 * @author jonha
 */
@Service
public class EmpleadoService {
    @Autowired
    private EmpleadoRep repository;
    
    public void guardarEmpleado(Empleado empleado){
        repository.save(empleado);
        
    }
    public List<Empleado> getAEmpleados(){
        return repository.findAll();
    }
    public Empleado getEmpleadosbyId(int id){
        Optional<Empleado> e = repository.findById(id);
        if(e.isPresent()){
            return e.get();
        }
        return null;
    }
    public void deleteEm(int id){
        repository.deleteById(id);
    }
}
