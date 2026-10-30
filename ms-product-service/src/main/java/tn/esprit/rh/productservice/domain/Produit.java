package tn.esprit.rh.productservice.domain;
import javax.persistence.*;
@Entity @Table(name="produit") public class Produit {
 @Id @GeneratedValue(strategy=GenerationType.IDENTITY) private Long idProduit;
  private String codeProduit;
 private String libelleProduit;
 private Float prix;
 private String dateCreation;
 private String dateDerniereModification;
 private Long idCategorieProduit;
 private Long idStock;
 public Long getIdProduit(){return idProduit;} public void setIdProduit(Long value){this.idProduit=value;}
  public String getCodeProduit(){return codeProduit;} public void setCodeProduit(String value){this.codeProduit=value;}
 public String getLibelleProduit(){return libelleProduit;} public void setLibelleProduit(String value){this.libelleProduit=value;}
 public Float getPrix(){return prix;} public void setPrix(Float value){this.prix=value;}
 public Long getIdCategorieProduit(){return idCategorieProduit;} public void setIdCategorieProduit(Long value){this.idCategorieProduit=value;}
 public Long getIdStock(){return idStock;} public void setIdStock(Long value){this.idStock=value;}

 public String getDateCreation(){return dateCreation;} public void setDateCreation(String value){this.dateCreation=value;}
 public String getDateDerniereModification(){return dateDerniereModification;} public void setDateDerniereModification(String value){this.dateDerniereModification=value;}
}