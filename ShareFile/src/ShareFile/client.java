package ShareFile;
import java.io.*;
import java.net.*;

public class client 
{
	public static void main(String[] args) throws Exception 
	{
		// TODO Auto-generated method stub
		Socket s = new Socket("192.168.43.50", 1883);
		
		File fPath = new File("D://movie.mp4");
		int fLen = (int) fPath.length();
		
		DataOutputStream dos = new DataOutputStream(s.getOutputStream());
		FileInputStream fis = new FileInputStream(fPath);
		BufferedInputStream bis = new BufferedInputStream(fis);
		String str = String.valueOf(fLen);
		dos.writeUTF(str);
		int k;
		int n = 0;
		while ((k = bis.read()) != -1)
		{
			dos.write(k);
//			n++;
//			System.out.println(n + " of " + fLen + " bytes have been sent");
		}
	}
}