import java.io.*;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

public class DownloadImage {

    private static final String picture = "src\\inFile.jpg";

    public static void main(String[] args) throws IOException {
            InputStream url = new URL("http://www.avajava.com/images/avajavalogo.jpg").openStream();
            Files.copy(url, Path.of(picture), StandardCopyOption.REPLACE_EXISTING);
        }
}