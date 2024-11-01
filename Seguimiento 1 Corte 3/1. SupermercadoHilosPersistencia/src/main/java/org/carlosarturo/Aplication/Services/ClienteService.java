package org.carlosarturo.Aplication.Services;


import org.carlosarturo.Domain.Cliente;
import org.carlosarturo.Interfaces.ClienteRepository;

import java.util.List;

public class ClienteService {

    private final ClienteRepository repository;

    public ClienteService(ClienteRepository repository) {
        this.repository = repository;
    }

    public void crear(Cliente cliente) {
        repository.save(cliente);
    }


    public List<Cliente> listarPacientes() {
        return repository.findAll();
    }


    public void eliminarPaciente(int id) {
        repository.delete(id);
    }

    public Cliente buscarPacientePorId(long id) {
       return repository.findById(id);
    }

    public void actualizarPaciente(Cliente cliente) {
        repository.update(cliente);
    }



}
