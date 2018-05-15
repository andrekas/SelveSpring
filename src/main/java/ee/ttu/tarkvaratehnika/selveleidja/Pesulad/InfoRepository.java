package ee.ttu.tarkvaratehnika.selveleidja.Pesulad;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
interface InfoRepository extends JpaRepository<PesuladInfo, Long> {
}