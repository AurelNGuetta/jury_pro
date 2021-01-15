package ci.oda.jury_pro.entities;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "evenements")
public class Evenement {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int evenement_id;
    private String evenement_nom;
    private String evenement_type;
    private Date evenement_date_debut;
    private Date evenement_date_fin;

    public Evenement(int evenement_id, String evenement_nom, String evenement_type, Date evenement_date_debut,
            Date evenement_date_fin) {
        this.evenement_id = evenement_id;
        this.evenement_nom = evenement_nom;
        this.evenement_type = evenement_type;
        this.evenement_date_debut = evenement_date_debut;
        this.evenement_date_fin = evenement_date_fin;
    }

    public Evenement() {
    }

    public int getEvenement_id() {
        return this.evenement_id;
    }

    public String getEvenement_nom() {
        return this.evenement_nom;
    }

    public String getEvenement_type() {
        return this.evenement_type;
    }

    public Date getEvenement_date_debut() {
        return this.evenement_date_debut;
    }

    public Date getEvenement_date_fin() {
        return this.evenement_date_fin;
    }

    public void setEvenement_id(int evenement_id) {
        this.evenement_id = evenement_id;
    }

    public void setEvenement_nom(String evenement_nom) {
        this.evenement_nom = evenement_nom;
    }

    public void setEvenement_type(String evenement_type) {
        this.evenement_type = evenement_type;
    }

    public void setEvenement_date_debut(Date evenement_date_debut) {
        this.evenement_date_debut = evenement_date_debut;
    }

    public void setEvenement_date_fin(Date evenement_date_fin) {
        this.evenement_date_fin = evenement_date_fin;
    }

}
