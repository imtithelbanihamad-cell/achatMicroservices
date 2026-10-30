package tn.esprit.rh.invoiceservice.domain;
import javax.persistence.*;
@Entity @Table(name="detailfacture") public class DetailFacture {
 @Id @GeneratedValue(strategy=GenerationType.IDENTITY) private Long idDetailFacture;
  private Integer qteCommandee;
 private Float prixTotalDetail;
 private Integer pourcentageRemise;
 private Float montantRemise;
 private Long produitId;
 private Long factureId;
 public Long getIdDetailFacture(){return idDetailFacture;} public void setIdDetailFacture(Long value){this.idDetailFacture=value;}
  public Integer getQteCommandee(){return qteCommandee;} public void setQteCommandee(Integer value){this.qteCommandee=value;}
 public Float getPrixTotalDetail(){return prixTotalDetail;} public void setPrixTotalDetail(Float value){this.prixTotalDetail=value;}
 public Integer getPourcentageRemise(){return pourcentageRemise;} public void setPourcentageRemise(Integer value){this.pourcentageRemise=value;}
 public Float getMontantRemise(){return montantRemise;} public void setMontantRemise(Float value){this.montantRemise=value;}
 public Long getProduitId(){return produitId;} public void setProduitId(Long value){this.produitId=value;}
 public Long getFactureId(){return factureId;} public void setFactureId(Long value){this.factureId=value;}
}