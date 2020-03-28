package org.example;



import org.pcap4j.core.*;


import javax.imageio.ImageIO;
import javax.script.*;
import javax.swing.*;
import javax.swing.border.Border;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;





class Panel extends JPanel{


    //labels

    // adding backgrounf image
    BufferedImage image = ImageIO.read(new File("locks.jpg"));


    Panel() throws IOException {
    }

    //
    public void paintComponent(Graphics g) {
        g.drawImage(image,0,0,null);
    }


}

class FPanel extends JPanel{


    //labels

    // adding background image
    BufferedImage im = ImageIO.read(new File("q.jpg"));


    FPanel() throws IOException {
    }

    //
    public void paintComponent(Graphics g) {
        g.drawImage(im,0,0,null);
    }


}

public class App{


///===================================MAIN GUI APPLICATION====================================================================



    public static <Jlabel> void main(final String[] args ) throws PcapNativeException, NotOpenException, IOException, ScriptException {
        // labels and buttons

        final JButton blogin = new JButton("Login");
        blogin.setBounds(700,350,80,40);
        blogin.setBackground(Color.black);
        blogin.setForeground(Color.WHITE);



















        final JTextField txuser = new JTextField(15);
        final JPasswordField pass = new JPasswordField(15);
        txuser.setBounds(600,180,300,30);
        pass.setBounds(600,280,300,30);



        final JLabel text = new JLabel("ID");
        final JLabel pal = new JLabel("password");
        text.setForeground(Color.WHITE);
        pal.setForeground(Color.WHITE);
        text.setBounds(580,180,20,20);
        pal.setBounds(540,280,100,20);



        //login backend










        // login panel

        FPanel p = new FPanel();
        p.setLayout(null);
        p.add(txuser);
        p.add(pass);
        p.add(blogin);
        p.add(text);
        p.add(pal);



        //login frame



        final JFrame login = new JFrame("HIGH SECURITY SOFTWARE");
        login.setSize(1000,900);
        login.setVisible(true);

        login.setPreferredSize(new Dimension(1000,900));
        login.setResizable(false);
        login.add(p);
        blogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String user = txuser.getText();
                String password = pass.getText();

                if (user.equals("abdullah") && password.equals("1324")) {
                    login.dispose();



                    //labels

                    //heading label
                    JLabel heading = new JLabel("REAL TIME ML INTRUSION DETECTION SYSTEM");
                    heading.setFont(new Font("Arial",Font.BOLD,30));
                    heading.setForeground(Color.WHITE);
                    heading.setBounds(10,0,990,50);


                    // homepage label

                    JLabel homepage = new JLabel("HOMEPAGE");
                    homepage.setBounds(330,270,300,50);
                    homepage.setFont(new Font("Arial",Font.BOLD,50));
                    homepage.setForeground(Color.WHITE);




                    // center image
                    ImageIcon center = new ImageIcon("smile.jpg");
                    JLabel cen_image = new JLabel();
                    cen_image.setIcon(center);
                    cen_image.setBounds(500,400,400,200);




                    // buttons



                    // instructions button
                    JButton instructions = new JButton("Instructions");
                    instructions.setBackground(Color.blue);
                    instructions.setForeground(Color.WHITE);
                    instructions.setFont(new Font("Arial",Font.BOLD,19));
                    instructions.setBounds(450,440,350,70);
                    instructions.setOpaque(true);
                    instructions.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {

                            JFrame instruction_frame = new JFrame("Instructions");
                            instruction_frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                            instruction_frame.setVisible(true);


                            JPanel instruction_panel = new JPanel();
                            instruction_panel.setLayout(null);



                            JLabel one = new JLabel("1. Press capture button to open capture tab ");
                            JLabel two = new JLabel("2. Press capturing and select network interface from console");
                            JLabel three = new JLabel("3. Packet capture starts wait approx 5 minutes");
                            JLabel four = new JLabel("4. close capture tab and check that dataset has been made");
                            JLabel five = new JLabel("5. Apply the ML model and see results from the model tab");



                            one.setBounds(10,30,700,60);
                            one.setForeground(Color.blue);
                            one.setFont(new Font("Arial",Font.BOLD,20));
                            two.setBounds(10,80,700,60);
                            two.setForeground(Color.blue);
                            two.setFont(new Font("Arial",Font.BOLD,20));
                            three.setBounds(10,130,700,60);
                            three.setForeground(Color.blue);
                            three.setFont(new Font("Arial",Font.BOLD,20));
                            four.setFont(new Font("Arial",Font.BOLD,20));
                            four.setBounds(10,180,700,60);
                            four.setForeground(Color.blue);
                            five.setBounds(10,230,700,60);
                            five.setForeground(Color.blue);
                            five.setFont(new Font("Arial",Font.BOLD,20));



                            instruction_panel.add(one);
                            instruction_panel.add(two);
                            instruction_panel.add(three);
                            instruction_panel.add(four);
                            instruction_panel.add(five);


                            instruction_frame.add(instruction_panel);
                            instruction_frame.setSize(800,500);
                            instruction_frame.setPreferredSize(new Dimension(800,600));
                            instruction_frame.setResizable(false);




                        }
                    });


