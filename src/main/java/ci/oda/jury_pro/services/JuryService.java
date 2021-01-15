package ci.oda.jury_pro.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import ci.oda.jury_pro.entities.Jury;
import ci.oda.jury_pro.repositories.JuryRepository;

@RestController
public class JuryService {

    @Autowired
    JuryRepository juryRepository;

    public List<Jury> getAll() {
        return juryRepository.findAll();
    }

    public Jury getGroupeById(int id) {
        return juryRepository.getOne(id);
    }

    public boolean createOrUpdate(Jury Jury) {
        boolean result = false;
        try {
            if (Jury.getJury_id() > 0) {
                Jury item = juryRepository.getOne(Jury.getJury_id());
                result = true;
                if (item == null) {
                    throw new Exception();
                }
            }
            juryRepository.save(Jury);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        return result;

    }

    public boolean deleteEvenement(Jury Jury) {
        boolean result = false;
        try {
            if (Jury.getJury_id() < 0) {
                throw new Exception();
            }
            Jury item = juryRepository.getOne(Jury.getJury_id());
            if (item == null) {
                throw new Exception();
            }
            juryRepository.delete(Jury);
            result = true;
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        return result;
    }
}
