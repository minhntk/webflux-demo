package com.minhntk.order.client;

import com.minhntk.order.dto.response.OrderResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Component
public class OrderClient {

  private final WebClient webClient;

  public OrderClient(WebClient.Builder builder) {
    this.webClient = builder.baseUrl("http://localhost:8080").build();
  }

  public Mono<String> getMessage() {
    return this.webClient.get().uri("/hello").accept(MediaType.APPLICATION_JSON)
        .retrieve()
        .bodyToMono(OrderResponse.class)
        .map(OrderResponse::getStatus);
  }
}
