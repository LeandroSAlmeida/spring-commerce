package com.springlearning.commerce.services;

import com.springlearning.commerce.domain.Order;
import com.springlearning.commerce.dto.OrderDTO;
import com.springlearning.commerce.repositories.OrderRepository;
import com.springlearning.commerce.services.exceptions.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class OrderService {

    @Autowired
    private OrderRepository repository;
    @Transactional(readOnly = true)
    public OrderDTO findById(Long id){
        Order order = repository.findById(id).orElseThrow(
                ()-> new ResourceNotFoundException("Recurso não encontrado"));
        return new OrderDTO(order);
    }
}
