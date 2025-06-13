package designpatterns.creational.factorymethod;

public class ViewRequestThree implements ViewRequest {
    @java.lang.SuppressWarnings("all")
    private static final java.util.logging.Logger log = java.util.logging.Logger.getLogger(ViewRequestThree.class.getName());

    @Override
    public void executeProcess() {
        log.info("---> executeProcess() - three ");
    }
}
