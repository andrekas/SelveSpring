package ee.ttu.tarkvaratehnika.selveleidja.Pesulad;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
interface InfoRepository extends CrudRepository<PesuladInfo, Long> {
    @Override
    public List<PesuladInfo> findAll();
}