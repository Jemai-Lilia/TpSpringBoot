package tn.esprit.tpfoyer.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import tn.esprit.tpfoyer.Entities.Chambre;

public interface ChambreRepository extends JpaRepository<Chambre, Long> {

    @Query("SELECT COUNT(Reservation ) FROM Chambre WHERE Chambre.numeroChambre >10")
    Long countReservationsByNumeroChambreGreaterThan(@Param("numeroChambre") int numeroChambre);

}
