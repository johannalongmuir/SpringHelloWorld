package hello;


import org.springframework.web.bind.annotation.*;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class PostGreetingController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counterPost = new AtomicLong();


//    @PostMapping(path = "/members", consumes = "application/json", produces = "application/json")
//    public void addMember(@RequestBody Greeting member) {
//        DatabaseExample.addToPracticeMap(counterPost, name);
//        // Link to Method DatabaseExample.setPracticeSet
//        //code
//    }


}
