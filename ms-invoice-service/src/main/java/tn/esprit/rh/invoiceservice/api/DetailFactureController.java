package tn.esprit.rh.invoiceservice.api;
import tn.esprit.rh.invoiceservice.domain.DetailFacture; import tn.esprit.rh.invoiceservice.repository.DetailFactureRepository; import org.springframework.http.ResponseEntity; import org.springframework.web.bind.annotation.*; import java.util.List;
@RestController @RequestMapping("/api/detailfacture") @CrossOrigin
public class DetailFactureController { private final DetailFactureRepository repository; public DetailFactureController(DetailFactureRepository repository){this.repository=repository;}
 @GetMapping public List<DetailFacture> all(){return repository.findAll();}
 @GetMapping("/{id}") public ResponseEntity<DetailFacture> one(@PathVariable Long id){return repository.findById(id).map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());}
 @PostMapping public DetailFacture create(@RequestBody DetailFacture value){return repository.save(value);}
 @PutMapping("/{id}") public ResponseEntity<DetailFacture> update(@PathVariable Long id,@RequestBody DetailFacture value){if(!repository.existsById(id))return ResponseEntity.notFound().build(); return ResponseEntity.ok(repository.save(value));}
 @DeleteMapping("/{id}") public ResponseEntity<Void> delete(@PathVariable Long id){if(!repository.existsById(id))return ResponseEntity.notFound().build();repository.deleteById(id);return ResponseEntity.noContent().build();}
}