package tn.esprit.rh.productservice.api;
import tn.esprit.rh.productservice.domain.Produit; import tn.esprit.rh.productservice.repository.ProduitRepository; import org.springframework.http.ResponseEntity; import org.springframework.web.bind.annotation.*; import java.util.List;
@RestController @RequestMapping("/api/produit") @CrossOrigin
public class ProduitController { private final ProduitRepository repository; public ProduitController(ProduitRepository repository){this.repository=repository;}
 @GetMapping public List<Produit> all(){return repository.findAll();}
 @GetMapping("/{id}") public ResponseEntity<Produit> one(@PathVariable Long id){return repository.findById(id).map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());}
 @PostMapping public Produit create(@RequestBody Produit value){return repository.save(value);}
 @PutMapping("/{id}") public ResponseEntity<Produit> update(@PathVariable Long id,@RequestBody Produit value){if(!repository.existsById(id))return ResponseEntity.notFound().build(); return ResponseEntity.ok(repository.save(value));}
 @DeleteMapping("/{id}") public ResponseEntity<Void> delete(@PathVariable Long id){if(!repository.existsById(id))return ResponseEntity.notFound().build();repository.deleteById(id);return ResponseEntity.noContent().build();}
}