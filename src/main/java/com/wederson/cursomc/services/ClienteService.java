package com.wederson.cursomc.services;

import com.wederson.cursomc.domain.Cliente;
import com.wederson.cursomc.repositories.ClienteRepository;
import com.wederson.cursomc.services.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository ClienteRepository;

    public Cliente find(Integer id) {
        Optional<Cliente> obj = ClienteRepository.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException(
                "Objeto não encontrado! Id: " + id + ", Tipo: " + Cliente.class.getName()));
    }
}
