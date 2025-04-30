package hust.soict.dsai.aims.screen.manager;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddBookToStoreScreen extends AddItemToStoreScreen {
    private JButton addButton;

    public AddBookToStoreScreen() {
        super("Add Book");
        addButton = new JButton("Add Book");
        add(addButton, BorderLayout.SOUTH);
        addEventListeners();
    }

    @Override
    public void addEventListeners() {
        addButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String title = titleField.getText();
                String category = categoryField.getText();
                float cost = Float.parseFloat(costField.getText());
                // Logic thêm Book vào Store
                JOptionPane.showMessageDialog(null, "Book added: " + title);
            }
        });
    }
}
