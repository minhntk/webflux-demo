package com.minhntk.order.repository.entity;


import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.relational.core.mapping.Column;

@SuperBuilder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public abstract class Auditable {

  @Column("created_date")
  @CreatedDate
  protected LocalDateTime createdDate;

  @Column("modified_date")
  @LastModifiedDate
  protected LocalDateTime modifiedDate;
}