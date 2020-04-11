package org.random;

import java.util.*;

public class RandomNumber {
	public int getRandomNumber(){
		Random random = new Random();
		return random.nextInt();
	}
}