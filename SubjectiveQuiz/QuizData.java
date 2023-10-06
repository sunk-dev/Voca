package SubjectiveQuiz;

import java.io.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class QuizData extends ArrayList<Question> {
    public static void main(String[] args) {

        //String quizDataPath = "C:\\Quiz" + key + ".dat";
        //System.out.println(quizDataPath);
        try (FileReader fr = new FileReader(quizDataPath.path + "/wordLsit")) {

            BufferedReader br = new BufferedReader(fr);

            String s = br.readLine();
            System.out.println(s);

            String[] split = s.split(" ");
            System.out.println(Arrays.toString(split));

            Word word = new Word(split[0], split[1]);
        } catch (Exception e) {
            e.printStackTrace();
        }

//            Scanner scn = new Scanner(new FileInputStream(quizDataPath));

//            while (scn.hasNext()) {
//                //짝수줄 문제, 홀수줄 정답.
//                //문제와 정답을 읽어와서 Arraylist에 추가
//                Question q = new Question(scn.nextLine(), scn.nextLine());
//                //System.out.println(qDTO);
//                this.add(q);
//            }//while------
//
//            System.out.println();
//            Collections.shuffle(this); // 문제 섞는다.
//            /*
//             * for (Question q: QuizData) { System.out.println(q); }
//             */
//
//        } catch (IOException e) {
//            System.out.println("예외 : " + e);
//            return true;
//        }
//
//        return false;
        }// loadQuiz()
    }

