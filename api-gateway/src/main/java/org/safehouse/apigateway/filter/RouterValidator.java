package org.safehouse.apigateway.filter;

import org.springframework.http.server.reactive.ServerHttpRequest;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.function.Predicate;

@Component
public class RouterValidator {
	public static final List<String> allowedRoutes = List.of(
			"/auth/sign-in",
			"/auth/sign-up"
	);

	public Predicate<ServerHttpRequest> isSecured = request -> allowedRoutes.stream()
			.noneMatch(uri -> request.getURI().getPath().contains(uri));
}
