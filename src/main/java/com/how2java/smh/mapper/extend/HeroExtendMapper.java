package com.how2java.smh.mapper.extend;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.how2java.smh.pojo.extend.HeroExtend;
@Repository
public interface HeroExtendMapper {
	List<HeroExtend> findAll();
}
