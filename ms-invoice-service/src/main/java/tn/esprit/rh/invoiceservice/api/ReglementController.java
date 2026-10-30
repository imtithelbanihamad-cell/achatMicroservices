package tn.esprit.rh.invoiceservice.api;
import tn.esprit.rh.invoiceservice.domain.Reglement; import tn.esprit.rh.invoiceservice.repository.ReglementRepository; import org.springframework.http.ResponseEntity; import org.springframework.web.bind.annotation.*; import java.util.List;
@RestController @RequestMapping("/api/reglement") @CrossOrigin
public class ReglementController { private final ReglementRepository repository; public ReglementController(ReglementRepository repository){this.repository=repository;}
 @GetMapping public List<Reglement> all(){return repository.findAll();}
 @GetMapping("/{id}") public ResponseEntity<Reglement> one(@PathVariable Long id){return repository.findById(id).map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());}
 @PostMapping public Reglement create(@RequestBody Reglement value){return repository.save(value);}
 @PutMapping("/{id}") public ResponseEntity<Reglement> update(@PathVariable Long id,@RequestBody Reglement value){if(!repository.existsById(id))return ResponseEntity.notFound().build(); return ResponseEntity.ok(repository.save(value));}
 @DeleteMapping("/{id}") public ResponseEntity<Void> delete(@PathVariable Long id){if(!repository.existsById(id))return ResponseEntity.notFound().build();repository.deleteById(id);return ResponseEntity.noContent().build();}
}