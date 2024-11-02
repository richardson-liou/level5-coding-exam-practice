package Coding_Exam_B;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class CodingExamB {
	
	public static void main(String[] args) {
		/*
		 * Write a java program that asks the user to enter a file name.
		 * If the file can be opened, print the contents of the file in reverse. (last line first, first line last)
		 * If the file cannot be opened, let the user know and allow them to enter a new file.
		 * 
		 */
		
		try {
			FileWriter fw = new FileWriter("src/Coding_Exam_B/test.txt");

			fw.write("hello\n");
			fw.write("my\n");
			fw.write("name\n");
			fw.write("is");
			
				
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		while(true) {
		String fileName = JOptionPane.showInputDialog("Enter a file name: ");
		try {
			BufferedReader reader = new BufferedReader(new FileReader(fileName));
            List<String> lines = new ArrayList<>();
            String line;
            while ((line = reader.readLine()) != null) {
                lines.add(line);
            }
            reader.close();

            for (int i = lines.size()-1; i>=0; i--) {
                System.out.println(lines.get(i));
            }
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			JOptionPane.showMessageDialog(null, "Unable to read file, please enter new file name");
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}


	}
}
