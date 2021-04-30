/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tokoonline.Frameworktest.controllers;

import com.tokoonline.Frameworktest.entities.Roti;
import com.tokoonline.Frameworktest.services.RotiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

/**
 *
 * @author Matthew
 */
@Controller
public class MainController {

    @Autowired
    RotiService service;

    @GetMapping("")
    public String index(Model model) {
        //model.addAttribute("roti", new Roti());
        //model.addAttribute("RotiKiriman", service.getAll());
        return "home";
    }

    @GetMapping("/{id}")
    public String getById(@PathVariable("id") String id, Model model) {
        model.addAttribute("roti", service.findById(id));
        model.addAttribute("RotiKiriman", service.getAll());
        return "index";
    }

    @PostMapping("/save")
    public String save(Roti roti) {
        service.save(roti);
        return "redirect:/";
    }

    @GetMapping("/delete/{id}")
    public String deleteById(@PathVariable("id") String id) {
        service.delete(id);
        return "redirect:/";
    }
}
