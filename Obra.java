import java.io.Serializable;

public class Obra implements Serializable {
    
    private String artista;
    private String titulo;
    private String tecnica;
    private String dimensao;
    private int dtProducao;
    private static final long serialVersionUID = 5962408305911058254l;


    public Obra( String a, String t, String tec, String dim, int dt) {
        this.setArtista(a);
        this.setTitulo(t);
        this.setTecnica(tec);
        this.setDimensao(dim);
        this.setDtProducao(dt);
    }
    
    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTecnica() {
        return tecnica;
    }

    public void setTecnica(String tecnica) {
        this.tecnica = tecnica;
    }
    
    public String getDimensao() {
        return dimensao;
    }
    
    public void setDimensao(String dimensao) {
        this.dimensao = dimensao;
    }

    public int getDtproducao() {
        return dtProducao;
    }

    public void setDtProducao(int dtProducao) {
        this.dtProducao = dtProducao;
    }
}
