package com.ra.busBooking.config;

import java.io.IOException;
import java.util.Collection;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.web.DefaultRedirectStrategy;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.stereotype.Component;

@Component
public class CustomSuccessHandler implements AuthenticationSuccessHandler {

//	authentication success handler for redirecting users to different pages based on their roles
	@Override
	public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response,
										Authentication authentication) throws IOException, ServletException {

		String redirectUrl = null;

		// Retrieve the collection of granted authorities for the authenticated user
		Collection<? extends GrantedAuthority> authorities = authentication.getAuthorities();

		// Loop through the collection of authorities and check if the user has a matching role
		for (GrantedAuthority grantedAuthority : authorities) {
			if (grantedAuthority.getAuthority().equals("USER")) {
				redirectUrl = "/dashboard";
				break;
			} else if (grantedAuthority.getAuthority().equals("ADMIN")) {
				redirectUrl = "/adminScreen";
				break;
			}
		}
		if (redirectUrl == null) {
			throw new IllegalStateException();
		}
		// Send a redirect response to the client using the DefaultRedirectStrategy class
		new DefaultRedirectStrategy().sendRedirect(request, response, redirectUrl);
	}
}
