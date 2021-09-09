// Entrada: [“zebra”, “cálice”, “borboleta” ]
  //      Saída:  [“borboleta”, “cálice”, “zebra”]
    //    Regras

public class App {

    public String[] ordenaLista(String[] minhaLista){

        int ultimoIndice = minhaLista.length - 1;

        while (ultimoIndice > 0) {

            String maiorPalavra = minhaLista[0];
            int indexMaiorPalavra = 0;

            for(int i = 0; i <= ultimoIndice; i++) {

                if(minhaLista[i].compareTo(maiorPalavra) > 0) {
                    indexMaiorPalavra = i;
                    maiorPalavra = minhaLista[i];
                }

            }

            String aux = minhaLista[ultimoIndice];
            minhaLista[ultimoIndice] = maiorPalavra;
            minhaLista[indexMaiorPalavra] = aux;
            ultimoIndice--;
        }

        return minhaLista;

    }

}