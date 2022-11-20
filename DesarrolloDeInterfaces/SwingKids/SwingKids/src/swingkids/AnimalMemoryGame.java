package swingkids;

import basededatos.GestorSwingKids;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.InputStream;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 * 
 * @author rafaelblancoaranda
 */
public class AnimalMemoryGame extends javax.swing.JFrame implements ActionListener {

    /**
     * Creates new form MainFrame
     */
    public AnimalMemoryGame() {
        initComponents();
        initIcons();
        initGame();
    }

    private void initGame() {
        score = 0;
        int x = 0;
        for (int i = 0; i < tiles.length; i++) {
            tiles[i] = new Tile(icons[x], new ImageIcon(getClass().getResource("/images/logo2.png")));
            tiles[i].addActionListener(this);
            gamePanel.add(tiles[i]);
            if ((i + 1) % 2 == 0) {
                x++;
            }
        }
        title.setText("Puntuación: " + score);
        shuffle();

    }

    private void initIcons() {
        Image img;
        for (int i = 0; i < icons.length; i++) {
            img = new ImageIcon(getClass().getResource("/images/img" + i + ".png")).getImage();
            icons[i] = createIcon(img);
        }

    }

    private ImageIcon createIcon(Image img) {
        BufferedImage bi = new BufferedImage(img.getWidth(null), img.getHeight(null), BufferedImage.TYPE_INT_RGB);
        bi.createGraphics().drawImage(img, 0, 0, null);
        img = bi.getScaledInstance(80, 80, 1);
        return new ImageIcon(img);
    }

    private void showHelp() {
        //if tiles[0] would be null than all the tiles would be null here
        if (tiles[0] != null) {
            for (int i = 0; i < tiles.length; i++) {
                if (!tiles[i].isNoIcon()) {
                    tiles[i].showTile();
                    tiles[i].removeActionListener(this);
                }
            }
            score -= 110;
            title.setText("Puntuación: " + score);
        }
    }

    private void hideHelp() {

        for (int i = 0; i < tiles.length; i++) {
            if (!tiles[i].isNoIcon()) {
                tiles[i].hideTile();
                tiles[i].addActionListener(this);
            }
        }

    }

    private void check() {

        if (predict1 != predict2 && predict1.getImage() == predict2.getImage()) {
            new Thread() {
                @Override
                public void run() {
                    Sound sound = null;
                    try {
                        sound
                                = new Sound(getClass().getResource("/sounds/success.wav"));
                    } catch (Exception e) {
                    }
                    InputStream stream
                            = new ByteArrayInputStream(sound.getSamples());
                    sound.play(stream);
                }
            }.start();//sound 
            new Thread() {
                @Override
                public void run() {
                    for (int i = 0; i < 3; i++) {
                        try {
                            predict1.hideTile();
                            predict2.hideTile();
                            Thread.sleep(100);
                            predict1.showTile();
                            predict2.showTile();
                            Thread.sleep(100);
                        } catch (InterruptedException ex) {
                            System.out.println(ex);
                        }
                    }
                    predict1.setNoIcon();
                    predict2.setNoIcon();
                    for (int i = 0; i < tiles.length; i++) {
                        if (!tiles[i].isNoIcon()) {
                            won = false;
                            break;
                        } else {
                            won = true;
                        }
                    }
                    if (won) {
                        if (score > 0) {
                            new Thread() {
                                @Override
                                public void run() {
                                    Sound sound = null;
                                    try {
                                        sound
                                                = new Sound(getClass().getResource("/sounds/won.wav"));
                                    } catch (Exception e) {
                                    }
                                    InputStream stream
                                            = new ByteArrayInputStream(sound.getSamples());
                                    sound.play(stream);
                                }
                            }.start();//won sound
                            
                            GestorSwingKids gsk1 = new GestorSwingKids();
                            gsk1.insertarPuntuacion(MainView.userName, score);
                            if (score > (gsk1.leerJugador(MainView.userName).getMaxScore())) {
                                gsk1.actualizarPuntuacion(score);
                            }
                            Winner winner= new Winner(AnimalMemoryGame.this,true,score);
                            winner.setVisible(true);
                            
                        } else {
                            new Thread() {
                                @Override
                                public void run() {
                                    Sound sound = null;
                                    try {
                                        sound
                                                = new Sound(getClass().getResource("/sounds/loose.wav"));
                                    } catch (Exception e) {
                                    }
                                    InputStream stream
                                            = new ByteArrayInputStream(sound.getSamples());
                                    sound.play(stream);
                                }
                            }.start();//loose sound
                            JOptionPane.showMessageDialog(gamePanel, "¡Lo siento, has perdido! Tu puntuación ha sido de  " + score);
                        }

                        initGame();
                    }
                }
            }.start();//animation
            predict1.removeActionListener(this);
            predict2.removeActionListener(this);
            score += 100;
            title.setText("Puntuación: " + score);

        } else {
            predict1.hideTile();
            predict2.hideTile();
            score -= 10;
            title.setText("Puntuación: " + score);
        }
    }

