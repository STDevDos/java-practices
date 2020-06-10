package designpatterns.structural.facade;

public class FachadaServiceImpl {

    private AvionServiceImpl avionServiceImpl;
    private HotelServiceImpl hotelServiceImpl;

    public FachadaServiceImpl() {
        this.avionServiceImpl = new AvionServiceImpl();
        this.hotelServiceImpl = new HotelServiceImpl();
    }

    public String buscar(FachadaRequest fachadaRequest) {

        //quizás la aplicación cambien de motores de busqueda para el servicio de avión
        String avionStr = avionServiceImpl.buscar(fachadaRequest);
        String hotelStr = hotelServiceImpl.buscar(fachadaRequest);

        return avionStr + "\n" + hotelStr;
    }

}
