package tn.esprit.tpfoyer.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import tn.esprit.tpfoyer.Entities.Bloc;

import java.util.List;


@Repository
public interface BlocRepository extends JpaRepository<Bloc, Long> {
    @Query(value = "SELECT b FROM Bloc b WHERE b.foyer.universite.nomUniversite LIKE%:keyword%")
    List<Bloc> findByNomUniversiteContaining(@Param("keyword") String keyword);


}
