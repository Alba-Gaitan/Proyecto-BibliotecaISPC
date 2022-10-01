package biblioteca_virtual;

import java.awt.BorderLayout;
import java.awt.Color;
import java.sql.Connection;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JPanel;

public class Dashboard extends javax.swing.JFrame {

    int xMouse;
    int yMouse;
    Connect conn;
    Connection reg;
    /**
     * Creates new form Dashboard
     */
    public Dashboard() {
        initComponents();
        conn = new Connect();
        reg = conn.getConnection();
        
        LocalDate now = LocalDate.now();
        int year = now.getYear();
        int dia = now.getDayOfMonth();
        int month = now.getMonthValue();
        String[] meses = {"Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Septiembre"
            ,"Octubre","Noviembre","Diciembre"};
        fecha.setText("Hoy es "+dia+" de "+meses[month - 1]+" de "+year);
        
        Principal p1 = new Principal();
        p1.setSize(750, 430);
        p1.setLocation(0,0);
        
        Login.removeAll();
        Login.add(p1, BorderLayout.CENTER);
        Login.revalidate();
        Login.repaint();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Background = new javax.swing.JPanel();
        Menu = new javax.swing.JPanel();
        btn_prin = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btn_returns = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btn_books = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        btn_reports = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        btn_reports1 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        btn_lends = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        app_name = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        app_name1 = new javax.swing.JLabel();
        btn_login = new javax.swing.JPanel();
        icologin = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        Header = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        fecha = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Title = new javax.swing.JPanel();
        red_squr = new javax.swing.JPanel();
        exit = new javax.swing.JLabel();
        Login = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        Background.setBackground(new java.awt.Color(255, 255, 255));
        Background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Menu.setBackground(new java.awt.Color(63, 72, 204));
        Menu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_prin.setBackground(new java.awt.Color(63, 72, 204));
        btn_prin.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_prin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_prinMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_prinMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_prinMousePressed(evt);
            }
        });
        btn_prin.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/biblioteca_virtual/images/home-outline.png"))); // NOI18N
        btn_prin.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 30, 30));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Principal");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel5MousePressed(evt);
            }
        });
        btn_prin.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, 30));

        Menu.add(btn_prin, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 270, 50));

        btn_returns.setBackground(new java.awt.Color(63, 72, 204));
        btn_returns.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_returns.setPreferredSize(new java.awt.Dimension(270, 51));
        btn_returns.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_returnsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_returnsMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_returnsMousePressed(evt);
            }
        });
        btn_returns.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/biblioteca_virtual/images/calendar-multiple-check.png"))); // NOI18N
        btn_returns.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 30, 30));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Devoluciones");
        btn_returns.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, 30));

        Menu.add(btn_returns, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, -1, -1));

        btn_books.setBackground(new java.awt.Color(63, 72, 204));
        btn_books.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_books.setPreferredSize(new java.awt.Dimension(270, 51));
        btn_books.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_booksMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_booksMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_booksMousePressed(evt);
            }
        });
        btn_books.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/biblioteca_virtual/images/book-open-page-variant.png"))); // NOI18N
        btn_books.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 30, 30));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Libros");
        btn_books.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, 30));

        Menu.add(btn_books, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 340, -1, -1));

        btn_reports.setBackground(new java.awt.Color(63, 72, 204));
        btn_reports.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_reports.setPreferredSize(new java.awt.Dimension(270, 51));
        btn_reports.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_reportsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_reportsMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_reportsMousePressed(evt);
            }
        });
        btn_reports.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/biblioteca_virtual/images/file-chart.png"))); // NOI18N
        btn_reports.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 30, 30));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Reportes");
        btn_reports.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, 30));

        btn_reports1.setBackground(new java.awt.Color(63, 72, 204));
        btn_reports1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_reports1.setPreferredSize(new java.awt.Dimension(270, 51));
        btn_reports1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_reports1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_reports1MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_reports1MousePressed(evt);
            }
        });
        btn_reports1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/biblioteca_virtual/images/file-chart.png"))); // NOI18N
        btn_reports1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 30, 30));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Reportes");
        btn_reports1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, 30));

        btn_reports.add(btn_reports1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 440, -1, -1));

        Menu.add(btn_reports, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 390, -1, -1));

        btn_lends.setBackground(new java.awt.Color(63, 72, 204));
        btn_lends.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_lends.setPreferredSize(new java.awt.Dimension(270, 51));
        btn_lends.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_lendsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_lendsMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_lendsMousePressed(evt);
            }
        });
        btn_lends.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/biblioteca_virtual/images/calendar-plus.png"))); // NOI18N
        btn_lends.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 30, 30));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Préstamos");
        btn_lends.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, 30));

        Menu.add(btn_lends, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, -1, -1));

        app_name.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        app_name.setForeground(new java.awt.Color(255, 255, 255));
        app_name.setText("Popular");
        app_name.setToolTipText("");
        Menu.add(app_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, 150, 40));

        jSeparator2.setPreferredSize(new java.awt.Dimension(50, 5));
        Menu.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 190, 20));

        app_name1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        app_name1.setForeground(new java.awt.Color(255, 255, 255));
        app_name1.setText("Biblioteca");
        app_name1.setToolTipText("");
        Menu.add(app_name1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 180, 40));

        btn_login.setBackground(new java.awt.Color(63, 72, 204));
        btn_login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_loginMouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_loginMousePressed(evt);
            }
        });
        btn_login.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        icologin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/biblioteca_virtual/images/account-multiple.png"))); // NOI18N
        btn_login.add(icologin, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 18, 36, 39));

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Login Usuarios");
        btn_login.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, -1, -1));

        Menu.add(btn_login, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 430, 270, 60));

        Background.add(Menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 270, 640));

        Header.setBackground(new java.awt.Color(63, 72, 144));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Administración/Control/Biblioteca");

        fecha.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        fecha.setForeground(new java.awt.Color(255, 255, 255));
        fecha.setText("Hoy es Sábado 28 de Abril de 2018");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Los Lectores");

        javax.swing.GroupLayout HeaderLayout = new javax.swing.GroupLayout(Header);
        Header.setLayout(HeaderLayout);
        HeaderLayout.setHorizontalGroup(
            HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeaderLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(HeaderLayout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(478, Short.MAX_VALUE))
                    .addGroup(HeaderLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(fecha)
                        .addGap(33, 33, 33))))
        );
        HeaderLayout.setVerticalGroup(
            HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeaderLayout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addGroup(HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        Background.add(Header, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 0, 750, 150));

        Title.setBackground(new java.awt.Color(255, 255, 255));
        Title.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                TitleMouseDragged(evt);
            }
        });
        Title.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                TitleMousePressed(evt);
            }
        });

        red_squr.setBackground(new java.awt.Color(255, 255, 255));
        red_squr.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        red_squr.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                red_squrMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                red_squrMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                red_squrMousePressed(evt);
            }
        });

        exit.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        exit.setForeground(new java.awt.Color(102, 102, 102));
        exit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        exit.setText("X");
        exit.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                exitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                exitMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                exitMousePressed(evt);
            }
        });

        javax.swing.GroupLayout red_squrLayout = new javax.swing.GroupLayout(red_squr);
        red_squr.setLayout(red_squrLayout);
        red_squrLayout.setHorizontalGroup(
            red_squrLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        red_squrLayout.setVerticalGroup(
            red_squrLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(exit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout TitleLayout = new javax.swing.GroupLayout(Title);
        Title.setLayout(TitleLayout);
        TitleLayout.setHorizontalGroup(
            TitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TitleLayout.createSequentialGroup()
                .addGap(0, 984, Short.MAX_VALUE)
                .addComponent(red_squr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        TitleLayout.setVerticalGroup(
            TitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(red_squr, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        Background.add(Title, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1020, -1));

        Login.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout LoginLayout = new javax.swing.GroupLayout(Login);
        Login.setLayout(LoginLayout);
        LoginLayout.setHorizontalGroup(
            LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 750, Short.MAX_VALUE)
        );
        LoginLayout.setVerticalGroup(
            LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 430, Short.MAX_VALUE)
        );

        Background.add(Login, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 210, 750, 430));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowActivated

    private void TitleMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TitleMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x-xMouse,y-yMouse);
    }//GEN-LAST:event_TitleMouseDragged

    private void TitleMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TitleMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_TitleMousePressed

    private void exitMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMousePressed
        System.exit(0);
    }//GEN-LAST:event_exitMousePressed

    private void btn_prinMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_prinMousePressed
        setColor(btn_prin);
        resetColor(btn_lends);
        resetColor(btn_returns);
        resetColor(btn_login);
        resetColor(btn_books);
        resetColor(btn_reports);
        // Abrir sección
        Principal p1 = new Principal();
        p1.setSize(750, 430);
        p1.setLocation(0,0);
        
        Login.removeAll();
        Login.add(p1, BorderLayout.CENTER);
        Login.revalidate();
        Login.repaint();
    }//GEN-LAST:event_btn_prinMousePressed

    private void btn_lendsMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_lendsMousePressed
        resetColor(btn_prin);
        setColor(btn_lends);
        resetColor(btn_returns);
        resetColor(btn_login);
        resetColor(btn_books);
        resetColor(btn_reports);
        // Abrir sección
        Lendings p1 = new Lendings();
        p1.setSize(750, 430);
        p1.setLocation(0,0);
        
        Login.removeAll();
        Login.add(p1, BorderLayout.CENTER);
        Login.revalidate();
        Login.repaint();
    }//GEN-LAST:event_btn_lendsMousePressed

    private void btn_returnsMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_returnsMousePressed
        resetColor(btn_prin);
        resetColor(btn_lends);
        setColor(btn_returns);
        resetColor(btn_login);
        resetColor(btn_books);
        resetColor(btn_reports);
        // Abrir sección
        Returns p1 = new Returns();
        p1.setSize(750, 430);
        p1.setLocation(0,0);
        
        Login.removeAll();
        Login.add(p1, BorderLayout.CENTER);
        Login.revalidate();
        Login.repaint();
    }//GEN-LAST:event_btn_returnsMousePressed

    private void btn_booksMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_booksMousePressed
        resetColor(btn_prin);
        resetColor(btn_lends);
        resetColor(btn_returns);
        resetColor(btn_login);
        setColor(btn_books);
        resetColor(btn_reports);
        // Abrir sección
        Books p1 = new Books();
        p1.setSize(750, 430);
        p1.setLocation(0,0);
        
        Login.removeAll();
        Login.add(p1, BorderLayout.CENTER);
        Login.revalidate();
        Login.repaint();
    }//GEN-LAST:event_btn_booksMousePressed

    private void btn_reportsMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_reportsMousePressed
        resetColor(btn_prin);
        resetColor(btn_lends);
        resetColor(btn_returns);
        resetColor(btn_login);
        resetColor(btn_books);
        setColor(btn_reports);
        // Abrir sección
        Reports p1 = new Reports();
        p1.setSize(750, 430);
        p1.setLocation(0,0);
        
        Login.removeAll();
        Login.add(p1, BorderLayout.CENTER);
        Login.revalidate();
        Login.repaint();
    }//GEN-LAST:event_btn_reportsMousePressed

    private void red_squrMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_red_squrMousePressed
        System.exit(0);
    }//GEN-LAST:event_red_squrMousePressed

    private void btn_lendsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_lendsMouseEntered
        if(btn_lends.getBackground().getRGB() == -15574355)
            setColor(btn_lends);
    }//GEN-LAST:event_btn_lendsMouseEntered

    private void btn_lendsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_lendsMouseExited
        if(btn_prin.getBackground().getRGB() != -15574355 || btn_returns.getBackground().getRGB() != -15574355
            || btn_books.getBackground().getRGB() != -15574355 || btn_reports.getBackground().getRGB() != -15574355
            || btn_login.getBackground().getRGB() != -15574355)
            resetColor(btn_lends);
    }//GEN-LAST:event_btn_lendsMouseExited

    private void btn_prinMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_prinMouseEntered
        if(btn_prin.getBackground().getRGB() == -15574355)
            setColor(btn_prin);
    }//GEN-LAST:event_btn_prinMouseEntered

    private void btn_prinMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_prinMouseExited
        if(btn_lends.getBackground().getRGB() != -15574355 || btn_returns.getBackground().getRGB() != -15574355
            ||  btn_books.getBackground().getRGB() != -15574355 || btn_reports.getBackground().getRGB() != -15574355
            || btn_login.getBackground().getRGB() != -15574355)
            resetColor(btn_prin);
    }//GEN-LAST:event_btn_prinMouseExited

    private void btn_returnsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_returnsMouseEntered
        if(btn_returns.getBackground().getRGB() == -15574355)
            setColor(btn_returns);
    }//GEN-LAST:event_btn_returnsMouseEntered

    private void btn_returnsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_returnsMouseExited
        if(btn_lends.getBackground().getRGB() != -15574355 || btn_prin.getBackground().getRGB() != -15574355
            || btn_books.getBackground().getRGB() != -15574355 || btn_reports.getBackground().getRGB() != -15574355
            || btn_login.getBackground().getRGB() != -15574355)
            resetColor(btn_returns);
    }//GEN-LAST:event_btn_returnsMouseExited

    private void btn_booksMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_booksMouseEntered
        if(btn_books.getBackground().getRGB() == -15574355)
            setColor(btn_books);
    }//GEN-LAST:event_btn_booksMouseEntered

    private void btn_booksMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_booksMouseExited
        if(btn_lends.getBackground().getRGB() != -15574355 || btn_prin.getBackground().getRGB() != -15574355
            || btn_returns.getBackground().getRGB() != -15574355 ||  btn_reports.getBackground().getRGB() != -15574355
            || btn_login.getBackground().getRGB() != -15574355)
            resetColor(btn_books);
    }//GEN-LAST:event_btn_booksMouseExited

    private void btn_reportsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_reportsMouseEntered
        if(btn_reports.getBackground().getRGB() == -15574355)
            setColor(btn_reports);
    }//GEN-LAST:event_btn_reportsMouseEntered

    private void btn_reportsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_reportsMouseExited
        if(btn_lends.getBackground().getRGB() != -15574355 || btn_prin.getBackground().getRGB() != -15574355
            || btn_returns.getBackground().getRGB() != -15574355 || btn_books.getBackground().getRGB() != -15574355
                || btn_login.getBackground().getRGB() != -15574355)
            resetColor(btn_reports);
    }//GEN-LAST:event_btn_reportsMouseExited

    private void red_squrMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_red_squrMouseEntered
        red_squr.setBackground(new Color(204,0,0));
        exit.setForeground(Color.white);
    }//GEN-LAST:event_red_squrMouseEntered

    private void red_squrMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_red_squrMouseExited
        red_squr.setBackground(new Color(255,255,255));
        exit.setForeground(new Color(102,102,102));
    }//GEN-LAST:event_red_squrMouseExited

    private void exitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseEntered
        red_squr.setBackground(new Color(204,0,0));
        exit.setForeground(Color.white);
    }//GEN-LAST:event_exitMouseEntered

    private void exitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseExited
        red_squr.setBackground(new Color(255,255,255));
        exit.setForeground(new Color(102,102,102));
    }//GEN-LAST:event_exitMouseExited

    private void btn_reports1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_reports1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_reports1MouseEntered

    private void btn_reports1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_reports1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_reports1MouseExited

    private void btn_reports1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_reports1MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_reports1MousePressed

    private void jLabel5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel5MousePressed

    private void btn_loginMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_loginMousePressed
      
        // Aqui me debe dirigir a la pantalla de login
        resetColor(btn_prin);
        resetColor(btn_lends);
        resetColor(btn_returns);
  
        resetColor(btn_books);
        resetColor(btn_reports);
        setColor(btn_login);
        // Abrir sección
        Login p1 = new Login();
        p1.setSize(750, 430);
        p1.setLocation(0,0);
        
        Login.removeAll();
        Login.add(p1, BorderLayout.CENTER);
        Login.revalidate();
        Login.repaint();    
    }//GEN-LAST:event_btn_loginMousePressed

    private void btn_loginMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_loginMouseEntered
        if(btn_login.getBackground().getRGB() == -15574355)
            setColor(btn_login);
    }//GEN-LAST:event_btn_loginMouseEntered

    void setColor(JPanel panel){
        panel.setBackground(new Color(21,101,192));
    }
    void resetColor(JPanel panel){
        panel.setBackground(new Color(18,90,173));
    }
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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Background;
    private javax.swing.JPanel Header;
    public static javax.swing.JPanel Login;
    private javax.swing.JPanel Menu;
    private javax.swing.JPanel Title;
    private javax.swing.JLabel app_name;
    private javax.swing.JLabel app_name1;
    private javax.swing.JPanel btn_books;
    private javax.swing.JPanel btn_lends;
    private javax.swing.JPanel btn_login;
    private javax.swing.JPanel btn_prin;
    private javax.swing.JPanel btn_reports;
    private javax.swing.JPanel btn_reports1;
    private javax.swing.JPanel btn_returns;
    private javax.swing.JLabel exit;
    private javax.swing.JLabel fecha;
    private javax.swing.JLabel icologin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JPanel red_squr;
    // End of variables declaration//GEN-END:variables
}