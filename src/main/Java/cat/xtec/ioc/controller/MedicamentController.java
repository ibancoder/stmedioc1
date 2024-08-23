/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cat.xtec.ioc.controller;

//import cat.xtec.ioc.domain.Medicament;
import cat.xtec.ioc.domain.repository.MedicamentRepository;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author iban7
 */

@Controller
public class MedicamentController {
    
    @Autowired
    private MedicamentRepository medicamentRepository;
    
    @RequestMapping(value = "/medicaments", method = RequestMethod.GET)
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        ModelAndView modelview = new ModelAndView("medicaments");
       /*
        Medicament ibuprofe = new Medicament("M010", "Ibuprofé", 2);
        ibuprofe.setDescription("Ibuprofe de 600mg");
        ibuprofe.setCategory("Anti-inflamatori");
        ibuprofe.setProducer("Cinfa");
        ibuprofe.setStockQuantity(214);
        */
        modelview.getModelMap().addAttribute("medicaments", medicamentRepository.getAllMedicaments());
        return modelview;
    }
}
