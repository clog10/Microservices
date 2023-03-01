package com.springboot.app.productos.springbootserviceproductos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan({"com.commons.commons.entity"})
public class SpringbootServiceProductosApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootServiceProductosApplication.class, args);
	}

}
