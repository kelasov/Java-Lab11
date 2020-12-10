package Ex1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Window extends JFrame{
    public int a = 0;
    public int b = 0;
    Window(){
        super("Игра-угадайка");
        Random random = new Random();
        int numb = random.nextInt(20);

        JButton check = new JButton("Проверка:");
        JButton exit = new JButton("Выход");
        JTextField jtf = new JTextField("Введите значение", 20);
        jtf.setFont(new Font("Times new roman", Font.PLAIN, 20));
        jtf.setHorizontalAlignment(JTextField.CENTER);
        jtf.setBounds(85,100,320,40);
        check.setBounds(85,160,320,40);
        exit.setBounds(85,290,320,40);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        exit.setVisible(false);
        add(check);
        add(jtf);
        add(exit);
        JTextField jtf2 = new JTextField ("Результат:",10);
        jtf2.setHorizontalAlignment(JTextField.CENTER);
        jtf2.setFont(new Font("Dialog", Font.PLAIN, 20));
        jtf2.setBounds(85,230,320,30);
        add(jtf2);
        setSize(500,500);
        setLayout(null);
        setVisible(true);
        setLocationRelativeTo(null);

        ActionListener actionListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int n = Integer.parseInt(jtf.getText());
                if (n>numb){
                    jtf2.setText("Загаданное число меньше");
                }
                else if (n<numb){
                    jtf2.setText("Загаданное число больше");
                }
                else{
                    jtf2.setText("Поздравляю! Вы угадали!");
                    exit.setVisible(true);
                    check.setVisible(false);
                    b++;
                }
                a++;
                if ((a==3)&&(b == 0)){
                    jtf2.setText("Попытки закончились, Вы проиграли");
                    jtf2.setBounds(45,230,400,60);
                    check.setVisible(false);
                    exit.setVisible(true);
                }
            }
        };
        ActionListener actionListener2 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        };
        check.addActionListener(actionListener);
        exit.addActionListener(actionListener2);
    }
}