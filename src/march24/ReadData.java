package march24;

import java.io.*;

public class ReadData {

	public static void main(String[] args)throws Throwable {
		FileReader fr = new FileReader("E://9oclock.txt");
		BufferedReader br = new BufferedReader(fr);
		String str = "";
		while((str=br.readLine())!=null);
		{
		Thread.sleep(3000);
		System.out.println(str);
		}
		br.close();
	}

}
