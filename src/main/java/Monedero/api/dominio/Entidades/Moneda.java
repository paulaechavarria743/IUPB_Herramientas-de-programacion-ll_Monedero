package monedero.api.dominio.entidades;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "moneda")
public class Moneda {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "secuencia_moneda")
    @SequenceGenerator(name = "secuencia_moneda", sequenceName = "secuencia_moneda", allocationSize = 1)
    @Column(name = "Id")
    private int Id;

    @Column(name = "Moneda", length = 100)
    private String Moneda;

    @Column(name = "Sigla", length = 5)
    private String Sigla;

    @Column(name = "Simbolo", length = 5)
    private String Simbolo;

    @Column(name = "Emisor", length = 100)
    private String Emisor;

    @Column(name = "Imagen")
    private byte[] Imagen;

    public Moneda() {
    }

    public Moneda(int Id, String Moneda, String Sigla, String Simbolo, String Emisor, byte[] Imagen) {
        this.Id = Id;
        this.Moneda = Moneda;
        this.Sigla = Sigla;
        this.Simbolo = Simbolo;
        this.Emisor = Emisor;
        this.Imagen = Imagen;
    }

    public int getId() { return Id; }
    public void setId(int Id) { this.Id = Id; }

    public String getMoneda() { return Moneda; }
    public void setMoneda(String Moneda) { this.Moneda = Moneda; }

    public String getSigla() { return Sigla; }
    public void setSigla(String Sigla) { this.Sigla = Sigla; }

    public String getSimbolo() { return Simbolo; }
    public void setSimbolo(String Simbolo) { this.Simbolo = Simbolo; }

    public String getEmisor() { return Emisor; }
    public void setEmisor(String Emisor) { this.Emisor = Emisor; }

    public byte[] getImagen() { return Imagen; }
    public void setImagen(byte[] Imagen) { this.Imagen = Imagen; }
}
