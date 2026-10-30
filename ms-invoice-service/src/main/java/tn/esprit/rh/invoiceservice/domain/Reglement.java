package tn.esprit.rh.invoiceservice.domain;
import javax.persistence.*;
@Entity @Table(name="reglement") public class Reglement {
 @Id @GeneratedValue(strategy=GenerationType.IDENTITY) private Long idReglement;
  private Float montantPaye;
 private Float montantRestant;
 private Boolean payee;
 private String dateReglement;
 private Long factureId;
 public Long getIdReglement(){return idReglement;} public void setIdReglement(Long value){this.idReglement=value;}
  public Float getMontantPaye(){return montantPaye;} public void setMontantPaye(Float value){this.montantPaye=value;}
 public String getDateReglement(){return dateReglement;} public void setDateReglement(String value){this.dateReglement=value;}
 public Long getFactureId(){return factureId;} public void setFactureId(Long value){this.factureId=value;}

 public Float getMontantRestant(){return montantRestant;} public void setMontantRestant(Float value){this.montantRestant=value;}
 public Boolean getPayee(){return payee;} public void setPayee(Boolean value){this.payee=value;}
}