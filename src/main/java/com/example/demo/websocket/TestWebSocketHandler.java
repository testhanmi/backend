package com.example.demo.websocket;

import java.io.IOException;
import org.springframework.stereotype.Component;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;

@Component
public class TestWebSocketHandler extends TextWebSocketHandler {

  @Override
  protected void handleTextMessage(WebSocketSession session, TextMessage message)
      throws IOException {
    String payload = message.getPayload();
    // 원하는 동작을 수행
    session.sendMessage(new TextMessage("서버에서 보낸 응답: " + payload));
  }
}
