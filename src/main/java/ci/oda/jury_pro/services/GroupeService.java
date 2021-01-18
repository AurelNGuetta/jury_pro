package ci.oda.jury_pro.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.RestController;

import ci.oda.jury_pro.entities.Groupe;
import ci.oda.jury_pro.repositories.GroupeRepository;

@RestController
public class GroupeService {

    @Autowired
    GroupeRepository groupeRepository;

    public List<Groupe> getAll() {
        return groupeRepository.findAll();
    }

    public Groupe getGroupeById(int id) {
        return groupeRepository.getOne(id);
    }

    public boolean createOrUpdateGroupe(Groupe groupe) {
        boolean result = false;
        try {
            if (groupe.getGroupe_id() > 0) {
                Groupe item = groupeRepository.getOne(groupe.getGroupe_id());
                result = true;
                if (item == null) {
                    throw new Exception();
                }
            }
            groupeRepository.save(groupe);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        return result;

    }

    public boolean deleteGroupe(Groupe groupe) {
        boolean result = false;
        try {
            if (groupe.getGroupe_id() < 0) {
                throw new Exception();
            }
            Groupe item = ((JpaRepository<Groupe, Integer>) groupeRepository).getOne(groupe.getGroupe_id());
            if (item == null) {
                throw new Exception();
            }
            groupeRepository.delete(groupe);
            result = true;
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        return result;
    }

}
