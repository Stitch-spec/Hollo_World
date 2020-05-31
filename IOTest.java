import org.junit.Test;

import java.io.*;

public class IOTest {
    @Test
    public void test01(){
        OutputStream out = null;
        OutputStream output = null;
        try {
            out = new FileOutputStream("pom.txt",true);
            output = new BufferedOutputStream(out);
            String s = "01234";
//            out.write(s.getBytes());
            output.write(s.getBytes());
//            out.flush();
            output.flush();
	    System.out.println(123);
        }catch (IOException e){
            e.printStackTrace();
        }
    }
    @Test
    public void test02(){
        OutputStream output = null;
        InputStream input = null;
        try {
//            in = new FileInputStream("pom.xml");
//            out = new FileOutputStream("pom.txt");
            input = new BufferedInputStream(new FileInputStream("pom.xml"));
            output = new BufferedOutputStream(new FileOutputStream("pom.txt"));
            byte[] b = new byte[1024];
            input.read(b);
            String a = "haha";
            output.write(b);
            output.flush();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
