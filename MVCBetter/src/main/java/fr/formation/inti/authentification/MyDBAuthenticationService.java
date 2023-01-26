package fr.formation.inti.authentification;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import fr.formation.inti.dao.UserDaoImpl;
import fr.formation.inti.model.User2;

@Service
public class MyDBAuthenticationService implements UserDetailsService {

	@Autowired
	private UserDaoImpl dao;

	@Override
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
		User2 user2 = dao.findbyemail(email);
		if (user2 == null) {
			throw new UsernameNotFoundException(email + " was not found in the database");
		}

		List<GrantedAuthority> grantList = new ArrayList<GrantedAuthority>();
//		List<String> roles = dao.getRoles(email);
//
//		System.out.println("roles are "+roles);
//
//		for (String droit : roles) {
//
//			GrantedAuthority authority = new SimpleGrantedAuthority("ROLE_" + droit.toUpperCase());
//			grantList.add(authority);
//		}
		String role = user2.getDroit();
		GrantedAuthority authority = new SimpleGrantedAuthority("ROLE_" + role.toUpperCase());
		grantList.add(authority);
		if ("admin".equals(role)) {
			GrantedAuthority authority2 = new SimpleGrantedAuthority("ROLE_USER");
			grantList.add(authority2);
		}

		UserDetails userDetails = (UserDetails) new User(user2.getEmail(), user2.getPassword(), grantList);
		return userDetails;
	}

}
