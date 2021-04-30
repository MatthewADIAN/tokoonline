/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tokoonline.Frameworktest.services;

import com.tokoonline.Frameworktest.entities.Roti;
import com.tokoonline.Frameworktest.repositories.RotiRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Matthew
 */
@Service
public class RotiService {

    @Autowired
    RotiRepository repository;

    public List<Roti> getAll() {
        return repository.findAll();
    }

    public Roti save(Roti roti) {
        return repository.save(roti);
    }

    public boolean delete(String id) {
        try {
            repository.delete(new Roti(id));
            return true;
        } catch (Exception e) {
            return false;
        }

    }
    
    public Roti findById(String id){
        return repository.findById(id).get();
    }
}
