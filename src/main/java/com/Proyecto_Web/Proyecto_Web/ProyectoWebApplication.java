package com.Proyecto_Web.Proyecto_Web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class ProyectoWebApplication implements WebMvcConfigurer{
    
    public void  addViewController(ViewControllerRegistry reg){
        reg.addViewController("/index").setViewName("index");
    }

	public static void main(String[] args) {
		SpringApplication.run(ProyectoWebApplication.class, args);
	}

}
