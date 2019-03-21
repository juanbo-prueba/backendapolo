package com.cofar.backendapolo.component.mapper;

import com.cofar.backendapolo.component.model.Log;
import org.apache.ibatis.annotations.Mapper;import org.apache.ibatis.annotations.Param;

@Mapper
public interface LogMapper {

    public void guardar(@Param("log")Log log);
}
