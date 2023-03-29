package com.basedatos.basededatos.dao;

import com.basedatos.basededatos.models.ProfesorModel;
import com.basedatos.basededatos.models.RegisterModel;

import java.util.List;

public interface ProfesorDao {

    List<ProfesorModel> getAll();
    ProfesorModel get( long id);
    ProfesorModel register( ProfesorModel profesorModel);
    ProfesorModel update( ProfesorModel profesorModel);
    void delete(  long id);
}
