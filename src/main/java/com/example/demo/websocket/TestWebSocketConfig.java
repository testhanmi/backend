package com.example.demo.websocket;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.socket.config.annotation.EnableWebSocket;
import org.springframework.web.socket.config.annotation.WebSocketConfigurer;
import org.springframework.web.socket.config.annotation.WebSocketHandlerRegistry;

@EnableWebSocket
@Configuration
public class TestWebSocketConfig implements WebSocketConfigurer {

  private final TestWebSocketHandler WebSocketHandler;

  public TestWebSocketConfig(TestWebSocketHandler WebSocketHandler) {
    this.WebSocketHandler = WebSocketHandler;
  }

  @Override
  public void registerWebSocketHandlers(WebSocketHandlerRegistry registry) {
    registry.addHandler(WebSocketHandler, "/my-websocket");
  }
}
