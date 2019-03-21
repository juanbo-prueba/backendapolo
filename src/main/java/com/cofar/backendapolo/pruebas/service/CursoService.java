package com.cofar.backendapolo.pruebas.service;

import com.cofar.backendapolo.pruebas.model.Curso;

import java.util.List;

public interface CursoService {
    public abstract List<Curso> getListCursos();
    public abstract Curso addCurso( Curso curso );
    public abstract int removeCurso( int idCurso );
    public abstract Curso updateCurso( Curso curso );
}
