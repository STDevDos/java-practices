package designpatterns.structural.facade;

public class HotelServiceImpl implements FachadaService {

    public String buscar(FachadaRequest fachadaRequest) {
        return "obteniendo todos los Hoteles con los valores pasados por paramteros.";
    }

}
