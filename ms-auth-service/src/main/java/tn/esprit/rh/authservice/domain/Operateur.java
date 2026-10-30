package tn.esprit.rh.authservice.domain;
import javax.persistence.*;
@Entity @Table(name="operateur") public class Operateur {
 @Id @GeneratedValue(strategy=GenerationType.IDENTITY) private Long idOperateur;
  private String nom;
 private String prenom;
 private String password;
 public Long getIdOperateur(){return idOperateur;} public void setIdOperateur(Long value){this.idOperateur=value;}
  public String getNom(){return nom;} public void setNom(String value){this.nom=value;}
 public String getPrenom(){return prenom;} public void setPrenom(String value){this.prenom=value;}
 public String getPassword(){return password;} public void setPassword(String value){this.password=value;}
}