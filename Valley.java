package countingValleys;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;
import java.io.*; 
import java.util.*; 

public class Valley {
	
	public static int jumpingOnClouds(List<Integer> c) {
		
		int jumps = 0;
	
		for(int i = 0; i < (c.size() -1); i++) {
			
			if(c.get(i)==0) i++;
			//i++;
			jumps++;
		}
		
			
			return jumps;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 8;
		
		ArrayList<Integer> arr = new ArrayList<Integer>(List.of(0,1,0,0,0,1,0,1));
		
		System.out.println("ArrayList : " + arr);
		//System.out.println(arr.size());
		System.out.println(jumpingOnClouds(arr));

	}

}
