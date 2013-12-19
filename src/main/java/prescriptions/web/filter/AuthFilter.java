package prescriptions.web.filter;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.filter.OncePerRequestFilter;

@Component
@SessionAttributes
public class AuthFilter extends OncePerRequestFilter {

	public AuthFilter() {
		
	}

	@Override
	protected void doFilterInternal(HttpServletRequest request,
			HttpServletResponse response, FilterChain filterChain)
			throws ServletException, IOException {
		Integer userId = (Integer) request.getSession().getAttribute("userId");

		if (userId == null && !request.getPathInfo().contains("/login")) {
			response.sendRedirect("/prescriptions/bin/home/login");
		}
		else {
			request.setAttribute("userId", userId);
			filterChain.doFilter(request, response);
		}
	}

}
