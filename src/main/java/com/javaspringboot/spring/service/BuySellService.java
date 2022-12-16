package com.javaspringboot.spring.service;

import java.util.List;



import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.javaspringboot.spring.model.Buysell;
import com.javaspringboot.spring.repository.BuySellRepository;

@Service
@Transactional
public class BuySellService {
    
    private BuySellRepository buySellRepository;

    public BuySellService(BuySellRepository buySellRepository){
        this.buySellRepository = buySellRepository;
    }
    
    public void saveBuySell(Buysell buysell){
        buySellRepository.save(buysell);
    }

    public void updateBuySell(Buysell buysell){
        buySellRepository.save(buysell);
    }

    public List<Buysell> findAllBuySell(){
        return buySellRepository.findAll();
    }

    public void eliminarBuySell(Integer id){
        buySellRepository.deleteById(id);
    }
}
