package designpatterns.creational.factorymethod;

import lombok.extern.java.Log;

@Log
public class ViewRequestThree implements ViewRequest {

    @Override
    public void executeProcess() {
        log.info("---> executeProcess() - three ");
    }

}
