package com.minhntk.order.repository.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Data
@Table("inventory_item")
public class InventoryItem extends Auditable {

  @Id
  private Long id;

  private Inventory inventory;

  private
}
