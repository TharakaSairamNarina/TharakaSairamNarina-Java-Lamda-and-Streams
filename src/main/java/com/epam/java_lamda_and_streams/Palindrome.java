package com.epam.java_lamda_and_streams;

import java.util.List;
import java.util.function.Predicate;

@FunctionalInterface
public interface Palindrome {
	void PalindromeList(List<String> list,Predicate<String> predicate);
}