package com.sparta.backoffice.user.constant;

import lombok.Getter;

@Getter
public enum UserRoleEnum {
	USER("ROLE_USER"),
	ADMIN("ROLE_ADMIN");

	private final String authority;

	UserRoleEnum(String authority) {
		this.authority = authority;
	}


}