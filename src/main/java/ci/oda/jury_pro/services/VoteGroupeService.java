package ci.oda.jury_pro.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ci.oda.jury_pro.entities.Vote_groupes;
import ci.oda.jury_pro.repositories.VoteGroupeRepository;

@Service
public class VoteGroupeService {

    @Autowired
    VoteGroupeRepository voteGroupeRepository;

    public List<Vote_groupes> getAll() {
        return voteGroupeRepository.findAll();
    }

    public Vote_groupes getVoteGroupeById(int id) {
        return voteGroupeRepository.getOne(id);
    }

    public boolean createOrUpdateVoteGroupe(Vote_groupes voteGroupe) {
        boolean result = false;
        try {
            if (voteGroupe.getGroupe_id() > 0) {
                Vote_groupes item = voteGroupeRepository.getOne(voteGroupe.getGroupe_id());
                result = true;
                if (item == null) {
                    throw new Exception();
                }
            }
            voteGroupeRepository.save(voteGroupe);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        return result;

    }

    public boolean deleteVoteGroupe(Vote_groupes voteGroupe) {
        boolean result = false;
        try {
            if (voteGroupe.getGroupe_id() < 0) {
                throw new Exception();
            }
            Vote_groupes item = voteGroupeRepository.getOne(voteGroupe.getGroupe_id());
            if (item == null) {
                throw new Exception();
            }
            voteGroupeRepository.delete(voteGroupe);
            result = true;
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        return result;
    }

}
