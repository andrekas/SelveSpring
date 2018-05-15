package ee.ttu.tarkvaratehnika.selveleidja.Pesulad;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.stream.Collectors;

@RestController
public class InfoController {
    private InfoRepository repository;

    public InfoController(InfoRepository repository) {
        this.repository = repository;
    }

    @RequestMapping(value = "/info", method = {RequestMethod.GET})
    public Collection<PesuladInfo> info() {
        return repository.findAll().stream().collect(Collectors.toList());
    }
}

