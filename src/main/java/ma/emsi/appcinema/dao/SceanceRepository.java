package ma.emsi.appcinema.dao;

import ma.emsi.appcinema.entities.Sceance;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@RepositoryRestResource
@CrossOrigin("*")
public interface SceanceRepository extends JpaRepository<Sceance, Long> {

}
