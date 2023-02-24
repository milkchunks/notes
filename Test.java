import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.stream.Collectors;
import java.awt.Font;
import java.awt.Color;
public class GUI implements ActionListener {
    static boolean enterPressed = false;
    static String arg = "";
    static ArrayList<String> all = new ArrayList<>();
    static JButton one = configButton("1", 0, 100);
    static JButton two = configButton("2", 100, 100);
    static JButton three = configButton("3", 200, 100);
    static JButton four = configButton("4", 0, 150);
    static JButton five = configButton("5", 100, 150);
    static JButton six = configButton("6", 200, 150);
    static JButton seven = configButton("7", 0, 200);
    static JButton eight = configButton("8", 100, 200);
    static JButton nine = configButton("9", 200, 200);
    static JButton add = configButton("+", 300, 100);
    static JButton sub = configButton("-", 300, 150);
    static JButton mult = configButton("*", 300, 200);
    static JButton div = configButton("/", 300, 300);
    static JButton c = configButton("C", 0, 300);
    static JButton ce = configButton("CE", 100, 300);
    static JButton enter = configButton("Enter", 0, 0);
    static JButton parOne = configButton("(", 0, 250);
    static JButton parTwo = configButton(")", 100, 250);
    static JButton expo = configButton("^", 300, 250);
    static JButton mod = configButton("%", 200, 300);
    static JButton zero = configButton("0", 200, 250);
    static JTextField text = new JTextField();
    static JFrame calcFrame = setUpMain();
    static JFrame infoFrame = setUpInfo();
    static JButton back = configButton("Back", 0, 0);
    static JButton info = configButton("info", 0, 0);
    public static void main(String[] args) {
        //it kept saying that enter, info, and back were null so they're set up in main
        enter.setText("Enter");
        enter.setBounds(0, 350, 400, 50);
        info.setText("Info");
        info.setBounds(0, 400, 400, 50);
        info.setFont(new Font("Dialog", Font.PLAIN, 12));
        info.addActionListener(new GUI());
        info.setName("info");
        calcFrame.add(info);
        calcFrame.setVisible(true);
        text.setBounds(0, 0, 414, 100);
        text.setFont(new Font("Dialog", Font.PLAIN, 16));
        back.setName("back");
        back.addActionListener(new GUI());
        back.setFont(new Font("Dialog", Font.PLAIN, 12));
        back.setBounds(0,400,414,50);
        infoFrame.add(back);
        calcFrame.add(text);
        /*
        TODO try catch for when you try to ce with an empty arraylist
        TODO add LAST button
        TODO it gets mad when you start with a )
         */
    }
    //theres def a better way to set up
    public static JFrame setUpMain() {
        JFrame frame = new JFrame();
        ImageIcon icon = new ImageIcon("C:\\Users\\tahom\\Downloads\\R.png");
        Font font = new Font("Dialog", Font.PLAIN, 12);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setIconImage(icon.getImage());
        frame.setLayout(null);
        frame.setResizable(false);
        frame.setSize(414, 487);
        frame.setTitle("Calculator");
        zero.setFont(font);
        one.setFont(font);
        two.setFont(font);
        three.setFont(font);
        four.setFont(font);
        five.setFont(font);
        six.setFont(font);
        seven.setFont(font);
        eight.setFont(font);
        nine.setFont(font);
        add.setFont(font);
        sub.setFont(font);
        mult.setFont(font);
        div.setFont(font);
        expo.setFont(font);
        mod.setFont(font);
        parOne.setFont(font);
        parTwo.setFont(font);
        c.setFont(font);
        ce.setFont(font);
        enter.setFont(font);
        frame.add(zero);
        frame.add(one);
        frame.add(two);
        frame.add(three);
        frame.add(four);
        frame.add(five);
        frame.add(six);
        frame.add(seven);
        frame.add(eight);
        frame.add(nine);
        frame.add(add);
        frame.add(sub);
        frame.add(mult);
        frame.add(parOne);
        frame.add(parTwo);
        frame.add(expo);
        frame.add(mod);
        frame.add(div);
        frame.add(c);
        frame.add(ce);
        frame.add(enter);
        text.addActionListener(new GUI());
        zero.addActionListener(new GUI());
        one.addActionListener(new GUI());
        two.addActionListener(new GUI());
        three.addActionListener(new GUI());
        four.addActionListener(new GUI());
        five.addActionListener(new GUI());
        six.addActionListener(new GUI());
        seven.addActionListener(new GUI());
        eight.addActionListener(new GUI());
        nine.addActionListener(new GUI());
        add.addActionListener(new GUI());
        sub.addActionListener(new GUI());
        mult.addActionListener(new GUI());
        div.addActionListener(new GUI());
        parOne.addActionListener(new GUI());
        parTwo.addActionListener(new GUI());
        expo.addActionListener(new GUI());
        mod.addActionListener(new GUI());
        c.addActionListener(new GUI());
        ce.addActionListener(new GUI());
        enter.addActionListener(new GUI());
        zero.setName("zero");
        one.setName("one");
        two.setName("two");
        three.setName("three");
        four.setName("four");
        five.setName("five");
        six.setName("six");
        seven.setName("seven");
        eight.setName("eight");
        nine.setName("nine");
        add.setName("add");
        sub.setName("sub");
        mult.setName("mult");
        div.setName("div");
        parOne.setName("parOne");
        parTwo.setName("parTwo");
        expo.setName("expo");
        mod.setName("mod");
        c.setName("c");
        ce.setName("ce");
        enter.setName("enter");
        return frame;
    }
    public static JFrame setUpInfo() {
        JFrame frame = new JFrame();
        JTextField info = new JTextField();
        JTextField info2 = new JTextField();
        JTextField info3 = new JTextField();
        JTextField info4 = new JTextField();
        JTextField info5 = new JTextField();
        JTextField info6 = new JTextField();
        JTextField info7 = new JTextField();
        ImageIcon icon = new ImageIcon("C:\\Users\\tahom\\Downloads\\R.png");
        Font font = new Font("Dialog", Font.PLAIN, 12);
        frame.setBackground(Color.WHITE);
        frame.setTitle("Calculator");
        frame.setLayout(null);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setIconImage(icon.getImage());
        frame.setSize(414, 487);
        info.setBounds(5, 0, 414, 30);
        info.setEditable(false);
        info.setText("Click and type in the answer box to edit/type your equation.");
        info.setFont(font);
        info2.setBounds(5, 30, 414, 30);
        info2.setEditable(false);
        info2.setText("Press Enter on your keyboard to save changes to your problem...");
        info2.setFont(font);
        info3.setFont(font);
        info3.setBounds(5, 60, 414, 30);
        info3.setEditable(false);
        info3.setText("...when using the keyboard to edit your problem.");
        info4.setBounds(5, 90, 414, 30);
        info4.setText("This will not compute your problem, only save its text");
        info4.setEditable(false);
        info4.setFont(font);
        info5.setEditable(false);
        info5.setText("Pressing the calculator's Enter button will NOT save your changes...");
        info5.setBounds(5, 120, 414, 30);
        info5.setFont(font);
        info6.setEditable(false);
        info6.setText("...it will compute your problem.");
        info6.setBounds(5, 150, 414, 30);
        info6.setFont(font);
        info7.setEditable(false);
        info7.setText("Make sure to save your equation when editing/typing with a keyboard");
        info7.setBounds(5, 180, 414, 30);
        info7.setFont(font);
        frame.add(info);
        frame.add(info2);
        frame.add(info3);
        frame.add(info4);
        frame.add(info5);
        frame.add(info6);
        frame.add(info7);
        return frame;
    }
    public static JButton configButton(String text, int x, int y) {
        JButton button = new JButton();
        button.setBounds(x, y, 100, 50);
        button.setText(text);
        return button;
    }
    public void actionPerformed(ActionEvent e) {
        String name;
        try {
            JButton o = (JButton) e.getSource();
            name = o.getName();
        } catch (Exception a) {
            name = "text";
        }
        if(!name.equals("enter")) {
            if (enterPressed) {
                all.clear();
                arg = "";
            }
        }
        switch (name) {
            case "back":
                infoFrame.setVisible(false);
                calcFrame.setVisible(true);
                break;
            case "info":
                calcFrame.setVisible(false);
                infoFrame.setVisible(true);
                break;
            case "text":
                arg = text.getText();
                break;
            case "zero":
                arg = arg + "0";
                enterPressed = false;
                break;
            case "one":
                arg = arg + "1";
                enterPressed = false;
                break;
            case "two":
                arg = arg + "2";
                enterPressed = false;
                break;
            case "three":
                arg = arg + "3";
                enterPressed = false;
                break;
            case "four":
                arg = arg + "4";
                enterPressed = false;
                break;
            case "five":
                arg = arg + "5";
                enterPressed = false;
                break;
            case "six":
                arg = arg + "6";
                enterPressed = false;
                break;
            case "seven":
                arg = arg + "7";
                enterPressed = false;
                break;
            case "eight":
                arg = arg + "8";
                enterPressed = false;
                break;
            case "nine":
                arg = arg + "9";
                enterPressed = false;
                break;
            case "add":
                arg = arg + "+";
                enterPressed = false;
                break;
            case "sub":
                arg = arg + "-";
                enterPressed = false;
                break;
            case "mult":
                arg = arg + "*";
                enterPressed = false;
                break;
            case "div":
                arg = arg + "/";
                enterPressed = false;
                break;
            case "parOne":
                arg = arg + "(";
                enterPressed = false;
                break;
            case "parTwo":
                arg = arg + ")";
                enterPressed = false;
                break;
            case "expo":
                arg = arg + "^";
                enterPressed = false;
                break;
            case "mod":
                arg = arg + "%";
                enterPressed = false;
                break;
            case "c":
                all.clear();
                arg = "";
                enterPressed = false;
                break;
            case "ce":
                try {
                    enterPressed = false;
                    //TODO this is still a hot mess but it works (?)
                    ArrayList<Integer> lastIndex = (ArrayList<Integer>) all.get(all.size() - 1).chars().map(Character::getNumericValue).boxed().collect(Collectors.toList());
                    //TODO if arg.length() != 1, run the loop?
                    if (!all.get(all.size() - 1).equals("-") && !all.get(all.size() - 1).equals("+") && !all.get(all.size() - 1).equals("*") && !all.get(all.size() - 1).equals("/") && !all.get(all.size() - 1).equals("^") && !all.get(all.size() - 1).equals("%") && !all.get(all.size() - 1).equals("(") && !all.get(all.size() - 1).equals(")")) {
                        if (all.size() != 1) {
                            String string = "";
                            for (int i = 0; i <= lastIndex.size() - 2; i++) {
                                string = string + lastIndex.get(i);
                            }
                            all.remove(all.size() - 1);
                            all.add(string);
                            arg = removeLastChar(arg);
                        } else {
                            if (arg.length() != 1) {
                                arg = removeLastChar(arg);
                                String string = "";
                                for (int i = 0; i <= lastIndex.size() - 2; i++) {
                                    string = string + lastIndex.get(i);
                                }
                                all.clear();
                                all.add(string);
                            } else {
                                all.clear();
                                arg = "";
                            }
                        }
                    } else {
                        //if the last index is a sign
                        all.remove(all.size() - 1);
                        arg = removeLastChar(arg);
                    }
                } catch (Exception a) {

                }
                break;
            case "enter":
                enterPressed = true;
                ArrayList<String> sorter = Calculator.sorter(all);
                if (!Calculator.doMath(sorter).equals("Error: Invalid Problem (Try Again)")) {
                    text.setText(Calculator.doMath(sorter));
                } else {
                    text.setText("Error: Invalid Problem (Try Again)");
                }
                break;
            default:
                arg = "How did this even happen";
        }
        if (!enterPressed) {
            text.setText(arg);
        }
        all.clear();
        for (int i=0; i<=arg.length()-1;i++) {
            char[] tempArg = arg.toCharArray();
            all.add(String.valueOf(tempArg[i]));
            all = allFormatter(all);
        }
        calcFrame.add(text);
    }
    public static String removeLastChar(String s) {
        return (s == null || s.length() == 0)
                ? null
                : (s.substring(0, s.length() - 1));
    }
    public static ArrayList<String> allFormatter(ArrayList<String> all) {
        for (int i=1;i<=all.size()-1;i++) {
            if(all.size() != 1) {
                if ((!all.get(i - 1).equals("-") && !all.get(i - 1).equals("*") && !all.get(i - 1).equals("/") && !all.get(i - 1).equals("+") && !all.get(i - 1).equals("^") && !all.get(i - 1).equals("%") && !all.get(i - 1).equals("(") && !all.get(i - 1).equals(")")) && (!all.get(i).equals("(") && !all.get(i).equals(")") && !all.get(i).equals("-") && !all.get(i).equals("*") && !all.get(i).equals("/") && !all.get(i).equals("+") && !all.get(i).equals("^") && !all.get(i).equals("%"))) {
                    all.add(all.get(i-1) + all.get(i));
                    all.remove(all.get(i));
                    all.remove(i - 1);
                }
            }
        }
        return all;
    }
}