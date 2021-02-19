package ci.oda.jury_pro.entities;

import javax.persistence.Entity;

import javax.persistence.*;

@Entity
@Table(name = "jury")
public class Jury {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int jury_id;
    private int code;
    private String jury_nom_complet;
    private String email;
    private String jury_telephone;
    private int evenement_id;

    public Jury(int jury_id, int code, String jury_nom_complet, String email, String jury_telephone, int evenement_id) {
        this.jury_id = jury_id;
        this.code = code;
        this.jury_nom_complet = jury_nom_complet;
        this.email = email;
        this.jury_telephone = jury_telephone;
        this.evenement_id = evenement_id;
    }

    public Jury() {

    }

    public int getJury_id() {
        return this.jury_id;
    }

    public void setJury_id(int jury_id) {
        this.jury_id = jury_id;
    }

    public int getCode() {
        return this.code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getJury_nom_complet() {
        return this.jury_nom_complet;
    }

    public void setJury_nom_complet(String jury_nom_complet) {
        this.jury_nom_complet = jury_nom_complet;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getJury_telephone() {
        return this.jury_telephone;
    }

    public void setJury_telephone(String jury_telephone) {
        this.jury_telephone = jury_telephone;
    }

    public int getEvenement_id() {
        return this.evenement_id;
    }

    public void setEvenement_id(int evenement_id) {
        this.evenement_id = evenement_id;
    }
}
