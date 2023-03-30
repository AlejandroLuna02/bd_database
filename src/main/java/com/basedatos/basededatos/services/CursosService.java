package com.basedatos.basededatos.services;

import com.basedatos.basededatos.dao.CursosDao;
import com.basedatos.basededatos.dao.RegisterDao;
import com.basedatos.basededatos.models.CursosModel;
import com.basedatos.basededatos.models.RegisterModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
@Service
@CrossOrigin
public class CursosService {

    @Autowired
    CursosDao cursosDao;

    public List<CursosModel> getAll(){
        return cursosDao.getAll();
    }

    public CursosModel get( long id){

        return cursosDao.get(id);
    }

    public CursosModel register( CursosModel cursosModel){
        return cursosDao.register(cursosModel);
    }

    public CursosModel update(@RequestBody CursosModel cursosModel){
        return cursosDao.update(cursosModel);
    }

    public void delete(@PathVariable long id){
        cursosDao.delete(id);
    }
}
