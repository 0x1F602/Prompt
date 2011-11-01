/*
 * Patrik Natali, Kausthab Rao
 * 4
 * CET 350
 * nat1383@calu.edu rao1202@calu.edu
 */
package Prompt;

import java.io.*;

public class Prompt {
	public static String For(String promptFor) {
		String returns = new String("");

		System.out.print(promptFor);
		BufferedReader bReader = new BufferedReader(new InputStreamReader(System.in));
		try {
			returns = bReader.readLine();
		} catch (IOException e) {
			System.err.println("FATAL ERROR OCCURRED: " + e);
			e.printStackTrace();
		}

		return returns;
	}

	
}
