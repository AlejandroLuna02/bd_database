package com.basedatos.basededatos.dao.imp;

import com.basedatos.basededatos.dao.CursosDao;
import com.basedatos.basededatos.models.CursosModel;
import com.basedatos.basededatos.models.RegisterModel;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Repository
@Transactional
public class CursosDaoImp implements CursosDao {

    @PersistenceContext
    EntityManager entityManager;
    @Transactional
    @Override
    public List<CursosModel> getAll(){
        String hql = "FROM CursosModel as u";
        return (List<CursosModel>) entityManager.createQuery(hql).getResultList();
    }
    @Transactional
    @Override
    public CursosModel get( long id){
        return entityManager.find(CursosModel.class, id);

    }
    @Transactional
    @Override
    public CursosModel register( CursosModel cursosModel){
        entityManager.merge(cursosModel);
        return cursosModel;
    }
    @Transactional
    @Override
    public CursosModel update( CursosModel cursosModel){
        entityManager.merge(cursosModel);
        return cursosModel;
    }
    @Transactional
    @Override
    public void delete(  long id){
        CursosModel cursosModel = get(id);
        entityManager.remove(cursosModel);
    }
}
