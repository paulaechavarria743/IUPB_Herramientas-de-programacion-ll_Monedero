package monedero.api.infraestructura.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import monedero.api.dominio.entidades.Pais;

@Repository
public interface IpaisRepositorio extends JpaRepository<Pais, Integer>{

}