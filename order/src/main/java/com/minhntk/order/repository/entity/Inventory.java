package com.minhntk.order.repository.entity;

import lombok.Data;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;


@Data
@Table("inventory")
public class Inventory extends Auditable {

  private Long id;

  @Column("name")
  private String name;

  @Column("address")
  private String address;
}
