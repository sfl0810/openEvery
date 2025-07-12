import java.io.*;

public class Main {
    public static void main(String[] args) {
        File file = new File("src\\src\\applicationSrc.txt");
        String src = null;
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            while ((src = bufferedReader.readLine()) != null) {
                try {
                    Runtime.getRuntime().exec(src);
                    System.out.printf(src + "启动成功\n");
                } catch (IOException e) {
                    System.out.printf(src + "启动失败, 错误提示: " + e.getMessage() + "\n");
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
