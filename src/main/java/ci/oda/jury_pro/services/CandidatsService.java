package ci.oda.jury_pro.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.RestController;

import ci.oda.jury_pro.entities.Candidat;
import ci.oda.jury_pro.repositories.CandidatsRepository;

@RestController
public class CandidatsService {

    @Autowired
    CandidatsRepository candidatsRepository;

    public List<Candidat> getAll() {
        return candidatsRepository.findAll();
    }

    public Candidat getCandidatById(int id) {
        return candidatsRepository.findById(id).orElse(null);
    }

    public boolean createOrUpdateCanddat(Candidat candidat) {
        boolean result = false;
        try {
            if (candidat.getId() > 0) {
                Candidat item = candidatsRepository.findById(candidat.getId()).orElse(null);
                result = true;
                if (item == null) {
                    throw new Exception();
                }
            }
            candidatsRepository.save(candidat);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        return result;

    }

    public boolean deleteCandidat(Candidat candidat) {
        boolean result = false;
        try {
            if (candidat.getId() < 0) {
                throw new Exception();
            }
            Candidat item = ((JpaRepository<Candidat, Integer>) candidatsRepository).findById(candidat.getId()).orElse(null);
            if (item == null) {
                throw new Exception();
            }
            candidatsRepository.delete(candidat);
            result = true;
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        return result;
    }

}
