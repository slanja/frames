package org.example;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Task1 extends JFrame {
    private JPanel frame;
    private JTextField input;
    private JButton submit;

    public Task1() {
        initComponents();

        submit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                input.setText(input.getText().toUpperCase());
            }
        });
    }

    private void initComponents() {
        setContentPane(frame);
        setTitle("z malého VELKÉ APP");
        setSize(300, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Task1();
    }
}
