package ci.oda.jury_pro.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import ci.oda.jury_pro.entities.Criteres;
import ci.oda.jury_pro.repositories.CriteresRepository;

public class CriteresService {

    @Autowired
    CriteresRepository criteresRepository;

    public List<Criteres> getAll() {
        return criteresRepository.findAll();
    }

    public Criteres getCritereById(int id) {
        return criteresRepository.getOne(id);
    }

    public boolean createOrUpdateCritere(Criteres Criteres) {
        boolean result = false;
        try {
            if (Criteres.getCritere_id() > 0) {
                Criteres item = criteresRepository.getOne(Criteres.getCritere_id());
                result = true;
                if (item == null) {
                    throw new Exception();
                }
            }
            criteresRepository.save(Criteres);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        return result;

    }

    public boolean deleteCritere(Criteres Criteres) {
        boolean result = false;
        try {
            if (Criteres.getCritere_id() < 0) {
                throw new Exception();
            }
            Criteres item = criteresRepository.getOne(Criteres.getCritere_id());
            if (item == null) {
                throw new Exception();
            }
            criteresRepository.delete(Criteres);
            result = true;
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        return result;
    }
}
