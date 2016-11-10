import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Copy {

	public static void main(String[] args) throws IOException {
		
		//建立联系
		File src = new File("Z:\\Vedeo\\70EnumDemo_2016-11-02_143607.wmv");
		File dest = new File("e:\\70EnumDemo_2016-11-02_143607COPY.wmv");
		
		//选取流
		InputStream in = new FileInputStream(src);
		BufferedInputStream bin = new BufferedInputStream(in);

		OutputStream out = new FileOutputStream(dest);
		BufferedOutputStream bout = new BufferedOutputStream(out);

		/*定义一个数组，长度为需要读取的文件长度
		byte[] tmp = new byte[(int) src.length()];
		文件的长度不能这么写，文件过大的情况下long型转换成int型会导致数据精度丢失
		可以设置一个长度，或者不写死
		*/
		
		
		byte[] tmp = new byte[(int) src.length()];
		
		bin.read(tmp);		//读取文件

		bout.write(tmp);	//写入文件

		bin.close();		//关闭流
		in.close();
		bout.close();
		out.close();
		
		System.out.println("Copy is OK & IO is closed");
	}

}
