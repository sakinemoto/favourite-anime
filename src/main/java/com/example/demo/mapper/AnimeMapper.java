package com.example.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.entity.Anime;

@Mapper
public interface AnimeMapper {

	public List<Anime> selectAll();

}
