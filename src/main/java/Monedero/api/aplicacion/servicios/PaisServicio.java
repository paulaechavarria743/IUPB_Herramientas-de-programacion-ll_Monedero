package monedero.api.aplicacion.servicios;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import monedero.api.dominio.entidades.Pais;
import monedero.api.infraestructura.repositorios.IpaisRepositorio;

@Service
public class PaisServicio {

    @Autowired
    private IpaisRepositorio repositorio;

    public List<Pais> listar() { return repositorio.findAll(); }

    public Pais get(int Id) { return repositorio.getReferenceById(Id); }

    public Pais agregar(Pais pais) {
        pais.setId(0);
        return repositorio.save(pais);
    }

    public Pais modificar(Pais pais) {
        if (repositorio.findById(pais.getId()).isPresent()) {
            return repositorio.save(pais);
        }
        return null;
    }

    public boolean eliminar(int Id) {
        try {
            if (repositorio.findById(Id).isPresent()) {
                repositorio.deleteById(Id);
                return true;
            }
        } catch (Exception ex) {}
        return false;
    }
}
