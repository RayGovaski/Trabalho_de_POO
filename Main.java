import java.io.*;

public class Main {  // Mudar classe Obra para concreta
    public static void main(String[] args) throws IOException,
    ClassNotFoundException {
        /*Obra ob1 = new Obra("A Noite Estrelada", "Van Gogh", 1889);
        System.out.println(ob1);*/

        /*ObjectOutputStream objout = new ObjectOutputStream(new FileOutputStream("produto.byte"));
        objout.writeObject(ob1);
        objout.close();*/

        ObjectInputStream objout = new ObjectInputStream(new FileInputStream("produto.byte"));
        Obra ob1 = (Obra) objout.readObject();
        objout.close();
        System.out.println(ob1);
        
    }
}

