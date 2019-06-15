package br.com.samuelramon.estudospringboot.service;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import br.com.samuelramon.estudospringboot.repository.UserRepository;

@Component
public class CustomUserDetailsService implements UserDetailsService {
	
	private UserRepository users;
	
	public CustomUserDetailsService(UserRepository users) {
		this.users = users;
	}

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		return this.users.findByUsername(username)
			.orElseThrow(() -> new UsernameNotFoundException("Username: " + username + " not found"));
	}

}
