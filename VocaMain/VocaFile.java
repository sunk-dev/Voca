package VocaMain;

import java.io.File;
import java.io.IOException;

public class VocaFile {
    // txt 파일 생성
    File file = new File(FilePath.path + "/Vocabulary.txt");

    public VocaFile() {
        try {
            if (file.getParentFile().mkdirs() && file.createNewFile()) {

            } else {

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

