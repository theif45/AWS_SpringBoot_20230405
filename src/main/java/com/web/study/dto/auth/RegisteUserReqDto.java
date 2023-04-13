package com.web.study.dto.auth;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.web.study.domain.entity.User;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Data
@ToString
public class RegisteUserReqDto {
	private String username;
	private String password;
	private String name;
	private String email;
	
	public User toEntity() {
		return User.builder()
				.username(username)
				.password(new BCryptPasswordEncoder().encode(password))
				.name(name)
				.email(email)
				.build();
	}
}
