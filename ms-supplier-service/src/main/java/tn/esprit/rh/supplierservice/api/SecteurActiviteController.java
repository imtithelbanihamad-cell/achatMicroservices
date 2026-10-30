package tn.esprit.rh.supplierservice.api;
import tn.esprit.rh.supplierservice.domain.SecteurActivite; import tn.esprit.rh.supplierservice.repository.SecteurActiviteRepository; import org.springframework.http.ResponseEntity; import org.springframework.web.bind.annotation.*; import java.util.List;
@RestController @RequestMapping("/api/secteuractivite") @CrossOrigin
public class SecteurActiviteController { private final SecteurActiviteRepository repository; public SecteurActiviteController(SecteurActiviteRepository repository){this.repository=repository;}
 @GetMapping public List<SecteurActivite> all(){return repository.findAll();}
 @GetMapping("/{id}") public ResponseEntity<SecteurActivite> one(@PathVariable Long id){return repository.findById(id).map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());}
 @PostMapping public SecteurActivite create(@RequestBody SecteurActivite value){return repository.save(value);}
 @PutMapping("/{id}") public ResponseEntity<SecteurActivite> update(@PathVariable Long id,@RequestBody SecteurActivite value){if(!repository.existsById(id))return ResponseEntity.notFound().build(); return ResponseEntity.ok(repository.save(value));}
 @DeleteMapping("/{id}") public ResponseEntity<Void> delete(@PathVariable Long id){if(!repository.existsById(id))return ResponseEntity.notFound().build();repository.deleteById(id);return ResponseEntity.noContent().build();}
}