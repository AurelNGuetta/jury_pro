package ci.oda.jury_pro.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ci.oda.jury_pro.entities.Evenement;
import ci.oda.jury_pro.repositories.EvenementRepository;

@Service
public class EvenementService {

    @Autowired
    EvenementRepository evenementRepository;

    public List<Evenement> getAll() {
        return evenementRepository.findAll();
    }

    public Evenement getEvenementById(int id) {
        return evenementRepository.getOne(id);
    }

    public boolean createOrUpdateEvenement(Evenement evenement) {
        boolean result = false;
        try {
            if (evenement.getEvenement_id() > 0) {
                Evenement item = evenementRepository.getOne(evenement.getEvenement_id());
                result = true;
                if (item == null) {
                    throw new Exception();
                }
            }
            evenementRepository.save(evenement);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        return result;

    }

    public boolean deleteEvenement(Evenement evenement) {
        boolean result = false;
        try {
            if (evenement.getEvenement_id() < 0) {
                throw new Exception();
            }
            Evenement item = evenementRepository.getOne(evenement.getEvenement_id());
            if (item == null) {
                throw new Exception();
            }
            // evenementRepository.delete(evenement);
            evenementRepository.deleteById(1);
            result = true;
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        return result;
    }

}
