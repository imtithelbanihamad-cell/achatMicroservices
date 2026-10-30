package tn.esprit.rh.productservice.domain;
import javax.persistence.*;
@Entity @Table(name="categorieproduit") public class CategorieProduit {
 @Id @GeneratedValue(strategy=GenerationType.IDENTITY) private Long idCategorieProduit;
  private String codeCategorie;
 private String libelleCategorie;
 public Long getIdCategorieProduit(){return idCategorieProduit;} public void setIdCategorieProduit(Long value){this.idCategorieProduit=value;}
  public String getCodeCategorie(){return codeCategorie;} public void setCodeCategorie(String value){this.codeCategorie=value;}
 public String getLibelleCategorie(){return libelleCategorie;} public void setLibelleCategorie(String value){this.libelleCategorie=value;}
}