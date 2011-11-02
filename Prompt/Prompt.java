/*
Developed by Patrik Natali - beta0x64
Email: patnatali@gmail.com
Hosted on github

Description: This is a Java utility that simply encapsulates the process of prompting the user for input.
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
