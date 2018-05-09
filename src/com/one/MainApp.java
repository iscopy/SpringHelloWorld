package com.one;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class MainApp {

	public static void main(String[] args) {
//		https://github.com/iscopy/SpringHelloWorld
		//һ��ClassPathXmlApplicationContext
		/*
		 *��һ��������ʹ�ÿ�� API ClassPathXmlApplicationContext() ������Ӧ�ó���������ġ� 
		 *��� API ���� beans �������ļ������ջ������ṩ�� API��
		 *������������ʼ�����еĶ��󣬼��������ļ����ᵽ�� beans��
		 * */
		 ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		/*
	      * �ڶ�����ʹ���Ѵ����������ĵ� getBean() �������������� bean��
	      * �������ʹ�� bean �� ID ����һ�����տ���ת��Ϊʵ�ʶ����ͨ�ö���
	      * һ�����˶�����Ϳ���ʹ�������������κ���ķ�����
	      * */
		 HelloWorld objCon = (HelloWorld) context.getBean("helloWorld");
		 objCon.getMessage();
		
		
		 //����XmlBeanFactory
		 /*
	      * ��һ�����ÿ���ṩ�� XmlBeanFactory() API ȥ���ɹ��� bean 
	      * �Լ����� ClassPathResource() API ȥ������·�� CLASSPATH �¿��õ� bean �����ļ���
	      * XmlBeanFactory() API ���𴴽�����ʼ�����еĶ��󣬼��������ļ����ᵽ�� bean��
	      * */
		 XmlBeanFactory factory = new XmlBeanFactory (new ClassPathResource("Beans.xml"));
		 
		 /*
		  * �ڶ������õ�һ�����ɵ� bean ��������� getBean() �����õ�����Ҫ�� bean�� 
		  * �������ͨ�������ļ��е� bean ID ������һ�������Ķ��󣬸ö�������������ʵ�ʵĶ���
		  * һ���õ�������󣬾Ϳ���������������������κη�����
		  * */
		 HelloWorld objFac = (HelloWorld) factory.getBean("helloWorld");
		 objFac.getMessage();
		 
		 //����XmlBeanFactory
		 /*
		  * ��һ�����ɹ�������
		  * ������ָ��·���� bean �����ļ���
		  * ���ÿ���ṩ�� FileSystemXmlApplicationContext API ȥ���ɹ��� bean��
		  * FileSystemXmlApplicationContext �������ɺͳ�ʼ�����еĶ���
		  * ���磬������ XML bean �����ļ��е� bean��
		  * */
		 ApplicationContext conFile = new FileSystemXmlApplicationContext("F:\\frame\\springBoot\\HelloSpring\\src\\Beans.xml");
		 /*
		  * �ڶ������õ�һ�����ɵ��������е� getBean() �����õ�����Ҫ�� bean�� 
		  * �������ͨ�������ļ��е� bean ID ������һ�������Ķ���
		  * һ���õ�������󣬾Ϳ���������������������κη�����
		  * */
		 HelloWorld objFile = (HelloWorld) conFile.getBean("helloWorld");
		 objFile.getMessage();
		 
		 
		 
		 
	}

}
