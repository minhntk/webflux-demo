package com.minhntk.order.service;


import com.minhntk.order.repository.InventoryRepository;
import com.minhntk.order.repository.entity.Inventory;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

@Service
@RequiredArgsConstructor
public class InventoryService {

  private final InventoryRepository inventoryRepository;

  public Flux<Inventory> findAll() {
    return inventoryRepository.findAll();
  }
}
