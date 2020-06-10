package designpatterns.creational.factorymethod;

import lombok.extern.java.Log;

@Log
public class ViewRequestOne implements ViewRequest {

    @Override
    public void executeProcess() {
        log.info("---> executeProcess() - one ");
    }

}
