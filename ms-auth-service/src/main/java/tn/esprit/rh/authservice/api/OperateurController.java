package tn.esprit.rh.authservice.api;
import tn.esprit.rh.authservice.domain.Operateur; import tn.esprit.rh.authservice.repository.OperateurRepository; import org.springframework.http.ResponseEntity; import org.springframework.web.bind.annotation.*; import java.util.List;
@RestController @RequestMapping("/api/operateur") @CrossOrigin
public class OperateurController { private final OperateurRepository repository; public OperateurController(OperateurRepository repository){this.repository=repository;}
 @GetMapping public List<Operateur> all(){return repository.findAll();}
 @GetMapping("/{id}") public ResponseEntity<Operateur> one(@PathVariable Long id){return repository.findById(id).map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());}
 @PostMapping public Operateur create(@RequestBody Operateur value){return repository.save(value);}
 @PutMapping("/{id}") public ResponseEntity<Operateur> update(@PathVariable Long id,@RequestBody Operateur value){if(!repository.existsById(id))return ResponseEntity.notFound().build(); return ResponseEntity.ok(repository.save(value));}
 @DeleteMapping("/{id}") public ResponseEntity<Void> delete(@PathVariable Long id){if(!repository.existsById(id))return ResponseEntity.notFound().build();repository.deleteById(id);return ResponseEntity.noContent().build();}
}