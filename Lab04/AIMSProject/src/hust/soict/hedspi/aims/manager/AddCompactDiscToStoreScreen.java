package hust.soict.dsai.aims.screen.manager;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddCompactDiscToStoreScreen extends AddItemToStoreScreen {
    private JButton addButton;

    public AddCompactDiscToStoreScreen() {
        super("Add CD");
        addButton = new JButton("Add CD");
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
                // Logic thêm CD vào Store
                JOptionPane.showMessageDialog(null, "CD added: " + title);
            }
        });
    }
}
