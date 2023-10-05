package MinGeon;

import java.io.*;

import static MinGeon.Utility.input;

public class PlusWord {
    static final String ROOT_PATH = "D:";

    public PlusWord() {
        File file = new File(ROOT_PATH + "/plusWord.txt");
        FileReader fileReader = null;
        String wordList = "";
        String word = "";
        String wordMean = "";

        if(!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
                System.out.println("파일 생성 실패!");
                return;
            }
        }

        try {
            fileReader = new FileReader(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("파일 불러오기 실패!");
            return;
        }

        try (BufferedReader buffRead = new BufferedReader(fileReader)) {
            String line;
            while((line = buffRead.readLine()) != null) {
                wordList = wordList + line +"\n";
            }
            fileReader.close();
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("파일 읽어오기 실패!");
            return;
        }

//        System.out.println(wordList); //잘 읽어오는지 확인

        while(true) {
            System.out.println("단어를 추가합니다. 0을 입력시 종료");
            word = input("단어 입력 : ");
            if (word.equals("0")) {
                System.out.println("단어 추가를 중지합니다.");
                break;
            }
            wordMean = input("단어의 뜻 입력 : ");
            if (wordMean.equals("0")) {
                System.out.println("단어 추가를 중지합니다.");
                break;
            }
            word = word + " ";
            wordList = wordList + word + wordMean + "\n";
        }

        try (FileWriter fileWriter = new FileWriter(file)){
            fileWriter.write(wordList);
            fileWriter.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
