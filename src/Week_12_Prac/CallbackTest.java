package Week_12_Prac;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;

class MyClass implements ActionListener {   //2학기에 할거
    public void actionPerformed(ActionEvent event) {
        System.out.println("beep");
    }
}

public class CallbackTest {
    public static void main(String[] args) {
        ActionListener listener = new MyClass();
        Timer t = new Timer(1000, listener);
        t.start();
        for (int i = 0 ; i < 1000; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {

            }
        }
    }
}
