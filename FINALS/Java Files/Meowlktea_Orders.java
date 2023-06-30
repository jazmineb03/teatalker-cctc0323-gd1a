
package group06;
public class Meowlktea_Orders extends javax.swing.JFrame {
    public Meowlktea_Orders() {
        initComponents();
     
        // this will set the receipt and buttons invisble.    
        correct.setVisible(false);
        corr.setVisible(false);
        tot.setVisible(false);
        tot1.setVisible(false);    
        addOrder2.setVisible(false);
        addOrder3.setVisible(false);
        ord2.setVisible(false);
        ord3.setVisible(false);
        ord4.setVisible(false);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        MilkteaShop = new javax.swing.JPanel();
        Title = new javax.swing.JLabel();
        Menu = new javax.swing.JPanel();
        choose = new javax.swing.JLabel();
        price1 = new javax.swing.JLabel();
        price2 = new javax.swing.JLabel();
        price3 = new javax.swing.JLabel();
        price4 = new javax.swing.JLabel();
        sink = new javax.swing.JLabel();
        sugar = new javax.swing.JLabel();
        sugar1 = new javax.swing.JRadioButton();
        sugar2 = new javax.swing.JRadioButton();
        sugar3 = new javax.swing.JRadioButton();
        sugar4 = new javax.swing.JRadioButton();
        sink1 = new javax.swing.JRadioButton();
        sink2 = new javax.swing.JRadioButton();
        sink3 = new javax.swing.JRadioButton();
        addOrder = new javax.swing.JButton();
        clearOrder = new javax.swing.JButton();
        meow1 = new javax.swing.JRadioButton();
        meow2 = new javax.swing.JRadioButton();
        meow3 = new javax.swing.JRadioButton();
        meow4 = new javax.swing.JRadioButton();
        max = new javax.swing.JLabel();
        Receipt = new javax.swing.JPanel();
        rec = new javax.swing.JPanel();
        Title2 = new javax.swing.JLabel();
        tot = new javax.swing.JLabel();
        corr = new javax.swing.JLabel();
        addOrder2 = new javax.swing.JButton();
        addOrder3 = new javax.swing.JButton();
        correct = new javax.swing.JLabel();
        tot1 = new javax.swing.JTextField();
        Order = new javax.swing.JPanel();
        OrderS = new javax.swing.JPanel();
        Title1 = new javax.swing.JLabel();
        addOrder1 = new javax.swing.JButton();
        milk1 = new javax.swing.JLabel();
        milk2 = new javax.swing.JLabel();
        milk3 = new javax.swing.JLabel();
        milk4 = new javax.swing.JLabel();
        add1 = new javax.swing.JLabel();
        sug1 = new javax.swing.JLabel();
        pr1 = new javax.swing.JLabel();
        add2 = new javax.swing.JLabel();
        add3 = new javax.swing.JLabel();
        add4 = new javax.swing.JLabel();
        sug2 = new javax.swing.JLabel();
        sug3 = new javax.swing.JLabel();
        sug4 = new javax.swing.JLabel();
        pr2 = new javax.swing.JLabel();
        pr3 = new javax.swing.JLabel();
        pr4 = new javax.swing.JLabel();
        milkLabel = new javax.swing.JLabel();
        addLabel = new javax.swing.JLabel();
        sugLabel = new javax.swing.JLabel();
        prLabel = new javax.swing.JLabel();
        ord2 = new javax.swing.JButton();
        ord3 = new javax.swing.JButton();
        ord4 = new javax.swing.JButton();
        max1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        MilkteaShop.setBackground(new java.awt.Color(102, 0, 102));
        MilkteaShop.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 4, 4, new java.awt.Color(51, 0, 51)));

        Title.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        Title.setForeground(new java.awt.Color(255, 255, 255));
        Title.setText("+  +  +  Welcome to Meowlktea Shop!  +  +  +");

        javax.swing.GroupLayout MilkteaShopLayout = new javax.swing.GroupLayout(MilkteaShop);
        MilkteaShop.setLayout(MilkteaShopLayout);
        MilkteaShopLayout.setHorizontalGroup(
            MilkteaShopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MilkteaShopLayout.createSequentialGroup()
                .addGap(142, 142, 142)
                .addComponent(Title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        MilkteaShopLayout.setVerticalGroup(
            MilkteaShopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MilkteaShopLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Title)
                .addContainerGap())
        );

        Menu.setBackground(new java.awt.Color(255, 204, 255));
        Menu.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 4, 4, new java.awt.Color(153, 0, 153)));

        choose.setFont(new java.awt.Font("MS UI Gothic", 1, 14)); // NOI18N
        choose.setText("Please Choose your Milktea Order/s Here:");

        price1.setBackground(new java.awt.Color(255, 255, 255));
        price1.setFont(new java.awt.Font("MS UI Gothic", 1, 14)); // NOI18N
        price1.setText("PHP 70");

        price2.setBackground(new java.awt.Color(255, 255, 255));
        price2.setFont(new java.awt.Font("MS UI Gothic", 1, 14)); // NOI18N
        price2.setText("PHP 75");

        price3.setBackground(new java.awt.Color(255, 255, 255));
        price3.setFont(new java.awt.Font("MS UI Gothic", 1, 14)); // NOI18N
        price3.setText("PHP 85");

        price4.setBackground(new java.awt.Color(255, 255, 255));
        price4.setFont(new java.awt.Font("MS UI Gothic", 1, 14)); // NOI18N
        price4.setText("PHP 90");

        sink.setFont(new java.awt.Font("MS UI Gothic", 1, 14)); // NOI18N
        sink.setText("Add-Ons/Sinkers:");

        sugar.setFont(new java.awt.Font("MS UI Gothic", 1, 14)); // NOI18N
        sugar.setText("Sugar Level:");

        sugar1.setBackground(new java.awt.Color(255, 204, 255));
        buttonGroup1.add(sugar1);
        sugar1.setFont(new java.awt.Font("MS PGothic", 2, 14)); // NOI18N
        sugar1.setText(" 25%");

        sugar2.setBackground(new java.awt.Color(255, 204, 255));
        buttonGroup1.add(sugar2);
        sugar2.setFont(new java.awt.Font("MS PGothic", 2, 14)); // NOI18N
        sugar2.setText(" 50%");

        sugar3.setBackground(new java.awt.Color(255, 204, 255));
        buttonGroup1.add(sugar3);
        sugar3.setFont(new java.awt.Font("MS PGothic", 2, 14)); // NOI18N
        sugar3.setText(" 75%");

        sugar4.setBackground(new java.awt.Color(255, 204, 255));
        buttonGroup1.add(sugar4);
        sugar4.setFont(new java.awt.Font("MS PGothic", 2, 14)); // NOI18N
        sugar4.setText(" 100%");

        sink1.setBackground(new java.awt.Color(255, 204, 255));
        buttonGroup2.add(sink1);
        sink1.setFont(new java.awt.Font("MS PGothic", 2, 14)); // NOI18N
        sink1.setText("  [C]    Pearl");

        sink2.setBackground(new java.awt.Color(255, 204, 255));
        buttonGroup2.add(sink2);
        sink2.setFont(new java.awt.Font("MS PGothic", 2, 14)); // NOI18N
        sink2.setText("  [A]    Nata");

        sink3.setBackground(new java.awt.Color(255, 204, 255));
        buttonGroup2.add(sink3);
        sink3.setFont(new java.awt.Font("MS PGothic", 2, 14)); // NOI18N
        sink3.setText("  [T]    Pudding");

        addOrder.setBackground(new java.awt.Color(255, 51, 102));
        addOrder.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        addOrder.setForeground(new java.awt.Color(255, 255, 255));
        addOrder.setText("Add Order");
        addOrder.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 3, 3, new java.awt.Color(153, 0, 51)));
        addOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addOrderActionPerformed(evt);
            }
        });

        clearOrder.setBackground(new java.awt.Color(255, 51, 102));
        clearOrder.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        clearOrder.setForeground(new java.awt.Color(255, 255, 255));
        clearOrder.setText("Clear Order");
        clearOrder.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 3, 3, new java.awt.Color(153, 0, 51)));
        clearOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearOrderActionPerformed(evt);
            }
        });

        meow1.setBackground(new java.awt.Color(255, 204, 255));
        buttonGroup3.add(meow1);
        meow1.setFont(new java.awt.Font("MS PGothic", 2, 14)); // NOI18N
        meow1.setText("  [M]      Cookies and Cream Milktea");
        meow1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                meow1ActionPerformed(evt);
            }
        });

        meow2.setBackground(new java.awt.Color(255, 204, 255));
        buttonGroup3.add(meow2);
        meow2.setFont(new java.awt.Font("MS PGothic", 2, 14)); // NOI18N
        meow2.setText("  [E]      Strawberry Cheesecake Milktea");

        meow3.setBackground(new java.awt.Color(255, 204, 255));
        buttonGroup3.add(meow3);
        meow3.setFont(new java.awt.Font("MS PGothic", 2, 14)); // NOI18N
        meow3.setText("  [O]      Mocha Manifico Milktea");

        meow4.setBackground(new java.awt.Color(255, 204, 255));
        buttonGroup3.add(meow4);
        meow4.setFont(new java.awt.Font("MS PGothic", 2, 14)); // NOI18N
        meow4.setText("  [W]     Caramel Macchiato Milktea");

        max.setFont(new java.awt.Font("MS PGothic", 3, 10)); // NOI18N
        max.setForeground(new java.awt.Color(204, 102, 255));
        max.setText("*MAXIMUM OF FOUR (4) ORDERS ONLY!");

        javax.swing.GroupLayout MenuLayout = new javax.swing.GroupLayout(Menu);
        Menu.setLayout(MenuLayout);
        MenuLayout.setHorizontalGroup(
            MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuLayout.createSequentialGroup()
                .addGroup(MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MenuLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(choose, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(MenuLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(MenuLayout.createSequentialGroup()
                                        .addGroup(MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(meow1, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(meow3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(meow2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                        .addGap(20, 20, 20))
                                    .addGroup(MenuLayout.createSequentialGroup()
                                        .addComponent(meow4, javax.swing.GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE)
                                        .addGap(23, 23, 23)))
                                .addGroup(MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(MenuLayout.createSequentialGroup()
                                        .addComponent(price4, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(30, 30, 30))
                                    .addGroup(MenuLayout.createSequentialGroup()
                                        .addGroup(MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(price3, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(price2, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(price1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 0, Short.MAX_VALUE))))))
                    .addGroup(MenuLayout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(sugar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(sugar1)
                        .addGap(18, 18, 18)
                        .addComponent(sugar2)
                        .addGap(18, 18, 18)
                        .addComponent(sugar3)
                        .addGap(18, 18, 18)
                        .addComponent(sugar4)))
                .addGroup(MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MenuLayout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sink, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(MenuLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(sink2)
                                    .addComponent(sink1)
                                    .addComponent(sink3)))))
                    .addGroup(MenuLayout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addGroup(MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(clearOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(66, 66, 66))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MenuLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(max)
                .addContainerGap())
        );
        MenuLayout.setVerticalGroup(
            MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(choose)
                    .addComponent(sink))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(price1)
                    .addComponent(sink1)
                    .addComponent(meow1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(price2)
                    .addComponent(sink2)
                    .addComponent(meow2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(price3)
                    .addComponent(sink3)
                    .addComponent(meow3))
                .addGroup(MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MenuLayout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(meow4)
                            .addComponent(price4))
                        .addGap(29, 29, 29)
                        .addGroup(MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(sugar)
                            .addComponent(sugar1)
                            .addComponent(sugar2)
                            .addComponent(sugar3)
                            .addComponent(sugar4)))
                    .addGroup(MenuLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(addOrder)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(clearOrder)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(max)
                .addContainerGap())
        );

        Receipt.setBackground(new java.awt.Color(255, 204, 255));
        Receipt.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 4, 4, new java.awt.Color(153, 0, 153)));

        rec.setBackground(new java.awt.Color(102, 0, 102));
        rec.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 4, 4, new java.awt.Color(51, 0, 51)));

        Title2.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        Title2.setForeground(new java.awt.Color(255, 255, 255));
        Title2.setText("+  Receipt  +");

        javax.swing.GroupLayout recLayout = new javax.swing.GroupLayout(rec);
        rec.setLayout(recLayout);
        recLayout.setHorizontalGroup(
            recLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, recLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Title2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43))
        );
        recLayout.setVerticalGroup(
            recLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(recLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Title2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tot.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        tot.setText("TOTAL");

        corr.setFont(new java.awt.Font("MS UI Gothic", 1, 14)); // NOI18N
        corr.setText("Is your order correct?");

        addOrder2.setBackground(new java.awt.Color(255, 51, 102));
        addOrder2.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        addOrder2.setForeground(new java.awt.Color(255, 255, 255));
        addOrder2.setText("Proceed");
        addOrder2.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 3, 3, new java.awt.Color(153, 0, 51)));
        addOrder2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addOrder2ActionPerformed(evt);
            }
        });

        addOrder3.setBackground(new java.awt.Color(255, 51, 102));
        addOrder3.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        addOrder3.setForeground(new java.awt.Color(255, 255, 255));
        addOrder3.setText("Cancel");
        addOrder3.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 3, 3, new java.awt.Color(153, 0, 51)));
        addOrder3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addOrder3ActionPerformed(evt);
            }
        });

        correct.setIcon(new javax.swing.ImageIcon("C:\\Users\\My PC\\Desktop\\reign\\school\\BPSU\\hello.jpg")); // NOI18N

        tot1.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        tot1.setText("PHP 00.00");
        tot1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tot1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ReceiptLayout = new javax.swing.GroupLayout(Receipt);
        Receipt.setLayout(ReceiptLayout);
        ReceiptLayout.setHorizontalGroup(
            ReceiptLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(rec, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ReceiptLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(correct)
                .addGap(30, 30, 30))
            .addGroup(ReceiptLayout.createSequentialGroup()
                .addGroup(ReceiptLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ReceiptLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(ReceiptLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ReceiptLayout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(tot)
                                .addGap(18, 18, 18)
                                .addComponent(tot1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(corr, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(ReceiptLayout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addGroup(ReceiptLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(addOrder3, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addOrder2, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        ReceiptLayout.setVerticalGroup(
            ReceiptLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ReceiptLayout.createSequentialGroup()
                .addComponent(rec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(corr)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(correct, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(ReceiptLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tot)
                    .addComponent(tot1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addComponent(addOrder2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addOrder3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        Order.setBackground(new java.awt.Color(255, 204, 255));
        Order.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 4, 4, new java.awt.Color(153, 0, 153)));

        OrderS.setBackground(new java.awt.Color(102, 0, 102));
        OrderS.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 4, 4, new java.awt.Color(51, 0, 51)));

        Title1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Title1.setForeground(new java.awt.Color(255, 255, 255));
        Title1.setText("+ + +  Your Milktea Order/s  + + +");

        javax.swing.GroupLayout OrderSLayout = new javax.swing.GroupLayout(OrderS);
        OrderS.setLayout(OrderSLayout);
        OrderSLayout.setHorizontalGroup(
            OrderSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, OrderSLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Title1, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45))
        );
        OrderSLayout.setVerticalGroup(
            OrderSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, OrderSLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Title1)
                .addContainerGap())
        );

        addOrder1.setBackground(new java.awt.Color(255, 51, 102));
        addOrder1.setFont(new java.awt.Font("Segoe UI Black", 0, 16)); // NOI18N
        addOrder1.setForeground(new java.awt.Color(255, 255, 255));
        addOrder1.setText("Check Out");
        addOrder1.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 3, 3, new java.awt.Color(153, 0, 51)));
        addOrder1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addOrder1ActionPerformed(evt);
            }
        });

        milk1.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        milk1.setText("[-] -");

        milk2.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        milk2.setText("[-] -");

        milk3.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        milk3.setText("[-] -");

        milk4.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        milk4.setText("[-] -");

        add1.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        add1.setText("[-] -");

        sug1.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        sug1.setText("100%");

        pr1.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        pr1.setText("-");

        add2.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        add2.setText("[-] -");

        add3.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        add3.setText("[-] -");

        add4.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        add4.setText("[-] -");

        sug2.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        sug2.setText("100%");

        sug3.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        sug3.setText("100%");

        sug4.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        sug4.setText("100%");

        pr2.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        pr2.setText("-");

        pr3.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        pr3.setText("-");

        pr4.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        pr4.setText("-");

        milkLabel.setFont(new java.awt.Font("MS UI Gothic", 1, 16)); // NOI18N
        milkLabel.setText("MILKTEA");

        addLabel.setFont(new java.awt.Font("MS UI Gothic", 1, 15)); // NOI18N
        addLabel.setText("ADD-ONS");

        sugLabel.setFont(new java.awt.Font("MS UI Gothic", 1, 15)); // NOI18N
        sugLabel.setText(" SUGAR %");

        prLabel.setFont(new java.awt.Font("MS UI Gothic", 1, 15)); // NOI18N
        prLabel.setText("PRICE");

        ord2.setBackground(new java.awt.Color(255, 51, 102));
        ord2.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        ord2.setForeground(new java.awt.Color(255, 255, 255));
        ord2.setText("+");
        ord2.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 3, 3, new java.awt.Color(153, 0, 51)));
        ord2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ord2ActionPerformed(evt);
            }
        });

        ord3.setBackground(new java.awt.Color(255, 51, 102));
        ord3.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        ord3.setForeground(new java.awt.Color(255, 255, 255));
        ord3.setText("+");
        ord3.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 3, 3, new java.awt.Color(153, 0, 51)));
        ord3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ord3ActionPerformed(evt);
            }
        });

        ord4.setBackground(new java.awt.Color(255, 51, 102));
        ord4.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        ord4.setForeground(new java.awt.Color(255, 255, 255));
        ord4.setText("+");
        ord4.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 3, 3, new java.awt.Color(153, 0, 51)));
        ord4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ord4ActionPerformed(evt);
            }
        });

        max1.setFont(new java.awt.Font("MS PGothic", 3, 14)); // NOI18N
        max1.setForeground(new java.awt.Color(204, 102, 255));
        max1.setText("*Click the \"+\" Button to ADD another order.");

        javax.swing.GroupLayout OrderLayout = new javax.swing.GroupLayout(Order);
        Order.setLayout(OrderLayout);
        OrderLayout.setHorizontalGroup(
            OrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(OrderS, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(OrderLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(OrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(OrderLayout.createSequentialGroup()
                        .addComponent(milk1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, OrderLayout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(milkLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(OrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(OrderLayout.createSequentialGroup()
                                .addComponent(addLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(sugLabel))
                            .addComponent(add2, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(add1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(39, 39, 39))
                    .addGroup(OrderLayout.createSequentialGroup()
                        .addGroup(OrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(milk2)
                            .addComponent(milk3, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(milk4))
                        .addGap(34, 34, 34)
                        .addGroup(OrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, OrderLayout.createSequentialGroup()
                                .addComponent(add3, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                                .addComponent(sug3))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, OrderLayout.createSequentialGroup()
                                .addComponent(add4, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(sug4))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, OrderLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(OrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(sug1, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(sug2, javax.swing.GroupLayout.Alignment.TRAILING))))
                        .addGap(57, 57, 57)))
                .addGroup(OrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(OrderLayout.createSequentialGroup()
                        .addComponent(prLabel)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(OrderLayout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(OrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(pr2)
                            .addComponent(pr1)
                            .addComponent(pr3)
                            .addComponent(pr4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                        .addGroup(OrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ord2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ord3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ord4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, OrderLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(OrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(addOrder1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(max1))
                .addContainerGap())
        );
        OrderLayout.setVerticalGroup(
            OrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(OrderLayout.createSequentialGroup()
                .addComponent(OrderS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(OrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(OrderLayout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addGroup(OrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(add1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(OrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(milk1)
                                .addComponent(sug1)
                                .addComponent(pr1))))
                    .addGroup(OrderLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(OrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(addLabel)
                            .addComponent(sugLabel)
                            .addComponent(prLabel)
                            .addComponent(milkLabel))))
                .addGap(24, 24, 24)
                .addGroup(OrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pr2)
                    .addComponent(sug2)
                    .addComponent(add2)
                    .addComponent(milk2)
                    .addComponent(ord2))
                .addGap(26, 26, 26)
                .addGroup(OrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pr3)
                    .addComponent(sug3)
                    .addComponent(add3)
                    .addComponent(milk3)
                    .addComponent(ord3))
                .addGap(19, 19, 19)
                .addGroup(OrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pr4)
                    .addComponent(sug4)
                    .addComponent(add4)
                    .addComponent(milk4)
                    .addComponent(ord4))
                .addGap(18, 18, 18)
                .addComponent(addOrder1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(max1)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Order, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Receipt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(MilkteaShop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Menu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(MilkteaShop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Order, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Receipt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void clearOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearOrderActionPerformed
        // clear the selections of the radio button group
        buttonGroup1.clearSelection();
        buttonGroup2.clearSelection();
        buttonGroup3.clearSelection();
    }//GEN-LAST:event_clearOrderActionPerformed

    private void meow1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_meow1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_meow1ActionPerformed

    private void addOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addOrderActionPerformed
           //this will display the milktea order the user selected from the
           // radio buttons.
           if (meow1.isSelected() == true){
               milk1.setText("[M] Cookies and Cream");
               pr1.setText("70");
           }
           else if (meow2.isSelected() == true){
               milk1.setText("[E] Strawberry Cheesecake");
               pr1.setText("75");
           }
           else if (meow3.isSelected() == true){
               milk1.setText("[O] Mocha Magnifico");
               pr1.setText("85");
           }
           else if (meow4.isSelected() == true){
               milk1.setText("[W] Caramel Macchiato");
               pr1.setText("90");
           }
           
           if (sink1.isSelected() == true){
               add1.setText("[C] Pearl");
           }
           else if (sink2.isSelected() == true){
               add1.setText("[A] Nata");
           }
           else if (sink3.isSelected() == true){
               add1.setText("[T] Pudding");
           }
           
           if (sugar1.isSelected() == true){
               sug1.setText("25%");
           }
           else if (sugar2.isSelected() == true){
               sug1.setText("50%");
           }
           else if (sugar3.isSelected() == true){
               sug1.setText("75%");
           }
           else if (sugar4.isSelected() == true){
               sug1.setText("100%");
           }
           
              
           buttonGroup1.clearSelection();
           buttonGroup2.clearSelection();
           buttonGroup3.clearSelection();
           
           // this will make the add order button invisible
           // while the plus button under the first milktea
           // order becomes visible.
           addOrder.setVisible(false);
           ord2.setVisible(true);
           
    }//GEN-LAST:event_addOrderActionPerformed

    private void addOrder3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addOrder3ActionPerformed
        // an option pane will show up if the user clicked the cancel button
        Cancel can = new Cancel();

        can.show();
    }//GEN-LAST:event_addOrder3ActionPerformed

    private void addOrder2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addOrder2ActionPerformed
         // an option pane will show up if the user clicked the proceed button
        ThankYou TY = new ThankYou();

        TY.show();
    }//GEN-LAST:event_addOrder2ActionPerformed

    private void ord2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ord2ActionPerformed
           //this will display the 2nd milktea order the user selected from the
           // radio buttons.
           if (meow1.isSelected() == true){
               milk2.setText("[M] Cookies and Cream");
               pr2.setText("70");
           }
           else if (meow2.isSelected() == true){
               milk2.setText("[E] Strawberry Cheesecake");
               pr2.setText("75");
           }
           else if (meow3.isSelected() == true){
               milk2.setText("[O] Mocha Magnifico");
               pr2.setText("85");
           }
           else if (meow4.isSelected() == true){
               milk2.setText("[W] Caramel Macchiato");
               pr2.setText("90");
           }
           
           if (sink1.isSelected() == true){
               add2.setText("[C] Pearl");
           }
           else if (sink2.isSelected() == true){
               add2.setText("[A] Nata");
           }
           else if (sink3.isSelected() == true){
               add2.setText("[T] Pudding");
           }
           
           if (sugar1.isSelected() == true){
               sug2.setText("25%");
           }
           else if (sugar2.isSelected() == true){
               sug2.setText("50%");
           }
           else if (sugar3.isSelected() == true){
               sug2.setText("75%");
           }
           else if (sugar4.isSelected() == true){
               sug2.setText("100%");
           }
   
           buttonGroup1.clearSelection();
           buttonGroup2.clearSelection();
           buttonGroup3.clearSelection();
           
           // this will make the plus button invisible
           // while a new plus button under the second milktea
           // order becomes visible.
           ord3.setVisible(true);
           ord2.setVisible(false);
    }//GEN-LAST:event_ord2ActionPerformed

    private void addOrder1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addOrder1ActionPerformed
        // this will display the receipt
        correct.setVisible(true);
        corr.setVisible(true);
        tot.setVisible(true);
        tot1.setVisible(true);
        addOrder2.setVisible(true);
        addOrder3.setVisible(true);
        ord2.setVisible(false);
        ord3.setVisible(false);
        ord4.setVisible(false); 
    }//GEN-LAST:event_addOrder1ActionPerformed

    private void ord3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ord3ActionPerformed
           //this will display the 3rd milktea order the user selected from the
           // radio buttons.
           if (meow1.isSelected() == true){
               milk3.setText("[M] Cookies and Cream");
               pr3.setText("70");
           }
           else if (meow2.isSelected() == true){
               milk3.setText("[E] Strawberry Cheesecake");
               pr3.setText("75");
           }
           else if (meow3.isSelected() == true){
               milk3.setText("[O] Mocha Magnifico");
               pr3.setText("85");
           }
           else if (meow4.isSelected() == true){
               milk3.setText("[W] Caramel Macchiato");
               pr3.setText("90");
           }
           
           if (sink1.isSelected() == true){
               add3.setText("[C] Pearl");
           }
           else if (sink2.isSelected() == true){
               add3.setText("[A] Nata");
           }
           else if (sink3.isSelected() == true){
               add3.setText("[T] Pudding");
           }
           
           if (sugar1.isSelected() == true){
               sug3.setText("25%");
           }
           else if (sugar2.isSelected() == true){
               sug3.setText("50%");
           }
           else if (sugar3.isSelected() == true){
               sug3.setText("75%");
           }
           else if (sugar4.isSelected() == true){
               sug3.setText("100%");
           }
    
           buttonGroup1.clearSelection();
           buttonGroup2.clearSelection();
           buttonGroup3.clearSelection();
           
           // this will make the plus button invisible
           // while a new plus button under the third milktea
           // order becomes visible.
           ord4.setVisible(true);
           ord3.setVisible(false);
    }//GEN-LAST:event_ord3ActionPerformed

    private void ord4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ord4ActionPerformed
           //this will display the 4th milktea order the user selected from the
           // radio buttons.
           if (meow1.isSelected() == true){
               milk4.setText("[M] Cookies and Cream");
               pr4.setText("70");
           }
           else if (meow2.isSelected() == true){
               milk4.setText("[E] Strawberry Cheesecake");
               pr4.setText("75");
           }
           else if (meow3.isSelected() == true){
               milk4.setText("[O] Mocha Magnifico");
               pr4.setText("85");
           }
           else if (meow4.isSelected() == true){
               milk4.setText("[W] Caramel Macchiato");
               pr4.setText("90");
           }
           
           if (sink1.isSelected() == true){
               add4.setText("[C] Pearl");
           }
           else if (sink2.isSelected() == true){
               add4.setText("[A] Nata");
           }
           else if (sink3.isSelected() == true){
               add4.setText("[T] Pudding");
           }
           
           if (sugar1.isSelected() == true){
               sug4.setText("25%");
           }
           else if (sugar2.isSelected() == true){
               sug4.setText("50%");
           }
           else if (sugar3.isSelected() == true){
               sug4.setText("75%");
           }
           else if (sugar4.isSelected() == true){
               sug4.setText("100%");
           }
  
           buttonGroup1.clearSelection();
           buttonGroup2.clearSelection();
           buttonGroup3.clearSelection();
           
           // this will make the plus button invisible
           ord4.setVisible(false);
    }//GEN-LAST:event_ord4ActionPerformed

    private void tot1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tot1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tot1ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Meowlktea_Orders().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Menu;
    private javax.swing.JPanel MilkteaShop;
    private javax.swing.JPanel Order;
    private javax.swing.JPanel OrderS;
    private javax.swing.JPanel Receipt;
    private javax.swing.JLabel Title;
    private javax.swing.JLabel Title1;
    private javax.swing.JLabel Title2;
    private javax.swing.JLabel add1;
    private javax.swing.JLabel add2;
    private javax.swing.JLabel add3;
    private javax.swing.JLabel add4;
    private javax.swing.JLabel addLabel;
    private javax.swing.JButton addOrder;
    private javax.swing.JButton addOrder1;
    private javax.swing.JButton addOrder2;
    private javax.swing.JButton addOrder3;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JLabel choose;
    private javax.swing.JButton clearOrder;
    private javax.swing.JLabel corr;
    private javax.swing.JLabel correct;
    private javax.swing.JLabel max;
    private javax.swing.JLabel max1;
    private javax.swing.JRadioButton meow1;
    private javax.swing.JRadioButton meow2;
    private javax.swing.JRadioButton meow3;
    private javax.swing.JRadioButton meow4;
    private javax.swing.JLabel milk1;
    private javax.swing.JLabel milk2;
    private javax.swing.JLabel milk3;
    private javax.swing.JLabel milk4;
    private javax.swing.JLabel milkLabel;
    private javax.swing.JButton ord2;
    private javax.swing.JButton ord3;
    private javax.swing.JButton ord4;
    private javax.swing.JLabel pr1;
    private javax.swing.JLabel pr2;
    private javax.swing.JLabel pr3;
    private javax.swing.JLabel pr4;
    private javax.swing.JLabel prLabel;
    private javax.swing.JLabel price1;
    private javax.swing.JLabel price2;
    private javax.swing.JLabel price3;
    private javax.swing.JLabel price4;
    private javax.swing.JPanel rec;
    private javax.swing.JLabel sink;
    private javax.swing.JRadioButton sink1;
    private javax.swing.JRadioButton sink2;
    private javax.swing.JRadioButton sink3;
    private javax.swing.JLabel sug1;
    private javax.swing.JLabel sug2;
    private javax.swing.JLabel sug3;
    private javax.swing.JLabel sug4;
    private javax.swing.JLabel sugLabel;
    private javax.swing.JLabel sugar;
    private javax.swing.JRadioButton sugar1;
    private javax.swing.JRadioButton sugar2;
    private javax.swing.JRadioButton sugar3;
    private javax.swing.JRadioButton sugar4;
    private javax.swing.JLabel tot;
    private javax.swing.JTextField tot1;
    // End of variables declaration//GEN-END:variables
}
