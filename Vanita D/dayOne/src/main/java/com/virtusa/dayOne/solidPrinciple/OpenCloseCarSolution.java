package com.virtusa.dayOne.solidPrinciple;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

//for getter and setter, to string , equals,  @data
//@NoArgsConstructor for default constructor
//@AllArgsConstructor for all parameterized constructor
//component replace bean in xml file


@NoArgsConstructor
@AllArgsConstructor
@Data 
@EqualsAndHashCode(callSuper=false)
@Component
public class OpenCloseCarSolution extends OpenCloseCar {
	private boolean isElectric;
	
}

//let say electric car have more attributes like engine like electic instead of addding another field to it and modify previous class , I should extend extend this class with extra feature;
