package ci.oda.jury_pro.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "criteres")
public class Criteres {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int critere_id;

    private String critere_libelle;
    private int critere_bareme;
    private int evenement_id;

    public int getCritere_id() {
        return this.critere_id;
    }

    public void setCritere_id(int critere_id) {
        this.critere_id = critere_id;
    }

    public String getCritere_libelle() {
        return this.critere_libelle;
    }

    public void setCritere_libelle(String critere_libelle) {
        this.critere_libelle = critere_libelle;
    }

    public int getCritere_bareme() {
        return this.critere_bareme;
    }

    public void setCritere_bareme(int critere_bareme) {
        this.critere_bareme = critere_bareme;
    }

    public int getEvenement_id() {
        return this.evenement_id;
    }

    public void setEvenement_id(int evenement_id) {
        this.evenement_id = evenement_id;
    }

}
