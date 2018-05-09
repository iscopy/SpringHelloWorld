package com.one;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class MainApp {

	public static void main(String[] args) {
//		https://github.com/iscopy/SpringHelloWorld
		//一、ClassPathXmlApplicationContext
		/*
		 *第一步是我们使用框架 API ClassPathXmlApplicationContext() 来创建应用程序的上下文。 
		 *这个 API 加载 beans 的配置文件并最终基于所提供的 API，
		 *它处理创建并初始化所有的对象，即在配置文件中提到的 beans。
		 * */
		 ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		/*
	      * 第二步是使用已创建的上下文的 getBean() 方法来获得所需的 bean。
	      * 这个方法使用 bean 的 ID 返回一个最终可以转换为实际对象的通用对象。
	      * 一旦有了对象，你就可以使用这个对象调用任何类的方法。
	      * */
		 HelloWorld objCon = (HelloWorld) context.getBean("helloWorld");
		 objCon.getMessage();
		
		
		 //二、XmlBeanFactory
		 /*
	      * 第一步利用框架提供的 XmlBeanFactory() API 去生成工厂 bean 
	      * 以及利用 ClassPathResource() API 去加载在路径 CLASSPATH 下可用的 bean 配置文件。
	      * XmlBeanFactory() API 负责创建并初始化所有的对象，即在配置文件中提到的 bean。
	      * */
		 XmlBeanFactory factory = new XmlBeanFactory (new ClassPathResource("Beans.xml"));
		 
		 /*
		  * 第二步利用第一步生成的 bean 工厂对象的 getBean() 方法得到所需要的 bean。 
		  * 这个方法通过配置文件中的 bean ID 来返回一个真正的对象，该对象最后可以用于实际的对象。
		  * 一旦得到这个对象，就可以利用这个对象来调用任何方法。
		  * */
		 HelloWorld objFac = (HelloWorld) factory.getBean("helloWorld");
		 objFac.getMessage();
		 
		 //三、XmlBeanFactory
		 /*
		  * 第一步生成工厂对象。
		  * 加载完指定路径下 bean 配置文件后，
		  * 利用框架提供的 FileSystemXmlApplicationContext API 去生成工厂 bean。
		  * FileSystemXmlApplicationContext 负责生成和初始化所有的对象，
		  * 比如，所有在 XML bean 配置文件中的 bean。
		  * */
		 ApplicationContext conFile = new FileSystemXmlApplicationContext("F:\\frame\\springBoot\\HelloSpring\\src\\Beans.xml");
		 /*
		  * 第二步利用第一步生成的上下文中的 getBean() 方法得到所需要的 bean。 
		  * 这个方法通过配置文件中的 bean ID 来返回一个真正的对象。
		  * 一旦得到这个对象，就可以利用这个对象来调用任何方法。
		  * */
		 HelloWorld objFile = (HelloWorld) conFile.getBean("helloWorld");
		 objFile.getMessage();
		 
		 
		 
		 
	}

}