                    // Apply ML

                    JButton ml = new JButton("Detect Intrusion using knn");
                    ml.setFont(new Font("Arial",Font.BOLD,19));
                    ml.setBackground(Color.ORANGE);
                    ml.setBounds(50,440,350,70);
                    ml.setForeground(Color.BLACK);
                    ml.setOpaque(true);
                    ml.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
//======================================================ML WINDOW=============================================================
                            //status bar
                            final JLabel status= new JLabel("Apply the model by pressing the below button");
                            status.setBounds(10,10,900,40);
                            status.setFont(new Font("Arial",Font.TYPE1_FONT,18));
                            status.setForeground(Color.ORANGE);



                            //brain pic

                            ImageIcon brain = new ImageIcon("data.jpg");
                            JLabel b_im = new JLabel();
                            b_im.setIcon(brain);
                            b_im.setBounds(45,100,500,500);


                            //Results knn
                            JButton results =new JButton("Results of detection");
                            results.setOpaque(true);
                            results.setBackground(Color.ORANGE);
                            results.setFont(new Font("Arial",Font.TRUETYPE_FONT,20));
                            results.setBounds(400,400,200,50);
                            results.addActionListener(new ActionListener() {
                                @Override
                                public void actionPerformed(ActionEvent e) {
                                    Desktop desktop = Desktop.getDesktop();
                                    try {
                                        desktop.open(new File("Results_knn.txt"));
                                    } catch (IOException ex) {
                                        ex.printStackTrace();
                                    }
                                }
                            });



                            //apply prediction model

                            JButton predict = new JButton("Predict the intrusion by clicking here");
                            predict.setFont(new Font("Arial",Font.ITALIC,31));
                            predict.setForeground(Color.BLACK);
                            predict.setBackground(Color.ORANGE);
                            predict.setOpaque(true);
                            predict.setBounds(10,100,600,80);
                            predict.addActionListener(new ActionListener() {
                                @Override
                                public void actionPerformed(ActionEvent e) {
                                    status.setText("Wait for the model to predict and conclude results");
                                    JOptionPane.showMessageDialog(null,"Applyin ml model ");
                                    try {
                                        ML_Processing.process_ml();
                                    } catch (IOException ex) {

                                        ex.printStackTrace();
                                    }
                                    status.setText("your wait has paid u back, catch the malware now");



                                }
                            });














                            //creating a panel
                            JPanel b = new JPanel();


                            b.setBackground(Color.BLACK);
                            b.setLayout(null);
                            b.add(status);
                            b.add(predict);
                            b.add(b_im);
                            b.add(results);


                            //creatinf a new frame
                            final JFrame ml_frame = new JFrame("Applying ml on the datset ");
                            ml_frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                            ml_frame.setVisible(true);
                            ml_frame.add(b);



