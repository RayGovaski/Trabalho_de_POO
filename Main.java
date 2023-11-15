import java.io.*;
import java.util.ArrayList;

public class Main {

public static void limparTela() {
    try {
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
    } catch (Exception e) {
        System.out.println(e.getMessage());
    }
}
    public static void main(String[] args) throws Exception {
        limparTela();

        ArrayList <Obra> obras = criarListaObras();
        PersistirListaBinSerializado(obras);

        ArrayList <Obra> obrasLidas = lerListaBinSerializado();
        mostrarListaObras(obrasLidas);
    }

    private static ArrayList  <Obra> criarListaObras() {
        ArrayList<Obra> obras = new ArrayList<Obra>();
        obras.add(new Obra("Vincent Van Gogh", "The Starry Night", "Óleo sobre tela", "921 x 737 mm" ,1889));
        obras.add(new Obra("Vincent Van Gogh", "Self-Portrait", "Óleo sobre tela", "540 x 650 mm", 1889));
        obras.add(new Obra("Claude Monet", "Woman with a Parasol - Madame Monet and Her Son", "Óleo sobre tela", "100 x 81 cm", 1875));
        obras.add(new Obra("Rembrandt van Rijn", "Christ in the Storm on the Sea of Galilee", "Óleo sobre tela", "128 x 168 cm", 1633));
        return obras;
    }

    public static void PersistirListaBinSerializado(ArrayList <Obra> obras) {
        FileOutputStream fos = null;
        ObjectOutput oos = null;
        try {
            fos = new FileOutputStream("obras.dat");
            oos = new ObjectOutputStream(fos);
            oos.writeObject(obras);
        } catch (FileNotFoundException e) {
            System.out.println("Arquivo não encontrado.");
        } catch (IOException e) {
            System.out.println("Erro ao criar arquivo.");
        } finally {
            if (oos != null) {
                try {
                    oos.close();
                } catch (IOException e) {
                    System.out.println("Erro ao fechar o arquivo.");
                }
            }
        }
    }

    private static ArrayList <Obra> lerListaBinSerializado() {
        ArrayList <Obra> obras = null;
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        try {
            fis = new FileInputStream("obras.dat");
            ois = new ObjectInputStream(fis);
            obras = (ArrayList<Obra>)ois.readObject();
            return obras; 
        } catch (ClassNotFoundException e) {
            System.out.println("Classe não encontrada.");
        } catch (IOException e) {
            System.out.println("Erro ao criar arquivo.");
        } finally {
            if (ois != null) {
                try {
                    ois.close();
                } catch (IOException e) {
                    System.out.println("Erro ao fechar o arquivo.");
                }
            }
        }
        return null;
    }

    private static void mostrarListaObras(ArrayList<Obra> obras) {
        for (Obra obra : obras) {
            System.out.printf("Artista: %s\nTítulo: %s\nTécnica: %s\nDimensão: %s\nAno: %2d\n", obra.getArtista(), obra.getTitulo(), obra.getTecnica(), obra.getDimensao(), obra.getDtproducao());
            System.out.println("--------------------------");
        }
    }

}