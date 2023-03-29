package com.basedatos.basededatos.controllers;

import com.basedatos.basededatos.models.ProfesorModel;
import com.basedatos.basededatos.models.RegisterModel;
import com.basedatos.basededatos.services.ProfesorService;
import com.basedatos.basededatos.services.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@CrossOrigin
@RequestMapping("/profesor")
public class ProfesorController {

    @Autowired
    ProfesorService profesorService;

    @GetMapping("/getAll")
    List<ProfesorModel> getAllUser(){
        return profesorService.getAll();
    }

    @GetMapping(value = "/getId/{id}")
    ProfesorModel getUserById(@PathVariable("id") long id ){
        return profesorService.get(id);
    }

    @PostMapping(value = "/create")
    ProfesorModel createUser(@RequestBody ProfesorModel profesorModel){return profesorService.register(profesorModel);}

    @PutMapping(value = "/update/{id}")
    ProfesorModel updateUserById(@RequestBody ProfesorModel profesorModel ){
        return profesorService.update(profesorModel);
    }

    @DeleteMapping(value = "/delete/{id}")
    void  deleteUserById(@PathVariable("id") long id){
        profesorService.delete(id);
    }
}