                            ml_frame.setSize(600,500);
                        }
                    });


                    // button of open dataset
                    // open dataset button

                    JButton open_dataset = new JButton("Open the test dataset");
                    open_dataset.setFont(new Font("Arial",Font.BOLD,19));
                    open_dataset.setBounds(450,350,350,70);
                    open_dataset.setBackground(Color.GREEN);
                    open_dataset.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            Desktop desktop = Desktop.getDesktop();
                            try {
                                desktop.open(new File("features_1.csv"));
                            } catch (IOException ex) {
                                JOptionPane.showMessageDialog(null,"File does not exist");
                                ex.printStackTrace();


                            }
                        }
                    });

                    JButton capture = new JButton("Capture Packets");
                    capture.setBackground(Color.RED);
                    capture.setForeground(Color.WHITE);
                    capture.setFont(new Font("Arial",Font.BOLD,20));
                    capture.setOpaque(true);
                    capture.setBounds(50,350,350,70);


                    capture.addActionListener(new ActionListener() {
                        //==================================CAPTURE PACKETS WINDOW=================================================================
                        @Override
                        public void actionPerformed(ActionEvent e) {

                            final JFrame frame = new JFrame("Capture Packets ");
                            frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                            frame.setVisible(true);

                            frame.setSize(1000,500);



                            final JPanel a = new JPanel();
                            a.setLayout(null);




                            frame.add(a);

                            //labels
                            JLabel instruction = new JLabel(" WARNING:SELECT NETWORK INTERFACE FROM java console after pressing button");

                            instruction.setFont(new Font("Arial",Font.ITALIC,20));
                            instruction.setForeground(Color.WHITE);
                            instruction.setBounds(20,10,1300,50);

                            //data picture
                            ImageIcon image = new ImageIcon("data1.jpg");

                            JLabel data_pic = new JLabel();
                            data_pic.setIcon(image);

                            data_pic.setBounds(200,100,1200,400);


                            //loading icon


                            // Buttonns







                            // capture button
                            final JButton start_capturing = new JButton("Start capturing 500 packets");
                            start_capturing.setForeground(Color.WHITE);
                            start_capturing.setBackground(Color.RED);
                            start_capturing.setFont(new Font("Arial",Font.ITALIC,30));
                            start_capturing.setOpaque(true);
                            start_capturing.setBounds(20,100,800,50);
                            start_capturing.addActionListener(new ActionListener() {
                                @Override
                                public void actionPerformed(ActionEvent e) {



                                    try {
                                        ImageIcon loading = new ImageIcon("gear.gif");
                                        JLabel load = new JLabel();
                                        load.setIcon(loading);
                                        load.setBounds(600,200,20,10);
                                        a.add(load);
                                        frame.add(a);




                                        PcapNetworkInterface device = Get_Network_interface.getNetworkDevice();
                                        JOptionPane.showMessageDialog(null,"Capturing packets......Wait 5 minutes");



                                        Capture_packets_and_save.Capture_and_save(device);
                                        Conversion_of_pcap_to_csv.pcap_to_test_data();


                                        JOptionPane.showMessageDialog(null,"Capturing finished and pcap file made and converted to csv");
                                    } catch (IOException ex) {
                                        ex.printStackTrace();
                                    } catch (PcapNativeException ex) {
                                        ex.printStackTrace();
                                    } catch (NotOpenException ex) {
                                        ex.printStackTrace();
                                    }



                                }
                            });















                            //panel

                            a.add(instruction);
                            a.add(start_capturing);
                            a.setBackground(Color.BLACK
                            );

                            a.add(data_pic);









                            //frame



                            JButton close = new JButton("Close ");
                            close.setFont(new Font("Arial",Font.PLAIN,18));
                            close.setOpaque(true);
                            close.setBounds(600,300,100,50);
                            close.setBackground(Color.RED);
                            close.setForeground(Color.WHITE);
                            close.addActionListener(new ActionListener() {
                                @Override
                                public void actionPerformed(ActionEvent e) {
                                    frame.dispose();

                                }
                            });
                            a.add(close);



                        }
                    });


                    // choose the network interface








                    //Panel
                    Panel panel = null;
                    try {
                        panel = new Panel();
                    } catch (IOException ex) {
                        ex.printStackTrace();
                    }
                    panel.setLayout(null);
                    panel.add(heading);
                    panel.add(capture);
                    panel.add(homepage);
                    panel.add(instructions);
                    panel.add(open_dataset);
                    panel.add(ml);














                    // creating the frame






                    final JFrame main_frame = new JFrame("REAL TIME ML IDS ");
                    main_frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                    main_frame.setVisible(true);
                    main_frame.add(panel);
                    main_frame.setSize(1000,900);
                    main_frame.setPreferredSize(new Dimension(1600, 900));
                    main_frame.setResizable(false);





                    // exit button

                    JButton exit = new JButton("EXIT");
                    exit.setForeground(Color.WHITE);
                    exit.setBackground(Color.BLACK);
                    exit.setFont(new Font("Arial",Font.BOLD,19));
                    exit.setBounds(830,5,100,50);
                    exit.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            main_frame.dispose();
                        }
                    });
                    panel.add(exit);



















                }
                else {
                    JOptionPane.showMessageDialog(null,"Wrong Password / Username");
                    txuser.setText("");
                    pass.setText("");
                    txuser.requestFocus();
                }
            }
        });



























































    }








    }


