package monedero.api.dominio.entidades;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "pais")
public class Pais {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "secuencia_pais")
    @SequenceGenerator(name = "secuencia_pais", sequenceName = "secuencia_pais", allocationSize = 1)
    @Column(name = "Id")
    private int id;

    @Column(name = "Pais", length = 50)
    private String pais;

    @Column(name = "CodigoAlfa2", length = 5)
    private String codigoAlfa2;

    @Column(name = "CodigoAlfa3", length = 5)
    private String codigoAlfa3;

    @Column(name = "Mapa")
    private byte[] mapa;

    @Column(name = "Bandera")
    private byte[] bandera;

    @ManyToOne
    @JoinColumn(name = "IdMoneda", referencedColumnName = "Id")
    private Moneda moneda;

    public Pais() {
    }

    public Pais(int id, String pais, String codigoAlfa2, String codigoAlfa3, byte[] mapa, byte[] bandera, Moneda moneda) {
        this.id = id;
        this.pais = pais;
        this.codigoAlfa2 = codigoAlfa2;
        this.codigoAlfa3 = codigoAlfa3;
        this.mapa = mapa;
        this.bandera = bandera;
        this.moneda = moneda;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getPais() { return pais; }
    public void setPais(String pais) { this.pais = pais; }

    public String getCodigoAlfa2() { return codigoAlfa2; }
    public void setCodigoAlfa2(String codigoAlfa2) { this.codigoAlfa2 = codigoAlfa2; }

    public String getCodigoAlfa3() { return codigoAlfa3; }
    public void setCodigoAlfa3(String codigoAlfa3) { this.codigoAlfa3 = codigoAlfa3; }

    public byte[] getMapa() { return mapa; }
    public void setMapa(byte[] mapa) { this.mapa = mapa; }

    public byte[] getBandera() { return bandera; }
    public void setBandera(byte[] bandera) { this.bandera = bandera; }

    public Moneda getMoneda() { return moneda; }
    public void setMoneda(Moneda moneda) { this.moneda = moneda; }
}
