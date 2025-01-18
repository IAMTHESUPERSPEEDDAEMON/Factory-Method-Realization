package app.controller;

import app.model.Transport;
import app.service.CarFactoryService;
import app.service.PlaneFactoryService;
import app.service.TransportFactory;
import app.view.TransportView;

public class Client {
    private TransportView view;

    public void run() {
        this.view = new TransportView();
        createAndMoveCar();
        createAndMovePlane();
    }

    private void createAndMoveCar() {
        TransportFactory carFactory = new CarFactoryService();
        Transport transport = carFactory.createTransport();
        String transportType = transport.getClass().getSimpleName();

        view.displayTransportCreation(transportType);
        transport.move();
    }

    private void createAndMovePlane() {
        TransportFactory planeFactory = new PlaneFactoryService();
        Transport transport = planeFactory.createTransport();
        String transportType = transport.getClass().getSimpleName();

        view.displayTransportCreation(transportType);
        transport.move();
    }
}
