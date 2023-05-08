package march24;

import java.io.*;

public class WriteText {

	public static void main(String[] args)throws Throwable {
		File f = new File("E://9oclock.txt");
		FileWriter fw = new FileWriter(f);
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write("i am learning java");
		bw.newLine();
		bw.write("i am learning manual");
		bw.newLine();
		bw.write("i am learning testing");
		bw.newLine();
		bw.write("i am learning selenium");
		bw.newLine();
		bw.write("i am learning QTP");
		bw.flush();
		bw.close();

	}

}
