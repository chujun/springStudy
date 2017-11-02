package com.jun.chu.demo.i732instantiatingBeans;

/**
 * Created by chujun on 2017/11/2.
 */
public class ClientService {
    private static ClientService clientService = new ClientService();
    private ClientService() {}

    public static ClientService createInstance() {
        return clientService;
    }
}
