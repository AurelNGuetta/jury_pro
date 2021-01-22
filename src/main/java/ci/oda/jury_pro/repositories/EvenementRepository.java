package ci.oda.jury_pro.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.web.bind.annotation.CrossOrigin;

// import ci.oda.jury_pro.entities.AllEvenement;
import ci.oda.jury_pro.entities.Evenement;
import ci.oda.jury_pro.entities.IEvenementDTO;

@CrossOrigin
public interface EvenementRepository extends JpaRepository<Evenement, Integer> {

    @Query(value = "SELECT EV.*, GP.Nombre as 'participant'  FROM evenements as EV LEFT OUTER JOIN (SELECT * FROM  (SELECT CA.evenement_id, COUNT(*) AS nombre FROM candidats as CA GROUP BY CA.evenement_id) AS G1 UNION SELECT * FROM (SELECT GR.evenement_id , COUNT(*) AS nombre  FROM groupe as GR GROUP BY GR.evenement_id) AS G2) AS GP ON (EV.evenement_id = GP.evenement_id);", nativeQuery = true)
    List<IEvenementDTO> findAllEvenements();
}
