package designpatterns.creational.factorymethod;

public class ViewRequestTwo implements ViewRequest {
    @java.lang.SuppressWarnings("all")
    private static final java.util.logging.Logger log = java.util.logging.Logger.getLogger(ViewRequestTwo.class.getName());

    @Override
    public void executeProcess() {
        log.info("---> executeProcess() - two ");
    }
}
