package ci.oda.jury_pro.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import ci.oda.jury_pro.entities.Vote_candidats;


public interface VoteCandidatRepository extends JpaRepository<Vote_candidats, Integer>{

}
