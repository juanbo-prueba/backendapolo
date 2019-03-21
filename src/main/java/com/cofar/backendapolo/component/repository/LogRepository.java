package com.cofar.backendapolo.component.repository;

import com.cofar.backendapolo.component.mapper.LogMapper;
import com.cofar.backendapolo.component.model.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.logging.LogManager;

@Repository("logRepository")
public class LogRepository {

    @Autowired
    private LogMapper logMapper;

    public void guardarLog( Log log ) {
        logMapper.guardar( log );
    }
}
