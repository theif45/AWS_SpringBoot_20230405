package com.web.study.service;

import org.springframework.stereotype.Service;

import com.web.study.domain.entity.Lecture;
import com.web.study.dto.request.lecture.LectureReqDto;
import com.web.study.repository.LectureRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class LectureServiceImpl implements LectureService{
	
	private final LectureRepository lectureRepository;

	@Override
	public void registeLecture(LectureReqDto lectureReqDto) {
		// DTO -> ENTITY로 변환
		//DTO는 클라이언트 쪽, ENTITY는 데이터베이스 쪽
		Lecture lecture = lectureReqDto.toEntity();
		System.out.println("변환: " + lecture);
		lectureRepository.registe(lecture);
	}

}
