package com.jun.chu.demo.i732instantiatingBeans;

/**
 * Created by chujun on 2017/11/2.
 */
public class DefaultServiceLocator {

    private static ClientService clientService = ClientService.createInstance();

    public ClientService createClientServiceInstance() {
        return clientService;
    }
}
