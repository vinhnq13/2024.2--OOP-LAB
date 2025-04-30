package hust.soict.dsai.aims.screen.manager;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddDigitalVideoDiscToStoreScreen extends AddItemToStoreScreen {
    private JButton addButton;

    public AddDigitalVideoDiscToStoreScreen() {
        super("Add DVD");
        addButton = new JButton("Add DVD");
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
                // Logic thêm DVD vào Store
                JOptionPane.showMessageDialog(null, "DVD added: " + title);
            }
        });
    }
}

