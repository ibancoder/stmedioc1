/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package cat.xtec.ioc.domain.repository;

import cat.xtec.ioc.domain.Medicament;
import java.util.List;

/**
 *
 * @author iban7
 */
public interface MedicamentRepository {
    
    List <Medicament> getAllMedicaments();
    Medicament getMedicamentById(String medicamentId);
    
}
