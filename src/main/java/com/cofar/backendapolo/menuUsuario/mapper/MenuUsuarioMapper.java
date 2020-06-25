package com.cofar.backendapolo.menuUsuario.mapper;

import com.cofar.backendapolo.menuUsuario.model.VentanasZeus;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface MenuUsuarioMapper {

    public List<VentanasZeus> obtieneListaMenu(@Param("codPersonal") int codPersonal);

}
