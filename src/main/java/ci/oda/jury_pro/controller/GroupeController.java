package ci.oda.jury_pro.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import ci.oda.jury_pro.entities.Groupe;
import ci.oda.jury_pro.services.GroupeService;

@RestController
public class GroupeController extends GroupeService {
    
    @Autowired
    GroupeService groupeService;

    @GetMapping("/groupes")
    public List<Groupe> getAll() {
        return groupeService.getAll();
    }

    @GetMapping("/groupes/{id}")
    public Groupe getGroupeById(@PathVariable int id) {
        return groupeService.getGroupeById(id);
    }

    @PostMapping("/groupes")
    public boolean createOrUpdateGroupe(@RequestBody Groupe groupe) {

        return groupeService.createOrUpdateGroupe(groupe);

    }

    @PostMapping("/groupes/delete")
    public boolean deleteGroupe(Groupe groupe) {
        // candidat.setId(1);
        return groupeService.deleteGroupe(groupe);

    }
}
