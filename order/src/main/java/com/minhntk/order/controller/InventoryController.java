package com.minhntk.order.controller;

import com.minhntk.order.repository.entity.Inventory;
import com.minhntk.order.service.InventoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RequiredArgsConstructor
@RestController
@RequestMapping("/inventory")
public class InventoryController {

  private final InventoryService inventoryService;

  @GetMapping("/all")
  @ResponseStatus(HttpStatus.ACCEPTED)
  public Flux<Inventory> getAll() {
    return inventoryService.findAll();
  }
}
