package app.service;

import app.model.Car;
import app.model.Transport;

public class CarFactoryService extends TransportFactory {

    @Override
    public Transport createTransport() {
        return new Car();
    }
}
