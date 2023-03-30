package com.basedatos.basededatos.dao;

import com.basedatos.basededatos.models.CursosModel;
import com.basedatos.basededatos.models.RegisterModel;

import java.util.List;

public interface CursosDao {
    List<CursosModel> getAll();
    CursosModel get( long id);
    CursosModel register( CursosModel cursosModel);
    CursosModel update( CursosModel cursosModel);
    void delete(  long id);
}
