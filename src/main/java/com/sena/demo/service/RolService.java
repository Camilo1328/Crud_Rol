package com.sena.demo.service;

import com.sena.demo.model.Rol;
import com.sena.demo.repository.RolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RolService {

    @Autowired
    private RolRepository rolRepository;

    public List<Rol> getRol(){
        return rolRepository.findAll();
    }

    public Rol saveRol(Rol rol){
        return rolRepository.save(rol);
    }

    public Rol getRol(Long id){
        return rolRepository.findById(id).get();
    }

    public Rol updateRol(Rol rol){
        return rolRepository.save(rol);
    }

    public void deleteRol(Long id){
        rolRepository.deleteById(id);
    }

}
