package com.epam.java_lamda_and_streams;

import java.util.List;

public class Average {
	public double calculateAverage(List<Integer> list) {
		return list.stream().mapToInt((val)->val.intValue()).average().getAsDouble();
	}
}