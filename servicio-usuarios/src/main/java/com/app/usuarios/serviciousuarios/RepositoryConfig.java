package com.app.usuarios.serviciousuarios;



import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;
import org.springframework.web.servlet.config.annotation.CorsRegistry;

import commons.usuarios.usuarioscommons.models.entity.Rol;
import commons.usuarios.usuarioscommons.models.entity.Usuario;


@Configuration
public class RepositoryConfig implements RepositoryRestConfigurer {

    @Override
    public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config, CorsRegistry cors) {
        config.exposeIdsFor(Usuario.class, Rol.class);
    }
    
}
