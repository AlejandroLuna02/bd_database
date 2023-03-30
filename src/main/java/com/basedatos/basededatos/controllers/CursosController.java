package com.basedatos.basededatos.controllers;

import com.basedatos.basededatos.models.CursosModel;
import com.basedatos.basededatos.models.RegisterModel;
import com.basedatos.basededatos.services.CursosService;
import com.basedatos.basededatos.services.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@CrossOrigin
@RequestMapping("/cursos")
public class CursosController {

    @Autowired
    CursosService cursosService;

    @GetMapping("/getAll")
    List<CursosModel> getAllUser(){
        return cursosService.getAll();
    }

    @GetMapping(value = "/getId/{id}")
    CursosModel getUserById(@PathVariable("id") long id ){
        return cursosService.get(id);
    }

    @PostMapping(value = "/create")
    CursosModel createUser(@RequestBody CursosModel cursosModel){return cursosService.register(cursosModel);}



    @PutMapping(value = "/update/{id}")
    CursosModel updateUserById(@RequestBody CursosModel cursosModel ){
        return cursosService.update(cursosModel);
    }

    @DeleteMapping(value = "/delete/{id}")
    void  deleteUserById(@PathVariable("id") long id){
        cursosService.delete(id);
    }
}
