package VocaMain;

import java.io.*;

public class VocaFile {
    // txt 파일 생성
    File file = new File("D:/Voca" + "/Vocabulary.txt");

    public VocaFile() {
        try {
            if (file.getParentFile().mkdirs() && file.createNewFile()) {
                System.out.println("파일 생성 성공: " + file.getAbsolutePath());
            } else {
                System.out.println("파일이 이미 있습니다.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //파일 초기 데이터 쓰기

    public void FileWrite(){
        try(FileWriter writer = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(writer)) {

            bufferedWriter.write("precarious 불확실한");
            bufferedWriter.newLine();
            bufferedWriter.write("disrupt 방해하다");
            bufferedWriter.newLine();
            bufferedWriter.write("warfare 전쟁");
            bufferedWriter.newLine();
            bufferedWriter.write("hijack 납치하다");
            bufferedWriter.newLine();
            bufferedWriter.write("activation 작동시키다");
            bufferedWriter.newLine();
            bufferedWriter.write("bonfire 모닥불");
            bufferedWriter.newLine();
            }catch (IOException e) {
            e.printStackTrace();
        }
    }


        //파일 로드
    public void loadFile() {
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
