package com.how2java.smh.webservice;

import javax.jws.WebParam;
import javax.jws.WebService;

import org.springframework.beans.factory.annotation.Autowired;

import com.how2java.smh.pojo.Hero;
import com.how2java.smh.service.HeroService;

import java.util.Date;
@WebService(serviceName = "DemoService", // 与接口中指定的name一致
        targetNamespace = "http://webservice.smh.how2java.com", // 与接口中的命名空间一致,一般是接口的包名倒
        endpointInterface = "com.how2java.smh.webservice.DemoService"// 接口地址
)
public class DemoServiceImpl implements DemoService {
	
	@Autowired HeroService heroService;
    @Override
    public String sayHello(@WebParam(name = "hero",targetNamespace = "http://pojo.smh.how2java.com")Hero hero) {
    	heroService.add(hero);
        return hero.getName()+"，现在时间："+"("+new Date()+")";
    }
}
