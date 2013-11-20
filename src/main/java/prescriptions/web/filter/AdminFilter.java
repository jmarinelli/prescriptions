package prescriptions.web.filter;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.filter.OncePerRequestFilter;

import prescriptions.domain.entity.Role;
import prescriptions.domain.repositories.RoleRepo;

@Component
@SessionAttributes
public class AdminFilter extends OncePerRequestFilter {

	private RoleRepo roleRepo;
	
	@Autowired
	public AdminFilter(RoleRepo roleRepo) {
		this.roleRepo = roleRepo;
	}

	@Override
	protected void doFilterInternal(HttpServletRequest request,
			HttpServletResponse response, FilterChain filterChain)
			throws ServletException, IOException {
		Integer userId = (Integer) request.getSession().getAttribute("userId");
		if (userId != null) {
			Role user = roleRepo.get(userId);
			if (user.isAdmin())
				filterChain.doFilter(request, response);
		} else {
			response.sendRedirect("/prescriptions/login");
		}		
	}

}
