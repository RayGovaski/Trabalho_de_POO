import java.io.*;

public class Obra implements Serializable {
    private String artista;
    private String titulo;
    private String tecnica;
    private String dimensao;
    private int dtProducao;
    private static final long serialVersionUID = 5962408305911058254l;

    public Obra( String a, String t, String tec, String dim, int dt) {
        this.artista = a;
        this.titulo = t;
        this.tecnica = tec;
        this.dimensao = dim;
        this.dtProducao = dt; 
    }

    public void mostrar() {
        System.out.println("Artista: "+artista);
        System.out.println("Título: "+titulo);
        System.out.println("Técnica: "+tecnica);
        System.out.println("Dimensões: "+dimensao);
        System.out.println("Data: "+dtProducao);
    }

    /*public Obra(String titulo, String artista, int ano) {
        this.titulo = titulo;
        this.artista = artista;
        this.ano = ano;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getArtista() {
        return artista;
    }

    public int getAno() {
        return ano;
    }

    public void serializarObra(String nomeArquivo) {
        try {
            FileOutputStream fileOut = new FileOutputStream(nomeArquivo);
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(this);
            out.close();
            fileOut.close();
            System.out.println("Objeto serializado em " + nomeArquivo);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Obra desserializarObra(String nomeArquivo) {
        Obra obra = null;
        try {
            FileInputStream fileIn = new FileInputStream(nomeArquivo);
            ObjectInputStream in = new ObjectInputStream(fileIn);
            obra = (Obra) in.readObject();
            in.close();
            fileIn.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return obra;
    }*/
}