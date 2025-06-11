package Week_12_Prac;

public class StringStack1 implements Stack1 {
    private String[] element;   // 스택의 저장 메모리
    private int tos;    // index, top of stack

    public StringStack1(int capacity) {
        element = new String[capacity];
        tos -= 1;
    }

    // Stack 인터페이스에 선언된 다음 3개의 메소드 오버라이딩 구현
    @Override
    public int length() {   //현재 스택에 저장된 개수 리턴
        return tos+1;
    }

    @Override
    public int capacity() { // 스택 크기 리턴
        return element.length;
    }

    @Override
    public String pop() {
        if (tos == -1)  // 스택이 비었음
            return null;
        String s = element[tos]; // 톱에 있는 값
        tos--;
        return s;
    }

    @Override
    public boolean push(String val) {
        return false;
    }


}
