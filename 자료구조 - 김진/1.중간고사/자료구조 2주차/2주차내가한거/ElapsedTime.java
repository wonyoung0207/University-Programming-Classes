package ahn1;

import java.util.*;

public class ElapsedTime {

	public static void main(String[] args) {
		try {
			long start = System.currentTimeMillis();
			System.out.println(new Date());
			Thread.sleep(5 * 1000);
			System.out.println(new Date());
			long end = System.currentTimeMillis();
			long diff = end - start;
			System.out.println("Difference : " + diff);

		} catch (Exception e) {
			System.out.println("An exception occurs");
		}

	}

}
