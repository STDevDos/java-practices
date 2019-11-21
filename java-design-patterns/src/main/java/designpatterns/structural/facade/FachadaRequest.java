package designpatterns.structural.facade;

/**
 * @author Froy
 */
public class FachadaRequest {

    private String fechaInicial;
    private String fechaFinal;
    private String origen;
    private String destino;

    public FachadaRequest(String fechaInicial, String fechaFinal, String origen, String destino) {
        this.fechaInicial = fechaInicial;
        this.fechaFinal = fechaFinal;
        this.origen = origen;
        this.destino = destino;
    }

}
