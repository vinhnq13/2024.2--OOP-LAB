package hust.soict.dsai.aims.screen.manager;

import javax.swing.*;
import java.awt.*;

public abstract class AddItemToStoreScreen extends JFrame {
    protected JTextField titleField;
    protected JTextField categoryField;
    protected JTextField costField;

    public AddItemToStoreScreen(String title) {
        super(title);
        setLayout(new BorderLayout());

        JPanel inputPanel = new JPanel(new GridLayout(3, 2));
        inputPanel.add(new JLabel("Title:"));
        titleField = new JTextField(30);
        inputPanel.add(titleField);

        inputPanel.add(new JLabel("Category:"));
        categoryField = new JTextField(30);
        inputPanel.add(categoryField);

        inputPanel.add(new JLabel("Cost:"));
        costField = new JTextField(30);
        inputPanel.add(costField);

        add(inputPanel, BorderLayout.CENTER);
        setSize(400, 200);
        setVisible(true);
    }

    public abstract void addEventListeners();
}