package baseball.view;

import static camp.nextstep.edu.missionutils.Console.readLine;

public class input {

    // player가 선택한 서로 다른 3가지 숫자
    private String userNumber;
    // 게임 상태 번호
    private String gameMode;

    // player가 서로 다른 숫자 3가지 입력
    public void inputUserNumber() {
        System.out.print("숫자를 입력해주세요 : ");
        userNumber = readLine();
        // 검증 코드
//        if (userNumber.length() != 3 || !userNumber.matches("[0-9]+") || hasDuplicateCharacters(userNumber)) {
//            throw new IllegalArgumentException("입력값은 서로 다른 세 자리 숫자여야 합니다.");
//        }

        System.out.println();
    }

    // player가 게임 종료 후 재시작/종료 선택
    public void endGame() {
        System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
        gameMode = readLine();
        // 검증 코드
//        if(gameMode.equals("1") || gameMode.equals("2")) {
//            throw new IllegalArgumentException("1과 2 중에서 선택해야합니다.");
//        }
    }

//    private boolean hasDuplicateCharacters(String str) {
//        return str.chars().distinct().count() != str.length();
//    }
}
