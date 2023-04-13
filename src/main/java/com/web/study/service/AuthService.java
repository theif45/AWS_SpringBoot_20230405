package com.web.study.service;

import com.web.study.dto.auth.RegisteUserReqDto;

public interface AuthService {
	public void registeUser(RegisteUserReqDto registeUserReqDto);
	public void duplicatedUsername(RegisteUserReqDto registeUserReqDto);
}
