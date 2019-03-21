package com.cofar.backendapolo.pruebas.controller;


import com.cofar.backendapolo.pruebas.model.Curso;
import com.cofar.backendapolo.pruebas.service.CursoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cursos")
public class CursoController {

    @Autowired
    @Qualifier("cursoService")
    private CursoService cursoService;

    //http://localhost:5007/cursos/saludo?nm=kurdi
    @GetMapping("/saludo")
    public String getSaludoForma1(@RequestParam( name = "nm", required = false, defaultValue = "NULL" ) String name) {
        return "Hola mundo : " + name;
    }

    //http://localhost:5007/cursos/saludo2/kurdi
    @GetMapping("/saludo2/{nm}")
    public String getSaludoForma2(@PathVariable("nm") String name) {
        return "Hola mundo : " + name;
    }

    @GetMapping("/lista")
    public List<Curso> getCursos(){
      return cursoService.getListCursos();
    }
}
