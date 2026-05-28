package monedero.api.aplicacion.servicios;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import monedero.api.dominio.entidades.Moneda;
import monedero.api.infraestructura.repositorios.ImonedaRepositorio;

@Service
public class MonedaServicio {

    @Autowired
    private ImonedaRepositorio repositorio;

    public List<Moneda> listar() { return repositorio.findAll(); }

    public Moneda get(int Id) { return repositorio.getReferenceById(Id); }

    public Moneda agregar(Moneda moneda) {
        moneda.setId(0);
        return repositorio.save(moneda);
    }

    public Moneda modificar(Moneda moneda) {
        if (repositorio.findById(moneda.getId()).isPresent()) {
            return repositorio.save(moneda);
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
