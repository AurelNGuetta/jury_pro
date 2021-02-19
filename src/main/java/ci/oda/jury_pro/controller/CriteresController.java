package ci.oda.jury_pro.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import ci.oda.jury_pro.entities.Criteres;
import ci.oda.jury_pro.services.CriteresService;

@RestController
public class CriteresController extends CriteresService{
    
    @Autowired
    CriteresService criteresService;


    @GetMapping("/criteres")
    public List<Criteres> getAll() {
        return criteresService.getAll();
    }

    @GetMapping("/criteres/{id}")
    public Criteres getCritereById(@PathVariable int id) {
        return criteresService.getCritereById(id);
    }

    @GetMapping("/criteres/event/{evenement}")
    public List<Criteres> getCritereByEvenement( @PathVariable(required = true) int evenement ) {
        return criteresService.getCritereByEvenement(evenement);
    }

    @PostMapping("/criteres")
    public boolean createOrUpdateCritere(@RequestBody Criteres criteres) {

        return criteresService.createOrUpdateCritere(criteres);
    }

    @PostMapping("/criteres/delete")
    public boolean deleteCritere(Criteres criteres) {
        // Criteres.setId(1);
        return criteresService.deleteCritere(criteres);

    }
}
