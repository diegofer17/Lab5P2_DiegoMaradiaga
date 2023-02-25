package lab5p2_diegomaradiaga;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

public class Main extends javax.swing.JFrame {
    ArrayList <Object> character = new ArrayList();
    /**
     * Creates new form Main
     */
    public Main() {
        initComponents();
        this.setLocationRelativeTo(this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jD_agregar = new javax.swing.JDialog();
        panelfondo = new javax.swing.JPanel();
        jL_poder = new javax.swing.JLabel();
        jTFnombre = new javax.swing.JTextField();
        jL_fuerza = new javax.swing.JLabel();
        jL_debilidad = new javax.swing.JLabel();
        jL_nombre3 = new javax.swing.JLabel();
        jL_agilidadF = new javax.swing.JLabel();
        jL_hp = new javax.swing.JLabel();
        jL_agilidadM = new javax.swing.JLabel();
        Universo = new javax.swing.JLabel();
        jTFpoder = new javax.swing.JTextField();
        jTFdebilidad = new javax.swing.JTextField();
        jTFfuerza = new javax.swing.JTextField();
        jTFaf = new javax.swing.JTextField();
        jTFam = new javax.swing.JTextField();
        jTFhp = new javax.swing.JTextField();
        jComboBoxU = new javax.swing.JComboBox<>();
        btn_menu = new javax.swing.JButton();
        btn_add = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jD_listar = new javax.swing.JDialog();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTree = new javax.swing.JTree();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList = new javax.swing.JList<>();
        jTFnombrep = new javax.swing.JTextField();
        btm_menu = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        popup1 = new javax.swing.JPopupMenu();
        jmListar = new javax.swing.JMenuItem();
        popup2 = new javax.swing.JPopupMenu();
        jmListar2 = new javax.swing.JMenuItem();
        jmeliminar = new javax.swing.JMenuItem();
        PanelPrin = new javax.swing.JPanel();
        Titulo = new javax.swing.JLabel();
        Btn_Simular = new javax.swing.JButton();
        Btn_Agregar = new javax.swing.JButton();
        Btn_Listar = new javax.swing.JButton();
        Btn_Salir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        jD_agregar.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelfondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jL_poder.setFont(new java.awt.Font("THE AMAZING SPIDER-MAN", 1, 36)); // NOI18N
        jL_poder.setForeground(new java.awt.Color(255, 255, 255));
        jL_poder.setText("Poder");
        panelfondo.add(jL_poder, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 220, 150, 50));

        jTFnombre.setBackground(new java.awt.Color(255, 255, 255));
        jTFnombre.setFont(new java.awt.Font("Sansburg", 0, 18)); // NOI18N
        jTFnombre.setForeground(new java.awt.Color(0, 0, 0));
        panelfondo.add(jTFnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, 250, 40));

