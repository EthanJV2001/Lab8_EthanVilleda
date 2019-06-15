import basededatos.bda;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
public class main extends javax.swing.JFrame {
    
    public main() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jd_Login = new javax.swing.JDialog();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tf_NUsuario = new javax.swing.JTextField();
        tf_Clave = new javax.swing.JTextField();
        jb_LogIn = new javax.swing.JButton();
        jd_Admin = new javax.swing.JDialog();
        jLabel5 = new javax.swing.JLabel();
        tabbed_Admin = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        tf_NombreProducto = new javax.swing.JTextField();
        sp_Cantidad = new javax.swing.JSpinner();
        tf_Precio = new javax.swing.JTextField();
        jb_Agregar = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        sp_Dia = new javax.swing.JSpinner();
        sp_Mes = new javax.swing.JSpinner();
        sp_Anio = new javax.swing.JSpinner();
        jLabel12 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jt_Productos = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        jb_AgregarUsu = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        tf_NombreUsu = new javax.swing.JTextField();
        tf_IDE = new javax.swing.JTextField();
        tf_ClaveUsu = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        tf_SaldoUSU = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        tf_CuentaUSU = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jt_Usuarios = new javax.swing.JTable();
        jd_Cliente = new javax.swing.JDialog();
        jScrollPane2 = new javax.swing.JScrollPane();
        jt_Lista = new javax.swing.JTable();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        tf_Compra = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        ta_Factura = new javax.swing.JTextArea();
        popup_ModEliProductos = new javax.swing.JPopupMenu();
        mi_ModProd = new javax.swing.JMenuItem();
        mi_EliProd = new javax.swing.JMenuItem();
        popup_ModEliUsuario = new javax.swing.JPopupMenu();
        mi_ModUsu = new javax.swing.JMenuItem();
        mi_EliUsu = new javax.swing.JMenuItem();
        jd_ModProd = new javax.swing.JDialog();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        tf_NuevoNombreProd = new javax.swing.JTextField();
        sp_NuevaCantidad = new javax.swing.JSpinner();
        tf_NuevoPrecio = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        sp_NuevoDia = new javax.swing.JSpinner();
        jLabel24 = new javax.swing.JLabel();
        sp_NuevoMes = new javax.swing.JSpinner();
        jLabel25 = new javax.swing.JLabel();
        sp_NuevoAnio = new javax.swing.JSpinner();
        jb_Modificar = new javax.swing.JButton();
        jLabel26 = new javax.swing.JLabel();
        tf_ID = new javax.swing.JTextField();
        jd_ModUsu = new javax.swing.JDialog();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jb_Modificar1 = new javax.swing.JButton();
        tf_NuevoNombreUsu = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        tf_IDUSU = new javax.swing.JTextField();
        tf_NuevaCuenta = new javax.swing.JTextField();
        tf_NuevaClave = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        tf_NuevoNumID = new javax.swing.JTextField();
        tf_NuevoSaldo = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel2.setText("Sistema de Registro");

        jLabel3.setText("Nombre de usuario: ");

        jLabel4.setText("Clave de acceso: ");

