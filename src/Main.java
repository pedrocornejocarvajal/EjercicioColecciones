import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Integer> listaNumero1 = new ArrayList<>();
        listaNumero1.add(4);
        listaNumero1.add(6);
        listaNumero1.add(10);
        listaNumero1.add(69);
        listaNumero1.add(89);
        ArrayList<Integer> listaNumero2 = new ArrayList<>();
        listaNumero2.add(2);
        listaNumero1.add(6);
        listaNumero1.add(15);
        listaNumero1.add(25);
        listaNumero1.add(30);

        ArrayList<Integer> listasFusionadas = new ArrayList<>();
        listasFusionadas = fusion(listaNumero1, listaNumero2);

        System.out.println(listasFusionadas.toString());
    }

    /**
     * precondiciones: Las listas pasadas por parámetros están ordenadas
     *
     * @param listaNumero1
     * @param listaNumero2
     * @return
     */
    public static ArrayList<Integer> fusion( ArrayList<Integer> listaNumero1,  ArrayList<Integer> listaNumero2) {

        ArrayList<Integer> listasFusionadas = new ArrayList<>();

        for (int i = 0; i < listaNumero1.size(); i++) {
            for (int j = 0; j < listaNumero2.size(); j++) {

                if (listaNumero2.get(j) < listaNumero1.get(i)) {
                    listasFusionadas.add(i, listaNumero2.get(j));
                } else if (listasFusionadas.get(i).equals(listaNumero2.get(j))) {
                } else if (listaNumero2.get(j) > listaNumero1.get(i)) {
                    listasFusionadas.add(i, listaNumero1.get(j));
                }

            }
        }

        return listasFusionadas;
    }
}
