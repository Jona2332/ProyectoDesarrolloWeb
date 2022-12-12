/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Proyecto_Web.Proyecto_Web.repository;

import com.Proyecto_Web.Proyecto_Web.repository.EmpleadoRep;
import com.Proyecto_Web.Proyecto_Web.model.Empleado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author jonha
 */
@Repository
public interface EmpleadoRep extends JpaRepository<Empleado, Integer>{
    
}