        jL_fuerza.setFont(new java.awt.Font("THE AMAZING SPIDER-MAN", 1, 36)); // NOI18N
        jL_fuerza.setForeground(new java.awt.Color(255, 255, 255));
        jL_fuerza.setText("Fuerza");
        panelfondo.add(jL_fuerza, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 80, 150, 70));

        jL_debilidad.setFont(new java.awt.Font("THE AMAZING SPIDER-MAN", 1, 36)); // NOI18N
        jL_debilidad.setForeground(new java.awt.Color(255, 255, 255));
        jL_debilidad.setText("Debilidad");
        panelfondo.add(jL_debilidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 340, 150, 50));

        jL_nombre3.setFont(new java.awt.Font("THE AMAZING SPIDER-MAN", 1, 36)); // NOI18N
        jL_nombre3.setForeground(new java.awt.Color(255, 255, 255));
        jL_nombre3.setText("Nombre ");
        panelfondo.add(jL_nombre3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, 150, 50));

        jL_agilidadF.setFont(new java.awt.Font("THE AMAZING SPIDER-MAN", 1, 36)); // NOI18N
        jL_agilidadF.setForeground(new java.awt.Color(255, 255, 255));
        jL_agilidadF.setText("Agilidad fisica");
        panelfondo.add(jL_agilidadF, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 200, 320, 70));

        jL_hp.setFont(new java.awt.Font("THE AMAZING SPIDER-MAN", 1, 36)); // NOI18N
        jL_hp.setForeground(new java.awt.Color(255, 255, 255));
        jL_hp.setText("Puntos de vida");
        panelfondo.add(jL_hp, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 460, 300, 70));

        jL_agilidadM.setFont(new java.awt.Font("THE AMAZING SPIDER-MAN", 1, 36)); // NOI18N
        jL_agilidadM.setForeground(new java.awt.Color(255, 255, 255));
        jL_agilidadM.setText("Agilidad Mental");
        panelfondo.add(jL_agilidadM, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 330, 290, 70));

        Universo.setFont(new java.awt.Font("THE AMAZING SPIDER-MAN", 1, 36)); // NOI18N
        Universo.setForeground(new java.awt.Color(255, 255, 255));
        Universo.setText("Universo");
        panelfondo.add(Universo, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 460, 300, 70));

        jTFpoder.setBackground(new java.awt.Color(255, 255, 255));
        jTFpoder.setFont(new java.awt.Font("Sansburg", 0, 18)); // NOI18N
        jTFpoder.setForeground(new java.awt.Color(0, 0, 0));
        jTFpoder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFpoderActionPerformed(evt);
            }
        });
        panelfondo.add(jTFpoder, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 270, 250, 40));

        jTFdebilidad.setBackground(new java.awt.Color(255, 255, 255));
        jTFdebilidad.setFont(new java.awt.Font("Sansburg", 0, 18)); // NOI18N
        jTFdebilidad.setForeground(new java.awt.Color(0, 0, 0));
        panelfondo.add(jTFdebilidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 400, 250, 40));

        jTFfuerza.setBackground(new java.awt.Color(255, 255, 255));
        jTFfuerza.setFont(new java.awt.Font("Sansburg", 0, 18)); // NOI18N
        jTFfuerza.setForeground(new java.awt.Color(0, 0, 0));
        panelfondo.add(jTFfuerza, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 140, 250, 40));

        jTFaf.setBackground(new java.awt.Color(255, 255, 255));
        jTFaf.setFont(new java.awt.Font("Sansburg", 0, 18)); // NOI18N
        jTFaf.setForeground(new java.awt.Color(0, 0, 0));
        panelfondo.add(jTFaf, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 270, 250, 40));

        jTFam.setBackground(new java.awt.Color(255, 255, 255));
        jTFam.setFont(new java.awt.Font("Sansburg", 0, 18)); // NOI18N
        jTFam.setForeground(new java.awt.Color(0, 0, 0));
        panelfondo.add(jTFam, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 400, 250, 40));

        jTFhp.setBackground(new java.awt.Color(255, 255, 255));
        jTFhp.setFont(new java.awt.Font("Sansburg", 0, 18)); // NOI18N
        jTFhp.setForeground(new java.awt.Color(0, 0, 0));
        panelfondo.add(jTFhp, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 520, 250, 40));

        jComboBoxU.setBackground(new java.awt.Color(255, 255, 255));
        jComboBoxU.setFont(new java.awt.Font("Sansburg", 0, 18)); // NOI18N
        jComboBoxU.setForeground(new java.awt.Color(0, 0, 0));
        jComboBoxU.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "DC", "Marvel", "CapCom", "Mortal Kombat" }));
        panelfondo.add(jComboBoxU, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 530, 250, 30));

        btn_menu.setBackground(new java.awt.Color(51, 51, 51));
        btn_menu.setFont(new java.awt.Font("Sansburg", 3, 18)); // NOI18N
        btn_menu.setForeground(new java.awt.Color(255, 255, 255));
        btn_menu.setText("Menú");
        btn_menu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_menuMouseClicked(evt);
            }
        });
        panelfondo.add(btn_menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 400, 140, 40));

        btn_add.setBackground(new java.awt.Color(51, 51, 51));
        btn_add.setFont(new java.awt.Font("Sansburg", 3, 18)); // NOI18N
        btn_add.setForeground(new java.awt.Color(255, 255, 255));
        btn_add.setText("Agregar");
        btn_add.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_addMouseClicked(evt);
            }
        });
        panelfondo.add(btn_add, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 270, 140, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Fondo2222.jpg"))); // NOI18N
        panelfondo.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1140, 640));

        jD_agregar.getContentPane().add(panelfondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 640));

        jD_listar.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTree.setBackground(new java.awt.Color(255, 255, 255));
        jTree.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jTree.setForeground(new java.awt.Color(0, 0, 0));
        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("Personajes");
        javax.swing.tree.DefaultMutableTreeNode treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("DC");
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Marvel");
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("CapCom");
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("MortalKombat");
        treeNode1.add(treeNode2);
        jTree.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        jTree.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTreeMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTree);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, 310, 500));

        jList.setBackground(new java.awt.Color(255, 255, 255));
        jList.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jList.setForeground(new java.awt.Color(0, 0, 0));
        jList.setModel(new DefaultListModel());
        jScrollPane2.setViewportView(jList);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 120, 240, 440));

        jTFnombrep.setEditable(false);
        jTFnombrep.setBackground(new java.awt.Color(255, 255, 255));
        jTFnombrep.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jTFnombrep.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jTFnombrep, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 60, 240, 40));

        btm_menu.setBackground(new java.awt.Color(28, 99, 171));
        btm_menu.setFont(new java.awt.Font("Sansburg", 2, 18)); // NOI18N
        btm_menu.setForeground(new java.awt.Color(255, 255, 255));
        btm_menu.setText("Menú");
        btm_menu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btm_menuMouseClicked(evt);
            }
        });
        jPanel1.add(btm_menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 60, 240, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Fon22.jpg"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 600));

        jD_listar.getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1140, 600));

        jmListar.setText("Listar personajes del universo");
        jmListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmListarActionPerformed(evt);
            }
        });
        popup1.add(jmListar);

        jmListar2.setText("Listar atributos");
        jmListar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmListar2ActionPerformed(evt);
            }
        });
        popup2.add(jmListar2);

        jmeliminar.setText("Eliminar personaje");
        jmeliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmeliminarActionPerformed(evt);
            }
        });
        popup2.add(jmeliminar);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanelPrin.setBackground(new java.awt.Color(255, 255, 255));
        PanelPrin.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Titulo.setFont(new java.awt.Font("THE AMAZING SPIDER-MAN", 1, 48)); // NOI18N
        Titulo.setForeground(new java.awt.Color(255, 255, 255));
        Titulo.setText("1 vs 1");
        PanelPrin.add(Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 110, 190, 90));

        Btn_Simular.setBackground(new java.awt.Color(18, 40, 61));
        Btn_Simular.setFont(new java.awt.Font("THE AMAZING SPIDER-MAN", 1, 36)); // NOI18N
        Btn_Simular.setForeground(new java.awt.Color(255, 255, 255));
        Btn_Simular.setText("Simular");
        Btn_Simular.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Btn_SimularMouseClicked(evt);
            }
        });
        Btn_Simular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_SimularActionPerformed(evt);
            }
        });
        PanelPrin.add(Btn_Simular, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 480, 190, 70));

        Btn_Agregar.setBackground(new java.awt.Color(18, 40, 61));
        Btn_Agregar.setFont(new java.awt.Font("THE AMAZING SPIDER-MAN", 1, 36)); // NOI18N
        Btn_Agregar.setForeground(new java.awt.Color(255, 255, 255));
        Btn_Agregar.setText("Agregar");
        Btn_Agregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Btn_AgregarMouseClicked(evt);
            }
        });
        PanelPrin.add(Btn_Agregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 290, 190, 70));

        Btn_Listar.setBackground(new java.awt.Color(18, 40, 61));
        Btn_Listar.setFont(new java.awt.Font("THE AMAZING SPIDER-MAN", 1, 36)); // NOI18N
        Btn_Listar.setForeground(new java.awt.Color(255, 255, 255));
        Btn_Listar.setText("Listar");
        Btn_Listar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Btn_ListarMouseClicked(evt);
            }
        });
        PanelPrin.add(Btn_Listar, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 390, 190, 70));

        Btn_Salir.setBackground(new java.awt.Color(18, 40, 61));
        Btn_Salir.setFont(new java.awt.Font("THE AMAZING SPIDER-MAN", 1, 36)); // NOI18N
        Btn_Salir.setForeground(new java.awt.Color(255, 255, 255));
        Btn_Salir.setText("Salir");
        Btn_Salir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Btn_SalirMouseClicked(evt);
            }
        });
        Btn_Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_SalirActionPerformed(evt);
            }
        });
        PanelPrin.add(Btn_Salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 570, 190, 70));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Fondito1.jpg"))); // NOI18N
        PanelPrin.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1310, 730));

        getContentPane().add(PanelPrin, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1310, 730));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Btn_SimularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_SimularActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Btn_SimularActionPerformed

    private void Btn_AgregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_AgregarMouseClicked
        abrirAgregar();
    }//GEN-LAST:event_Btn_AgregarMouseClicked

    private void Btn_ListarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_ListarMouseClicked
        abrirListar();
    }//GEN-LAST:event_Btn_ListarMouseClicked

    private void Btn_SimularMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_SimularMouseClicked
        
    }//GEN-LAST:event_Btn_SimularMouseClicked

    private void jTFpoderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFpoderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFpoderActionPerformed

    private void btn_addMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_addMouseClicked
        int index = jComboBoxU.getSelectedIndex();
        
        String name = jTFnombre.getText();
        String poder = jTFpoder.getText();
        String debilidad = jTFdebilidad.getText();
        String u = jComboBoxU.getItemAt(index).toString();
        int fuerza = Integer.parseInt(jTFfuerza.getText());
        int agilidadF = Integer.parseInt(jTFaf.getText());
        int agilidadM = Integer.parseInt(jTFam.getText());
        int hp = Integer.parseInt(jTFhp.getText());
        
        Personaje p = new Personaje(name, debilidad, u, poder, agilidadF, fuerza, agilidadM, hp);
        character.add(p);
        
        DefaultTreeModel m = (DefaultTreeModel) jTree.getModel();
        DefaultMutableTreeNode raiz  = (DefaultMutableTreeNode) m.getRoot();
        DefaultMutableTreeNode nodonuevo  = new DefaultMutableTreeNode (p);
        
        if(p.Universo.equals("DC")){
            ((DefaultMutableTreeNode)raiz.getChildAt(0)).add(nodonuevo);
        }else if (p.Universo.equals("Marvel")){
            ((DefaultMutableTreeNode)raiz.getChildAt(1)).add(nodonuevo);
        }else if (p.Universo.equals("CapCom")){
            ((DefaultMutableTreeNode)raiz.getChildAt(2)).add(nodonuevo);
        }else if (p.Universo.equals("MortalKombat")){
            ((DefaultMutableTreeNode)raiz.getChildAt(3)).add(nodonuevo);
        }
        
        JOptionPane.showMessageDialog(jD_agregar, "Personaje agregado exitosamente");
        jTFnombre.setText("");
        jTFpoder.setText("");
        jTFdebilidad.setText("");
        jTFfuerza.setText("");
        jTFaf.setText("");
        jTFam.setText("");
        jTFhp.setText("");
        m.reload();
    }//GEN-LAST:event_btn_addMouseClicked

    private void btn_menuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_menuMouseClicked
        Regrear();
    }//GEN-LAST:event_btn_menuMouseClicked

    private void btm_menuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btm_menuMouseClicked
        Regresar();
    }//GEN-LAST:event_btm_menuMouseClicked

    private void Btn_SalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_SalirMouseClicked
        System.exit(0);
    }//GEN-LAST:event_Btn_SalirMouseClicked

    private void Btn_SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_SalirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Btn_SalirActionPerformed

    private void jTreeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTreeMouseClicked
        if (evt.isMetaDown()) {
            int row = jTree.getClosestRowForLocation(evt.getX(), evt.getY());
            jTree.setSelectionRow(row);
            Object v1  = jTree.getSelectionPath().getLastPathComponent();
            nodo_seleccionado = (DefaultMutableTreeNode) v1;
            
            if (nodo_seleccionado.getUserObject().equals("DC")||nodo_seleccionado.getUserObject().equals("Marvel")||nodo_seleccionado.getUserObject().equals("CapCom")||nodo_seleccionado.getUserObject().equals("MortalKombat")) {
                popup1.show(evt.getComponent(),evt.getX(), evt.getY());
            }else{
                popup2.show(evt.getComponent(),evt.getX(), evt.getY());
            }
        }
    }//GEN-LAST:event_jTreeMouseClicked

    private void jmListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmListarActionPerformed
        DefaultListModel modelo = (DefaultListModel) jList.getModel();

        for (int i = 0; i < character.size(); i++) {
            if (nodo_seleccionado.toString().equals(((Personaje)character.get(i)).getUniverso())) {
                modelo.addElement(((Personaje)character.get(i)).toStringN());
            }
        }
    }//GEN-LAST:event_jmListarActionPerformed

    private void jmListar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmListar2ActionPerformed
        jList.setModel(new DefaultListModel ());
        
        Object personaje_seleccionado = jTree.getSelectionPath().getLastPathComponent();
        DefaultListModel modelo = (DefaultListModel) jList.getModel();
        
        for (int i = 0; i < character.size(); i++) {
            if (personaje_seleccionado.toString().equals(((Personaje)character.get(i)).getNombre())) {
                modelo.addElement(((Personaje)character.get(i)).toString());
                jTFnombrep.setText(((Personaje)character.get(i)).toString());
                break;
            }
        }
        
    }//GEN-LAST:event_jmListar2ActionPerformed

    private void jmeliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmeliminarActionPerformed
        int r = JOptionPane.showConfirmDialog(this,"¿Seguro que lo desea eliminar?","Confirm",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);

        if (r == JOptionPane.OK_OPTION) {
            DefaultTreeModel m = (DefaultTreeModel) jTree.getModel();
            m.removeNodeFromParent(nodo_seleccionado);
            m.reload();
            jList.setModel(new DefaultListModel());
            
        }
    }//GEN-LAST:event_jmeliminarActionPerformed

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }
    
    private void abrirAgregar() {
        this.dispose();
        jD_agregar.pack();
        jD_agregar.setLocationRelativeTo(this);
        jD_agregar.setVisible(true);
    }
    
    private void abrirListar() {
        this.dispose();
        jD_listar.pack();
        jD_listar.setLocationRelativeTo(this);
        jD_listar.setVisible(true);
    }
    
    private void Regrear() {
        jD_agregar.dispose();
        this.pack();
        this.setLocationRelativeTo(this);
        this.setVisible(true);
    }
    
    private void Regresar() {
        jD_listar.dispose();
        this.pack();
        this.setLocationRelativeTo(this);
        this.setVisible(true);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn_Agregar;
    private javax.swing.JButton Btn_Listar;
    private javax.swing.JButton Btn_Salir;
    private javax.swing.JButton Btn_Simular;
    private javax.swing.JPanel PanelPrin;
    private javax.swing.JLabel Titulo;
    private javax.swing.JLabel Universo;
    private javax.swing.JButton btm_menu;
    private javax.swing.JButton btn_add;
    private javax.swing.JButton btn_menu;
    private javax.swing.JComboBox<String> jComboBoxU;
    private javax.swing.JDialog jD_agregar;
    private javax.swing.JDialog jD_listar;
    private javax.swing.JLabel jL_agilidadF;
    private javax.swing.JLabel jL_agilidadM;
    private javax.swing.JLabel jL_debilidad;
    private javax.swing.JLabel jL_fuerza;
    private javax.swing.JLabel jL_hp;
    private javax.swing.JLabel jL_nombre3;
    private javax.swing.JLabel jL_poder;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JList<String> jList;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTFaf;
    private javax.swing.JTextField jTFam;
    private javax.swing.JTextField jTFdebilidad;
    private javax.swing.JTextField jTFfuerza;
    private javax.swing.JTextField jTFhp;
    private javax.swing.JTextField jTFnombre;
    private javax.swing.JTextField jTFnombrep;
    private javax.swing.JTextField jTFpoder;
    private javax.swing.JTree jTree;
    private javax.swing.JMenuItem jmListar;
    private javax.swing.JMenuItem jmListar2;
    private javax.swing.JMenuItem jmeliminar;
    private javax.swing.JPanel panelfondo;
    private javax.swing.JPopupMenu popup1;
    private javax.swing.JPopupMenu popup2;
    // End of variables declaration//GEN-END:variables
    
    
    DefaultMutableTreeNode nodo_seleccionado;
    Personaje personaje_seleccionado;
}
