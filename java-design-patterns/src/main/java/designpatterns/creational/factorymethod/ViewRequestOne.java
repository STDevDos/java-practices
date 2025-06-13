package designpatterns.creational.factorymethod;

public class ViewRequestOne implements ViewRequest {
    @java.lang.SuppressWarnings("all")
    private static final java.util.logging.Logger log = java.util.logging.Logger.getLogger(ViewRequestOne.class.getName());

    @Override
    public void executeProcess() {
        log.info("---> executeProcess() - one ");
    }
}
