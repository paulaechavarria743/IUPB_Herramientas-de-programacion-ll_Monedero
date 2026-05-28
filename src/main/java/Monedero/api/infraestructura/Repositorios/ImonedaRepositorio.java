package monedero.api.infraestructura.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import monedero.api.dominio.entidades.Moneda;

@Repository
public interface ImonedaRepositorio extends JpaRepository<Moneda, Integer> {
}
