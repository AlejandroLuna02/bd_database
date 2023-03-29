package com.basedatos.basededatos.services;

import com.basedatos.basededatos.dao.ProfesorDao;
import com.basedatos.basededatos.dao.RegisterDao;
import com.basedatos.basededatos.dao.UserDao;
import com.basedatos.basededatos.models.ProfesorModel;
import com.basedatos.basededatos.models.RegisterModel;
import com.basedatos.basededatos.models.UserModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
@Service
@CrossOrigin
public class ProfesorService {

    @Autowired
    ProfesorDao profesorDao;

    public List<ProfesorModel> getAll(){
        return profesorDao.getAll();
    }

    public ProfesorModel get( long id){

        return profesorDao.get(id);
    }

    public ProfesorModel register( ProfesorModel profesorModel){
        return profesorDao.register(profesorModel);
    }

    public ProfesorModel update(@RequestBody ProfesorModel profesorModel){
        return profesorDao.update(profesorModel);
    }

    public void delete(@PathVariable long id){
        profesorDao.delete(id);
    }
}
