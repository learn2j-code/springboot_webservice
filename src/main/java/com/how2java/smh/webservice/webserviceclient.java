package com.how2java.smh.webservice;

import javax.xml.namespace.QName;

import org.apache.cxf.endpoint.Client;
import org.apache.cxf.jaxws.endpoint.dynamic.JaxWsDynamicClientFactory;
import org.apache.cxf.transport.http.HTTPConduit;
import org.apache.cxf.transports.http.configuration.HTTPClientPolicy;

import com.how2java.smh.pojo.Hero;

public class webserviceclient {

	public static void main(String[] args) {
		//创建动态客户端
        JaxWsDynamicClientFactory factory = JaxWsDynamicClientFactory.newInstance();
        Client client = factory.createClient("http://localhost:8080/webservice/api?wsdl");
        // 需要密码的情况需要加上用户名和密码
        //client.getOutInterceptors().add(new ClientLoginInterceptor(USER_NAME,PASS_WORD));
        HTTPConduit conduit = (HTTPConduit) client.getConduit();
        HTTPClientPolicy httpClientPolicy = new HTTPClientPolicy();
        httpClientPolicy.setConnectionTimeout(2000);  //连接超时
        httpClientPolicy.setAllowChunking(false);    //取消块编码
        httpClientPolicy.setReceiveTimeout(120000);     //响应超时
        conduit.setClient(httpClientPolicy);
        //client.getOutInterceptors().addAll(interceptors);//设置拦截器
      try{
          Object[] objects = new Object[0];
          QName qName = new QName("http://localhost:8080/webservice/api", "sayHello"); 
          // invoke("方法名",参数1,参数2,参数3....);
          Hero hero = new Hero();
          hero.setHp(188f);
          hero.setName("鲁班");
          objects = client.invoke(qName, hero);
          System.out.println("返回数据:" + objects[0]);
      }catch (Exception e){
          e.printStackTrace();
      }
	}

}
