package com.nilesh.springCRUD.security;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class PassGen {
	public static void main(String[] args) {
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		
		System.out.println(encoder.encode("test"));
		//System.out.println(encoder.encode("ramesh"));
	}
}

//$2a$12$hR/f1A34GPLTHpoe9hwwfOVS9tv1aMWYtSHyC3gO6NeqAQc0wU2xm

//$2a$10$G6BnV0YosGu3VUemnp039eMtrgbcvhrBAa2PecuujGekTRwSRIUPS
//$2a$10$o17vDWmUp63GQPuWMhTbxeY9woH/gdLfokhYmsQRMdVlOX9ul8dgm