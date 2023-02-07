import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

class OutputStreamExample {
    public static void main(String[] args) throws IOException {
        OutputStream os = new FileOutputStream("output.txt");

        byte[] bytes = new byte[] { 'C', 'o', 'd', 'e', 'G', 'y', 'm' };

        for (byte i = -128; i < 127; i++) {
            os.write(i);
        }
        os.close();
    }
}