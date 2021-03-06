package euler;

import java.util.ArrayList;
import java.util.List;
import java.util.function.IntPredicate;
import java.util.stream.IntStream;

public class ProjectEulerServiceImpl implements ProjectEulerService {

    @Override
    public long sumaDeMultiplos(int limiteDeSerie, List<Integer> multiplosDe) {
        int suma = 0;
        if (limiteDeSerie >= 0 && multiplosDe.size() > 0) {
            IntPredicate predicate = s -> multiplosDe.stream().anyMatch(i -> s % i == 0);
            suma = IntStream.range(3, limiteDeSerie).filter(predicate).sum();
        }
        return suma;
    }

    @Override
    public long sumaFibonacci(long limiteDeSerie) {
        long suma = 0;

        List<Long> listaNumeros = new ArrayList<>();
        listaNumeros.add(1L);
        listaNumeros.add(2L);
        int posicion = 0;
        long sumaTotal = 0L;

        do {
            suma = listaNumeros.get(posicion) + listaNumeros.get(++posicion);
            if (suma < limiteDeSerie) {
                listaNumeros.add(suma);
            }
            sumaTotal = listaNumeros.stream().filter(s -> (s % 2) == 0).mapToLong(Long::new).sum();
        }
        while (suma < limiteDeSerie);

        return sumaTotal;
    }

    @Override
    public long fetchLargestPrimeFactor(long numero) {
        for (long a = 2; a < numero; a++) {
            if ((numero % a) == 0) {
                long largest = numero / a;
                if (isPrime(largest)) {
                    return largest;
                }
            }
        }
        return numero;
    }

    @Override
    public boolean isPrime(long numero) {
        for (long a = 2; a < numero; a++) {
            if ((numero % a) == 0) {
                return false;
            }
        }
        return true;
    }

    @Override
    public List<Long> multiplosDeUnNumero(long limiteDeSerie) {
        List<Long> listaDeNumerosPrimos = new ArrayList<>();
        for (long a = 2; a < limiteDeSerie; a++) {
            if ((limiteDeSerie % a) == 0) {
                listaDeNumerosPrimos.add(a);
            }
        }
        return listaDeNumerosPrimos;
    }


}
