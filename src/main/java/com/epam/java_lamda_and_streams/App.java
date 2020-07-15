package com.epam.java_lamda_and_streams;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class App implements Palindrome
{
	public void PalindromeList(List<String> list,Predicate<String> predicate) {
		for(String s:list) {
			if(predicate.test(s)) {
				System.out.print(s+" ");
			}
		}
		System.out.println();
	}
    public static void main( String[] args ) throws IOException
    {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	boolean flag = true;
    	Average avgobj = new Average();
    	App app = new App();
    	StringFilter stringfilter_obj = new StringFilter();
    	while(flag) {
    		System.out.println("Press 1: Average of n numbers");
    		System.out.println("Press 2: To check which strings starts with 'a' and length 3");
    		System.out.println("Press 3: To check which strings are palindrome");
    		int choice = Integer.parseInt(br.readLine());
    		if(choice == 1) {
    			System.out.println("Enter n numbers seperated by space: ");
    			String[] input = br.readLine().split(" ");
    			List<Integer> input_list = new ArrayList<>();
    			for(String s:input)
    				input_list.add(Integer.parseInt(s));
    			System.out.println(avgobj.calculateAverage(input_list));
    		}else if(choice == 2) {
    			System.out.println("Enter the strings seperated by space: ");
    			String[] input = br.readLine().split(" ");
    			List<String> list = stringfilter_obj.filterStrings(Arrays.asList(input));
    			for(String s:list)
    				System.out.print(s+" ");
    			System.out.println();
    		}else if(choice == 3){
    			System.out.println("Enter the strings separated by space: ");
    			String[] input = br.readLine().split(" ");
    			app.PalindromeList(Arrays.asList(input), (s)->s.equals(new StringBuilder(s).reverse().toString()));
    		}else {
    			flag = false;
    			return;
    		}
    	}
    }
}