package Week_12_Prac;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;

class MyClass implements ActionListener {   //2학기에 할거
    public void actionPerformed(ActionEvent event) {
        System.out.println("beep");
    }
}   //beep 소리가 들리게 함

public class CallbackTest {
    public static void main(String[] args) {
        ActionListener listener = new MyClass();
        Timer t = new Timer(1000, listener);    //1초마다 actionPerformed class가 자동으로 호출되게 하는 것
        t.start();
        for (int i = 0 ; i < 1000; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {

            }
        }
    }
}
