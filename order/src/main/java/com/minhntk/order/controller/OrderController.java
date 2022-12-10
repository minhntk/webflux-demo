package com.minhntk.order.controller;


import com.minhntk.order.repository.entity.Order;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;


@RequiredArgsConstructor
@RestController
@RequestMapping("/orders")
public class OrderController {

  @PostMapping("/create")
  @ResponseStatus(HttpStatus.CREATED)
  public Mono<String> create(@RequestBody Order order){
    return null;
  }

  @GetMapping("/hello")
  @ResponseStatus(HttpStatus.CREATED)
  public Mono<String> testHello(){
    return Mono.just("hello");
  }

}
