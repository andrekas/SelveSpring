package ee.ttu.tarkvaratehnika.selveleidja.Pesulad;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InfoService {

    private InfoRepository infoRepository;

    public InfoService(InfoRepository infoRepository) {
        this.infoRepository = infoRepository;
    }

    List<PesuladInfo> getAllInfo() {
        return infoRepository.findAll();
    }

    PesuladInfo getInfoById(long infoId) {
        return infoRepository.findById(infoId).orElse(null);
    }
}
