package com.jun.chu.demo.core1i3;

/**
 * @author jun.chu
 * @date 2019-04-26 16:26
 */
public class ClientService {
    private static ClientService clientService = new ClientService();

    private ClientService() {
    }

    public static ClientService createInstance() {
        return clientService;
    }
}
