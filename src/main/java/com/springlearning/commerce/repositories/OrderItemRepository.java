package com.springlearning.commerce.repositories;


import com.springlearning.commerce.domain.OrderItem;
import com.springlearning.commerce.domain.OrderItemPK;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}
