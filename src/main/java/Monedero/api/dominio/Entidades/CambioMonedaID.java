package monedero.api.dominio.entidades;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Objects;

@Embeddable
public class CambioMonedaId implements Serializable {

    @Column(name = "IdMoneda")
    private int IdMoneda;

    @Column(name = "Fecha")
    private LocalDateTime Fecha;

    public CambioMonedaId() {
    }

    public CambioMonedaId(int IdMoneda, LocalDateTime Fecha) {
        this.IdMoneda = IdMoneda;
        this.Fecha = Fecha;
    }

    public int getIdMoneda() { return IdMoneda; }
    public void setIdMoneda(int IdMoneda) { this.IdMoneda = IdMoneda; }

    public LocalDateTime getFecha() { return Fecha; }
    public void setFecha(LocalDateTime Fecha) { this.Fecha = Fecha; }

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