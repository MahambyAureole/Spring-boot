package commerce.repository;

import commerce.model.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UtilisateurRepository extends JpaRepository<Utilisateur,Integer> {
//    @Query("SELECT nom_util FROM utilisateur WHERE nom_util = :utilisateur AND mot_passe = :motPasse")
//    String VerifierUtilisateur(@Param("utilisateur") String nomUtil, @Param("motPasse") String motPasse);
}
