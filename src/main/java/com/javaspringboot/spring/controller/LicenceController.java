package com.javaspringboot.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.javaspringboot.spring.model.Licence;
import com.javaspringboot.spring.service.LicenceService;

@CrossOrigin("*")
@RestController
public class LicenceController {
    
    private LicenceService licenceService;

    public LicenceController(@Autowired LicenceService licenceService){
        this.licenceService = licenceService;
    }

    @PostMapping("/Licence/save")
    public void guardarLicence(@RequestBody Licence licence){
        licenceService.saveLicence(licence);    
    }

    @PutMapping("/Licence/update")
    public void updateLicense(@RequestBody Licence licence){
        licenceService.saveLicence(licence);
    }

    @GetMapping("/Licence/findAll")
    public List<Licence> todasLasLicencias(){
        return licenceService.findAll();
    }

    @GetMapping("/Licence/buscarClase")
    public List<Licence> buscarClase(String clase){
        return licenceService.buscarClase(clase);
    }

    @GetMapping("/Licence/buscarEstado")
    public List<Licence> buscarEstado(String estado){
        return licenceService.buscarEstado(estado);
    }

    @DeleteMapping("/Licence/delete/{id}")
    public void eliminarLicencia(@PathVariable Integer id){
        licenceService.eliminarLicencia(id);
    }
}