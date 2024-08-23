/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cat.xtec.ioc.service.impl;

import cat.xtec.ioc.domain.Medicament;
import cat.xtec.ioc.domain.repository.MedicamentRepository;
import cat.xtec.ioc.service.MovimentStockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author iban7
 */
@Service
public class MovimentStockServiceImpl implements MovimentStockService {
    
    @Autowired
    private MedicamentRepository medicamentRepository;
    
    
    public void processMovimentStock(String medicamentId, long quantity, int signe){
        Medicament medicamentById = medicamentRepository.getMedicamentById(medicamentId);
        long signedQuantity = quantity * signe;
        if ((medicamentById.getStockQuantity()+ signedQuantity) < 0){
            throw new IllegalArgumentException("No hi ha prou unitats. La quantitat en estoc es: " + medicamentById.getStockQuantity());
        }
        medicamentById.setStockQuantity(medicamentById.getStockQuantity()+ signedQuantity);
    }
    
}
