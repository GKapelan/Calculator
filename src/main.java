
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class main {
    public static void main(String[] args) {
        new Calculator().setVisible(true);
    }
}

class Calculator extends JFrame {

    private static JTextField textField;

    static double a = 0;
    static double b = 0;
    static char  eq = (char) 0;

    static final int MIN_BUTTON_WIDTH  = 42;
    static final int PREF_BUTTON_WIDTH = 42;
    static final int MAX_BUTTON_WIDTH  = 42;

    static final int MIN_BUTTON_HEIGTH  = 26;
    static final int PREF_BUTTON_HEIGTH = 26;
    static final int MAX_BUTTON_HEIGTH  = 26;

    private void printMessages(String e) {
        JOptionPane.showMessageDialog(null, e, "ERROR", JOptionPane.ERROR_MESSAGE);
    }

    private void clearTextField(StringBuilder str) {
        if (str.length() > 0) {
            textField.setText(str.delete(str.length() - 1, str.length()).toString());
        }
    }

    Calculator() {

        Focus    f = new Focus();
        Equation e = new Equation();
        KeyPressed k = new KeyPressed();

        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension dim = toolkit.getScreenSize();
        setBounds(dim.width / 2 - 250,dim.height / 2 - 150,100,300);

        textField = new JFormattedTextField();
        textField.setHorizontalAlignment(JFormattedTextField.RIGHT);
        textField.setPreferredSize(new Dimension(186, 20));
        textField.addFocusListener(f);
        textField.addKeyListener(k);

        JButton eqButton = new JButton("=");
        JButton dotButton = new JButton(".");
        JButton clearButton = new JButton("C");
        JButton eraseButton = new JButton("E");
        JButton summButton = new JButton("+");
        JButton subtrButton = new JButton("-");
        JButton multiButton = new JButton("*");
        JButton divButton = new JButton("/");
        JButton ButtonZero = new JButton("0");
        JButton ButtonOne = new JButton("1");
        JButton ButtonTwo = new JButton("2");
        JButton ButtonThree = new JButton("3");
        JButton ButtonFour = new JButton("4");
        JButton ButtonFive = new JButton("5");
        JButton ButtonSix = new JButton("6");
        JButton ButtonSeven = new JButton("7");
        JButton ButtonEigth = new JButton("8");
        JButton ButtonNine = new JButton("9");
        JButton powButton = new JButton("^");

        eqButton.addKeyListener(k);
        summButton.addKeyListener(k);
        subtrButton.addKeyListener(k);
        multiButton.addKeyListener(k);
        divButton.addKeyListener(k);
        clearButton.addKeyListener(k);

        eraseButton.addActionListener(e);
        clearButton.addActionListener(e);
        dotButton.addActionListener(e);
        eqButton.addActionListener(e);
        powButton.addActionListener(e);
        summButton.addActionListener(e);
        subtrButton.addActionListener(e);
        multiButton.addActionListener(e);
        divButton.addActionListener(e);
        ButtonZero.addActionListener(e);
        ButtonOne.addActionListener(e);
        ButtonTwo.addActionListener(e);
        ButtonThree.addActionListener(e);
        ButtonFour.addActionListener(e);
        ButtonFive.addActionListener(e);
        ButtonSix.addActionListener(e);
        ButtonSeven.addActionListener(e);
        ButtonEigth.addActionListener(e);
        ButtonNine.addActionListener(e);

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);

        layout.setAutoCreateGaps(true);
        layout.setAutoCreateContainerGaps(true);

