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
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "secuencia_pais")
    @SequenceGenerator(name = "secuencia_pais", sequenceName = "secuencia_pais", allocationSize = 1)
    @Column(name = "id")
    private int Id;

    @Column(name = "pais", length = 50)
    private String Pais;

    @Column(name = "codigoalfa2", length = 5)
    private String CodigoAlfa2;

    @Column(name = "codigoalfa3", length = 5)
    private String CodigoAlfa3;

    @Column(name = "mapa")
    private byte[] Mapa;

    @Column(name = "bandera")
    private byte[] Bandera;

    @ManyToOne
    @JoinColumn(name = "idmoneda", referencedColumnName = "id")
    private Moneda moneda;

    public Pais() {}

    public Pais(int Id, String Pais, String CodigoAlfa2, String CodigoAlfa3, byte[] Mapa, byte[] Bandera, Moneda moneda) {
        this.Id = Id;
        this.Pais = Pais;
        this.CodigoAlfa2 = CodigoAlfa2;
        this.CodigoAlfa3 = CodigoAlfa3;
        this.Mapa = Mapa;
        this.Bandera = Bandera;
        this.moneda = moneda;
    }

    public int getId() { return Id; }
    public void setId(int Id) { this.Id = Id; }
    public String getPais() { return Pais; }
    public void setPais(String Pais) { this.Pais = Pais; }
    public String getCodigoAlfa2() { return CodigoAlfa2; }
    public void setCodigoAlfa2(String CodigoAlfa2) { this.CodigoAlfa2 = CodigoAlfa2; }
    public String getCodigoAlfa3() { return CodigoAlfa3; }
    public void setCodigoAlfa3(String CodigoAlfa3) { this.CodigoAlfa3 = CodigoAlfa3; }
    public byte[] getMapa() { return Mapa; }
    public void setMapa(byte[] Mapa) { this.Mapa = Mapa; }
    public byte[] getBandera() { return Bandera; }
    public void setBandera(byte[] Bandera) { this.Bandera = Bandera; }
    public Moneda getMoneda() { return moneda; }
    public void setMoneda(Moneda moneda) { this.moneda = moneda; }
}
