package ci.oda.jury_pro.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import ci.oda.jury_pro.entities.Jury;
import ci.oda.jury_pro.services.JuryService;

@RestController
public class JuryController extends JuryService {
    
    @Autowired
    JuryService juryService;


    @GetMapping("/juries")
    public List<Jury> getAll() {
        return juryService.getAll();
    }

    @GetMapping("/juries/{id}")
    public Jury getJuryById(@PathVariable int id) {
        return juryService.getJuryById(id);
    }

    @GetMapping("/juries/search/{id}")
    public Jury getJuryByTag(@PathVariable String id) {
        return juryService.getJuryByEmailPhone(id);
    }

    @PostMapping("/juries")
    public boolean createOrUpdateJury(@RequestBody Jury jury) {

        return juryService.createOrUpdateJury(jury);

    }

    @PostMapping("/juries/delete")
    public boolean deleteJury(@RequestBody Jury jury) {
        // candidat.setId(1);
        return juryService.deleteJury(jury);

    }
}
