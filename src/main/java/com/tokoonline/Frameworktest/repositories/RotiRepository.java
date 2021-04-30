/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tokoonline.Frameworktest.repositories;

import com.tokoonline.Frameworktest.entities.Roti;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Matthew
 */
public interface RotiRepository extends JpaRepository<Roti, String> {
    
}
