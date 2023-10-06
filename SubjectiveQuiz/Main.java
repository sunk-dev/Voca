package SubjectiveQuiz;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.List;

public class Main {

//    try (
//    FileInputStream fis
//            = new FileInputStream(FilePath.path
//            + "/ENG.sav")) {
//
//        // 객체를 불러올 보조스트림
//        ObjectInputStream ois = new ObjectInputStream(fis);
//
//        List<ENG> engLsit = (List<ENG>) ois.readObject();
//
//        for (ENG eng : engList) {
//            System.out.println("snack = " + eng);
//        }
//
//
//    } catch (Exception e) {
//        e.printStackTrace();
//    }
//}

    public static void main(String[] args) {
        Quiz.start();
    }
}
