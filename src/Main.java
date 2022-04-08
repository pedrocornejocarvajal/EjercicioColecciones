import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Integer> listaNumero1 = new ArrayList<>();
        listaNumero1.add(4);
        listaNumero1.add(6);
        listaNumero1.add(10);
        listaNumero1.add(69);
        listaNumero1.add(89);
        List<Integer> listaNumero2 = new ArrayList<>();
        listaNumero2.add(2);
        listaNumero2.add(6);
        listaNumero2.add(15);
        listaNumero2.add(25);
        listaNumero2.add(30);

        List<Integer> listasFusionadas;
        listasFusionadas = fusion(listaNumero1, listaNumero2);

        System.out.println(listasFusionadas);
    }

    /**
     * precondiciones: Las listas pasadas por parámetros están ordenadas
     *
     * @param listaNumero1
     * @param listaNumero2
     * @return
     */
    public static List<Integer> fusion(List<Integer> listaNumero1, List<Integer> listaNumero2) {

        List<Integer> listasFusionadas = new ArrayList<>();
        int j = 0;
        int i = 0;
        while (i < listaNumero1.size() && j < listaNumero2.size()){
            if (listaNumero1.get(i) < listaNumero2.get(j)) {
                listasFusionadas.add(listaNumero1.get(i));
                i++;
            }
            else{
                listasFusionadas.add(listaNumero2.get(j));
                j++;
            }
        }
        if (i == listaNumero1.size()){
            listasFusionadas.addAll(listaNumero2.subList(j, listaNumero2.size()));
        } else {
            listasFusionadas.addAll(listaNumero1.subList(i, listaNumero1.size()));
        }

        return listasFusionadas;
    }
}
