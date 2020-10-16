/**
 * DemoService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.how2java.smh.webservice;

import javax.jws.WebParam;
import javax.jws.WebService;

import com.how2java.smh.pojo.Hero;

@WebService(name = "DemoService", // 暴露服务名称
    targetNamespace = "http://webservice.smh.how2java.com"// 命名空间,一般是接口的包名倒序
)
public interface DemoService {
    public String sayHello(@WebParam(name = "hero",targetNamespace = "http://pojo.smh.how2java.com")Hero hero);
}