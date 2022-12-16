package com.javaspringboot.spring.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.javaspringboot.spring.model.Licence;
import com.javaspringboot.spring.repository.LicenceRepository;

@Service
@Transactional
public class LicenceService {

    private LicenceRepository licenceRepository;

    public LicenceService(LicenceRepository licenceRepository){
        this.licenceRepository = licenceRepository;
    } 

    public void saveLicence(Licence licence){
        licenceRepository.save(licence);
    }

    public void updateLicense(Licence licence){
        licenceRepository.save(licence);
    }

    public List<Licence> findAll(){
        return licenceRepository.findAll();
    }

    public List<Licence> buscarClase(String clase){
        return licenceRepository.findclase(clase);
    }

    public List<Licence> buscarEstado(String estado){
        return licenceRepository.findEstado(estado);
    }

    public void eliminarLicencia(Integer id){
        licenceRepository.deleteById(id);
    }

}
