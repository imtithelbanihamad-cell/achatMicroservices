package tn.esprit.rh.supplierservice.api;
import tn.esprit.rh.supplierservice.domain.Fournisseur; import tn.esprit.rh.supplierservice.repository.FournisseurRepository; import org.springframework.http.ResponseEntity; import org.springframework.web.bind.annotation.*; import java.util.List;
@RestController @RequestMapping("/api/fournisseur") @CrossOrigin
public class FournisseurController { private final FournisseurRepository repository; public FournisseurController(FournisseurRepository repository){this.repository=repository;}
 @GetMapping public List<Fournisseur> all(){return repository.findAll();}
 @GetMapping("/{id}") public ResponseEntity<Fournisseur> one(@PathVariable Long id){return repository.findById(id).map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());}
 @PostMapping public Fournisseur create(@RequestBody Fournisseur value){return repository.save(value);}
 @PutMapping("/{id}") public ResponseEntity<Fournisseur> update(@PathVariable Long id,@RequestBody Fournisseur value){if(!repository.existsById(id))return ResponseEntity.notFound().build(); return ResponseEntity.ok(repository.save(value));}
 @DeleteMapping("/{id}") public ResponseEntity<Void> delete(@PathVariable Long id){if(!repository.existsById(id))return ResponseEntity.notFound().build();repository.deleteById(id);return ResponseEntity.noContent().build();}
}