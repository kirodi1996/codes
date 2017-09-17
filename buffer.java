import java.io.*;
class buffer{
	public static void main(String[] args) throws IOException{
		DataInputStream dis=new DataInputStream(System.in);
		FileOutputStream fout=new FileOutputStream("myfile.txt",true);
		BufferedOutputStream bos=new BufferedOutputStream(fout,1024);
		char ch;
		while((ch=(char)dis.read())!='@')
			bos.write(ch);
		bos.close();
	}
}