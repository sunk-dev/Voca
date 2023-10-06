package SubjectiveQuiz;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Play {
    private int result = 0; //맞은개수 저장.
    private int qTotalOuput; //출력 퀴즈수
    private QuizData quizData; //문제들을 저장하는 ArrayList

    //생성자
    public Play() {
        this(5); //퀴즈 출력개수는 디폴트 5개
    }
    public Play(int size) {
        quizData = new QuizData();
        qTotalOuput = size;
    }


    /**퀴즈 시작*/
    public void startQuiz() {
        System.out.println("#퀴즈를 시작합니다!");
        Scanner scn = new Scanner(System.in);
        if(qTotalOuput>quizData.size()) qTotalOuput = quizData.size();
        for (int i = 0; i < qTotalOuput; i++) {
            Question q = quizData.get(i);
            String question = q.getQuestion();
            String answer = q.getAnswer();

            System.out.println((i + 1) + ") " + question);
            String user_Answer = scn.nextLine();

            if (answer.equals(user_Answer)) {
                System.out.println("# 정답입니다~!");
                result++;
            } else {
                System.out.println("# 틀렸습니다.");
            }
            System.out.println();
        }//for()------
        System.out.println("# 퀴즈를 다 풀었습니다.");
        quizData.clear(); //퀴즈데이터 초기화
        showResult(); //결과 출력

    }//startQuiz()---------

    /**게임 결과 보기*/
    public void showResult(){

        System.out.println("===== Quiz Result =====");
        System.out.println("문제수 : "+qTotalOuput);
        System.out.println("정답수 : "+result);
        System.out.printf("점  수 : %.1f 점\n",result*(100.0/qTotalOuput));
        System.out.println("=======================");
    }//showResult()---------
}
