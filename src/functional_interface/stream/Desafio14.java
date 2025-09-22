package functional_interface.stream;

import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;

public class Desafio14 {
    public static boolean isPrimo(int n){
        n = Math.abs(n);
        if (n <= 1) return false;
        for (int i = 2; i * i <= n; i++){
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        int maiorPrimo = numeros
                .stream()
                .filter(Desafio14::isPrimo)
                .max(Integer::compare)
                .orElseThrow(() -> new NoSuchElementException("Não foi possível encontrar um valor"));

        System.out.println(maiorPrimo);
    }
}
