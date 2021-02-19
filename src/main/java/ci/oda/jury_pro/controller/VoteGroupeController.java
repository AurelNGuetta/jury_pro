package ci.oda.jury_pro.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import ci.oda.jury_pro.entities.Vote_groupes;
import ci.oda.jury_pro.services.VoteGroupeService;

@RestController
public class VoteGroupeController extends VoteGroupeService {

    @Autowired
    VoteGroupeService voteGroupeService;

    @GetMapping("/voteGroupe")
    public List<Vote_groupes> getAll() {
        return voteGroupeService.getAll();
    }

    @GetMapping("/voteGroupe/{id}")
    public Vote_groupes getVoteGroupeById(int id) {
        return voteGroupeService.getVoteGroupeById(id);
    }

    @PostMapping("/voteGroupe")
    public boolean createOrUpdateVoteGroupe(@RequestBody Vote_groupes Vote_groupes) {

        return voteGroupeService.createOrUpdateVoteGroupe(Vote_groupes);

    }

    @PostMapping("/voteGroupe/delete")
    public boolean deleteVoteGroupe(Vote_groupes Vote_groupes) {
        // Vote_groupes.setId(1);
        return voteGroupeService.deleteVoteGroupe(Vote_groupes);

    }

}
