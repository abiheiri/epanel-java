package epanel;


import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.*;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;



/**
 *
 * @author Al Biheiri <abiheiri@gmail.com>
 */

public class App extends javax.swing.JFrame {

    /**
     * Creates new form App
     */    
    
    public App() {
        list = new DefaultListModel();
        frame = this; //systray doesnt know 'this' so i explicit imply
        frameIcon();
        backupSavedList();
        initComponents();
        load ();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        txtGo = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();
        btnAdd = new javax.swing.JButton();
        btnRemove = new javax.swing.JButton();
        btnGo = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtNotes = new javax.swing.JTextArea();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mnuTray = new javax.swing.JMenuItem();
        mnuSave = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        mnuQuit = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        mnuCut = new javax.swing.JMenuItem();
        mnuCopy = new javax.swing.JMenuItem();
        mnuPaste = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        mnuSelectAll = new javax.swing.JMenuItem();
        chkWrap = new javax.swing.JCheckBoxMenuItem();
        jMenu2 = new javax.swing.JMenu();
        mnuAbout = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ePanel v1.3.1");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jTabbedPane2.setMaximumSize(null);

        jPanel1.setMaximumSize(null);

        txtGo.setComponentPopupMenu(jMenu3.getPopupMenu());
        txtGo.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtGo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtGoKeyPressed(evt);
            }
        });

        jScrollPane1.setMaximumSize(null);

        jList1.setModel(list);
        jList1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList1MouseClicked(evt);
            }
        });
        jList1.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                jList1ValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(jList1);

        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnRemove.setText("Remove");
        btnRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveActionPerformed(evt);
            }
        });

        btnGo.setText("Launch");
        btnGo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 347, Short.MAX_VALUE)
                    .addComponent(txtGo)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnAdd)
                        .addGap(18, 18, 18)
                        .addComponent(btnRemove)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 84, Short.MAX_VALUE)
                        .addComponent(btnGo)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtGo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 292, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdd)
                    .addComponent(btnRemove)
                    .addComponent(btnGo)))
        );

        jTabbedPane2.addTab("panel", jPanel1);

        jPanel2.setMaximumSize(null);

        txtNotes.setColumns(20);
        txtNotes.setRows(5);
        txtNotes.setComponentPopupMenu(jMenu3.getPopupMenu());
        jScrollPane2.setViewportView(txtNotes);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 371, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 372, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("notes", jPanel2);

        jMenu1.setText("File");

        mnuTray.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        mnuTray.setText("Hide to tray");
        mnuTray.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuTrayActionPerformed(evt);
            }
        });
        jMenu1.add(mnuTray);

        mnuSave.setText("Save");
        mnuSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuSaveActionPerformed(evt);
            }
        });
        jMenu1.add(mnuSave);
        jMenu1.add(jSeparator1);

        mnuQuit.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        mnuQuit.setText("Exit");
        mnuQuit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuQuitActionPerformed(evt);
            }
        });
        jMenu1.add(mnuQuit);

        jMenuBar1.add(jMenu1);

        jMenu3.setText("Edit");

        mnuCut.setText("Cut");
        mnuCut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuCutActionPerformed(evt);
            }
        });
        jMenu3.add(mnuCut);

        mnuCopy.setText("Copy");
        mnuCopy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuCopyActionPerformed(evt);
            }
        });
        jMenu3.add(mnuCopy);

        mnuPaste.setText("Paste");
        mnuPaste.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuPasteActionPerformed(evt);
            }
        });
        jMenu3.add(mnuPaste);
        jMenu3.add(jSeparator2);

        mnuSelectAll.setText("Select All...");
        mnuSelectAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuSelectAllActionPerformed(evt);
            }
        });
        jMenu3.add(mnuSelectAll);

        chkWrap.setText("Line Wrap (notes)");
        chkWrap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkWrapActionPerformed(evt);
            }
        });
        jMenu3.add(chkWrap);

        jMenuBar1.add(jMenu3);

        jMenu2.setText("Help");

        mnuAbout.setText("About");
        mnuAbout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuAboutActionPerformed(evt);
            }
        });
        jMenu2.add(mnuAbout);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
        
    private DefaultListModel list;
    public javax.swing.JFrame frame; //stupidity used for systray   
    
    // <editor-fold defaultstate="collapsed" desc="functions">
    private void frameIcon () {
        try{ 
            InputStream imgStream = this.getClass().getResourceAsStream("img/trayicon.png"); 
            BufferedImage bi = ImageIO.read(imgStream); 
            ImageIcon myImg = new ImageIcon(bi); 
            this.setIconImage(myImg.getImage());      
        }catch(Exception e){
            System.out.println("error loading icon: " + e);
        }        
    }    
        
    protected boolean alreadyInList(String name) {    
        return list.contains(name); //checks for duplicates     
        
    }
    
    private void searchOnline () {                    
        try {  
            String text = txtGo.getText();
            //String myURL = "http://www.google.com/search?q="+text;       
            java.awt.Desktop myNewBrowserDesktop = java.awt.Desktop.getDesktop();
            //google url has a %s which is var that is URLEncoder.encode(text)
            java.net.URI myNewLocation = new java.net.URI( String.format("http://www.google.com/search?q=%s",java.net.URLEncoder.encode( text , "UTF8" ) ) );            
            myNewBrowserDesktop.browse( myNewLocation );
            //System.out.println(myNewLocation);
        }
        catch (URISyntaxException ux) {
            System.out.println("error searchOnline(ux): " + ux);
        }
        catch (IOException ix) {
            System.out.println("error searchOnline(ix): " + ix);
        }
    }
    
    private void AddContents () {
        String text = txtGo.getText();

        //stop duplicates and empty space
        if (text.equals("") || alreadyInList(text)) {
            Toolkit.getDefaultToolkit().beep();
            txtGo.requestFocusInWindow();
            txtGo.selectAll();
            return;
        }
        
        int index = jList1.getSelectedIndex(); //get selected index
          if (index == -1) { //no selection, so insert at beginning
              index = 0;
          } else {           //add after the selected item
              index++;
          }
            
        list.addElement(text);
        save ();
    }
    
    private void doAction () {
            String text = txtGo.getText();
        
        try {
                Runtime rt = Runtime.getRuntime();
                //Process pr = rt.exec("cmd /c dir");
                Process pr = rt.exec(text); 
                BufferedReader input = new BufferedReader(new InputStreamReader(pr.getInputStream())); 
                String line; 
                while((line=input.readLine()) != null) {
                    System.out.println(line);
                }
 
            } catch(Exception e) {
                try {                    
                    String myURL = text;
                    java.awt.Desktop myNewBrowserDesktop = java.awt.Desktop.getDesktop();
                    java.net.URI myNewLocation = new java.net.URI(myURL);            
                    myNewBrowserDesktop.browse( myNewLocation );
                } 
                catch (URISyntaxException ex) {            
                    searchOnline ();
                } 
                catch (IOException ex) {            
                    searchOnline ();                                      

                }                   
            }    
    }
    
    // </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="Save/Load/Copy">
    private void save () {
        try {  
            BufferedWriter bw = new BufferedWriter(  
                                new OutputStreamWriter(  
                                new FileOutputStream("epanel-list.txt")));  
            for(int j = 0; j < list.getSize(); j++) {  
                String line = (String)list.getElementAt(j);  
                bw.write(line, 0, line.length());  
                bw.newLine();  
            }  
            bw.close();
        } catch(IOException e) {  
            JOptionPane.showMessageDialog(null, "error: " + e.getMessage());  
        }  
        
        String notes = txtNotes.getText();
        try {  
            BufferedWriter bw = new BufferedWriter(  
                                new OutputStreamWriter(  
                                new FileOutputStream("epanel-notes.txt")));   
                bw.write(notes);    
            bw.close();
        } catch(IOException e) {  
            JOptionPane.showMessageDialog(null, "error: " + e.getMessage());  
        }  
        
    } 
    
    private void load () {

        try {  
            BufferedReader br = new BufferedReader(  
                                new InputStreamReader(  
                                new FileInputStream("epanel-list.txt")));  
            String line;  
            while((line = br.readLine()) != null) {
                //im trying not to load duplicates
//                if (alreadyInList(line)) {
//                    return;
//                }
                list.addElement(line);  
            }  
            br.close();  
        } catch(IOException e) {  
            //JOptionPane.showMessageDialog(null, "error: " + e.getMessage());  
        }

        
        try {  
            BufferedReader br = new BufferedReader(  
                                new InputStreamReader(  
                                new FileInputStream("epanel-notes.txt")));  
            String line;
            String result = "";
            
            while((line = br.readLine()) != null) { 
                //System.out.print(line + "\n");
                result += line + "\n";
                
            }  
            
            txtNotes.setText(result);
            br.close();  
            
        } catch(IOException e) {  
            //JOptionPane.showMessageDialog(null, "error: " + e.getMessage());  
        }
        
    }
    
    private void backupSavedList () {  //makes a backup of listfile on init          
        FileWriter out = null;
        try {
            File inputFile = new File("epanel-list.txt");
            File outputFile = new File("epanel-list-BACKUP.txt");
            FileReader in = new FileReader(inputFile);
            out = new FileWriter(outputFile);
            int c;
            while ((c = in.read()) != -1)        
                out.write(c);
            in.close();
            out.close();
        }catch (IOException ex) {
                //Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    // </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="sysTray related">        
    private void createTray() {
        //Check the SystemTray support
        if (!SystemTray.isSupported()) {
            System.out.println("Shucks creating a system tray is not possible");
            return;
        }
        final PopupMenu popup = new PopupMenu();
        final TrayIcon trayIcon =
                new TrayIcon(createImage("img/trayicon.png", "tray icon"));
        final SystemTray tray = SystemTray.getSystemTray();
                
        MenuItem restoreForm = new MenuItem("Show");
        MenuItem exitItem = new MenuItem("Exit");
        
        //Add components to popup menu
        popup.add(restoreForm);
        popup.addSeparator();
        popup.add(exitItem);
        
        trayIcon.setPopupMenu(popup);
        
        try {
            tray.add(trayIcon);
        } catch (AWTException e) {
            System.out.println("TrayIcon could not be added.");
            return;
        }
                
        trayIcon.setImageAutoSize(true); //autosize the tray
        
        trayIcon.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tray.remove(trayIcon);                
                frame.setVisible(true); 
            }
        });
       
        restoreForm.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tray.remove(trayIcon);
                frame.setVisible(true);  
            }
        });
           
        exitItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tray.remove(trayIcon);
                save();
                System.exit(0);
            }
        });
        
    }     
                
    protected static Image createImage(String path, String description) {
        URL imageURL = App.class.getResource(path);
        
        if (imageURL == null) {
            System.err.println("Resource not found in createImage(): " + path);
            return null;
        } else {
            return (new ImageIcon(imageURL, description)).getImage();
        }
    }
   

    
    private void mnuAboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuAboutActionPerformed
        try {
            String myURL = "http://goo.gl/I7KuD";
            java.awt.Desktop myNewBrowserDesktop = java.awt.Desktop.getDesktop();
            java.net.URI myNewLocation = new java.net.URI(myURL);
            myNewBrowserDesktop.browse( myNewLocation );
        } catch (URISyntaxException ex) {
            Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_mnuAboutActionPerformed
     // </editor-fold>
    
    private void btnGoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGoActionPerformed
        doAction();
    }//GEN-LAST:event_btnGoActionPerformed
       
    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        AddContents ();         
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveActionPerformed
            //single remove
            //int index = jList1.getSelectedIndex();
            //list.remove(index);
            DefaultListModel dlm = (DefaultListModel) this.jList1.getModel(); 

            if(this.jList1.getSelectedIndices().length > 0) {  
                int[] tmp = this.jList1.getSelectedIndices();  
                int[] selectedIndices = this.jList1.getSelectedIndices();       
  
                for (int i = tmp.length-1; i >=0; i--) {      
                    selectedIndices = this.jList1.getSelectedIndices();      
                    dlm.removeElementAt(selectedIndices[i]);  
                }
            }
            
            save ();
    }//GEN-LAST:event_btnRemoveActionPerformed

    private void jList1ValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jList1ValueChanged
        //add what is selected to txtGo
        int selected[] = jList1.getSelectedIndices();
            for (int i = 0; i < selected.length; i++) {
                String element = (String) jList1.getModel().getElementAt(
                    selected[i]);
                txtGo.setText(element);
      }

    }//GEN-LAST:event_jList1ValueChanged

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        save ();
    }//GEN-LAST:event_formWindowClosing

    private void txtGoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtGoKeyPressed
        int keyCode = evt.getKeyCode();
        if (keyCode == KeyEvent.VK_ENTER) {
            AddContents();
        }
    }//GEN-LAST:event_txtGoKeyPressed

    private void mnuQuitActionPerformed(java.awt.event.ActionEvent evt) {                                            
        save(); //needed eventhough there is an OnClosing event
        System.exit(0);
    }                                       

    private void mnuTrayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuTrayActionPerformed
        this.setVisible(false);
        createTray();
    }//GEN-LAST:event_mnuTrayActionPerformed

    private void jList1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList1MouseClicked
        if(evt.getClickCount() == 2){
            doAction();
        }       
    }//GEN-LAST:event_jList1MouseClicked

    private void chkWrapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkWrapActionPerformed
        if (chkWrap.isSelected()){
            txtNotes.setLineWrap(true);
        }else{
            txtNotes.setLineWrap(false);            
        }
    }//GEN-LAST:event_chkWrapActionPerformed

    private void mnuSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuSaveActionPerformed
        save ();
        JOptionPane.showMessageDialog(null, "Data saved");  
    }//GEN-LAST:event_mnuSaveActionPerformed

    private void mnuCopyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuCopyActionPerformed
        try {
            Robot robot = new Robot();
            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_C);
            robot.keyRelease( KeyEvent.VK_C );
            robot.keyRelease( KeyEvent.VK_CONTROL );
        } catch (AWTException ex) {
            Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_mnuCopyActionPerformed

    private void mnuPasteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuPasteActionPerformed
        try {
            Robot robot = new Robot();
            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_V);
            robot.keyRelease( KeyEvent.VK_V );
            robot.keyRelease( KeyEvent.VK_CONTROL );
        } catch (AWTException ex) {
            Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_mnuPasteActionPerformed

    private void mnuSelectAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuSelectAllActionPerformed
        try {
            Robot robot = new Robot();
            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_A);
            robot.keyRelease( KeyEvent.VK_A );
            robot.keyRelease( KeyEvent.VK_CONTROL );
        } catch (AWTException ex) {
            Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_mnuSelectAllActionPerformed

    private void mnuCutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuCutActionPerformed
        try {
            Robot robot = new Robot();
            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_X);
            robot.keyRelease( KeyEvent.VK_X );
            robot.keyRelease( KeyEvent.VK_CONTROL );
        } catch (AWTException ex) {
            Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_mnuCutActionPerformed

      
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                new App().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnGo;
    private javax.swing.JButton btnRemove;
    private javax.swing.JCheckBoxMenuItem chkWrap;
    private javax.swing.JList jList1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JMenuItem mnuAbout;
    private javax.swing.JMenuItem mnuCopy;
    private javax.swing.JMenuItem mnuCut;
    private javax.swing.JMenuItem mnuPaste;
    private javax.swing.JMenuItem mnuQuit;
    private javax.swing.JMenuItem mnuSave;
    private javax.swing.JMenuItem mnuSelectAll;
    private javax.swing.JMenuItem mnuTray;
    private javax.swing.JTextField txtGo;
    private javax.swing.JTextArea txtNotes;
    // End of variables declaration//GEN-END:variables
}
