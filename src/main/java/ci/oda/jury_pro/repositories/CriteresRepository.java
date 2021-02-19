package ci.oda.jury_pro.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import ci.oda.jury_pro.entities.Criteres;


public interface CriteresRepository extends JpaRepository<Criteres, Integer>{

    @Query(value = "SELECT * FROM criteres c WHERE c.evenement_id = ?1", nativeQuery = true)
    List<Criteres> getCritereByEvenement(int evenement);
}
