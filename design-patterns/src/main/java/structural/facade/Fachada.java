package structural.facade;

/**
 * @author Froy
 */
public class Fachada {

    private AvionAPI avionAPI;
    private HotelAPI hotelAPI;

    public Fachada() {
        this.avionAPI = new AvionAPI();
        this.hotelAPI = new HotelAPI();
    }

    public String buscar(FachadaRequest fachadaRequest) {
        return avionAPI.buscar(fachadaRequest) + "\n" + hotelAPI.buscar(fachadaRequest);
    }

}
