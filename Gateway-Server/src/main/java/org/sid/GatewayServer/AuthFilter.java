package org.sid.GatewayServer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.gateway.filter.GatewayFilter;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

@Component
public class AuthFilter implements GatewayFilter {
    @Autowired
    private JwtTokenUtil jwtTokenUtil;

    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
        // Récupérer le jeton JWT des en-têtes de la requête
        String token = exchange.getRequest().getHeaders().getFirst("Authorization");

        if (token != null && jwtTokenUtil.validateToken(token)) {
            // Le jeton est valide, poursuivre le traitement de la requête
            return chain.filter(exchange);
        } else {
            // Le jeton est invalide, renvoyer une réponse d'erreur
            exchange.getResponse().setStatusCode(HttpStatus.UNAUTHORIZED);
            return exchange.getResponse().setComplete();
        }
    }
}
