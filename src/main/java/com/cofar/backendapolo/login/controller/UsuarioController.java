package com.cofar.backendapolo.login.controller;

import com.cofar.backendapolo.login.model.Usuario;
import com.cofar.backendapolo.login.model.UsuarioPrincipal;
import com.cofar.backendapolo.login.payload.JwtAuthenticationResponse;
import com.cofar.backendapolo.login.payload.LoginRequest;
import com.cofar.backendapolo.login.payload.UsuarioResponse;
import com.cofar.backendapolo.login.security.JwtTokenProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/login")
public class UsuarioController {

    @Autowired
    AuthenticationManager authenticationManager;


    @Autowired
    JwtTokenProvider tokenProvider;

    @PostMapping("/logearse")
    public ResponseEntity<?> authenticateUser(@Valid @RequestBody LoginRequest loginRequest) {

        System.out.println("ENTRA USUARIO: ");
        System.out.println("ENTRA USUARIO: " + loginRequest);
        Authentication authentication = authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(
                        loginRequest.getUsernameOrEmail(),
                        loginRequest.getPassword()
                )
        );




        System.out.println( " final logro ");
        SecurityContextHolder.getContext().setAuthentication(authentication);
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        String name = auth.getName();
        System.out.println("nombre: " + name);
        System.out.println("nombre: " + auth.getAuthorities());
        System.out.println("nombre: " + auth.getCredentials());
        System.out.println("nombre: " + auth.getDetails());
        UsuarioPrincipal userDetails = (UsuarioPrincipal)SecurityContextHolder.getContext().
                getAuthentication().getPrincipal();

        System.out.println(userDetails.getId());
        System.out.println(userDetails.getCodAreaEmpresa());

        System.out.println(userDetails.getPassword());
        System.out.println(userDetails.getUsername());
        System.out.println(userDetails.isEnabled());
        System.out.printf("cod id : " + userDetails.getId());

        //
        String jwt = tokenProvider.generateToken(authentication);
        UsuarioResponse usuarioResponse = new UsuarioResponse();
        usuarioResponse.setAccessToken(jwt);
        usuarioResponse.setLogeoExito(userDetails.isEnabled());

        Usuario usuario = new Usuario(userDetails.getId(), userDetails.getCodAreaEmpresa(), userDetails.getCodCargo(), userDetails.getName(), userDetails.getUsername(), userDetails.getEmail());
        usuarioResponse.setUsuario(usuario);


        return ResponseEntity.ok(usuarioResponse);
    }
}
