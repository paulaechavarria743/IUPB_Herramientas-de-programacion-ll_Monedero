package monedero.api.aplicacion.servicios;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import monedero.api.dominio.entidades.CambioMoneda;
import monedero.api.dominio.entidades.CambioMonedaId;
import monedero.api.infraestructura.repositorios.IcambiomonedaRepositorio;

@Service
public class CambioMonedaServicio {

    @Autowired
    private IcambiomonedaRepositorio repositorio;

    public List<CambioMoneda> listar() { return repositorio.findAll(); }

    public CambioMoneda get(CambioMonedaId id) { return repositorio.getReferenceById(id); }

    public CambioMoneda agregar(CambioMoneda cambioMoneda) { return repositorio.save(cambioMoneda); }

    public CambioMoneda modificar(CambioMoneda cambioMoneda) {
        if (repositorio.findById(cambioMoneda.getId()).isPresent()) {
            return repositorio.save(cambioMoneda);
        }
        return null;
    }

    public boolean eliminar(CambioMonedaId id) {
        try {
            if (repositorio.findById(id).isPresent()) {
                repositorio.deleteById(id);
                return true;
            }
        } catch (Exception ex) {}
        return false;
    }
}
