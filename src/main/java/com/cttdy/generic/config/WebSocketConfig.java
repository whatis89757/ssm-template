package com.cttdy.generic.config;

import com.cttdy.generic.websocket.LegalClientHandshakeInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.socket.config.annotation.EnableWebSocket;
import org.springframework.web.socket.config.annotation.WebSocketConfigurer;
import org.springframework.web.socket.config.annotation.WebSocketHandlerRegistry;
import org.springframework.web.socket.handler.AbstractWebSocketHandler;

@Configuration
@EnableWebSocket
public class WebSocketConfig implements WebSocketConfigurer {

    @Override
    public void registerWebSocketHandlers(WebSocketHandlerRegistry registry) {
        registry.addHandler(providerUniversalVideoHandler(), "/webSocketServer").addInterceptors(providerLegalClientHandshakeInterceptor()).setAllowedOrigins("*");
    }

    @Bean
    public LegalClientHandshakeInterceptor providerLegalClientHandshakeInterceptor() {
        LegalClientHandshakeInterceptor handshakeInterceptor = new LegalClientHandshakeInterceptor();
        return handshakeInterceptor;
    }

    @Bean
    public AbstractWebSocketHandler providerUniversalVideoHandler() {
        return null;
    }


}
