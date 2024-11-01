package org.carlosarturo.Aplication;

import org.carlosarturo.Aplication.Services.ProductoService;
import org.carlosarturo.Aplication.Services.ClienteService;
import org.carlosarturo.Aplication.Services.registroService;
import org.carlosarturo.Infraestructure.FileProductosRepository;
import org.carlosarturo.Infraestructure.FileClienteRepository;
import org.carlosarturo.Infraestructure.FileRegistroRepository;
import org.carlosarturo.Interfaces.ProductosRepository;
import org.carlosarturo.Interfaces.ClienteRepository;
import org.carlosarturo.Interfaces.RegistroRepository;

public class Main {
    public static void main(String[] args) {

        ClienteRepository repository = new FileClienteRepository();
        ClienteService service = new ClienteService(repository);

        RegistroRepository registros = new FileRegistroRepository();
        registroService service1 = new registroService(registros);

        ProductosRepository productosRepository = new FileProductosRepository();
        ProductoService service3 = new ProductoService(productosRepository);

        Visual visual = new Visual(service, service3,service1);

        visual.iniciar();

    }
}
