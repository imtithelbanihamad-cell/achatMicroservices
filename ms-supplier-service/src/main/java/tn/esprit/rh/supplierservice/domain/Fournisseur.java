package tn.esprit.rh.supplierservice.domain;
import javax.persistence.*;
@Entity @Table(name="fournisseur") public class Fournisseur {
 @Id @GeneratedValue(strategy=GenerationType.IDENTITY) private Long idFournisseur;
  private String code;
 private String libelle;
 private String categorieFournisseur;
 private String email;
 private String adresse;
 private Long secteurActiviteId;
 public Long getIdFournisseur(){return idFournisseur;} public void setIdFournisseur(Long value){this.idFournisseur=value;}
  public String getCode(){return code;} public void setCode(String value){this.code=value;}
 public String getLibelle(){return libelle;} public void setLibelle(String value){this.libelle=value;}
 public String getCategorieFournisseur(){return categorieFournisseur;} public void setCategorieFournisseur(String value){this.categorieFournisseur=value;}
 public String getEmail(){return email;} public void setEmail(String value){this.email=value;}
 public String getAdresse(){return adresse;} public void setAdresse(String value){this.adresse=value;}
 public Long getSecteurActiviteId(){return secteurActiviteId;} public void setSecteurActiviteId(Long value){this.secteurActiviteId=value;}
}