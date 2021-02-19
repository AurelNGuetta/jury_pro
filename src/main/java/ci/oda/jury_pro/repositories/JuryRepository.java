package ci.oda.jury_pro.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.web.bind.annotation.CrossOrigin;

import ci.oda.jury_pro.entities.Jury;

@CrossOrigin
public interface JuryRepository extends JpaRepository<Jury, Integer>{

    @Query(value = "SELECT * FROM jury j WHERE (j.email = ?1 OR j.jury_telephone = ?1);", nativeQuery = true)
    Jury findJuryByTag(String data);
}