        layout.setHorizontalGroup(layout.createParallelGroup()
                .addGroup(layout.createSequentialGroup()
                        .addComponent(textField)
                )
                .addGroup(layout.createParallelGroup()
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(summButton, MIN_BUTTON_WIDTH, PREF_BUTTON_WIDTH, MAX_BUTTON_WIDTH)
                                .addComponent(subtrButton, MIN_BUTTON_WIDTH, PREF_BUTTON_WIDTH, MAX_BUTTON_WIDTH)
                                .addComponent(multiButton, MIN_BUTTON_WIDTH, PREF_BUTTON_WIDTH, MAX_BUTTON_WIDTH)
                                .addComponent(divButton, MIN_BUTTON_WIDTH, PREF_BUTTON_WIDTH, MAX_BUTTON_WIDTH)
                        )
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(ButtonSeven, MIN_BUTTON_WIDTH, PREF_BUTTON_WIDTH, MAX_BUTTON_WIDTH)
                                .addComponent(ButtonEigth, MIN_BUTTON_WIDTH, PREF_BUTTON_WIDTH, MAX_BUTTON_WIDTH)
                                .addComponent(ButtonNine, MIN_BUTTON_WIDTH, PREF_BUTTON_WIDTH, MAX_BUTTON_WIDTH)
                                .addComponent(powButton, MIN_BUTTON_WIDTH, PREF_BUTTON_WIDTH, MAX_BUTTON_WIDTH)
                        )
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(ButtonFour, MIN_BUTTON_WIDTH, PREF_BUTTON_WIDTH, MAX_BUTTON_WIDTH)
                                .addComponent(ButtonFive, MIN_BUTTON_WIDTH, PREF_BUTTON_WIDTH, MAX_BUTTON_WIDTH)
                                .addComponent(ButtonSix, MIN_BUTTON_WIDTH, PREF_BUTTON_WIDTH, MAX_BUTTON_WIDTH)
                                .addComponent(dotButton, MIN_BUTTON_WIDTH, PREF_BUTTON_WIDTH, MAX_BUTTON_WIDTH)
                        )
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(ButtonOne, MIN_BUTTON_WIDTH, PREF_BUTTON_WIDTH, MAX_BUTTON_WIDTH)
                                .addComponent(ButtonTwo, MIN_BUTTON_WIDTH, PREF_BUTTON_WIDTH, MAX_BUTTON_WIDTH)
                                .addComponent(ButtonThree, MIN_BUTTON_WIDTH, PREF_BUTTON_WIDTH, MAX_BUTTON_WIDTH)
                                .addComponent(eraseButton, MIN_BUTTON_WIDTH, PREF_BUTTON_WIDTH, MAX_BUTTON_WIDTH)
                        )
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(clearButton, MIN_BUTTON_WIDTH, PREF_BUTTON_WIDTH, MAX_BUTTON_WIDTH)
                                .addComponent(ButtonZero, MIN_BUTTON_WIDTH, PREF_BUTTON_WIDTH, MAX_BUTTON_WIDTH)
                                .addComponent(eqButton, MIN_BUTTON_WIDTH, PREF_BUTTON_WIDTH, MAX_BUTTON_WIDTH * 2 + 5)
                        )
                )
        );

        layout.linkSize(SwingConstants.HORIZONTAL, textField);

        layout.setVerticalGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup()
                        .addComponent(textField)
                )
                .addGroup(layout.createParallelGroup()
                        .addComponent(summButton, MIN_BUTTON_HEIGTH, PREF_BUTTON_HEIGTH, MAX_BUTTON_HEIGTH)
                        .addComponent(subtrButton, MIN_BUTTON_HEIGTH, PREF_BUTTON_HEIGTH, MAX_BUTTON_HEIGTH)
                        .addComponent(multiButton, MIN_BUTTON_HEIGTH, PREF_BUTTON_HEIGTH, MAX_BUTTON_HEIGTH)
                        .addComponent(divButton, MIN_BUTTON_HEIGTH, PREF_BUTTON_HEIGTH, MAX_BUTTON_HEIGTH)
                )
                .addGroup(layout.createParallelGroup()
                        .addComponent(ButtonSeven, MIN_BUTTON_HEIGTH, PREF_BUTTON_HEIGTH, MAX_BUTTON_HEIGTH)
                        .addComponent(ButtonEigth, MIN_BUTTON_HEIGTH, PREF_BUTTON_HEIGTH, MAX_BUTTON_HEIGTH)
                        .addComponent(ButtonNine, MIN_BUTTON_HEIGTH, PREF_BUTTON_HEIGTH, MAX_BUTTON_HEIGTH)
                        .addComponent(powButton, MIN_BUTTON_HEIGTH, PREF_BUTTON_HEIGTH, MAX_BUTTON_HEIGTH)
                )
                .addGroup(layout.createParallelGroup()
                        .addComponent(ButtonFour, MIN_BUTTON_HEIGTH, PREF_BUTTON_HEIGTH, MAX_BUTTON_HEIGTH)
                        .addComponent(ButtonFive, MIN_BUTTON_HEIGTH, PREF_BUTTON_HEIGTH, MAX_BUTTON_HEIGTH)
                        .addComponent(ButtonSix, MIN_BUTTON_HEIGTH, PREF_BUTTON_HEIGTH, MAX_BUTTON_HEIGTH)
                        .addComponent(dotButton, MIN_BUTTON_HEIGTH, PREF_BUTTON_HEIGTH, MAX_BUTTON_HEIGTH)
                )
                .addGroup(layout.createParallelGroup()
                        .addComponent(ButtonOne, MIN_BUTTON_HEIGTH, PREF_BUTTON_HEIGTH, MAX_BUTTON_HEIGTH)
                        .addComponent(ButtonTwo, MIN_BUTTON_HEIGTH, PREF_BUTTON_HEIGTH, MAX_BUTTON_HEIGTH)
                        .addComponent(ButtonThree, MIN_BUTTON_HEIGTH, PREF_BUTTON_HEIGTH, MAX_BUTTON_HEIGTH)
                        .addComponent(eraseButton, MIN_BUTTON_HEIGTH, PREF_BUTTON_HEIGTH, MAX_BUTTON_HEIGTH)

                )
                .addGroup(layout.createParallelGroup()
                        .addComponent(clearButton, MIN_BUTTON_HEIGTH, PREF_BUTTON_HEIGTH, MAX_BUTTON_HEIGTH)
                        .addComponent(ButtonZero, MIN_BUTTON_HEIGTH, PREF_BUTTON_HEIGTH, MAX_BUTTON_HEIGTH)
                        .addComponent(eqButton, MIN_BUTTON_HEIGTH, PREF_BUTTON_HEIGTH, MAX_BUTTON_HEIGTH)

                )
        );

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Calculation");
        pack();
        setResizable(false);
    }

    class KeyPressed implements KeyListener{

        @Override
        public void keyTyped(KeyEvent keyEvent) {

        }

        @Override
        public void keyPressed(KeyEvent keyEvent) {

            StringBuilder str = new StringBuilder(textField.getText());
            int l = str.length();
            char c = keyEvent.getKeyChar();

            try {

                if (keyEvent.getKeyCode() == KeyEvent.VK_DELETE || keyEvent.getKeyCode() == KeyEvent.VK_BACK_SPACE) {
                    clearTextField(str);
                }

                if (keyEvent.getKeyChar() >= '0' && keyEvent.getKeyChar() <= '9' || keyEvent.getKeyChar() == '.') {
                    textField.setEditable(true);
                } else {

                    textField.setEditable(false);

                    if (c == '+' || c == '-' || c == '*' || c == '/' || c == '^') {
                        if (str.length() > 0) {
                            a = Double.parseDouble(str.toString());
                            eq = c;
                            textField.setText("");
                        }
                    }

                    if (c == '\n') {
                        if (str.length() > 0) {
                            b = Double.parseDouble(str.toString());
                            switch (eq){
                                case '+':
                                    textField.setText(Double.toString(a + b));
                                    break;
                                case '-':
                                    textField.setText(Double.toString(a - b));
                                    break;
                                case '*':
                                    textField.setText(Double.toString(a * b));
                                    break;
                                case '/':
                                    textField.setText(Double.toString(a / b));
                                    break;
                                case '^':
                                    textField.setText(Double.toString(Math.pow(a,b)));
                                    break;
                            }
                        }
                    }
                }
            } catch (Exception e) {
                printMessages(e.getMessage());
            }
        }

        @Override
        public void keyReleased(KeyEvent keyEvent) {

        }
    }

    class Equation implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent ev) {

            StringBuilder str = new StringBuilder(textField.getText());
            String s = ev.getActionCommand();

            double res;

            try {
                if (s.charAt(0) >= '0' && s.charAt(0) <= '9' || s.charAt(0) == '.') {
                    textField.setText(str.append(s).toString());
                }

                if (s.charAt(0) == 'C') {
                    clearTextField(str);
                }

                if (s.charAt(0) == 'E') {
                    textField.setText("");
                    a  = 0;
                    b  = 0;
                    eq = (char) 0;
                }

                if (s.charAt(0) == '+' || s.charAt(0) == '-' || s.charAt(0) == '*' || s.charAt(0) == '/' || s.charAt(0) == '^') {
                    if (str.length() > 0) {
                        a = Double.parseDouble(str.toString());
                        eq = s.charAt(0);
                        textField.setText("");
                    }
                }

                if (s.charAt(0) == '=') {
                    if (str.length() > 0) {
                        b = Double.parseDouble(str.toString());
                        switch (eq){
                            case '+':
                                textField.setText(Double.toString(a + b));
                                break;
                            case '-':
                                textField.setText(Double.toString(a - b));
                                break;
                            case '*':
                                textField.setText(Double.toString(a * b));
                                break;
                            case '/':
                                textField.setText(Double.toString(a / b));
                                break;
                            case '^':
                                textField.setText(Double.toString(Math.pow(a,b)));
                                break;
                        }
                    }
                }
            } catch (Exception e) {
                printMessages(e.getMessage());
            }
        }
    }

    class Focus implements FocusListener {

        @Override
        public void focusGained(FocusEvent focusEvent) { textField.requestFocus(); }

        @Override
        public void focusLost(FocusEvent focusEvent) { textField.requestFocus(); }
    }
}