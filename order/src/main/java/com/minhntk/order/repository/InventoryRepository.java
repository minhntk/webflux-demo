package com.minhntk.order.repository;

import com.minhntk.order.repository.entity.Inventory;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface InventoryRepository extends ReactiveCrudRepository<Inventory, Integer> {

}
