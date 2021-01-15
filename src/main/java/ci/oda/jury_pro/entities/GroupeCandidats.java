package ci.oda.jury_pro.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "groupe_candidats")
public class GroupeCandidats {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int groupe_candidat_id;
    private int candidat_id;
    private int groupe_id;

    public int getGroupe_candidat_id() {
        return this.groupe_candidat_id;
    }

    public void setGroupe_candidat_id(int groupe_candidat_id) {
        this.groupe_candidat_id = groupe_candidat_id;
    }

    public int getCandidat_id() {
        return this.candidat_id;
    }

    public void setCandidat_id(int candidat_id) {
        this.candidat_id = candidat_id;
    }

    public int getGroupe_id() {
        return this.groupe_id;
    }

    public void setGroupe_id(int groupe_id) {
        this.groupe_id = groupe_id;
    }

}
