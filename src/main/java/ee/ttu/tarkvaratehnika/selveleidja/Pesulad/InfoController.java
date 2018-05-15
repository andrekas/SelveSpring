package ee.ttu.tarkvaratehnika.selveleidja.Pesulad;

import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class InfoController {
    private InfoService infoService;

    public InfoController(InfoService infoService){
        this.infoService = infoService;
    }

    @CrossOrigin(origins = "http://localhost:8080")
    @RequestMapping(value = "/info", method = RequestMethod.GET)
    public List<PesuladInfo> getAllInfo() {
        return infoService.getAllInfo();
    }

    @RequestMapping(value = "/info/{id}", method=RequestMethod.GET)
    public PesuladInfo getInfo(@PathVariable("id") long infoId) {
        return infoService.getInfoById(infoId);
    }
}
