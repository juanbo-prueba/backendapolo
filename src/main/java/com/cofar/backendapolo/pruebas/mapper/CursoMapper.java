package com.cofar.backendapolo.pruebas.mapper;

import com.cofar.backendapolo.pruebas.model.Curso;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CursoMapper {

   public List<Curso> listar();
}
