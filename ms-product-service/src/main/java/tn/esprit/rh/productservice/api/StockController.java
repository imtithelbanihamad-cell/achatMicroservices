package tn.esprit.rh.productservice.api;
import tn.esprit.rh.productservice.domain.Stock; import tn.esprit.rh.productservice.repository.StockRepository; import org.springframework.http.ResponseEntity; import org.springframework.web.bind.annotation.*; import java.util.List;
@RestController @RequestMapping("/api/stock") @CrossOrigin
public class StockController { private final StockRepository repository; public StockController(StockRepository repository){this.repository=repository;}
 @GetMapping public List<Stock> all(){return repository.findAll();}
 @GetMapping("/{id}") public ResponseEntity<Stock> one(@PathVariable Long id){return repository.findById(id).map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());}
 @PostMapping public Stock create(@RequestBody Stock value){return repository.save(value);}
 @PutMapping("/{id}") public ResponseEntity<Stock> update(@PathVariable Long id,@RequestBody Stock value){if(!repository.existsById(id))return ResponseEntity.notFound().build(); return ResponseEntity.ok(repository.save(value));}
 @DeleteMapping("/{id}") public ResponseEntity<Void> delete(@PathVariable Long id){if(!repository.existsById(id))return ResponseEntity.notFound().build();repository.deleteById(id);return ResponseEntity.noContent().build();}
}