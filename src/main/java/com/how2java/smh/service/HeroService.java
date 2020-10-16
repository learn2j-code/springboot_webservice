package com.how2java.smh.service;

import java.util.List;

import com.how2java.smh.pojo.Hero;
import com.how2java.smh.pojo.extend.HeroExtend;

public interface HeroService {
    public int add(Hero record); 
    
    public void delete(int id); 
        
    public Hero get(int id); 
      
    public int update(Hero record);  
        
    public List<Hero> list();
    
    public List<HeroExtend> findAllDetail();
}
