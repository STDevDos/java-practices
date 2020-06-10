package designpatterns.structural.facade;

public class AvionServiceImpl implements FachadaService {

    public String buscar(FachadaRequest fachadaRequest) {
        return "obteniendo todos los Aviones con los valores pasados por paramteros.";
    }
}
