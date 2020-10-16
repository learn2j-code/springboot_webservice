package com.how2java.smh.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.how2java.smh.mapper.HeroMapper;
import com.how2java.smh.mapper.extend.HeroExtendMapper;
import com.how2java.smh.pojo.Hero;
import com.how2java.smh.pojo.HeroExample;
import com.how2java.smh.pojo.extend.HeroExtend;
import com.how2java.smh.service.HeroService;

@Service
public class HeroServiceImpl implements HeroService{
	
	@Autowired HeroMapper mapper;
	@Autowired HeroExtendMapper extendMapper;
	@Override
	public int add(Hero record) {
		return mapper.insert(record);
	}

	@Override
	public void delete(int id) {
		mapper.deleteByPrimaryKey(id);
	}

	@Override
	public Hero get(int id) {
		return mapper.selectByPrimaryKey(id);
	}

	@Override
	public int update(Hero record) {
		return mapper.updateByPrimaryKey(record);
	}

	@Override
	public List<Hero> list() {
		HeroExample example = new HeroExample();
		example.setOrderByClause("id asc");
		return mapper.selectByExample(example);
	}

	@Override
	public List<HeroExtend> findAllDetail() {
		return extendMapper.findAll();
	}

}
