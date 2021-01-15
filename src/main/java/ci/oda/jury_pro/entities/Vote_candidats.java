package ci.oda.jury_pro.entities;

import javax.persistence.Entity;

import javax.persistence.*;

@Entity
@Table(name = "vote_candidats")
public class Vote_candidats {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int vote_candidat_id;
    private int jury_id;
    private int evenement_id;
    private int candidat_id;
    private int note;
    private String commenentaires;

    public Vote_candidats() {
    }

    public Vote_candidats(int vote_candidat_id, int jury_id, int evenement_id, int candidat_id, int note,
            String commenentaires) {
        this.vote_candidat_id = vote_candidat_id;
        this.jury_id = jury_id;
        this.evenement_id = evenement_id;
        this.candidat_id = candidat_id;
        this.note = note;
        this.commenentaires = commenentaires;
    }

    public int getVote_candidat_id() {
        return this.vote_candidat_id;
    }

    public void setVote_candidat_id(int vote_candidat_id) {
        this.vote_candidat_id = vote_candidat_id;
    }

    public int getJury_id() {
        return this.jury_id;
    }

    public void setJury_id(int jury_id) {
        this.jury_id = jury_id;
    }

    public int getEvenement_id() {
        return this.evenement_id;
    }

    public void setEvenement_id(int evenement_id) {
        this.evenement_id = evenement_id;
    }

    public int getCandidat_id() {
        return this.candidat_id;
    }

    public void setCandidat_id(int candidat_id) {
        this.candidat_id = candidat_id;
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