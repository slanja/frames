package org.example;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.Random;

public class Task3  extends JFrame{
    private JPanel frame;
    private JComboBox optionComboBox;
    private JButton startButton;
    private JButton submitButton;
    private JTextField inputField;

    Random rand = new Random();

    String[] guesses = new String[3];

    public int randomNumber;

    public int guessesIndex = 1;

    public Task3() {
        initComponents();

        startButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                randomNumber = rand.nextInt(0, Integer.parseInt(String.valueOf(optionComboBox) + 1));
            }
        });

        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if (Integer.parseInt(String.valueOf(inputField.getText())) < randomNumber) {
                    guesses[guessesIndex] = inputField.getText();
                    guessesIndex++;
                }
                if (Integer.parseInt(String.valueOf(inputField.getText())) > randomNumber) {
                    guesses[guessesIndex] = inputField.getText();
                    guessesIndex++;
                }
                if (Integer.parseInt(String.valueOf(inputField.getText())) == randomNumber) {
                    guesses[guessesIndex] = inputField.getText();
                    JOptionPane.showMessageDialog(null, "Uhodl jsi!\nČíslo bylo " + randomNumber + " zabralo ti to pouze " + guessesIndex + "pokusů\nTady jsou tvé tipy: " + Arrays.toString(guesses));
                }
            }
        });
    }

    private void initComponents() {
        setContentPane(frame);
        setTitle("APP");
        setSize(300, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Task3();
    }
}
