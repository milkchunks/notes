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
            buttonIndex++;
            if (buttonIndex == 30) {
                buttonIndex = 0;
                for (int i = 0; i <= 29; i++) {
                    button2.setText("");
                }
            }
            //if enter is pressed when buttonIndex is a multiple of 5
            buttonIndex--;
            System.out.println("String.valueOf(): " + (String.valueOf((Double.valueOf(buttonIndex)/5))));
            System.out.println("buttonIndex: " + buttonIndex);
            if (String.valueOf((Double.valueOf(buttonIndex)/5)).contains(".0") && buttonIndex != 0) {
                System.out.println("running changeColor()");
                buttonIndex++;
                changeColor();
            }
            buttonIndex--;
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
        int pos = 0;
        //TODO broken, doesn't match letters
        ArrayList<String> texts = new ArrayList<>();
        ArrayList<String> word = new ArrayList<>();
        String[] words = {"polly", "jolly", "molly", "mucly"};
        for (int i=0;i<=4;i++) {
            word.add(String.valueOf(words[(int) Math.floor((Math.random() * 3) - 0)].charAt(i)));
        }
        for (int i=buttonIndex-6;i<=buttonIndex-2;i++) {
            JButton button = (JButton) frame.getContentPane().getComponent(i);
            texts.add(button.getText().toLowerCase());
        }
        System.out.println("word: " + word);
        System.out.println("texts: " + texts);
        //texts is what the user guessed
        //word is the correct answer
        for (int i=buttonIndex-6;i<=buttonIndex-2;i++) {
            JButton button = (JButton) frame.getContentPane().getComponent(i);
            if (button.getText().toLowerCase().equals(word.get(pos))) {
                button.setBackground(Color.GREEN);
            } else if (texts.contains(word.get(pos))) {
                button.setBackground(Color.YELLOW);
            } else {
                button.setBackground(Color.GRAY);
            }
            pos++;
        }
    }
    /*
    public static void changeColor() {
        //TODO broken, doesn't match letters
        ArrayList<String> texts = new ArrayList<>();
        String[] words = {"polly", "jolly", "molly", "mucky"};
        String word = words[(int) Math.floor((Math.random() * 3)-0)];
        System.out.println("word: " + word);
        String guess = "VRTFDMUDDYMUCKYMOLLYJOLLYPOLLY";
        char[] guess2 = guess.toLowerCase().toCharArray();
        //if the letter is in the right place, change to 1
        //if the letter is in the word, change to 2
        //if the letter isn't in the word, change to 3
        int pos = 0;
        for (int i=buttonIndex-4;i<=buttonIndex;i++) {
            String guess2i = String.valueOf(guess2[i]);
            if (guess2[i] == word.charAt(pos)) {
                guess2[i] = '1';
            } else if (word.contains(guess2i)) {
                guess2[i] = '2';
            } else {
                guess2[i] = '3';
            }
            pos++;
        }
        System.out.println(guess2);
    }
     */
}