        jb_LogIn.setText("Ingresar");
        jb_LogIn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_LogInMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jd_LoginLayout = new javax.swing.GroupLayout(jd_Login.getContentPane());
        jd_Login.getContentPane().setLayout(jd_LoginLayout);
        jd_LoginLayout.setHorizontalGroup(
            jd_LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_LoginLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jd_LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jd_LoginLayout.createSequentialGroup()
                        .addGroup(jd_LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(50, 50, 50)
                        .addGroup(jd_LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tf_NUsuario)
                            .addComponent(tf_Clave, javax.swing.GroupLayout.DEFAULT_SIZE, 229, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jd_LoginLayout.createSequentialGroup()
                        .addGap(0, 73, Short.MAX_VALUE)
                        .addComponent(jLabel2)))
                .addGap(87, 87, 87))
            .addGroup(jd_LoginLayout.createSequentialGroup()
                .addGap(184, 184, 184)
                .addComponent(jb_LogIn, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jd_LoginLayout.setVerticalGroup(
            jd_LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_LoginLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(29, 29, 29)
                .addGroup(jd_LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tf_NUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jd_LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tf_Clave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(jb_LogIn, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setText("Menu de administrador");

        tabbed_Admin.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                tabbed_AdminStateChanged(evt);
            }
        });

        jLabel6.setText("Nombre del producto: ");

        jLabel7.setText("Cantidad: ");

        jLabel8.setText("Precio: ");

        jLabel9.setText("Fecha de caducidad: ");

        jb_Agregar.setText("Agregar");
        jb_Agregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_AgregarMouseClicked(evt);
            }
        });

        jLabel10.setText("Dia");

        jLabel11.setText("Mes");

        jLabel12.setText("Anio");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addGap(60, 60, 60)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(sp_Cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 149, Short.MAX_VALUE)
                        .addComponent(jb_Agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(tf_NombreProducto)
                            .addComponent(tf_Precio, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(sp_Dia, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(sp_Mes, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(sp_Anio, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(tf_NombreProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(sp_Cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(tf_Precio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11)
                    .addComponent(sp_Dia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sp_Mes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sp_Anio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(jb_Agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        tabbed_Admin.addTab("Agregar producto", jPanel1);

        jt_Productos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Cantidad", "Precio"
            }
        ));
        jt_Productos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jt_ProductosMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jt_Productos);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 628, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE)
                .addContainerGap())
        );

        tabbed_Admin.addTab("Modificar/Eliminar productos", jPanel4);

        jb_AgregarUsu.setText("Agregar");
        jb_AgregarUsu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_AgregarUsuMouseClicked(evt);
            }
        });

        jLabel15.setText("Nombre: ");

        jLabel16.setText("Clave: ");

        jLabel17.setText("Numero de Identidad: ");

        jLabel13.setText("Saldo: ");

        jLabel14.setText("Cuenta: ");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15)
                    .addComponent(jLabel16)
                    .addComponent(jLabel14)
                    .addComponent(jLabel17)
                    .addComponent(jLabel13))
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(0, 16, Short.MAX_VALUE)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(tf_SaldoUSU, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(56, 56, 56)
                                .addComponent(jb_AgregarUsu, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(tf_ClaveUsu, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_NombreUsu, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_CuentaUSU, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tf_IDE, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(tf_NombreUsu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(tf_ClaveUsu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_CuentaUSU, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(tf_IDE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                        .addComponent(jb_AgregarUsu, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(tf_SaldoUSU, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        tabbed_Admin.addTab("Agregar cliente", jPanel5);

        jt_Usuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Clave", "Cuenta", "Numero ID", "Saldo"
            }
        ));
        jt_Usuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jt_UsuariosMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(jt_Usuarios);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 628, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE)
                .addContainerGap())
        );

        tabbed_Admin.addTab("Modificar/Eliminar cliente", jPanel6);

        javax.swing.GroupLayout jd_AdminLayout = new javax.swing.GroupLayout(jd_Admin.getContentPane());
        jd_Admin.getContentPane().setLayout(jd_AdminLayout);
        jd_AdminLayout.setHorizontalGroup(
            jd_AdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_AdminLayout.createSequentialGroup()
                .addGap(168, 168, 168)
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jd_AdminLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tabbed_Admin)
                .addContainerGap())
        );
        jd_AdminLayout.setVerticalGroup(
            jd_AdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_AdminLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(tabbed_Admin, javax.swing.GroupLayout.DEFAULT_SIZE, 302, Short.MAX_VALUE))
        );

        jt_Lista.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Precio"
            }
        ));
        jScrollPane2.setViewportView(jt_Lista);

        jLabel34.setText("Agregue nombre del objeto: ");

        jLabel35.setText("COMPRA");

        jButton2.setText("Agregar");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });

        ta_Factura.setColumns(20);
        ta_Factura.setRows(5);
        jScrollPane1.setViewportView(ta_Factura);

        javax.swing.GroupLayout jd_ClienteLayout = new javax.swing.GroupLayout(jd_Cliente.getContentPane());
        jd_Cliente.getContentPane().setLayout(jd_ClienteLayout);
        jd_ClienteLayout.setHorizontalGroup(
            jd_ClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_ClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jd_ClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jd_ClienteLayout.createSequentialGroup()
                        .addGroup(jd_ClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jd_ClienteLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel34))
                            .addGroup(jd_ClienteLayout.createSequentialGroup()
                                .addGap(131, 131, 131)
                                .addComponent(jLabel35)))
                        .addGap(0, 88, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_ClienteLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jd_ClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_ClienteLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jd_ClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tf_Compra, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING))))))
                .addContainerGap())
        );
        jd_ClienteLayout.setVerticalGroup(
            jd_ClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_ClienteLayout.createSequentialGroup()
                .addGroup(jd_ClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jd_ClienteLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jd_ClienteLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel35)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel34)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_Compra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton2)
                        .addGap(11, 11, 11)
                        .addComponent(jScrollPane1)))
                .addContainerGap())
        );

        mi_ModProd.setText("Modificar");
        mi_ModProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mi_ModProdActionPerformed(evt);
            }
        });
        popup_ModEliProductos.add(mi_ModProd);

        mi_EliProd.setText("Eliminar");
        mi_EliProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mi_EliProdActionPerformed(evt);
            }
        });
        popup_ModEliProductos.add(mi_EliProd);

        mi_ModUsu.setText("Modificar");
        mi_ModUsu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mi_ModUsuActionPerformed(evt);
            }
        });
        popup_ModEliUsuario.add(mi_ModUsu);

        mi_EliUsu.setText("Eliminar");
        mi_EliUsu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mi_EliUsuActionPerformed(evt);
            }
        });
        popup_ModEliUsuario.add(mi_EliUsu);

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel18.setText("Modificar Producto");

        jLabel19.setText("Nuevo nombre: ");

        jLabel20.setText("Nueva cantidad: ");

        jLabel21.setText("Nuevo precio: ");

        jLabel22.setText("Nueva fecha de caducidad:  ");

        jLabel23.setText("Dia");

        jLabel24.setText("Mes");

        jLabel25.setText("Anio");

        jb_Modificar.setText("Modificar");
        jb_Modificar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_ModificarMouseClicked(evt);
            }
        });

        jLabel26.setText("Numero de lista: ");

        javax.swing.GroupLayout jd_ModProdLayout = new javax.swing.GroupLayout(jd_ModProd.getContentPane());
        jd_ModProd.getContentPane().setLayout(jd_ModProdLayout);
        jd_ModProdLayout.setHorizontalGroup(
            jd_ModProdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_ModProdLayout.createSequentialGroup()
                .addGroup(jd_ModProdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jd_ModProdLayout.createSequentialGroup()
                        .addGroup(jd_ModProdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jd_ModProdLayout.createSequentialGroup()
                                .addGap(150, 150, 150)
                                .addComponent(jLabel18))
                            .addGroup(jd_ModProdLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jd_ModProdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel19)
                                    .addComponent(jLabel20)
                                    .addComponent(jLabel21)
                                    .addComponent(jLabel22)
                                    .addComponent(jLabel26))
                                .addGap(54, 54, 54)
                                .addGroup(jd_ModProdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jd_ModProdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(tf_NuevoNombreProd, javax.swing.GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE)
                                        .addComponent(sp_NuevaCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(tf_NuevoPrecio))
                                    .addGroup(jd_ModProdLayout.createSequentialGroup()
                                        .addGroup(jd_ModProdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(tf_ID, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jd_ModProdLayout.createSequentialGroup()
                                                .addComponent(jLabel23)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(sp_NuevoDia, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel24)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(sp_NuevoMes, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel25)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(sp_NuevoAnio, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 7, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_ModProdLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jb_Modificar, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jd_ModProdLayout.setVerticalGroup(
            jd_ModProdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_ModProdLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel18)
                .addGap(18, 18, 18)
                .addGroup(jd_ModProdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(tf_NuevoNombreProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_ModProdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(sp_NuevaCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_ModProdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(tf_NuevoPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_ModProdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(jLabel23)
                    .addComponent(sp_NuevoDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel24)
                    .addComponent(sp_NuevoMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel25)
                    .addComponent(sp_NuevoAnio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_ModProdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26)
                    .addComponent(tf_ID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jb_Modificar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel27.setText("Modificar Usuario");

        jLabel28.setText("Nuevo nombre: ");

        jLabel30.setText("Nueva clave: ");

        jLabel31.setText("Nueva cuenta: ");

        jb_Modificar1.setText("Modificar");
        jb_Modificar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_Modificar1MouseClicked(evt);
            }
        });

        jLabel33.setText("Numero de lista: ");

        jLabel29.setText("Nuevo numero de identidad: ");

        jLabel32.setText("Nuevo saldo: ");

        javax.swing.GroupLayout jd_ModUsuLayout = new javax.swing.GroupLayout(jd_ModUsu.getContentPane());
        jd_ModUsu.getContentPane().setLayout(jd_ModUsuLayout);
        jd_ModUsuLayout.setHorizontalGroup(
            jd_ModUsuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_ModUsuLayout.createSequentialGroup()
                .addGroup(jd_ModUsuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jd_ModUsuLayout.createSequentialGroup()
                        .addGroup(jd_ModUsuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jd_ModUsuLayout.createSequentialGroup()
                                .addGap(150, 150, 150)
                                .addComponent(jLabel27))
                            .addGroup(jd_ModUsuLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jd_ModUsuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel28)
                                    .addComponent(jLabel30)
                                    .addComponent(jLabel31)
                                    .addComponent(jLabel29)
                                    .addComponent(jLabel32)
                                    .addComponent(jLabel33))
                                .addGap(45, 45, 45)
                                .addGroup(jd_ModUsuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tf_NuevaClave)
                                    .addComponent(tf_NuevoNombreUsu, javax.swing.GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE)
                                    .addComponent(tf_NuevaCuenta)
                                    .addComponent(tf_NuevoNumID, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(tf_NuevoSaldo)
                                    .addComponent(tf_IDUSU))))
                        .addGap(0, 54, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_ModUsuLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jb_Modificar1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jd_ModUsuLayout.setVerticalGroup(
            jd_ModUsuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_ModUsuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel27)
                .addGap(18, 18, 18)
                .addGroup(jd_ModUsuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel28)
                    .addComponent(tf_NuevoNombreUsu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_ModUsuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel30)
                    .addComponent(tf_NuevaClave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_ModUsuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel31)
                    .addComponent(tf_NuevaCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_ModUsuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel29)
                    .addComponent(tf_NuevoNumID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_ModUsuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel32)
                    .addComponent(tf_NuevoSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_ModUsuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel33)
                    .addComponent(tf_IDUSU, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jb_Modificar1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Supermercado \"El Barrio\"");

        jButton1.setText("LogIn");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(66, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(58, 58, 58))
            .addGroup(layout.createSequentialGroup()
                .addGap(137, 137, 137)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(43, 43, 43)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(49, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        dispose();
        jd_Login.pack();
        jd_Login.setModal(true);
        jd_Login.setVisible(true);
    }//GEN-LAST:event_jButton1MouseClicked

    private void jb_LogInMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_LogInMouseClicked
        bda db = new bda("./Barrio.mdb");
        db.conectar();
        if(tf_NUsuario.getText().equals("Die123")){
            if(tf_Clave.getText().equals("321eid")){
                tf_NUsuario.setText("");
                tf_Clave.setText("");
                jd_Login.setVisible(false);
                jd_Admin.pack();
                jd_Admin.setModal(true);
                jd_Admin.setVisible(true);
            }else{
                JOptionPane.showMessageDialog(this, "Contrasenia incorrecta");
                tf_Clave.setText("");
            }
        }else{
            try {
                db.query.execute("select Nombre,Clave from Usuario");
                ResultSet rs = db.query.getResultSet();           
                while (rs.next()) {
                    System.out.println(rs.getString(1));
                    if(rs.getString(1).equals(tf_NUsuario.getText())){
                        System.out.println(rs.getString(2));
                        if(rs.getString(2).equals(tf_Clave.getText())){
                            tf_NUsuario.setText("");
                            tf_Clave.setText("");
                            jd_Login.setVisible(false);
                            jd_Cliente.pack();
                            jd_Cliente.setModal(true);
                            jd_Cliente.setVisible(true);
                        }else{
                            JOptionPane.showMessageDialog(this, "Contrasenia incorrecta");
                        }
                    }
                }            
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
            db.desconectar();
        }
    }//GEN-LAST:event_jb_LogInMouseClicked

    private void jb_AgregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_AgregarMouseClicked
        bda db = new bda("./Barrio.mdb");
        db.conectar();
        try {
            db.query.execute("INSERT INTO Productos"
                    + " (Nombre, Cantidad, Precio, Dia, Mes, Anio)"
                    + " VALUES ('" + tf_NombreProducto.getText() + "', '" + (int)sp_Cantidad.getValue() +"', '" + Double.parseDouble(tf_Precio.getText()) + 
                                "', '" + (int)sp_Dia.getValue() + "', '" + (int)sp_Mes.getValue() +"', '" + (int)sp_Anio.getValue() + "')");
            db.commit();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        db.desconectar();
        JOptionPane.showMessageDialog(this, "Agregado exitosamente!");
        tf_NombreProducto.setText(""); sp_Cantidad.setValue(0); tf_Precio.setText(""); sp_Dia.setValue(0); sp_Mes.setValue(0); sp_Anio.setValue(0);
    }//GEN-LAST:event_jb_AgregarMouseClicked

    private void tabbed_AdminStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_tabbed_AdminStateChanged
        if(tabbed_Admin.getSelectedIndex()==1){
            updateProductos();
        }if(tabbed_Admin.getSelectedIndex()==3){
            updateUsuarios();
        }
    }//GEN-LAST:event_tabbed_AdminStateChanged

    private void mi_ModProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mi_ModProdActionPerformed
        jd_Admin.setVisible(false);
        jd_ModProd.pack();
        jd_ModProd.setModal(true);
        jd_ModProd.setVisible(true);
    }//GEN-LAST:event_mi_ModProdActionPerformed

    private void mi_EliProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mi_EliProdActionPerformed
        bda db = new bda("./Barrio.mdb");
        db.conectar();
        try {
            db.query.execute("delete from Productos where Nombre = '" + jt_Productos.getColumn(0).toString()+ "'");
            db.commit();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        db.desconectar();
        updateProductos();
    }//GEN-LAST:event_mi_EliProdActionPerformed

    private void mi_EliUsuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mi_EliUsuActionPerformed
        bda db = new bda("./Barrio.mdb");
        int id=Integer.parseInt(JOptionPane.showInputDialog("Ingrese ID: "));
        db.conectar();
        try {
            db.query.execute("delete from Usuario where Id = '" + id + "'");
            db.commit();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        db.desconectar();
        updateUsuarios();
    }//GEN-LAST:event_mi_EliUsuActionPerformed

    private void jb_AgregarUsuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_AgregarUsuMouseClicked
        bda db = new bda("./Barrio.mdb");
        db.conectar();
        try {
            db.query.execute("INSERT INTO Usuario"
                    + "(Nombre, Clave, Cuenta, NumeroIdentidad, Saldo)"
                    + " VALUES ('" + tf_NombreUsu.getText() + "', '" + tf_ClaveUsu.getText() +"', " + Integer.parseInt(tf_CuentaUSU.getText()) + 
                                ", " + Integer.parseInt(tf_IDE.getText()) + ", " + Double.parseDouble(tf_SaldoUSU.getText()) + ")");
            db.commit();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        db.desconectar();
        JOptionPane.showMessageDialog(this, "Agregado exitosamente!");
        tf_NombreUsu.setText(""); tf_Clave.setText(""); tf_CuentaUSU.setText(""); tf_IDE.setText(""); tf_SaldoUSU.setText("");
    }//GEN-LAST:event_jb_AgregarUsuMouseClicked

    private void jb_ModificarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_ModificarMouseClicked
        bda db = new bda("./Barrio.mdb");
        db.conectar();
        try {  //Pone vos el id, miralo de access porfa, no se por que no se pone en orden
            db.query.execute("update Productos set Nombre='"+ tf_NuevoNombreProd.getText() +"' where Id=" + Integer.parseInt(tf_ID.getText()));
            db.query.execute("update Productos set Cantidad='"+ (int)sp_NuevaCantidad.getValue() + "' where Id=" + Integer.parseInt(tf_ID.getText()));
            db.query.execute("update Productos set Precio='"+ Integer.parseInt(tf_NuevoPrecio.getText()) +"' where Id=" + Integer.parseInt(tf_ID.getText()));
            db.query.execute("update Productos set Dia='"+ (int)sp_NuevoDia.getValue() +"' where Id=" + Integer.parseInt(tf_ID.getText()));
            db.query.execute("update Productos set Mes='"+ (int)sp_NuevoMes.getValue() +"' where Id=" + Integer.parseInt(tf_ID.getText()));
            db.query.execute("update Productos set Anio='"+ (int)sp_NuevoAnio.getValue() +"' where Id=" + Integer.parseInt(tf_ID.getText()));
            db.commit();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        db.desconectar();
        updateProductos();
        JOptionPane.showMessageDialog(this, "Modificado exitosamente!");
        tf_NuevoNombreProd.setText(""); sp_NuevaCantidad.setValue(0); tf_NuevoPrecio.setText(""); sp_Dia.setValue(0); sp_Mes.setValue(0); sp_Anio.setValue(0); tf_ID.setText("");
        jd_ModProd.setVisible(false);
        jd_Admin.pack();
        jd_Admin.setModal(true);
        jd_Admin.setVisible(true);
    }//GEN-LAST:event_jb_ModificarMouseClicked

    private void jb_Modificar1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_Modificar1MouseClicked
        bda db = new bda("./Barrio.mdb");
        db.conectar();
        try {  //Pone vos el id, miralo de access porfa, no se por que no se pone en orden
            db.query.execute("update Usuario set Nombre='"+ tf_NuevoNombreUsu.getText() +"' where Id=" + Integer.parseInt(tf_IDUSU.getText()));
            db.query.execute("update Usuario set Clave='"+ tf_NuevaClave.getText() + "' where Id=" + Integer.parseInt(tf_IDUSU.getText()));
            db.query.execute("update Usuario set Cuenta='"+ Integer.parseInt(tf_NuevaCuenta.getText()) +"' where Id=" + Integer.parseInt(tf_IDUSU.getText()));
            db.query.execute("update Usuario set NumeroIdentidad='"+ Integer.parseInt(tf_NuevoNumID.getText()) +"' where Id=" + Integer.parseInt(tf_IDUSU.getText()));
            db.query.execute("update Usuario set Saldo='"+ Double.parseDouble(tf_NuevoSaldo.getText()) +"' where Id=" + Integer.parseInt(tf_IDUSU.getText()));
            db.commit();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        db.desconectar();
        updateUsuarios();
        JOptionPane.showMessageDialog(this, "Modificado exitosamente!");
        tf_NuevoNombreUsu.setText(""); tf_NuevaClave.setText(""); tf_NuevaCuenta.setText(""); tf_NuevoNumID.setText(""); tf_NuevoSaldo.setText("");
        jd_ModUsu.setVisible(false);
        jd_Admin.pack();
        jd_Admin.setModal(true);
        jd_Admin.setVisible(true);
    }//GEN-LAST:event_jb_Modificar1MouseClicked

    private void mi_ModUsuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mi_ModUsuActionPerformed
        jd_Admin.setVisible(false);
        jd_ModUsu.pack();
        jd_ModUsu.setModal(true);
        jd_ModUsu.setVisible(true);
    }//GEN-LAST:event_mi_ModUsuActionPerformed

    private void jt_ProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jt_ProductosMouseClicked
        if(jt_Productos.getSelectedRow()>=0){
            if(evt.isMetaDown()){
                row=jt_Productos.getSelectedRow();
                Nombre=jt_Productos.getColumn(0).toString();
                popup_ModEliProductos.show(evt.getComponent(), evt.getX(), evt.getY());
            }
        }
    }//GEN-LAST:event_jt_ProductosMouseClicked

    private void jt_UsuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jt_UsuariosMouseClicked
        if(jt_Usuarios.getSelectedRow()>=0){
            if(evt.isMetaDown()){
                popup_ModEliUsuario.show(evt.getComponent(), evt.getX(), evt.getY());
            }
        }
    }//GEN-LAST:event_jt_UsuariosMouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        bda db = new bda("./Barrio.mdb");
        db.conectar();
        try {
            db.query.execute("select Nombre,Precio from Productos");
            ResultSet rs = db.query.getResultSet();           
            lista.add(rs.getString(0) + "                  L." + rs.getInt(2));
            subtotal+=rs.getInt(2);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        db.desconectar();
    }//GEN-LAST:event_jButton2MouseClicked

    public void updateProductos(){
        DefaultTableModel model=(DefaultTableModel)jt_Productos.getModel();
        model.setRowCount(0);
        bda db = new bda("./Barrio.mdb");
        db.conectar();
        try {
            db.query.execute("select Nombre,Cantidad,Precio from Productos");
            ResultSet rs = db.query.getResultSet();           
            while (rs.next()) {
                Object[] r={rs.getString(1), rs.getInt(2), rs.getInt(3)};
                model.addRow(r);
            }            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        db.desconectar();
    }
    
    public void updateProductos2(){
        DefaultTableModel model=(DefaultTableModel)jt_Lista.getModel();
        model.setRowCount(0);
        bda db = new bda("./Barrio.mdb");
        db.conectar();
        try {
            db.query.execute("select Nombre,Precio from Productos");
            ResultSet rs = db.query.getResultSet();           
            while (rs.next()) {
                Object[] r={rs.getString(1), rs.getInt(3)};
                model.addRow(r);
            }            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        db.desconectar();
    }
    
    public void updateUsuarios(){
        DefaultTableModel model=(DefaultTableModel)jt_Usuarios.getModel();
        model.setRowCount(0);
        bda db = new bda("./Barrio.mdb");
        db.conectar();
        try {
            db.query.execute("select Nombre,Clave,Cuenta,NumeroIdentidad,Saldo from Usuario");
            ResultSet rs = db.query.getResultSet();           
            while (rs.next()) {
                Object[] r={rs.getString(1), rs.getInt(2), rs.getInt(3), rs.getInt(4), rs.getInt(5)};
                model.addRow(r);
            }            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        db.desconectar();
    }
    
    public static void main(String args[]) {
    
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new main().setVisible(true);
            }
        });
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JButton jb_Agregar;
    private javax.swing.JButton jb_AgregarUsu;
    private javax.swing.JButton jb_LogIn;
    private javax.swing.JButton jb_Modificar;
    private javax.swing.JButton jb_Modificar1;
    private javax.swing.JDialog jd_Admin;
    private javax.swing.JDialog jd_Cliente;
    private javax.swing.JDialog jd_Login;
    private javax.swing.JDialog jd_ModProd;
    private javax.swing.JDialog jd_ModUsu;
    private javax.swing.JTable jt_Lista;
    private javax.swing.JTable jt_Productos;
    private javax.swing.JTable jt_Usuarios;
    private javax.swing.JMenuItem mi_EliProd;
    private javax.swing.JMenuItem mi_EliUsu;
    private javax.swing.JMenuItem mi_ModProd;
    private javax.swing.JMenuItem mi_ModUsu;
    private javax.swing.JPopupMenu popup_ModEliProductos;
    private javax.swing.JPopupMenu popup_ModEliUsuario;
    private javax.swing.JSpinner sp_Anio;
    private javax.swing.JSpinner sp_Cantidad;
    private javax.swing.JSpinner sp_Dia;
    private javax.swing.JSpinner sp_Mes;
    private javax.swing.JSpinner sp_NuevaCantidad;
    private javax.swing.JSpinner sp_NuevoAnio;
    private javax.swing.JSpinner sp_NuevoDia;
    private javax.swing.JSpinner sp_NuevoMes;
    private javax.swing.JTextArea ta_Factura;
    private javax.swing.JTabbedPane tabbed_Admin;
    private javax.swing.JTextField tf_Clave;
    private javax.swing.JTextField tf_ClaveUsu;
    private javax.swing.JTextField tf_Compra;
    private javax.swing.JTextField tf_CuentaUSU;
    private javax.swing.JTextField tf_ID;
    private javax.swing.JTextField tf_IDE;
    private javax.swing.JTextField tf_IDUSU;
    private javax.swing.JTextField tf_NUsuario;
    private javax.swing.JTextField tf_NombreProducto;
    private javax.swing.JTextField tf_NombreUsu;
    private javax.swing.JTextField tf_NuevaClave;
    private javax.swing.JTextField tf_NuevaCuenta;
    private javax.swing.JTextField tf_NuevoNombreProd;
    private javax.swing.JTextField tf_NuevoNombreUsu;
    private javax.swing.JTextField tf_NuevoNumID;
    private javax.swing.JTextField tf_NuevoPrecio;
    private javax.swing.JTextField tf_NuevoSaldo;
    private javax.swing.JTextField tf_Precio;
    private javax.swing.JTextField tf_SaldoUSU;
    // End of variables declaration//GEN-END:variables
    int row;
    String Nombre;
    ArrayList<String> lista=new ArrayList();
    int subtotal;
}
