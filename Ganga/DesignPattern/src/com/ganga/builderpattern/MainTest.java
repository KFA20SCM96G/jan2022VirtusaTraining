package com.ganga.builderpattern;

public class MainTest {

	 public static void main(String[] args) {
	        Task task = new TaskBuilder(5).setDescription("Hello").setSummary("Test").build();
	        System.out.println(task.getSummary());
	    }

	}