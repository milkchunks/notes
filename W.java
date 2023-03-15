import java.awt.*;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.awt.Font;
import java.util.ArrayList;

public class W {
    static int buttonIndex = 0;
    static JFrame frame = new JFrame();
    static JButton button2;
    static ActionListener listen = e -> {
        JButton button = (JButton) e.getSource();
        System.out.println("buttonIndex: " + buttonIndex);
        if (!button.getName().equals("enter")) {
            button2 = (JButton) frame.getContentPane().getComponent(buttonIndex);
            if (!button.getName().equals("backspace")) {
                if (!button.getName().equals("enter")) {
                    button2.setText(button.getName().toUpperCase());
                    buttonIndex++;
                }
                if (buttonIndex == 30) {
                    buttonIndex--;
                }
            } else {
                button2.setText("");
                if (buttonIndex != 0) {
                    buttonIndex--;
                }
            }
        } else {
            if (buttonIndex == 30) {
                buttonIndex = 0;
                for (int i = 0; i <= 29; i++) {
                    button2.setText("");
                }
            }
            //if enter is pressed when buttonIndex is a multiple of 5
            if (String.valueOf((Double.valueOf(buttonIndex)/5)).contains(".0") && buttonIndex != 0) {
                changeColor();
            }
        }
    };
    public static void main(String[] args) {
        //TODO steal from html
        setUp();
        frame.setVisible(true);
    }
    public static void setUp() {
        String[] alphabet = {"q", "w", "e", "r", "t", "y", "u", "i", "o", "p", "a", "s", "d", "f", "g", "h", "j", "k", "l", "z", "x", "c", "v", "b", "n", "m", "Enter"};
        frame.setLayout(null);
        frame.setSize(1000, 1000);
        frame.setResizable(false);
        int xpos = 63;
        int ypos = 0;
        for (int i=1;i<=30;i++) {
            JButton button = new JButton();
            button.setBounds(xpos, ypos, 75, 75);
            button.setEnabled(false);
            button.addActionListener(listen);
            button.setFont(new Font("Dialog", 0, 18));
            frame.add(button);
            xpos += 75;
            if (String.valueOf((double) i /5).contains(".0")) {
                xpos = 63;
                ypos += 75;
            }
        }
        xpos = 0;
        for (int i=0;i<=26;i++) {
            JButton button = new JButton(alphabet[i]);
            button.setBounds(xpos, ypos, 50, 50);
            button.addActionListener(listen);
            button.setName(alphabet[i].toLowerCase());
            frame.add(button);
            xpos += 50;
            if (alphabet[i].equals("p") || alphabet[i].equals("l")) {
                ypos += 50;
                xpos = i/9*25;
            }
        }
        JButton backspace = new JButton("B");
        backspace.addActionListener(listen);
        backspace.setName("backspace");
        backspace.setBounds(450, 550, 50, 50);
        frame.add(backspace);
    }
    public static void changeColor() {
        //TODO broken, doesn't match letters
        ArrayList<String> texts = new ArrayList<>();
        String[] words = {"polly", "jolly", "molly", "mucky"};
        char[] word = words[(int) (Math.random() * 3) + 0].toCharArray();
        for (int i=buttonIndex-5;i<=buttonIndex-1;i++) {
            JButton button = (JButton) frame.getContentPane().getComponent(i);
            texts.add(button.getText().toLowerCase());
        }
        System.out.println("texts: " + texts);
        for (int i=buttonIndex-5;i<=buttonIndex-1;i++) {
            System.out.println("i: " + i);
            System.out.println("word[i]: " + word[i]);
            JButton button = (JButton) frame.getContentPane().getComponent(i);
            System.out.println("button.getText(): " + button.getText().toLowerCase());
            if (button.getText().toLowerCase().equals(word[i])) {
                button.setBackground(Color.GREEN);
            } else if (texts.contains(word[i])) {
                button.setBackground(Color.YELLOW);
            }
        }
    }
}
