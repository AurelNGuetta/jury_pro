package ci.oda.jury_pro.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ci.oda.jury_pro.entities.Vote_candidats;
import ci.oda.jury_pro.repositories.VoteCandidatRepository;

@Service
public class VoteCandidatService {
    @Autowired
    VoteCandidatRepository voteCandidatRepository;

    public List<Vote_candidats> getAll() {
        return voteCandidatRepository.findAll();
    }

    public Vote_candidats getVoteCandidatById(int id) {
        return voteCandidatRepository.getOne(id);
    }

    public boolean createOrUpdateVoteCandidat(Vote_candidats voteCandidat) {
        boolean result = false;
        try {
            if (voteCandidat.getCandidat_id() > 0) {
                Vote_candidats item = voteCandidatRepository.getOne(voteCandidat.getCandidat_id());
                result = true;
                if (item == null) {
                    throw new Exception();
                }
            }
            voteCandidatRepository.save(voteCandidat);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        return result;

    }

    public boolean deleteVoteCandidat(Vote_candidats voteCandidat) {
        boolean result = false;
        try {
            if (voteCandidat.getCandidat_id() < 0) {
                throw new Exception();
            }
            Vote_candidats item = voteCandidatRepository.getOne(voteCandidat.getCandidat_id());
            if (item == null) {
                throw new Exception();
            }
            voteCandidatRepository.delete(voteCandidat);
            result = true;
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        return result;
    }
}
