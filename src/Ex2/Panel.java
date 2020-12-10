package Ex2;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Panel extends JFrame {
    public Panel(){
        JFrame panel = new JFrame("Панель");
        panel.setLayout(null);
        panel.setSize(600,600);
        panel.setVisible(true);
        panel.setLocationRelativeTo(null);
        JButton center = new JButton("Center");
        center.setBounds(230,180,100,100);
        panel.add(center);
        JButton north = new JButton("North");
        north.setBounds(160,110,240,70);
        panel.add(north);
        JButton south = new JButton("South");
        south.setBounds(160,280,240,70);
        panel.add(south);
        JButton east = new JButton("East");
        east.setBounds(330,180,70,100);
        panel.add(east);
        JButton west = new JButton("West");
        west.setBounds(160,180,70,100);
        panel.add(west);

        ActionListener actionListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                JOptionPane.showMessageDialog(panel, "Добро пожаловать в САО");
            }
        };
        north.addActionListener(actionListener);
        ActionListener actionListener2 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                JOptionPane.showMessageDialog(panel, "Добро пожаловать в ЗАО");
            }
        };
        west.addActionListener(actionListener2);
        ActionListener actionListener3 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                JOptionPane.showMessageDialog(panel, "Добро пожаловать в ЦАО");
            }
        };
        center.addActionListener(actionListener3);
        ActionListener actionListener4 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                JOptionPane.showMessageDialog(panel, "Добро пожаловать в СВАО");
            }
        };
        east.addActionListener(actionListener4);
        ActionListener actionListener5 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                JOptionPane.showMessageDialog(panel, "Добро пожаловать в ЮЗАО");
            }
        };
        south.addActionListener(actionListener5);
    }
}
