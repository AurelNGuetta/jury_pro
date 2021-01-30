package ci.oda.jury_pro.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

// import ci.oda.jury_pro.entities.AllEvenement;
import ci.oda.jury_pro.entities.Evenement;
import ci.oda.jury_pro.entities.IEvenementDTO;
import ci.oda.jury_pro.services.EvenementService;

@RestController
public class EvenementController extends EvenementService {

    @Autowired
    EvenementService evenementService;

    @GetMapping("/evenements")
    public List<IEvenementDTO> getAll() {
        return evenementService.getAll();
    }

    @GetMapping("/evenements/{id}")
    public Evenement getEvenementById(@PathVariable("id") Integer id) {
        return evenementService.getEvenementById(id);
    }

    @PostMapping("/evenements")
    public Evenement createOrUpdateEvenement(@RequestBody Evenement evenement) {

        return evenementService.createOrUpdateEvenement(evenement);

    }

    @PostMapping("/evenements/delete")
    public boolean deleteEvenement(@RequestBody Evenement evenement) {
        // evenement.setEvenement_id(1);
        return evenementService.deleteEvenement(evenement);

    }

}
