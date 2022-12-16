package com.javaspringboot.spring.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.javaspringboot.spring.model.Licence;

public interface LicenceRepository extends JpaRepository<Licence,Integer>{
    //Este query es para encontrar la clase de la licencia
    @Query(value = "Select * from Licence where clase= ?1",nativeQuery = true)
    List<Licence> findclase(String clase);
    // Este query es para encontrar el estado de la licencia
    @Query(value = "Select * from Licence where estado= ?1",nativeQuery = true)
    List<Licence> findEstado(String estado);
    
}
