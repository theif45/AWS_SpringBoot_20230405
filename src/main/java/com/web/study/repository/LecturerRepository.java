package com.web.study.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.web.study.domain.entity.Lecturer;

@Mapper
public interface LecturerRepository {
	public int registeLecturer(Lecturer lecturer);
	public List<Lecturer> getLecturerAll();
	public Lecturer findLecturerById(int id);
}
