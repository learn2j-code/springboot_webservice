package com.how2java.smh.pojo.extend;

import com.how2java.smh.pojo.Hero;

public class HeroExtend extends Hero{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Hero heroDetail;

	public Hero getHeroDetail() {
		return heroDetail;
	}

	public void setHeroDetail(Hero heroDetail) {
		this.heroDetail = heroDetail;
	}
}
