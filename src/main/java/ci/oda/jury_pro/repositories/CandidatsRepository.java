package ci.oda.jury_pro.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import ci.oda.jury_pro.entities.Candidat;

public interface CandidatsRepository extends JpaRepository<Candidat, Integer>{


    @Query(value = "SELECT * FROM candidats WHERE evenement_id = ?1", nativeQuery = true)
    List<Candidat> findCandidatByEvenement(Integer evenement_id);
}
