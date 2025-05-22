/*
 * 5c. Develop a Swing program in Java to add the countries USA, India, Vietnam, Canada,
Denmark, France, Great Britain, Japan, Africa, Greenland, Singapore into a JList and
display the capital of the countries on console whenever the countries are selected on the list.
 */

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CountryCapitalSwingApp {
    public static void main(String[] args) {
        // Create frame
        JFrame frame = new JFrame("Country → Capital Viewer");
        frame.setSize(350, 250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        // Country list data
        String[] countries = {
            "USA", "India", "Vietnam", "Canada", "Denmark",
            "France", "Great Britain", "Japan", "Africa",
            "Greenland", "Singapore"
        };

        // Map each country to its capital
        Map<String, String> capitals = new HashMap<>();
        capitals.put("USA", "Washington, D.C.");
        capitals.put("India", "New Delhi");
        capitals.put("Vietnam", "Hanoi");
        capitals.put("Canada", "Ottawa");
        capitals.put("Denmark", "Copenhagen");
        capitals.put("France", "Paris");
        capitals.put("Great Britain", "London");
        capitals.put("Japan", "Tokyo");
        capitals.put("Africa", "Pretoria (executive)");
        capitals.put("Greenland", "Nuuk");
        capitals.put("Singapore", "Singapore");

        // Create JList and wrap in scroll pane
        JList<String> countryJList = new JList<>(countries);
        countryJList.setVisibleRowCount(6);
        countryJList.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        JScrollPane scrollPane = new JScrollPane(countryJList);

        // Add listener to print capitals on selection
        countryJList.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                // Only act when selection is final
                if (!e.getValueIsAdjusting()) {
                    List<String> selected = countryJList.getSelectedValuesList();
                    System.out.println("---- Selected Capitals ----");
                    if (selected.isEmpty()) {
                        System.out.println("(none)");
                    } else {
                        for (String country : selected) {
                            String capital = capitals.get(country);
                            System.out.printf("%s → %s%n", country, capital);
                        }
                    }
                    System.out.println("---------------------------\n");
                }
            }
        });

        // Add to frame and show
        frame.add(scrollPane);
        frame.setVisible(true);
    }
}
