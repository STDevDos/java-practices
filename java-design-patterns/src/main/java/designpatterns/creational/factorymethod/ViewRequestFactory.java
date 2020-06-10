package designpatterns.creational.factorymethod;

public class ViewRequestFactory {

    private ViewRequest viewRequest;

    public ViewRequest getViewRequest(String type) {
        switch (type){
            case "one": return new ViewRequestOne();
            case "two": return new ViewRequestTwo();
            case "three": return new ViewRequestThree();
            default: return null;
        }
    }
}
