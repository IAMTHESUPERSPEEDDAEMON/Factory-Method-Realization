package app.service;

import app.model.Plane;
import app.model.Transport;

public class PlaneFactoryService extends TransportFactory{
    @Override
    public Transport createTransport() {
        return new Plane();
    }
}
