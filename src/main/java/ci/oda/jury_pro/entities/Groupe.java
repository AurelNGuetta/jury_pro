package ci.oda.jury_pro.entities;

import javax.persistence.Entity;

import javax.persistence.*;

@Entity
@Table(name = "groupe")
public class Groupe {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int groupe_id;
    private int code;
    private String groupe_nom;
    private int evenement_id;

    public Groupe() {
    }

    public Groupe(int groupe_id, int code, String groupe_nom, int evenement_id) {
        this.groupe_id = groupe_id;
        this.code = code;
        this.groupe_nom = groupe_nom;
        this.evenement_id = evenement_id;
    }

    public int getGroupe_id() {
        return this.groupe_id;
    }

    public void setGroupe_id(int groupe_id) {
        this.groupe_id = groupe_id;
    }

    public int getCode() {
        return this.code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getGroupe_nom() {
        return this.groupe_nom;
    }

    public void setGroupe_nom(String groupe_nom) {
        this.groupe_nom = groupe_nom;
    }

    public int getEvenement_id() {
        return this.evenement_id;
    }

    public void setEvenement_id(int evenement_id) {
        this.evenement_id = evenement_id;
    }

}
