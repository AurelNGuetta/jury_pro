package ci.oda.jury_pro.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
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

        }
        System.out.println(evenements);
        return evenements;
    }

    public Evenement getEvenementById(Integer id) {
        Evenement evenement = null;
        try {
            evenement = evenementRepository.findById(id).orElse(null);
        } catch (Exception e) {

        }
        return evenement;
    }

    public byte[] getEvenementImage(Integer id) {
        byte[] image = null;
        Evenement evenement = null;
        try {
            evenement = evenementRepository.findById(id).orElse(null);
            if (evenement != null) {
                image = evenementRepository.findEvenementImage(id);
            }
        } catch (Exception e) {

        }
        return image;
    }

    public Evenement createOrUpdateEvenement(Evenement evenement) {
        Evenement event = null;
        // ResponseEntity<?> result = new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        try {
            if (evenement.getEvenement_id() > 0) {
                Evenement item = evenementRepository.findById(evenement.getEvenement_id()).orElse(null);
                if (item == null) {
                    return event;
                }
            }
            event = evenementRepository.save(evenement);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        // result = new ResponseEntity<>(HttpStatus.OK);
        return event;

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
