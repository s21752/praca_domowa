package pl.pjatk.demo;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@org.springframework.web.bind.annotation.RestController
@RequestMapping("/test")
public class MyAPIController {

    @GetMapping(value = "/hello")
    public ResponseEntity<String> getNetResponse() {
        return ResponseEntity.ok("Hello world");
    }

    @GetMapping("/model")
    public ResponseEntity<Car> getCar() {
        return ResponseEntity.ok(new Car("Skoda"));
    }

    @GetMapping("/hello/{name}")
    public ResponseEntity<String> greeting(@PathVariable String name) {
        return ResponseEntity.ok(name);
    }

    @GetMapping(value = "/hello", params = "reqParam")
    public ResponseEntity<List<String>> noPathParam(@RequestParam List<String> reqParam) {
        return ResponseEntity.ok(reqParam);
    }

    @PostMapping(value = "/model",
    consumes = {MediaType.APPLICATION_JSON_VALUE}
    )    public ResponseEntity<Car> createCar(@RequestBody Car carBodyRequest) {
        return ResponseEntity.ok(carBodyRequest);
    }


}
