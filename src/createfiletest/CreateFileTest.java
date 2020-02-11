/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package createfiletest;

 import java.io.*;
 import java.util.Scanner;
 
 /**
  * A program that writes data to a file, overwriting existing file, if any.
  */
 public class CreateFileTest {

	public static void main(String[] args) {
		File dataFile = new File("StuScores.dat");
		FileWriter out;
		BufferedWriter writeFile;
		Scanner input = new Scanner(System.in);
		double score;
		String name;
		
		try {
			out = new FileWriter(dataFile,true);
			writeFile = new BufferedWriter(out);
			for (int i = 0; i < 2; i++) {
				System.out.print("Enter student name: ");
				name = input.next();
				System.out.print("Enter test score: ");
				score = input.nextInt();
				writeFile.write(name);
				writeFile.newLine();
				writeFile.write(String.valueOf(score));
				writeFile.newLine();
			}  	
    		writeFile.close();
    		out.close();
    		System.out.println("Data written to file.");
                } catch (IOException e) {
                        System.out.println("Problem writing to file.");
                        System.err.println("IOException: " + e.getMessage());
                }
                }	
 }