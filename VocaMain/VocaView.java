package VocaMain;

import static VocaMain.Utility.input;
import static VocaMain.Utility.makeLine;

public class VocaView {

    public static void start(){

        while (true){
            System.out.println("\n\n****** 단어Voca 프로그램 ****** ");
            System.out.println("#1. 단어장 보기!");
            System.out.println("#2. 객관식 문제 풀기!");
            System.out.println("#3. 주관식 문제 풀기!");
            System.out.println("#4. 새로운 단어 추가!");
            System.out.println("#5. 단어Voca 프로그램 종료");

            makeLine();

            String menuNum = input(">>");

            switch (menuNum) {
                case "1":
                    break;
                case"2":
                    break;
                case"3":
                    break;
                case"4":
                    break;
                case"5":
                    System.exit(0);
                default:
                    System.out.println("# 입력 하신 메뉴번호가 잘못 됐습니다!");
            }

        }

    }
}
