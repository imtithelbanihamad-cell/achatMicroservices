package tn.esprit.rh.supplierservice.domain;
import javax.persistence.*;
@Entity @Table(name="secteuractivite") public class SecteurActivite {
 @Id @GeneratedValue(strategy=GenerationType.IDENTITY) private Long idSecteurActivite;
  private String codeSecteurActivite;
 private String libelleSecteurActivite;
 public Long getIdSecteurActivite(){return idSecteurActivite;} public void setIdSecteurActivite(Long value){this.idSecteurActivite=value;}
  public String getCodeSecteurActivite(){return codeSecteurActivite;} public void setCodeSecteurActivite(String value){this.codeSecteurActivite=value;}
 public String getLibelleSecteurActivite(){return libelleSecteurActivite;} public void setLibelleSecteurActivite(String value){this.libelleSecteurActivite=value;}
}