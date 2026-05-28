package monedero.api.infraestructura.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import monedero.api.dominio.entidades.CambioMoneda;
import monedero.api.dominio.entidades.CambioMonedaId;
import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface IcambiomonedaRepositorio extends JpaRepository<CambioMoneda, CambioMonedaId> {

    @Query("SELECT c FROM CambioMoneda c WHERE c.id.IdMoneda = :idMoneda AND c.id.Fecha BETWEEN :fechaInicio AND :fechaFin")
    List<CambioMoneda> findByMonedaYRangoFechas(
            @Param("idMoneda") int idMoneda,
            @Param("fechaInicio") LocalDateTime fechaInicio,
            @Param("fechaFin") LocalDateTime fechaFin
    );
}
