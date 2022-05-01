package general;

import javax.swing.*;
import java.awt.event.*;

public class XorVernam {

    static char[] c = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's',
            't', 'u', 'v', 'w', 'x', 'y', 'z', 'A', 'B', 'C', 'D', 'E', 'F' };

    public static void main(String[] args) {

        // Frame
        JFrame f = new JFrame("Vernam");

        // Text Fields
        JTextField encrypt = new JTextField();
        JTextField decrypt = new JTextField();
        JTextField key = new JTextField();

        // Labels
        JLabel e = new JLabel("Enter Plain Text  :");
        JLabel d = new JLabel("Enter Cipher Text :");
        JLabel k = new JLabel("Enter Key         :");

        // Buttons
        JButton b1 = new JButton("Encrypt");
        JButton b2 = new JButton("Decrypt");

        // Sizes
        f.setSize(450, 450);
        e.setBounds(20, 20, 150, 30);
        encrypt.setBounds(160, 20, 150, 30);
        d.setBounds(20, 300, 150, 30);
        decrypt.setBounds(160, 300, 150, 30);
        b1.setBounds(160, 70, 100, 30);
        b2.setBounds(160, 350, 100, 30);
        k.setBounds(20, 160, 150, 30);
        key.setBounds(160, 160, 150, 30);

        // Adding Elements to Frame
        f.add(encrypt);
        f.add(decrypt);
        f.add(key);
        f.add(e);
        f.add(d);
        f.add(k);
        f.add(b1);
        f.add(b2);

        // Action Listeners

        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String temp = encrypt.getText();
                String ki = key.getText();
                String ans = "";

                for (int i = 0; i < temp.length(); i++) {
                    ans += c[(temp.charAt(i) - 97) ^ (ki.charAt(i) - 97)];
                }

                decrypt.setText(ans);
            }
        });

        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String temp = decrypt.getText();
                String ki = key.getText();
                String ans = "";

                for (int i = 0; i < temp.length(); i++) 
                {
                    if (temp.charAt(i) - 97 >= 0)
                        ans += c[(temp.charAt(i) - 97) ^ (ki.charAt(i) - 97)];
                    else
                        ans += c[(temp.charAt(i) - 65 + 26) ^ (ki.charAt(i) - 97)];
                }

                encrypt.setText(ans);
            }
        });

        // Layout and Close operations
        f.setLayout(null);
        f.setVisible(true);

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}