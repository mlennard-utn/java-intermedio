package hello;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import hello.service.PreguntaldosService;
import hello.service.PreguntaldosServiceImpl;

@RestController
public class GreetingController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/greeting")
    public Greeting greeting(@RequestParam(value="name", defaultValue="World") String name) {
        return new Greeting(counter.incrementAndGet(),
                            String.format(template, name));
    }
    
    @RequestMapping("/pregunta")
    public String pregunta(@RequestParam(value="numero") Integer numero) {
        PreguntaldosService service = new PreguntaldosServiceImpl();
        return service.getPregunta(numero);
    }
    
    
}
