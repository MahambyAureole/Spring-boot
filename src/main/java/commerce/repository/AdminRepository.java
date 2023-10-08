package commerce.repository;

import commerce.model.AdministrateurCom;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminRepository extends JpaRepository<AdministrateurCom,Integer> {
}
