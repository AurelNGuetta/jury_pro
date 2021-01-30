package ci.oda.jury_pro.entities;

import java.sql.Date;

public interface IEvenementDTO {

    public abstract int getEvenement_id();

    public abstract String getEvenement_nom();

    public abstract Date getEvenement_date_debut();

    public abstract String getEvenement_description();

    public abstract String getEvenement_type();

    public abstract Date getEvenement_date_fin();

    public abstract byte[] getEvenement_photo();

    public abstract Integer getParticipant();

}
