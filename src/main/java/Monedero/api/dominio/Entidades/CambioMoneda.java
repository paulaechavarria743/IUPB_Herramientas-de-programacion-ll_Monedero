package monedero.api.dominio.entidades;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "cambiomoneda")
public class CambioMoneda {

    @EmbeddedId
    private CambioMonedaId id;

    @Column(name = "cambio")
    private float Cambio;

    @ManyToOne
    @JoinColumn(name = "idmoneda", referencedColumnName = "id", insertable = false, updatable = false)
    private Moneda moneda;

    public CambioMoneda() {}

    public CambioMoneda(CambioMonedaId id, float Cambio) {
        this.id = id;
        this.Cambio = Cambio;
    }

    public CambioMonedaId getId() { return id; }
    public void setId(CambioMonedaId id) { this.id = id; }
    public float getCambio() { return Cambio; }
    public void setCambio(float Cambio) { this.Cambio = Cambio; }
    public Moneda getMoneda() { return moneda; }
    public void setMoneda(Moneda moneda) { this.moneda = moneda; }
}