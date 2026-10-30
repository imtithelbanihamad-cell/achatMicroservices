package tn.esprit.rh.invoiceservice.domain;
import javax.persistence.*;
@Entity @Table(name="facture") public class Facture {
 @Id @GeneratedValue(strategy=GenerationType.IDENTITY) private Long idFacture;
  private Float montantRemise;
 private Float montantFacture;
 private String dateCreationFacture;
 private String dateDerniereModificationFacture;
 private Boolean archivee;
 private Long fournisseurId;
 private Long operateurId;
 public Long getIdFacture(){return idFacture;} public void setIdFacture(Long value){this.idFacture=value;}
  public Float getMontantRemise(){return montantRemise;} public void setMontantRemise(Float value){this.montantRemise=value;}
 public Float getMontantFacture(){return montantFacture;} public void setMontantFacture(Float value){this.montantFacture=value;}
 public String getDateCreationFacture(){return dateCreationFacture;} public void setDateCreationFacture(String value){this.dateCreationFacture=value;}
 public String getDateDerniereModificationFacture(){return dateDerniereModificationFacture;} public void setDateDerniereModificationFacture(String value){this.dateDerniereModificationFacture=value;}
 public Boolean getArchivee(){return archivee;} public void setArchivee(Boolean value){this.archivee=value;}
 public Long getFournisseurId(){return fournisseurId;} public void setFournisseurId(Long value){this.fournisseurId=value;}
 public Long getOperateurId(){return operateurId;} public void setOperateurId(Long value){this.operateurId=value;}
}