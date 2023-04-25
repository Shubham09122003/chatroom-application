import java.util.*;
import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.awt.event.*;
import java.text.*;
import java.net.*;
import java.io.*;

public class Server implements ActionListener {
      JFrame fs = new JFrame();
      JTextField text;
      JPanel midPanel;
      Box vertical = Box.createVerticalBox();
      DataOutputStream dout;
      JLabel back4;

      Server() {

            fs.setLayout(null);

            JPanel p1 = new JPanel();
            p1.setBackground(new Color(7, 94, 84));
            p1.setBounds(0, 0, 450, 70);
            p1.setLayout(null);
            fs.add(p1);

            ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/3.png"));
            Image i2 = i1.getImage().getScaledInstance(25, 25, Image.SCALE_SMOOTH);
            ImageIcon i3 = new ImageIcon(i2);
            JLabel back = new JLabel(i3);

            back.setBounds(5, 20, 25, 25);
            p1.add(back);

            back.addMouseListener(new MouseAdapter() {
                  public void mouseClicked(MouseEvent ae) {
                        System.exit(0);

                  }
            });

            ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("icons/goku_angel.png"));
            Image i5 = i4.getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH);
            ImageIcon i6 = new ImageIcon(i5);
            JLabel profile = new JLabel(i6);
            profile.setBounds(40, 10, 50, 50);
            p1.add(profile);

            ImageIcon i7 = new ImageIcon(ClassLoader.getSystemResource("icons/video.png"));
            Image i8 = i7.getImage().getScaledInstance(30, 30, Image.SCALE_SMOOTH);
            ImageIcon i9 = new ImageIcon(i8);
            JLabel video = new JLabel(i9);
            video.setBounds(300, 20, 30, 30);
            p1.add(video);

            ImageIcon i10 = new ImageIcon(ClassLoader.getSystemResource("icons/phone.png"));
            Image i11 = i10.getImage().getScaledInstance(35, 30, Image.SCALE_SMOOTH);
            ImageIcon i12 = new ImageIcon(i11);
            JLabel phone = new JLabel(i12);
            phone.setBounds(360, 20, 35, 30);
            p1.add(phone);

            ImageIcon i13 = new ImageIcon(ClassLoader.getSystemResource("icons/3icon.png"));
            Image i14 = i13.getImage().getScaledInstance(10, 25, Image.SCALE_SMOOTH);
            ImageIcon i15 = new ImageIcon(i14);
            JLabel morevert = new JLabel(i15);
            morevert.setBounds(420, 20, 10, 25);
            p1.add(morevert);

            JLabel name = new JLabel("GOKU");
            name.setBounds(110, 15, 100, 16);
            name.setForeground(Color.WHITE);
            name.setFont(new Font("SAN_SERIF", Font.BOLD, 16));
            p1.add(name);

            JLabel status = new JLabel("ACTIVE NOW");
            status.setBounds(110, 35, 100, 16);
            status.setForeground(Color.WHITE);
            status.setFont(new Font("SAN_SERIF", Font.BOLD, 12));
            p1.add(status);

            ImageIcon back1 = new ImageIcon(ClassLoader.getSystemResource("icons/wallapper1.jpg"));
            Image back2 = back1.getImage().getScaledInstance(425, 543, Image.SCALE_SMOOTH);
            ImageIcon back3 = new ImageIcon(back2);
            back4 = new JLabel(back3);

            midPanel = new JPanel();
            midPanel.setBounds(5, 75, 425, 543);
            midPanel.add(back4);
            fs.add(midPanel);

            text = new JTextField();
            text.setBounds(5, 622, 300, 38);
            text.setFont(new Font("SAN_SERIF", Font.PLAIN, 16));
            fs.add(text);

            JButton send = new JButton("SEND");
            send.setFont(new Font("SAN_SERIF", Font.PLAIN, 16));
            send.setBounds(310, 622, 120, 37);
            send.setBackground(new Color(7, 94, 84));
            send.setForeground(Color.WHITE);
            send.addActionListener(this);
            send.setFocusPainted(false);
            fs.add(send);

            fs.setSize(450, 700);
            fs.setLocation(200, 50);
            // setUndecorated(true);
            fs.getContentPane().setBackground(Color.WHITE);

            fs.setVisible(true);
      }

      public void actionPerformed(ActionEvent ae) {
            try {
                  String output = text.getText();
                  // System.out.println(output);
                  // System.out.println(output);
                  // JLabel lout=new JLabel(output);

                  JPanel pout = formatLable(output);
                  pout.setBackground(new Color(0, 0, 0, 0));
                  back4.setLayout(new BorderLayout());

                  JPanel right = new JPanel(new BorderLayout());
                  right.setBackground(new Color(0, 0, 0, 0));
                  right.add(pout, BorderLayout.LINE_END);
                  vertical.add(right);
                  vertical.add(Box.createVerticalStrut(15));

                  back4.add(vertical, BorderLayout.PAGE_START);

                  dout.writeUTF(output);
                  text.setText("");

                  fs.repaint();
                  fs.invalidate();
                  fs.validate();
            } catch (Exception e) {
                  System.out.println("actionperformed");
                  e.printStackTrace();
            }

      }

      public JPanel formatLable(String output) {
            JPanel panel = new JPanel();
            panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

            JLabel outp = new JLabel(output);
            outp.setFont(new Font("Tahoma", Font.PLAIN, 16));
            outp.setBackground(new Color(52, 235, 110));
            outp.setOpaque(true);
            outp.setBorder(new EmptyBorder(15, 15, 15, 20));
            panel.add(outp);

            Calendar cal = Calendar.getInstance();
            SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");

            JLabel time = new JLabel();
            time.setText(sdf.format(cal.getTime()));
            time.setForeground(Color.WHITE);
            panel.add(time);

            return panel;
      }

      public void calling1() {
            try {
                  ServerSocket skt = new ServerSocket(1211);
                  while (true) {
                        Socket s = skt.accept();
                        DataInputStream din = new DataInputStream(s.getInputStream());
                        dout = new DataOutputStream(s.getOutputStream());

                        while (true) {
                              String msg = din.readUTF();
                              JPanel msgPut = formatLable(msg);
                              msgPut.setBackground(new Color(0, 0, 0, 0));

                              JPanel left = new JPanel(new BorderLayout());
                              left.setBackground(new Color(0, 0, 0, 0));
                              left.add(msgPut, BorderLayout.LINE_START);

                              vertical.add(left);
                              fs.validate();
                              fs.invalidate();
                              fs.repaint();
                        }
                  }
            } catch (Exception e) {
                  System.out.println("calling");
                  e.printStackTrace();
            }
      }

      public void clear1() {
            fs.dispose();
      }

      public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
            // Server ser=new Server();
            // ser.calling();
            s.close();
      }

}