package com.wederson.cursomc.services;

import com.wederson.cursomc.domain.Pedido;
import com.wederson.cursomc.repositories.PedidoRepository;
import com.wederson.cursomc.services.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PedidoService {

    @Autowired
    private PedidoRepository PedidoRepository;

    public Pedido find(Integer id) {
        Optional<Pedido> obj = PedidoRepository.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException(
                "Objeto não encontrado! Id: " + id + ", Tipo: " + Pedido.class.getName()));
    }
}
