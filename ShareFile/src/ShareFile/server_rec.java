package ShareFile;
import java.io.*;
import java.net.*;
public class server_rec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
ServerSocket ss=new ServerSocket(1883);
Socket s=ss.accept();
DataInputStream dis=new DataInputStream(s.getInputStream());
FileOutputStream fos = new FileOutputStream("D://video.");
BufferedOutputStream bos = new BufferedOutputStream(fos);
int fLen = Integer.parseInt(dis.readUTF());
int k = 0;
int rByte;
while (k != fLen)
{
	bos.write(dis.read());
	k++;
	//System.out.println(k + " of " + fLen + " bytes have been received");
}
//DataOutputStream dos=new DataOutputStream(s.getOutputStream());
//dos.writeUTF("hello world");
//dis.close();
//s.close();
//ss.close();
}catch(Exception e) {}
	}

}