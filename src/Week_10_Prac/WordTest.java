package Week_10_Prac;

import java.util.ArrayList;
import java.util.Scanner;

class Word {
    String eng;
    String kor;

    public Word(String eng) {
        this.eng = eng;
    }
    public Word(String eng, String kor) {
        this.eng = eng;
        this.kor = kor;
    }
    public String getEng() {
        return eng;
    }
    public String getKor() {
        return kor;
    }
    public void Search(String eng) {
        if (kor == null){
            System.out.println(eng + " -> 설명 필요");
        }else
            System.out.println(eng + " -> " + kor);
    }
}


public class WordTest {
    public static void main(String[] args) {
        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("Java", "자바"));
        words.add(new Word("Artificial Intelligence", "인공지능"));
        words.add(new Word("Reinforcement Learning", "강화학습"));
        words.add(new Word("Supervised Learning", "지도학습"));
        words.add(new Word("Unsupervised Learning", "비지도학습"));
        words.add(new Word("Internet of Things"));
        words.add(new Word("Network"));

        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        while (flag == true){
            System.out.println("검색할 단어를 입력하시오: (종료 quit)");
            String a = sc.nextLine();
            String b = "";
            if (a.equals("quit")){
                System.out.println("종료합니다.");
                flag = false;
                break;
            }else {
                for (int i = 0; i < words.size(); i++) {
                    if (words.get(i).getEng().equals(a)){
                        b = a;
                        words.get(i).Search(a);
                        break;
                    } else
                        b = null;
                }
                if (b == null) {
                    System.out.println("없는 단어");
                }
            }
        }

    }
}
