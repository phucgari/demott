import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

class InputStreamExample2 {

    public static void main(String[] args) throws IOException {

        InputStream in = new FileInputStream("CodeGym.txt");


        byte[] bytes = new byte[10];
        int i = -1;
        while ((i = in.read(bytes)) != -1) {
            String s = new String(bytes, 0, i);
            System.out.println(s);
        }
        in.close();
    }
}