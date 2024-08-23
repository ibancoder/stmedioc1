/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cat.xtec.ioc.service.impl;

import cat.xtec.ioc.domain.Medicament;
import cat.xtec.ioc.domain.repository.MedicamentRepository;
import cat.xtec.ioc.service.MedicamentService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author iban7
 */
@Service
public class MedicamentServiceImpl implements MedicamentService {
    
    @Autowired
    private MedicamentRepository medicamentRepository;
    
    public List<Medicament> getAllMedicaments(){
        return medicamentRepository.getAllMedicaments();
    }
    
    public Medicament getMedicamentById(String medicamentID){
        return medicamentRepository.getMedicamentById(medicamentID);
    }
}
