package com.cofar.backendapolo.pruebas.service.impl;

import com.cofar.backendapolo.pruebas.model.Curso;
import com.cofar.backendapolo.pruebas.repository.CursoRepository;
import com.cofar.backendapolo.pruebas.service.CursoService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.List;

@Service("cursoService")
public class CursoServiceImpl implements CursoService {

    private static final Logger LOG = LogManager.getLogger(CursoServiceImpl.class);

    @Autowired
    @Qualifier("cursoRepository")
    private CursoRepository cursoRepository;

    @Override
    public List<Curso> getListCursos() {
//        List<Curso> cursos = new ArrayList<>();
//        cursos.add( new Curso(1, "Java"));
//        cursos.add( new Curso(2, "Vuejs"));
        LOG.info("HOLA DESDE SERVICIO");
     //   LOG.info("TAMANIO LISTA: " + cursoRepository.listarCursos().size());
        LOG.info("TERMINA");
        for (Curso c: cursoRepository.listarCursos()) {
            LOG.info("ITEM: " + c.getIdCurso() + " --  " + c.getNombreCurso());
            System.out.println(c.getIdCurso() + " ---- " + c.getNombreCurso());
        }
        return cursoRepository.listarCursos();
    }

    @Override
    public Curso addCurso(Curso curso) {
        return null;
    }

    @Override
    public int removeCurso(int idCurso) {
        return 0;
    }

    @Override
    public Curso updateCurso(Curso curso) {
        return null;
    }
}
