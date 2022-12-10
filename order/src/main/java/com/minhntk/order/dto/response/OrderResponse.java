package com.minhntk.order.dto.response;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@Setter
public class OrderResponse {

  private String userId;
  private String status;
}
