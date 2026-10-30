package tn.esprit.rh.productservice.domain;
import javax.persistence.*;
@Entity @Table(name="stock") public class Stock {
 @Id @GeneratedValue(strategy=GenerationType.IDENTITY) private Long idStock;
  private String libelleStock;
 private Integer qte;
 private Integer qteMin;
 public Long getIdStock(){return idStock;} public void setIdStock(Long value){this.idStock=value;}
  public String getLibelleStock(){return libelleStock;} public void setLibelleStock(String value){this.libelleStock=value;}
 public Integer getQte(){return qte;} public void setQte(Integer value){this.qte=value;}
 public Integer getQteMin(){return qteMin;} public void setQteMin(Integer value){this.qteMin=value;}
}