package com.ranga.springbootcucumber;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/things")
public final class BagController {

    private final Bag bag = new Bag();

    @GetMapping
    public Bag getBag() {
        return bag;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void addThing(@RequestBody final String something) {
        bag.add(something);
    }
    @PostMapping("/bag")
    public void add(Optional<Bag> optional){
       bag.add(optional.get().toString());
    }
    @DeleteMapping
    public void removeEverything() {
        bag.removeEverything();
    }
}
