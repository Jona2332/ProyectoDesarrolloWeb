/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Proyecto_Web.Proyecto_Web.model;

import com.Proyecto_Web.Proyecto_Web.model.Empleado;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;



@Entity
@Table(name = "empleado")
public class Empleado {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String apellidos;
    private int edad;
    private String address;
    private String email;
    private String telefono;
    private String salario;

    public Empleado() {
        super();
    }

    public Empleado(int id, String name, String apellidos, int edad, String address, String email, String telefono, String salario) {
        this.id = id;
        this.name = name;
        this.apellidos = apellidos;
        this.edad = edad;
        this.address = address;
        this.email = email;
        this.telefono = telefono;
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Empleado{" + "id=" + id + ", name=" + name + ", apellidos=" + apellidos + ", edad=" + edad + ", address=" + address + ", email=" + email + ", telefono=" + telefono + ", salario=" + salario + '}';
    }

   
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getSalario() {
        return salario;
    }

    public void setSalario(String salario) {
        this.salario = salario;
    }

   
    
}
