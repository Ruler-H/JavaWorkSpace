package Chapter_13;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class _Quiz_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try (BufferedReader br = new BufferedReader(new FileReader("saying.txt"));){
            String answerInput;
            String line;
            String answer;
            while ((line = br.readLine()) != null) {
                System.out.println("속담 퀴즈입니다. 빈 칸에 알맞은 말을 입력하시오. (주관식)");
                System.out.println("---------------------------------------------------");
                System.out.println("(문제) " + line);
                System.out.print(" 정답 입력 => ");
                answerInput = sc.nextLine();
                answer = br.readLine();
                if (answer.equals(answerInput)) {
                    System.out.println("정답입니다!!");
                } else {
                    System.out.println("틀렸습니다. 정답은 " + answer + "입니다.");
                }
                System.out.println();
            }
            System.out.println("---------------------------------------------------");
            System.out.println("모든 퀴즈가 완료되었습니다.");
            System.out.println("수고하셨습니다.");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
