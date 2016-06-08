package decoratorInputStream;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.InputStream;

public class TesteInputStream {
 
  public static void main(String[] args) {
    int c;
    try {

      InputStream stream = new LowerCaseInputStream(new BufferedInputStream(new FileInputStream("D:\\desenv\\workspace\\Patterns\\src\\decotarorInputStream\\teste.txt")));
      while ((c = stream.read()) >= 0) {
        System.out.print((char)c);
      }
      stream.close();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

}
