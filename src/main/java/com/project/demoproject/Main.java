package com.project.demoproject;

import org.springframework.context.ApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		Project project = (Project) context.getBean("project");

		// Виведення інформації
		System.out.println("Проект: " + project.getProjectName());
		System.out.println("URL сторінки: " + project.getNewsPage().getPageUrl());
		System.out.println("Заголовок новини: " + project.getNewsPage().getNews().getHeadline());
		System.out.println("Текст новини: " + project.getNewsPage().getNews().getContent());
	}
}
