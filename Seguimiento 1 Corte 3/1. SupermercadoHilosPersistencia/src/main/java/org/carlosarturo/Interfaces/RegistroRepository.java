package org.carlosarturo.Interfaces;

import org.carlosarturo.Domain.Registro;

import java.util.List;

public interface RegistroRepository {

    void saveRegistro(Registro registro);
    void updateRegistro(Registro registro);

    void deleteRegistro(int id);

    Registro findRegistroById(int id);
    List<Registro> findAll();
}
