package ci.oda.jury_pro.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import ci.oda.jury_pro.entities.Vote_candidats;
import ci.oda.jury_pro.services.VoteCandidatService;

@RestController
public class VoteCandidatController extends VoteCandidatService {
    
    @Autowired
    VoteCandidatService voteCandidatService;

    
    @GetMapping("/voteCandidats")
    public List<Vote_candidats> getAll() {
        return voteCandidatService.getAll();
    }

    @GetMapping("/voteCandidats/{id}")
    public Vote_candidats getVoteCandidatById(int id) {
        return voteCandidatService.getVoteCandidatById(id);
    }

    @PostMapping("/voteCandidats")
    public boolean createOrUpdateVoteCandidat(@RequestBody Vote_candidats vote_candidats) {

        return voteCandidatService.createOrUpdateVoteCandidat(vote_candidats);

    }

    @PostMapping("/voteCandidats/delete")
    public boolean deleteVoteCandidat(Vote_candidats vote_candidats) {
        // Vote_candidats.setId(1);
        return voteCandidatService.deleteVoteCandidat(vote_candidats);

    }
}
