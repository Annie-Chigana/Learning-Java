// Filename: EmojiClientGUI.java
// Written by Annie
// Written on 04/07/2025

package emojiclient;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class EmojiClient extends JFrame {
    private JTextField wordField;
    private JLabel emojiLabel;

    public EmojiClient() {
        setTitle("Emoji Fetcher");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // 🔷 Create JPanel
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 1, 10, 10));
        panel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        // 📝 Input field
        wordField = new JTextField();
        panel.add(wordField);

        // 🔘 Button to trigger API request
        JButton fetchButton = new JButton("Get Emoji");
        panel.add(fetchButton);

        // 😊 Label to show the emoji
        emojiLabel = new JLabel("Your emoji will appear here", SwingConstants.CENTER);
        emojiLabel.setFont(new Font("Segoe UI Emoji", Font.PLAIN, 32));
        panel.add(emojiLabel);

        // 🔁 Add panel to frame
        add(panel);

        // 🧠 Button action
        fetchButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String word = wordField.getText().trim();
                if (!word.isEmpty()) {
                    fetchEmoji(word);
                } else {
                    emojiLabel.setText("Please enter a word.");
                }
            }
        });

        setVisible(true);
    }

    // 🌐 Fetch emoji from API
    private void fetchEmoji(String word) {
        try {
            String apiUrl = "http://localhost:3000/emoji?word=" + word;
            HttpURLConnection con = (HttpURLConnection) new URL(apiUrl).openConnection();
            con.setRequestMethod("GET");

            int responseCode = con.getResponseCode();
            if (responseCode == 200) {
                BufferedReader in = new BufferedReader(
                        new InputStreamReader(con.getInputStream(), "UTF-8"));
                String inputLine;
                StringBuilder response = new StringBuilder();

                while ((inputLine = in.readLine()) != null) {
                    response.append(inputLine);
                }
                in.close();

                // 🔎 Extract emoji from JSON manually
                String responseText = response.toString();
                String emoji = responseText.split("\"emoji\":\"")[1].split("\"")[0];

                emojiLabel.setText(emoji);  // 🎉 Show emoji
            } else {
                emojiLabel.setText("Error: " + responseCode);
            }
        } catch (Exception ex) {
            emojiLabel.setText("⚠️ Failed to fetch emoji");
            ex.printStackTrace();
        }
    }

    // 🚀 Run GUI
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new EmojiClient());
    }
}
