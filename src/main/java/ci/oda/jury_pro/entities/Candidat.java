package ci.oda.jury_pro.entities;

import javax.persistence.Entity;

import javax.persistence.*;

@Entity
@Table(name = "candidats")
public class Candidat {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String candidat_nom;
    private String candidat_prenom;
    private String candidat_email;
    private Byte[] candidat_photo;
    private int candidat_telephone;
    @Column(name = "evenement_id")
    private int candidat_evenement;

    public Candidat() {
    }

    public Candidat(int id, String candidat_nom, String candidat_prenom, String candidat_email, Byte[] candidat_photo,
            int candidat_telephone, int candidat_evenement) {
        this.id = id;
        this.candidat_nom = candidat_nom;
        this.candidat_prenom = candidat_prenom;
        this.candidat_email = candidat_email;
        this.candidat_photo = candidat_photo;
        this.candidat_telephone = candidat_telephone;
        this.candidat_evenement = candidat_evenement;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCandidat_nom() {
        return this.candidat_nom;
    }

    public void setCandidat_nom(String candidat_nom) {
        this.candidat_nom = candidat_nom;
    }

    public String getCandidat_prenom() {
        return this.candidat_prenom;
    }

    public void setCandidat_prenom(String candidat_prenom) {
        this.candidat_prenom = candidat_prenom;
    }

    public String getCandidat_email() {
        return this.candidat_email;
    }

    public void setCandidat_email(String candidat_email) {
        this.candidat_email = candidat_email;
    }

    public Byte[] getCandidat_photo() {
        return this.candidat_photo;
    }

    public void setCandidat_photo(Byte[] candidat_photo) {
        this.candidat_photo = candidat_photo;
    }

    public int getCandidat_telephone() {
        return this.candidat_telephone;
    }

    public void setCandidat_telephone(int candidat_telephone) {
        this.candidat_telephone = candidat_telephone;
    }

    public int getCandidat_evenement() {
        return this.candidat_evenement;
    }

    public void setCandidat_evenement(int candidat_evenement) {
        this.candidat_evenement = candidat_evenement;
    }

}