    private void shuffle() {
        gamePanel.removeAll();
        ArrayList<Integer> al = new ArrayList<Integer>();
        for (int i = 0; i < 36;) {
            int x = (int) (Math.random() * 36);
            if (!al.contains(x)) {
                al.add(x);
                i++;
            }
        }
        for (int i = 0; i < 36; i++) {
            gamePanel.add(tiles[al.get(i)]);
            tiles[al.get(i)].hideTile();
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titlePanel = new javax.swing.JPanel();
        title = new javax.swing.JTextField();
        close = new javax.swing.JLabel();
        help = new javax.swing.JLabel();
        gamePanel = new javax.swing.JPanel();
        controlPanel = new javax.swing.JPanel();
        play = new javax.swing.JButton();
        load = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Matching Game");
        setBackground(new java.awt.Color(204, 204, 255));
        setIconImage(new ImageIcon(getClass().getResource("/images/logo.png")).getImage());
        setLocationByPlatform(true);
        setName("MainFrame"); // NOI18N
        setUndecorated(true);

        titlePanel.setBackground(new java.awt.Color(153, 0, 153));
        titlePanel.setPreferredSize(new java.awt.Dimension(300, 25));
        titlePanel.setLayout(new java.awt.BorderLayout());

        title.setEditable(false);
        title.setBackground(new java.awt.Color(255, 204, 153));
        title.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        title.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        title.setText("Puntuación: ");
        title.setToolTipText("After Clicking mouse here use arrow keys to move");
        title.setBorder(null);
        title.setCursor(new java.awt.Cursor(java.awt.Cursor.MOVE_CURSOR));
        title.setSelectionColor(new java.awt.Color(153, 153, 255));
        title.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                titleMouseDragged(evt);
            }
        });
        title.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                titleActionPerformed(evt);
            }
        });
        title.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                titleKeyPressed(evt);
            }
        });
        titlePanel.add(title, java.awt.BorderLayout.CENTER);

        close.setBackground(new java.awt.Color(255, 204, 153));
        close.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        close.setForeground(new java.awt.Color(255, 255, 255));
        close.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        close.setText("X");
        close.setToolTipText("Close");
        close.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        close.setPreferredSize(new java.awt.Dimension(25, 25));
        close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeMouseClicked(evt);
            }
        });
        titlePanel.add(close, java.awt.BorderLayout.LINE_END);

        help.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        help.setForeground(new java.awt.Color(255, 255, 255));
        help.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        help.setText("?");
        help.setToolTipText("Right click to hide controls and Left click to see Images");
        help.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        help.setPreferredSize(new java.awt.Dimension(25, 25));
        help.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                helpMouseClicked(evt);
            }
        });
        titlePanel.add(help, java.awt.BorderLayout.LINE_START);

        getContentPane().add(titlePanel, java.awt.BorderLayout.NORTH);

        gamePanel.setBackground(new java.awt.Color(255, 255, 204));
        gamePanel.setPreferredSize(new java.awt.Dimension(630, 630));
        gamePanel.setLayout(new java.awt.GridLayout(6, 6, 5, 5));
        getContentPane().add(gamePanel, java.awt.BorderLayout.CENTER);

        controlPanel.setBackground(new java.awt.Color(153, 153, 255));
        controlPanel.setPreferredSize(new java.awt.Dimension(300, 40));
        controlPanel.setLayout(new java.awt.GridLayout(1, 2));

        play.setBackground(new java.awt.Color(255, 204, 153));
        play.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        play.setText("VOLVER A EMPEZAR");
        play.setToolTipText("Play new Game");
        play.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        play.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playActionPerformed(evt);
            }
        });
        controlPanel.add(play);

        load.setBackground(new java.awt.Color(255, 204, 153));
        load.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        load.setText("SUBIR FOTOS");
        load.setToolTipText("Load your favourite images");
        load.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        load.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loadActionPerformed(evt);
            }
        });
        controlPanel.add(load);

        getContentPane().add(controlPanel, java.awt.BorderLayout.SOUTH);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseClicked
        if (evt.getButton() == MouseEvent.BUTTON1) {
            this.dispose();
        }
    }//GEN-LAST:event_closeMouseClicked

    private void helpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_helpMouseClicked
        if (evt.getButton() == MouseEvent.BUTTON1) {
            if (!helping) {
                new Thread() {
                    @Override
                    public void run() {
                        try {
                            helping = true;
                            showHelp();
                            Thread.sleep(10000);
                            hideHelp();
                            helping = false;
                        } catch (InterruptedException ex) {
                            System.out.println(ex);
                        }
                    }
                }.start();
            }
        }
        if (evt.getButton() == MouseEvent.BUTTON3) {
            if (controlPanel.isVisible()) {
                setSize(600, 625);
                controlPanel.setVisible(false);
            } else {
                setSize(600, 665);
                controlPanel.setVisible(true);
            }
        }
    }//GEN-LAST:event_helpMouseClicked

    private void titleKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_titleKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_LEFT) {
            setLocation(getX() - 5, getY());
        }
        if (evt.getKeyCode() == KeyEvent.VK_RIGHT) {
            setLocation(getX() + 5, getY());
        }
        if (evt.getKeyCode() == KeyEvent.VK_UP) {
            setLocation(getX(), getY() - 5);
        }
        if (evt.getKeyCode() == KeyEvent.VK_DOWN) {
            setLocation(getX(), getY() + 5);
        }
    }//GEN-LAST:event_titleKeyPressed

    private void loadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loadActionPerformed
        JFileChooser chooser = new JFileChooser();
        chooser.setMultiSelectionEnabled(true);
        int response = chooser.showOpenDialog(predict1);
        if (response == JFileChooser.APPROVE_OPTION) {
            File[] file = chooser.getSelectedFiles();
            if (file.length >= 18) {
                for (int i = 0; i < 18; i++) {
                    icons[i] = createIcon(new ImageIcon(file[i].toString()).getImage());
                }
                initGame();
            } else {
                JOptionPane.showMessageDialog(gamePanel, "Por favot, selecciona 18 imágenes !");
            }
        }
    }//GEN-LAST:event_loadActionPerformed

    private void playActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playActionPerformed
        initGame();
    }//GEN-LAST:event_playActionPerformed

    private void titleMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_titleMouseDragged
        setLocation(evt.getXOnScreen() - 300, evt.getYOnScreen());
    }//GEN-LAST:event_titleMouseDragged

    private void titleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_titleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_titleActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AnimalMemoryGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AnimalMemoryGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AnimalMemoryGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AnimalMemoryGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                //do animation here if want
                //sleep here
                new AnimalMemoryGame().setVisible(true);
            }
        });
    }

    Tile[] tiles = new Tile[36];
    ImageIcon[] icons = new ImageIcon[18];
    int status, score;
    Tile predict1, predict2;
    private boolean won, helping;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel close;
    private javax.swing.JPanel controlPanel;
    private javax.swing.JPanel gamePanel;
    private javax.swing.JLabel help;
    private javax.swing.JButton load;
    private javax.swing.JButton play;
    private javax.swing.JTextField title;
    private javax.swing.JPanel titlePanel;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent e) {
        if (status == 0) {
            predict1 = (Tile) e.getSource();
            predict1.showTile();
            status++;
        } else if (status == 1) {
            status++;
            predict2 = (Tile) e.getSource();
            new Thread() {
                @Override
                public void run() {
                    try {
                        predict2.showTile();
                        Thread.sleep(500);
                        check();
                        Thread.sleep(600);
                        status = 0;
                    } catch (Exception e) {
                        System.out.println(e);
                    }
                }
            }.start();

        }
    }
}
