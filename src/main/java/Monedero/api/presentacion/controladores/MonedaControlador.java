package monedero.api.presentacion.controladores;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import monedero.api.aplicacion.servicios.MonedaServicio;
import monedero.api.dominio.entidades.Moneda;

@RestController
@RequestMapping("/api/monedas")
public class MonedaControlador {

    @Autowired
    private MonedaServicio servicio;

    @GetMapping
    public List<Moneda> listar() { return servicio.listar(); }

    @GetMapping("/{id}")
    public Moneda get(@PathVariable int id) { return servicio.get(id); }

    @PostMapping
    public Moneda agregar(@RequestBody Moneda moneda) { return servicio.agregar(moneda); }

    @PutMapping
    public Moneda modificar(@RequestBody Moneda moneda) { return servicio.modificar(moneda); }

    @DeleteMapping("/{id}")
    public boolean eliminar(@PathVariable int id) { return servicio.eliminar(id); }
}
