package com.one;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 *��һ��������ʹ�ÿ�� API ClassPathXmlApplicationContext() ������Ӧ�ó���������ġ� 
		 *��� API ���� beans �������ļ������ջ������ṩ�� API��
		 *������������ʼ�����еĶ��󣬼��������ļ����ᵽ�� beans��
		 * */
//		 ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		/*
	      * �ڶ�����ʹ���Ѵ����������ĵ� getBean() �������������� bean��
	      * �������ʹ�� bean �� ID ����һ�����տ���ת��Ϊʵ�ʶ����ͨ�ö���
	      * һ�����˶�����Ϳ���ʹ�������������κ���ķ�����
	      * */
//		 HelloWorld objCon = (HelloWorld) context.getBean("helloWorld");
//		 objCon.getMessage();
		
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
		 
	}

}
