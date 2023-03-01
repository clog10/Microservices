package com.app.usuarios.serviciousuarios.models.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import commons.usuarios.usuarioscommons.models.entity.Usuario;

@RepositoryRestResource(collectionResourceRel = "usuarios", path = "usuarios")
public interface UsuarioDao extends CrudRepository<Usuario, Long> {

    @RestResource(path = "buscar-username")
    public Usuario findByUsername(@Param("username") String username);

    @Query("select u from Usuario u where u.username=?1")
    public Usuario obtenerPorUsername(String username);

}
