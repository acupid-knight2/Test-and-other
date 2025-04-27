package com.example;

import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class CurrencyConverter {
    public static void main(String[] args) {
        // Hash Map (Dictionary) used to store key value pairs
        Map<String, Double> conversionRates = new HashMap<>();
        conversionRates.put("---Select Currency---", 0.00); // Blank
        conversionRates.put("Albanian Lek", 89.24); // Albanian Lek
        conversionRates.put("United States Dollar", 1.0);    // Base
        conversionRates.put("Euro", 0.91);   // Euro /done
        conversionRates.put("Russian Ruble", 85.8);   // Russian Ruble /done
        conversionRates.put("Swiss Franc", 0.85);   // Swiss Franc /done
        conversionRates.put("Danish Krone", 6.83);   // Danish Krone /done
        conversionRates.put("Norwegian Kron", 10.95);  // Norwegian Krone /done
        conversionRates.put("Swedish Krona", 9.9);  // Swedish Krona /done
        conversionRates.put("Ukrainian Hryvnia", 41.0);   // Ukrainian Hryvnia /done
        conversionRates.put("Azerbaijani Manat", 1.7);    // Azerbaijani Manat /done
        conversionRates.put("Turkish Lir", 38.01);  // Turkish Lira /done
        conversionRates.put("Czech Koruna", 23.00);  // Czech Koruna /done
        conversionRates.put("Georgian Lari", 2.75);   // Georgian Lari /done
        conversionRates.put("Armenian Dram", 391.40); // Armenian Dram /2diff
        conversionRates.put("Malaysian Ringgit", 4.49);   // Malaysian Ringgit / done
        conversionRates.put("Hong Kong Dollar", 7.77);   // Hong Kong Dollar /done
        conversionRates.put("British Pound", 0.78);   // British Pound /done
        conversionRates.put("Australian Dollar", 1.67);   // Australian Dollar /done
        conversionRates.put("Fijian Dollar", 2.34);   // Fijian Dollar 2/diff
        conversionRates.put("Papua New Guinea Kina", 4.10);   // Papua New Guinea Kina 2/diff
        conversionRates.put("Samoan Tala", 2.84);   // Samoan Tala 2/diff
        conversionRates.put("Solomon Islands Dollar", 8.32);   // Solomon Islands Dollar 2/diff
        conversionRates.put("Tongan Paʻanga", 2.37);   // Tongan Paʻanga /done
        conversionRates.put("Vanuatu Vatu", 126.0);  // Vanuatu Vatu
        conversionRates.put("Bhutanese Ngultrum", 86.09);  // Bhutanese Ngultrum
        conversionRates.put("Maldives Rufiyaa", 15.4);   // Maldives Rufiyaa
        conversionRates.put("Sri Lankan Rupee", 295.0);  // Sri Lankan Rupee
        conversionRates.put("Nepali Rupee", 130.0);  // Nepali Rupee
        conversionRates.put("Bangladeshi Taka", 108.0);  // Bangladeshi Taka
        conversionRates.put("Myanmar Kyat", 2100.0); // Myanmar Kyat
        conversionRates.put("Vietnamese Dong", 23500.0);// Vietnamese Dong
        conversionRates.put("Thai Baht", 34.0);   // Thai Baht
        conversionRates.put("Indonesian Rupiah", 15000.0);// Indonesian Rupiah
        conversionRates.put("Singapore Dollar", 1.3);    // Singapore Dollar
        conversionRates.put("Philippine Peso", 56.0);   // Philippine Peso
        conversionRates.put("Chinese Yuan", 6.9);    // Chinese Yuan
        conversionRates.put("Japanese Yen", 144.57);  // Japanese Yen
        conversionRates.put("South Korean Won", 1350.0); // South Korean Won
        conversionRates.put("Aruban Florin", 1.8025); // Aruban Florin
        conversionRates.put("Belarusian Ruble", 3.2740); // Belarusian Ruble
        conversionRates.put("Bosnia-Herzegovina Convertible Mark", 1.7660); // Bosnia-Herzegovina Convertible Mark
        conversionRates.put("Brunei Dollar", 1.3365); // Brunei Dollar
        conversionRates.put("Bulgarian Lev", 1.7449); // Bulgarian Lev
        conversionRates.put("CFP Franc", 107.6859); // CFP Franc - French Polynesia's Currency
        conversionRates.put("Cambodian Riel", 4006.357); // Cambodian Riel
        conversionRates.put("Serbian Dinar", 104.39); // Serbia Dinar
        conversionRates.put("Romanian Leu", 4.44); // Romanian Leu
        conversionRates.put("Polish Złoty", 3.79); // Polish Złoty
        conversionRates.put("New Zealand Dollar", 1.74); // New Zealand Dollar
        conversionRates.put("New Taiwan dollar", 32.79); // Polish Złoty
        conversionRates.put("Moldovan Leu", 16.97); //Moldovan Leu
        conversionRates.put("Macedonian Denar", 53.81); // Macedonian Denar
        conversionRates.put("Macanese Pataca", 7.99); // Macanese Pataca
        conversionRates.put("Laotain Kip", 21589.93); // Laotain Kip
        conversionRates.put("Kazakhstani Tenge", 21589.93); // Kyrgyzstan
        conversionRates.put("Indian Rupee", 85.19 ); // India, Bhutan
        conversionRates.put("Hungarian Forint", 355.40); // Hungary
        conversionRates.put("Georgian Lari", 2.74); //Georgia

        
        String[] currencies = conversionRates.keySet().toArray(new String[0]); // creates a list called currencies with all the currency names
        Arrays.sort(currencies); // this sorts all the values by alphabetical order

        // Components
        JComboBox<String> fromCurrency = new JComboBox<>(currencies); // creates a drop down menu with currencies
        JComboBox<String> toCurrency = new JComboBox<>(currencies); // ^^^
        JTextField amountField = new JTextField(); // allows you to input the desired amount
        JButton swapButton = new JButton("Swap"); // this allows you to swap the two currencies
        JButton clearButton = new JButton("Clear "); // this clears whatever you have selected
        JButton transactionHistory = new JButton("Transactions");  // Shows the users transaction history
        DefaultListModel<String> historyModel = new DefaultListModel<>(); // List model that does the same as above

        // Panel to hold components
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS)); // sets the layout, if y axis top to bottom and if x axis left to right

        // swap button code
        swapButton.addActionListener(new ActionListener() {
            @Override // to prevent a possible silent break or not overriding properly
            public void actionPerformed(ActionEvent e) {
                // Get selected items
                Object from = fromCurrency.getSelectedItem();
                Object to = toCurrency.getSelectedItem();
                
                // Swap the selections
                fromCurrency.setSelectedItem(to);
                toCurrency.setSelectedItem(from);
            }
        });

        // clear button code
        clearButton.addActionListener(new ActionListener() {
            @Override 
            public void actionPerformed(ActionEvent e) {
                // Dialog box that makes sure the user wants to clear what is on the screen
                int result = JOptionPane.showConfirmDialog(
                    null, 
                            "Are you sure you want to clear everything?", 
                            "Confirm Action", 
                            JOptionPane.YES_NO_OPTION
            );
                // Sets the selection to ---Select Currency or the default option
                if (result == JOptionPane.YES_OPTION) {
                    fromCurrency.setSelectedItem("---Select Currency---");
                    toCurrency.setSelectedItem("---Select Currency---");
                }
            }
        });

        // transaction button code
        transactionHistory.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // if there has been no transactions then it will display a message instead of just an empty dialog box
                if (historyModel.size() < 1) {
                    JOptionPane.showMessageDialog(null, "You have not completed any transactions yet.", "Transaction History", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    // this displays the transaction history if they have 1 or more transactions in their history
                    StringBuilder historyText = new StringBuilder(); // class in JOptionPane used to help us build these strings which eventually go on the list. 
                    for (int i = 0; i < historyModel.size(); i++) {
                        historyText.append(historyModel.getElementAt(i)).append("\n"); // adds whatever the last transaction was
                    }
                    JOptionPane.showMessageDialog(null, historyText.toString(), "Transaction History", JOptionPane.INFORMATION_MESSAGE);
                }
            }
            
        });

        // the menu screen 
        // JLabels so people are aware what they would need to input to properly use the program
        panel.add(new JLabel("Currency Converter"));
        panel.add(new JLabel("Convert from:"));
        panel.add(fromCurrency); // JComboBox
        panel.add(new JLabel("Convert to:"));
        panel.add(toCurrency); // JComboBox
        panel.add(new JLabel("Switch: "));
        panel.add(swapButton); // JButton 
        panel.add(new JLabel("Clear: "));
        panel.add(clearButton); // JButton 
        panel.add(new JLabel("Enter amount:"));
        panel.add(amountField); // JTextField
        panel.add(new JLabel("Transactions"));
        panel.add(transactionHistory); // JButton 

            
        // the while loop
        boolean stop = false;
        while (!stop) {            
            // the menu screen
            int result = JOptionPane.showConfirmDialog(null, panel, 
                    "Currency Converter Menu", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);

            // allows the user to cancel at the main menu and at the cancel screen
            if (result == JOptionPane.CANCEL_OPTION) {
                int exit = JOptionPane.showConfirmDialog(null, 
                    "Are you sure you want to leave the program?", "Currency Converter", JOptionPane.OK_OPTION, JOptionPane.PLAIN_MESSAGE);
                if (exit == JOptionPane.OK_OPTION) {
                    JOptionPane.showMessageDialog(null,"Thank you for using this program!");
                    break;
                }
            }
            // 
            if (result == JOptionPane.OK_OPTION) {
                try {
                    String from = (String) fromCurrency.getSelectedItem();
                    String to = (String) toCurrency.getSelectedItem();
                    double amount = Double.parseDouble(amountField.getText());

                    double fromRate = conversionRates.get(from);
                    double toRate = conversionRates.get(to);

                    if (fromRate == 0 || toRate == 0) {
                        JOptionPane.showMessageDialog(
                                    null,
                                    "You need to select two currencies",
                                    "Error",
                                    JOptionPane.ERROR_MESSAGE);
                    } else {
                        // Formula: amount * (toRate / fromRate)
                    double converted = amount * (toRate / fromRate);

                    JOptionPane.showMessageDialog(null,
                            String.format("%.2f %s = %.2f %s", amount, from, converted, to));
                            String logEntry = amount + " " + from + " = " + converted + " " + to;
                            historyModel.addElement(logEntry);
                    int stopChoice = JOptionPane.showConfirmDialog(null, 
                    "Would you like to run the program again?", "Currency Converter", JOptionPane.OK_OPTION, JOptionPane.PLAIN_MESSAGE);
                        if (stopChoice == JOptionPane.OK_OPTION) {
                            continue;
                        }
                        else {
                            JOptionPane.showMessageDialog(null,"Thank you for using this program!");
                            break;
                        } 
                    }
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Please enter a valid number.");
                }
            }
        }
    }
}