package com.cofar.backendapolo.login.repository;

import com.cofar.backendapolo.login.model.Usuario;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


@Mapper
public interface AdmUsuarioRepository {

   // public List<AdmUsuarioModel> listar();

   // public User findByUsernameOrEmail(String nombreUsuario, String email );
    public Usuario buscarUsuarioPorNombre(String nombreUsuario);

    public Usuario findById(Long id);

    public List<Usuario> listarTodo();

   // public Usuario findByNombre(String nombre);

}
