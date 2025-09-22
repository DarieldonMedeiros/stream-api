package functional_interface.stream;

import java.util.Arrays;
import java.util.List;

public class Desafio20 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        List<Long> listaFatorial = numeros.stream()
                .map(Desafio20::fatorial)
                .toList();

        System.out.println(listaFatorial);
    }

    public static long fatorial (int n){
        return n <= 1 ? 1 : n * fatorial(n - 1);
    }
}
