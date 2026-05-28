package monedero.api.dominio.entidades;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

@Embeddable
public class CambioMonedaId implements Serializable {

    @Column(name = "idmoneda")
    private int IdMoneda;

    @Column(name = "fecha")
    private LocalDate Fecha;

    public CambioMonedaId() {}

    public CambioMonedaId(int IdMoneda, LocalDate Fecha) {
        this.IdMoneda = IdMoneda;
        this.Fecha = Fecha;
    }

    public int getIdMoneda() { return IdMoneda; }
    public void setIdMoneda(int IdMoneda) { this.IdMoneda = IdMoneda; }
    public LocalDate getFecha() { return Fecha; }
    public void setFecha(LocalDate Fecha) { this.Fecha = Fecha; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CambioMonedaId)) return false;
        CambioMonedaId that = (CambioMonedaId) o;
        return IdMoneda == that.IdMoneda && Objects.equals(Fecha, that.Fecha);
    }

    @Override
    public int hashCode() {
        return Objects.hash(IdMoneda, Fecha);
    }
}