package tn.esprit.rh.productservice.api;
import tn.esprit.rh.productservice.domain.CategorieProduit; import tn.esprit.rh.productservice.repository.CategorieProduitRepository; import org.springframework.http.ResponseEntity; import org.springframework.web.bind.annotation.*; import java.util.List;
@RestController @RequestMapping("/api/categorieproduit") @CrossOrigin
public class CategorieProduitController { private final CategorieProduitRepository repository; public CategorieProduitController(CategorieProduitRepository repository){this.repository=repository;}
 @GetMapping public List<CategorieProduit> all(){return repository.findAll();}
 @GetMapping("/{id}") public ResponseEntity<CategorieProduit> one(@PathVariable Long id){return repository.findById(id).map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());}
 @PostMapping public CategorieProduit create(@RequestBody CategorieProduit value){return repository.save(value);}
 @PutMapping("/{id}") public ResponseEntity<CategorieProduit> update(@PathVariable Long id,@RequestBody CategorieProduit value){if(!repository.existsById(id))return ResponseEntity.notFound().build(); return ResponseEntity.ok(repository.save(value));}
 @DeleteMapping("/{id}") public ResponseEntity<Void> delete(@PathVariable Long id){if(!repository.existsById(id))return ResponseEntity.notFound().build();repository.deleteById(id);return ResponseEntity.noContent().build();}
}