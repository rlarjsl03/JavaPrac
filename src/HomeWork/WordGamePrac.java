package HomeWork;

import java.util.Scanner;

public class WordGamePrac {
    private Scanner scanner; //키보드 입력
    private String startWord = "Java"; //시작 단어
    private Player[] players; //게임 참가자들

    public WordGamePrac() {
        scanner = new Scanner(System.in);
    }

    //게임 참가자 수를 입력받고 Player []을 생성하는 메서드
    private void createPlayers() {
        System.out.println("게임에 참가하는 인원은 몇 명입니까?>> ");
        int nPlayers = scanner.nextInt();
        players = new Player[nPlayers]; //player [] 레퍼런스 배열 생성

        //각 참여자의 이름을 입력받아 player 객체 생성
        for (int i = 0; i < nPlayers; i++) {
            System.out.println("참가자의 이름을 입력하세요.>> ");
            String name = scanner.next();
            players[i] = new Player(name);
        }
    }

    //게임을 진행하는 메소드
    public void run() {
        createPlayers(); //참가자를 위한 player []을 생성한다.
        String lastWord = startWord; //startWord 부터 시작한다

        System.out.println("시작하는 단어는 " + lastWord + " 입니다.");
        int next = 0; //참가자들의 순서대로 증가

        //게임이 끝날때까지 반복
        while (true) {
            String newWord = players[next].sayWord(); //next 참가자가 단어를 입력하도록 한다.
            if (!players[next].succeed(lastWord)) {  //next 참가자가 성공하였는지 검사
                System.out.println(players[next].getName() + "이 졌습니다.");
                break;
            }
            next++; // 다음 참가자
            next %= players.length; //next가 참가자의 갯수보다 많게 증가하는것을 막는다.
            lastWord = newWord;
        }
    }

    public static void main(String[] args) {
        WordGamePrac game = new WordGamePrac();
        game.run();
    }
}

//한 사람의 참가자를 표현하는 클래스
class Player {
    Scanner scanner; //키보드 입력
    private String name; //게임 참가자의 이름
    private String word; //참가자가 입력한 단어

    public Player(String name) {
        this.name = name;
        scanner = new Scanner(System.in);
    }

    public String getName() {
        return name;
    }

    public String sayWord() {
        System.out.println(name + ">> ");
        word = scanner.next();
        return word;
    }

    //lastWord와 참가자가 입력한 word를 비교해 끝말잇기가 잘 되었는지 판단
    //성공했으면 true로 리턴
    public boolean succeed(String lastWord) {
        int lastIndex = lastWord.length() - 1; //최종 단어의 맨 마지막 문자의 인덱스

        //최종 단어의 맨 마지막 문자와 참가자가 입력한 단어의 첫 문자가 같은지 비교
        if (lastWord.charAt(lastIndex) == word.charAt(0))
            return true;
        else
            return false;
    }
}
