package lesson4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class ChatNew extends JFrame {
    public JLabel sendLabel;
    public JPanel sendPanel,chatPanel;
    private JTextField chatField,displayField;
    private JList<String> list;
    private DefaultListModel<String> listModel;
    private JButton sender;

    public ChatNew() throws HeadlessException {

        sendPanel = new JPanel(new BorderLayout());

        sender = new JButton("Send");
        chatField = new JTextField();
        sendLabel = new JLabel("Write: ");

        sendPanel.add(chatField,BorderLayout.CENTER);
        sendPanel.add(sender,BorderLayout.EAST);
        sendPanel.add(sendLabel,BorderLayout.WEST);

        chatPanel = new JPanel(new BorderLayout());

        listModel = new DefaultListModel<>();
        list = new JList<>(listModel);

        chatPanel.add(list,BorderLayout.CENTER);




        Container chat = getContentPane();
        chat.setLayout(new BorderLayout());

        chat.add(sendPanel,BorderLayout.SOUTH);
        chat.add(chatPanel,BorderLayout.CENTER);

        setTitle("MyChat");
        setSize(800,800);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        sender.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {

                listModel.add(0, chatField.getText());

            }
        });

        chatField.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {

                listModel.add(0, chatField.getText());

            }
        });

    }
}
