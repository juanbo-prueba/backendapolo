package com.cofar.backendapolo.login.security;

import com.cofar.backendapolo.exception.ResourceNotFoundException;
import com.cofar.backendapolo.login.model.Usuario;
import com.cofar.backendapolo.login.model.UsuarioPrincipal;
import com.cofar.backendapolo.login.repository.AdmUsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by rajeevkumarsingh on 02/08/17.
 */

@Service
public class CustomUserDetailsService implements UserDetailsService {

    @Autowired
    AdmUsuarioRepository admUsuarioRepository;


    @Override
    @Transactional
    public UserDetails loadUserByUsername(String usernameOrEmail)
            throws UsernameNotFoundException {
        // Let people login with either username or email
        System.out.println("Entra " + usernameOrEmail);
        Usuario user = admUsuarioRepository.buscarUsuarioPorNombre(usernameOrEmail);
        System.out.println("final :   " + user );

        System.out.println(" : " + user.getId());
        System.out.println(" : " + user.getCodAreaEmpresa());
        System.out.println(" : " + user.getCodCargo());
        System.out.println(" : " + user.getName());
        System.out.println(" : " + user.getUsername());
        System.out.println(" : " + user.getEmail());
        System.out.println(" : " + user.getPassword());

        UsuarioPrincipal usuarioPrincipal = UsuarioPrincipal.create(user);
        System.out.println( "termina creatoe ");
        return usuarioPrincipal;
    }

    @Transactional
    public UserDetails loadUserById(Long id) {
        System.out.println("Entra a buscar por id:: " + id );


        // Usuario user = admUsuarioRepository.buscarUsuarioPorNombre("saimon");
        Usuario user = admUsuarioRepository.findById(id);
        System.out.println("usuario: " +user);
        if ( user == null ) {
            new ResourceNotFoundException("User", "id", id);
        }

        System.out.println("usuario: " +user.getName());

        return UsuarioPrincipal.create(user);
    }


}