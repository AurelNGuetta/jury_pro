package ci.oda.jury_pro.entities;

import javax.persistence.Entity;

import javax.persistence.*;

@Entity
@Table(name = "vote_groupe")
public class Vote_groupes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int vote_groupe_id;
    private int jury_id;
    private int evenement_id;
    private int critere_id;
    private int groupe_id;
    private int note;
    private String commenentaires;

    public Vote_groupes(int vote_groupe_id, int jury_id, int evenement_id, int critere_id, int groupe_id, int note,
            String commenentaires) {
        this.vote_groupe_id = vote_groupe_id;
        this.jury_id = jury_id;
        this.critere_id = critere_id;
        this.evenement_id = evenement_id;
        this.groupe_id = groupe_id;
        this.note = note;
        this.commenentaires = commenentaires;
    }

    public Vote_groupes() {
    }

    public int getVote_groupe_id() {
        return this.vote_groupe_id;
    }

    public void setVote_groupe_id(int vote_groupe_id) {
        this.vote_groupe_id = vote_groupe_id;
    }

    public int getJury_id() {
        return this.jury_id;
    }

    public void setJury_id(int jury_id) {
        this.jury_id = jury_id;
    }

    public int getCritere_id() {
        return this.critere_id;
    }

    public void setCritere_id(int critere_id) {
        this.critere_id = critere_id;
    }

    public int getEvenement_id() {
        return this.evenement_id;
    }

    public void setEvenement_id(int evenement_id) {
        this.evenement_id = evenement_id;
    }

    public int getGroupe_id() {
        return this.groupe_id;
    }

    public void setGroupe_id(int groupe_id) {
        this.groupe_id = groupe_id;
    }

    public int getNote() {
        return this.note;
    }

    public void setNote(int note) {
        this.note = note;
    }

    public String getCommenentaires() {
        return this.commenentaires;
    }

    public void setCommenentaires(String commenentaires) {
        this.commenentaires = commenentaires;
    }

}