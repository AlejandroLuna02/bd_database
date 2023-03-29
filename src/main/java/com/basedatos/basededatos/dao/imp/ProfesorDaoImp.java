package com.basedatos.basededatos.dao.imp;

import com.basedatos.basededatos.dao.ProfesorDao;
import com.basedatos.basededatos.models.ProfesorModel;
import com.basedatos.basededatos.models.RegisterModel;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Repository
@Transactional
public class ProfesorDaoImp implements ProfesorDao {

    @PersistenceContext
    EntityManager entityManager;
    @Transactional
    @Override
    public List<ProfesorModel> getAll(){
        String hql = "FROM ProfesorModel as u";
        return (List<ProfesorModel>) entityManager.createQuery(hql).getResultList();
    }
    @Transactional
    @Override
    public ProfesorModel get( long id){
        return entityManager.find(ProfesorModel.class, id);

    }
    @Transactional
    @Override
    public ProfesorModel register( ProfesorModel profesorModel){
        entityManager.merge(profesorModel);
        return profesorModel;
    }
    @Transactional
    @Override
    public ProfesorModel update( ProfesorModel profesorModel){
        entityManager.merge(profesorModel);
        return profesorModel;
    }
    @Transactional
    @Override
    public void delete(  long id){
        ProfesorModel profesorModel = get(id);
        entityManager.remove(profesorModel);
    }
}
