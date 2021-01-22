package ci.oda.jury_pro.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import ci.oda.jury_pro.entities.Candidat;
import ci.oda.jury_pro.services.CandidatsService;

@RestController
public class CandidtasController extends CandidatsService {

    @Autowired
    CandidatsService candidatsService;

    @GetMapping("/candidats")
    public List<Candidat> getAll() {
        return candidatsService.getAll();
    }

    @GetMapping("/candidats/{id}")
    public Candidat getCandidatById(@PathVariable int id) {
        return candidatsService.getCandidatById(id);
    }

    @PostMapping("/candidats")
    public boolean createOrUpdateCandidat(@RequestBody Candidat candidat) {

        return candidatsService.createOrUpdateCanddat(candidat);

    }

    @PostMapping("/candidats/delete")
    public boolean deleteCandidat(@RequestBody Candidat candidat) {
        // candidat.setId(1);
        return candidatsService.deleteCandidat(candidat);

    }
}
