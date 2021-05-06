package pl.pjatk.demo.homework;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/homework")
public class HomeworkApiController {

    @GetMapping("/{variable}")
    public <T> ResponseEntity<T> getResponsePathVariable(@PathVariable T variable) {
        return ResponseEntity.ok(variable);
    }

    @GetMapping()
    public <T> ResponseEntity<T> getResponseParam(@RequestParam T param) {
        return ResponseEntity.ok(param);
    }

    @PostMapping()
    public ResponseEntity<String> postRequestBody(@RequestBody String body) {
        return ResponseEntity.ok(body);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(value = HttpStatus.OK)
    public void delete(@PathVariable String id) {}

    @PutMapping("/{id}")
    public ResponseEntity<String> putResponse(@PathVariable String id, @RequestBody String body) {
        return ResponseEntity.ok(body + "\nputted at " + id);
    }
}
