package tn.esprit.rh.invoiceservice.api;
import tn.esprit.rh.invoiceservice.domain.Facture; import tn.esprit.rh.invoiceservice.repository.FactureRepository; import org.springframework.http.ResponseEntity; import org.springframework.web.bind.annotation.*; import java.util.List;
@RestController @RequestMapping("/api/facture") @CrossOrigin
public class FactureController { private final FactureRepository repository; public FactureController(FactureRepository repository){this.repository=repository;}
 @GetMapping public List<Facture> all(){return repository.findAll();}
 @GetMapping("/{id}") public ResponseEntity<Facture> one(@PathVariable Long id){return repository.findById(id).map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());}
 @PostMapping public Facture create(@RequestBody Facture value){return repository.save(value);}
 @PutMapping("/{id}") public ResponseEntity<Facture> update(@PathVariable Long id,@RequestBody Facture value){if(!repository.existsById(id))return ResponseEntity.notFound().build(); return ResponseEntity.ok(repository.save(value));}
 @DeleteMapping("/{id}") public ResponseEntity<Void> delete(@PathVariable Long id){if(!repository.existsById(id))return ResponseEntity.notFound().build();repository.deleteById(id);return ResponseEntity.noContent().build();}
}