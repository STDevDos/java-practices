package euler;

import lombok.extern.java.Log;
import org.junit.jupiter.api.*;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@Tag("euler")
@Log
class ProjectEulerServiceImplTest {

    private ProjectEulerService service;

    @BeforeEach
    void setUp() {
        service = new ProjectEulerServiceImpl();
    }

    @Test
    void sumaDeMultiplos() {

        List<Integer> multiplosDe = List.of(3, 5);
        long sumaDeMultiplos = service.sumaDeMultiplos(1_000, multiplosDe);
        log.info(String.format("suma de los multiplos %d",sumaDeMultiplos));

    }

    @Test
    void sumaFibonacci() {

        long sumaFibonacci = service.sumaFibonacci(4_000_000);
        log.info(String.format("suma de fibonacci %d",sumaFibonacci));

    }

    @Test
    void fetchLargestPrimeFactor() {

        long obtenerElFactorPrimoMasGrande = service.fetchLargestPrimeFactor(600_851_475_143l);
        log.info(String.format("obtener el factor primo mas grande %d",obtenerElFactorPrimoMasGrande));

    }

    @Test
    void isPrime() {
    }

    @Test
    void multiplosDeUnNumero() {
    }

}
