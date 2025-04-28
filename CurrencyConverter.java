package com.example;

import java.awt.*;
import java.util.*;
import javax.swing.*;

public class CurrencyConverter {
    public static void main(String[] args) {
        try {
            // Set a modern look and feel
            UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Conversion rates
        Map<String, Double> conversionRates = new HashMap<>();
        conversionRates.put("---Select Currency---", 0.00);
        conversionRates.put("United States Dollar", 1.0);
        conversionRates.put("Euro", 0.91);
        conversionRates.put("Japanese Yen", 144.57);
        conversionRates.put("British Pound", 0.78);
        conversionRates.put("Swiss Franc", 0.85);
        // Add more currencies...

        String[] currencies = conversionRates.keySet().toArray(new String[0]);
        Arrays.sort(currencies);

        // Components
        JComboBox<String> fromCurrency = new JComboBox<>(currencies);
        JComboBox<String> toCurrency = new JComboBox<>(currencies);
        JTextField amountField = new JTextField(10);
        JButton swapButton = new JButton("🔄 Swap");
        JButton clearButton = new JButton("🧹 Clear");
        JButton transactionHistory = new JButton("📜 History");
        DefaultListModel<String> historyModel = new DefaultListModel<>();

        // Panel with GridBagLayout
        JPanel panel = new JPanel(new GridBagLayout());
        panel.setBackground(new Color(30, 30, 30)); // Dark background
        panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(8, 8, 8, 8);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        // Title
        JLabel title = new JLabel("🌎 Currency Converter");
        title.setFont(new Font("Arial Black", Font.BOLD, 24));
        title.setForeground(Color.CYAN);
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 2;
        panel.add(title, gbc);

        // From currency
        gbc.gridy++;
        gbc.gridwidth = 1;
        panel.add(new JLabel("From:"), gbc);
        gbc.gridx = 1;
        panel.add(fromCurrency, gbc);

        // To currency
        gbc.gridx = 0;
        gbc.gridy++;
        panel.add(new JLabel("To:"), gbc);
        gbc.gridx = 1;
        panel.add(toCurrency, gbc);

        // Amount
        gbc.gridx = 0;
        gbc.gridy++;
        panel.add(new JLabel("Amount:"), gbc);
        gbc.gridx = 1;
        panel.add(amountField, gbc);

        // Swap and Clear Buttons
        gbc.gridx = 0;
        gbc.gridy++;
        panel.add(swapButton, gbc);
        gbc.gridx = 1;
        panel.add(clearButton, gbc);

        // Transaction History Button
        gbc.gridx = 0;
        gbc.gridy++;
        gbc.gridwidth = 2;
        panel.add(transactionHistory, gbc);

        // Button Actions
        swapButton.addActionListener(e -> {
            Object from = fromCurrency.getSelectedItem();
            Object to = toCurrency.getSelectedItem();
            fromCurrency.setSelectedItem(to);
            toCurrency.setSelectedItem(from);
        });

        clearButton.addActionListener(e -> {
            int result = JOptionPane.showConfirmDialog(
                null,
                "Clear all selections?",
                "Confirm",
                JOptionPane.YES_NO_OPTION
            );
            if (result == JOptionPane.YES_OPTION) {
                fromCurrency.setSelectedItem("---Select Currency---");
                toCurrency.setSelectedItem("---Select Currency---");
                amountField.setText("");
            }
        });

        transactionHistory.addActionListener(e -> {
            if (historyModel.isEmpty()) {
                JOptionPane.showMessageDialog(null, "No transactions yet.", "History", JOptionPane.INFORMATION_MESSAGE);
            } else {
                StringBuilder historyText = new StringBuilder();
                for (int i = 0; i < historyModel.size(); i++) {
                    historyText.append(historyModel.getElementAt(i)).append("\n");
                }
                JOptionPane.showMessageDialog(null, historyText.toString(), "Transaction History", JOptionPane.INFORMATION_MESSAGE);
            }
        });

        // Main program loop
        boolean running = true;
        while (running) {
            int option = JOptionPane.showConfirmDialog(null, panel, "Currency Converter", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);

            if (option == JOptionPane.CANCEL_OPTION) {
                int exit = JOptionPane.showConfirmDialog(null, "Exit the converter?", "Exit", JOptionPane.YES_NO_OPTION);
                if (exit == JOptionPane.YES_OPTION) {
                    JOptionPane.showMessageDialog(null, "Thanks for using the converter!");
                    break;
                }
            }

            if (option == JOptionPane.OK_OPTION) {
                try {
                    String from = (String) fromCurrency.getSelectedItem();
                    String to = (String) toCurrency.getSelectedItem();
                    double amount = Double.parseDouble(amountField.getText());

                    double fromRate = conversionRates.getOrDefault(from, 0.0);
                    double toRate = conversionRates.getOrDefault(to, 0.0);

                    if (fromRate == 0 || toRate == 0) {
                        JOptionPane.showMessageDialog(null, "Select valid currencies.", "Error", JOptionPane.ERROR_MESSAGE);
                    } else {
                        double converted = amount * (toRate / fromRate);
                        String result = String.format("%.2f %s = %.2f %s", amount, from, converted, to);
                        JOptionPane.showMessageDialog(null, result, "Result", JOptionPane.INFORMATION_MESSAGE);
                        historyModel.addElement(result);
                    }
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Enter a valid number.", "Input Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
    }
}
