package no.nord.personlistdetail;

/**
 * Created by christerhansen on 17.02.16.
 */
public class Person {
    private String fornavn;
    private String etternavn;
    private String adresse;
    private int telefon;
    private String epost;

    public Person(String adresse, String epost, String etternavn, String fornavn, int telefon) {
        this.adresse = adresse;
        this.epost = epost;
        this.etternavn = etternavn;
        this.fornavn = fornavn;
        this.telefon = telefon;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getEpost() {
        return epost;
    }

    public void setEpost(String epost) {
        this.epost = epost;
    }

    public String getEtternavn() {
        return etternavn;
    }

    public void setEtternavn(String etternavn) {
        this.etternavn = etternavn;
    }

    public String getFornavn() {
        return fornavn;
    }

    public void setFornavn(String fornavn) {
        this.fornavn = fornavn;
    }

    public int getTelefon() {
        return telefon;
    }

    public void setTelefon(int telefon) {
        this.telefon = telefon;
    }
}
