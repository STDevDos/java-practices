package designpatterns.creational.factorymethod;

public class ViewRequestFactory {

    public ViewRequest getViewRequest(String type) {
        return switch (type) {
            case "one" -> new ViewRequestOne();
            case "two" -> new ViewRequestTwo();
            case "three" -> new ViewRequestThree();
            default -> throw new IllegalArgumentException("Unknown request type: " + type);
        };
    }
}
