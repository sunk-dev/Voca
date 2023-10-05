package MinGeon;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import static MinGeon.Utility.input;

public class PlusWord {
    static final String ROOT_PATH = "C:";

    public PlusWord() {
        File file = new File(ROOT_PATH + "plusWord.txt");

        try (FileInputStream fis = new FileInputStream(file)) {
            int data = 0;
            while (data != -1) {
                data = fis.read();
                System.out.write(data);
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("파일 불러오기 실패!");
        }

        String word = input("단어 입력 : ");
        String wordMean = input("단어의 뜻 입력 : ");
        word = word + " ";
    }
}
