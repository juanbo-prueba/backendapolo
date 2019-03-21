package com.cofar.backendapolo.pruebas.repository;

import com.cofar.backendapolo.pruebas.mapper.CursoMapper;
import com.cofar.backendapolo.pruebas.model.Curso;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("cursoRepository")
public class CursoRepository {

    @Autowired
    private CursoMapper cursoMapper;

    public List<Curso> listarCursos(){
        return cursoMapper.listar();
    }
}
