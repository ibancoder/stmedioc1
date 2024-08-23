/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cat.xtec.ioc.controller;

import cat.xtec.ioc.service.MedicamentService;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author iban7
 */

@Controller
@RequestMapping("/medicaments")
public class MedicamentController {
    
    @Autowired
    private MedicamentService medicamentService;
    
    @RequestMapping("/all")
    public ModelAndView allMedicaments(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        ModelAndView modelview = new ModelAndView("medicaments");
        modelview.getModelMap().addAttribute("medicaments", medicamentService.getAllMedicaments());
        return modelview;
    }
}
