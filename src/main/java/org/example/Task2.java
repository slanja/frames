package org.example;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

public class Task2 extends JFrame {
    private JPanel frame;
    private JTextField input;
    private JComboBox sortingMetod;
    private JLabel sumLabel;
    private JLabel minLabel;
    private JLabel maxLabel;
    private JLabel sortedLabel;
    private JLabel averageLabel;
    private JButton submit;

    public Task2() {
        initComponents();


        submit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String[] text = input.getText().split(" ");
                int[] numbers = new int[text.length];

                double sum = 0;

                for (int i = 0; i < text.length; i++) {
                    numbers[i] = Integer.parseInt(text[i]);

                    sum += Integer.parseInt(text[i]);
                }

                sumLabel.setText(String.valueOf(sum));
                minLabel.setText(String.valueOf(Arrays.stream(numbers).min()));
                maxLabel.setText(String.valueOf(Arrays.stream(numbers).max()));
                averageLabel.setText(String.valueOf(sum/numbers.length));

                if (sortingMetod.getSelectedItem() == "neřadit") sortedLabel.setText(Arrays.toString(numbers));else if (sortingMetod.getSelectedItem() == "od nejmenšího po největší") {
                    Arrays.sort(numbers);
                    sortedLabel.setText(Arrays.toString(numbers));
                }

                else if (sortingMetod.getSelectedItem() == "od největšího po nejmenší") {
                    Arrays.sort(numbers);

                    for (int i = numbers.length; i > 0; i--) {

                    }
                }

                else if (sortingMetod.getSelectedItem() == "od nejmenšího po největší") {
                    Arrays.sort(numbers);
                    sortedLabel.setText(Arrays.toString(numbers));
                }


            }
        });
    }

    private void initComponents() {
        setContentPane(frame);
        setTitle("z malého VELKÉ APP");
        setSize(300, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Task2();
    }
}