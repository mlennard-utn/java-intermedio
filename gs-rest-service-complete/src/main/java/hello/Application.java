package hello;

import java.io.BufferedReader;
import java.io.FileReader;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.io.ClassPathResource;

import hello.dao.PreguntaldosMemoryDAO;
import hello.model.PreguntaRespuesta;

@SpringBootApplication
@ComponentScan({"hello","hello.dao","hello.service","hello.model"})
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
    
    
    @Bean
    CommandLineRunner initDatabase(PreguntaldosMemoryDAO repository) {
        return args -> {
        	PreguntaRespuesta pr = null;
        	BufferedReader reader =
                    new BufferedReader(new FileReader( new ClassPathResource("Preguntas_Guido.tsv").getFile()));
                String ln;
                while((ln = reader.readLine()) != null) {
                    String[] record = ln.split("	");
                    pr = new PreguntaRespuesta();
                    pr.setPregunta(record[0]);
                    pr.setRespuesta(record[1]);
                    repository.insertPreguntaRespuesta(pr);
                }
        	
        	
        };
    }
    
}
