package Ex3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Text extends JFrame {
    public Text(){
        JFrame text = new JFrame("Текст");

        Label color = new Label("Выбор цвета текста:");
        color.setBounds(27, 20, 150, 20);
        color.setFont(new Font("Times New Roman", Font.PLAIN, 14));
        text.add(color);

        Label font = new Label("Выбор шрифта текста:");
        font.setBounds(27, 100, 200, 15);
        font.setFont(new Font("Times New Roman",Font.PLAIN,14));
        text.add(font);

        JComboBox box1 = new JComboBox();
        box1.setEditable(true);
        box1.addItem("Blue");
        box1.addItem("Red");
        box1.addItem("Black");
        box1.setBounds(30, 40, 150, 30);
        text.add(box1);

        JComboBox box2 = new JComboBox();
        box2.setEditable(true);
        box2.addItem("Times New Roman");
        box2.addItem("MS Sans Serif");
        box2.addItem("Courier New");
        box2.setBounds(30, 120, 150, 30);
        text.add(box2);

        JTextArea text_area = new JTextArea("Текст", 10,15);
        text_area.setFont(new Font("Times New Roman",Font.PLAIN,14));
        text_area.setBounds(30,170,150,40);

        box1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if (box1.getSelectedIndex()==0)
                    text_area.setForeground(Color.BLUE);
                if (box1.getSelectedIndex()==1)
                    text_area.setForeground(Color.RED);
                if (box1.getSelectedIndex()==2)
                    text_area.setForeground(Color.BLACK);
            }
        });

        box2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if (box2.getSelectedIndex()==0)
                    text_area.setFont(new Font("Times New Roman", Font.PLAIN, 14));
                if (box2.getSelectedIndex()==1)
                    text_area.setFont(new Font("MS Sans Serif", Font.PLAIN, 14));
                if (box2.getSelectedIndex()==2)
                    text_area.setFont(new Font("Courier New", Font.PLAIN, 14));
            }
        });

        text.add(text_area);
        text.setSize(280,280);
        text.setLayout(null);
        text.setVisible(true);
        text.setLocationRelativeTo(null);
    }
}
