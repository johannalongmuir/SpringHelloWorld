package hello;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {
    // https://spring.io/guides/gs/rest-service/

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    /*
    HTTP requests to /greeting are mapped to the greeting()method
    The implementation of the method body creates and returns a new Greeting object with id and content attributes
     based on the next value from the counter, and formats the given name by using the greeting template.
     */
    // Override default for first with  http://localhost:8080/greeting?name=Johanna


    @RequestMapping("/greeting")
    public Greeting greeting(@RequestParam(value="name", defaultValue="World") String name) {
        return new Greeting(counter.incrementAndGet(),
                String.format(template, name));
    }

    @RequestMapping("/more")
    public Greeting moreGreeting(@RequestParam(value="name", defaultValue="Noooooooo") String name) {
        return new Greeting(counter.incrementAndGet(),
                String.format(template, name));
    }

    @RequestMapping("/stop")
    public Greeting stop(@RequestParam(value="name", defaultValue="STOPPPPPPPPP") String name) {
        return new Greeting(counter.incrementAndGet(),
                name);
    }

}