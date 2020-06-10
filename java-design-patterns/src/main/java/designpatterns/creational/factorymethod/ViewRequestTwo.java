package designpatterns.creational.factorymethod;

import lombok.extern.java.Log;

@Log
public class ViewRequestTwo implements ViewRequest {

    @Override
    public void executeProcess() {
          log.info("---> executeProcess() - two ");
    }

}
