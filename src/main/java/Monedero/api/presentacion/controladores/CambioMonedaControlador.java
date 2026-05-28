package monedero.api.presentacion.controladores;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import monedero.api.aplicacion.servicios.CambioMonedaServicio;
import monedero.api.dominio.entidades.CambioMoneda;
import monedero.api.dominio.entidades.CambioMonedaId;

@RestController
@RequestMapping("/api/cambiomonedas")
public class CambioMonedaControlador {

    @Autowired
    private CambioMonedaServicio servicio;

    @GetMapping
    public List<CambioMoneda> listar() { return servicio.listar(); }

    @PostMapping("/get")
    public CambioMoneda get(@RequestBody CambioMonedaId id) { return servicio.get(id); }

    @PostMapping
    public CambioMoneda agregar(@RequestBody CambioMoneda cambioMoneda) { return servicio.agregar(cambioMoneda); }

    @PutMapping
    public CambioMoneda modificar(@RequestBody CambioMoneda cambioMoneda) { return servicio.modificar(cambioMoneda); }

    @DeleteMapping
    public boolean eliminar(@RequestBody CambioMonedaId id) { return servicio.eliminar(id); }
}
