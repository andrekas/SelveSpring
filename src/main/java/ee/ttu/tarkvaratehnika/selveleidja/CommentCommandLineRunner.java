/*
package ee.ttu.tarkvaratehnika.selveleidja;


import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.stream.Stream;

@Component
public class CommentCommandLineRunner implements CommandLineRunner {

    private final CommentRepository repository;

    public CommentCommandLineRunner(CommentRepository repository) {
        this.repository = repository;
    }

    @Override
    public void run(String... strings) throws Exception {
        Stream.of("Väga hea kõik, kõik töötab", "Hea hind", "Mugav asukoht").forEach(content ->
                repository.save(new Comment(content))
        );
        repository.findAll().forEach(System.out::println);
    }
}
*/
