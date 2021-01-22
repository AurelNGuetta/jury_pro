package ci.oda.jury_pro.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import ci.oda.jury_pro.entities.Evenement;
import ci.oda.jury_pro.entities.IEvenementDTO;
import ci.oda.jury_pro.repositories.EvenementRepository;

@Service
public class EvenementService {

    @Autowired
    EvenementRepository evenementRepository;

    public List<IEvenementDTO> getAll() {
        List<IEvenementDTO> evenements = null;
        try {
            evenements = evenementRepository.findAllEvenements();
        } catch (Exception e) {
            // TODO: handle exception
        }
        System.out.println(evenements);
        return evenements;
    }

    public Evenement getEvenementById(Integer id) {
        Evenement evenement = null;
        try {
            evenement = evenementRepository.findById(id).orElse(null);
        } catch (Exception e) {
            // TODO: handle exception
        }
        return evenement;
    }

    public ResponseEntity<?> createOrUpdateEvenement(Evenement evenement) {
        // boolean result = false;
        ResponseEntity<?> result = new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        try {
            if (evenement.getEvenement_id() > 0) {
                Optional<Evenement> item = evenementRepository.findById(evenement.getEvenement_id());
                if (item == null) {
                    throw new Exception();
                }
            }
            evenementRepository.save(evenement);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        result = new ResponseEntity<>(HttpStatus.OK);
        return result;

    }

    public boolean deleteEvenement(Evenement evenement) {
        boolean result = false;
        try {
            if (evenement.getEvenement_id() < 0) {
                throw new Exception();
            }
            Evenement item = evenementRepository.findById(evenement.getEvenement_id()).orElse(null);
            if (item == null) {
                throw new Exception();
            }
            evenementRepository.delete(evenement);
            // evenementRepository.deleteById(2);
            result = true;
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        return result;
    }

}
