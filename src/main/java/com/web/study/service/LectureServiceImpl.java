package com.web.study.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.web.study.domain.entity.Lecture;
import com.web.study.dto.request.lecture.LectureReqDto;
import com.web.study.dto.response.lecture.LectureRespDto;
import com.web.study.repository.LectureRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class LectureServiceImpl implements LectureService{
	
	// final => 상수: 초기화가 무조건 일어나야함.
	private final LectureRepository lectureRepository;

	@Override
	public void registeLecture(LectureReqDto lectureReqDto) {
		// DTO -> ENTITY로 변환
		//DTO는 클라이언트 쪽, ENTITY는 데이터베이스 쪽
		Lecture lecture = lectureReqDto.toEntity();
		System.out.println("변환: " + lecture);
		lectureRepository.registe(lecture);
	}

	@Override
	public List<LectureRespDto> searchLecture(int type, String searchValue) {
		Map<String, Object> parameterMap = new HashMap<>();
		parameterMap.put("type", type);
		parameterMap.put("searchValue", searchValue);
		
		List<LectureRespDto> dtos = new ArrayList<>();
		lectureRepository.searchLecture(parameterMap).forEach(entity -> {
			dtos.add(entity.toDto());
		});
		return dtos;
	}
}
