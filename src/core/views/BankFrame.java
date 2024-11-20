/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package core.views;

import core.controllers.UserController;
import core.controllers.AccountController;
import core.controllers.TransactionController;
import core.controllers.utils.Response;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author edangulo
 */
public class BankFrame extends javax.swing.JFrame {

    /**
     * Creates new form BankFrame
     */
    public BankFrame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        panelRegisterUser = new javax.swing.JPanel();
        lblRegisterUser = new javax.swing.JLabel();
        lblID = new javax.swing.JLabel();
        lblFirstname = new javax.swing.JLabel();
        lblLastname = new javax.swing.JLabel();
        lblAge = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        txtFirstname = new javax.swing.JTextField();
        txtLastname = new javax.swing.JTextField();
        txtAge = new javax.swing.JTextField();
        btnRegisterUser = new javax.swing.JButton();
        panelCreateAccount = new javax.swing.JPanel();
        lblCreateAccount = new javax.swing.JLabel();
        lblUserId = new javax.swing.JLabel();
        lblInitialBalance = new javax.swing.JLabel();
        txtUserId = new javax.swing.JTextField();
        txtInitialBalance = new javax.swing.JTextField();
        btnCreate = new javax.swing.JButton();
        panelMakeTransaction = new javax.swing.JPanel();
        lblMakeTransaction = new javax.swing.JLabel();
        lblType = new javax.swing.JLabel();
        lblSourceAccount = new javax.swing.JLabel();
        lblDestinationAccount = new javax.swing.JLabel();
        lblAmount = new javax.swing.JLabel();
        txtSourceAccount = new javax.swing.JTextField();
        txtDestinationAccount = new javax.swing.JTextField();
        txtAmount = new javax.swing.JTextField();
        comboType = new javax.swing.JComboBox<>();
        btnExecute = new javax.swing.JButton();
        panelListUsers = new javax.swing.JPanel();
        lblListUsers = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableListUsers = new javax.swing.JTable();
        btnRefreshUsers = new javax.swing.JButton();
        panelListAccounts = new javax.swing.JPanel();
        lblListAccounts = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        TableAccounts = new javax.swing.JTable();
        btnRefreshAccounts = new javax.swing.JButton();
        panelListTransactions = new javax.swing.JPanel();
        lblListTransactions = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableTransactions = new javax.swing.JTable();
        btnRefreshTransactions = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblRegisterUser.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblRegisterUser.setText("Register User");

        lblID.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblID.setText("ID");

        lblFirstname.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblFirstname.setText("Firstname");

        lblLastname.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblLastname.setText("Lastname");

        lblAge.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblAge.setText("Age");

        txtID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDActionPerformed(evt);
            }
        });

        txtAge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAgeActionPerformed(evt);
            }
        });

        btnRegisterUser.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        btnRegisterUser.setText("Register");
        btnRegisterUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterUserActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelRegisterUserLayout = new javax.swing.GroupLayout(panelRegisterUser);
        panelRegisterUser.setLayout(panelRegisterUserLayout);
        panelRegisterUserLayout.setHorizontalGroup(
            panelRegisterUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRegisterUserLayout.createSequentialGroup()
                .addGroup(panelRegisterUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRegisterUserLayout.createSequentialGroup()
                        .addGap(239, 239, 239)
                        .addComponent(lblRegisterUser)
                        .addGap(0, 270, Short.MAX_VALUE))
                    .addGroup(panelRegisterUserLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panelRegisterUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblFirstname)
                            .addComponent(lblLastname)
                            .addComponent(lblAge)
                            .addComponent(lblID))
                        .addGap(18, 18, 18)
                        .addGroup(panelRegisterUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtID, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtLastname, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtAge, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtFirstname, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap())
            .addGroup(panelRegisterUserLayout.createSequentialGroup()
                .addGap(259, 259, 259)
                .addComponent(btnRegisterUser)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelRegisterUserLayout.setVerticalGroup(
            panelRegisterUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRegisterUserLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(lblRegisterUser)
                .addGap(18, 18, 18)
                .addGroup(panelRegisterUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblID))
                .addGap(18, 18, 18)
                .addGroup(panelRegisterUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFirstname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFirstname))
                .addGap(18, 18, 18)
                .addGroup(panelRegisterUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtLastname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblLastname))
                .addGap(18, 18, 18)
                .addGroup(panelRegisterUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAge))
                .addGap(18, 18, 18)
                .addComponent(btnRegisterUser)
                .addContainerGap(83, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Register User", panelRegisterUser);

        lblCreateAccount.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblCreateAccount.setText("Create Account");

        lblUserId.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblUserId.setText("User ID");

        lblInitialBalance.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblInitialBalance.setText("Initial Balance");

        btnCreate.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        btnCreate.setText("Create");
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelCreateAccountLayout = new javax.swing.GroupLayout(panelCreateAccount);
        panelCreateAccount.setLayout(panelCreateAccountLayout);
        panelCreateAccountLayout.setHorizontalGroup(
            panelCreateAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCreateAccountLayout.createSequentialGroup()
                .addGroup(panelCreateAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCreateAccountLayout.createSequentialGroup()
                        .addGap(238, 238, 238)
                        .addComponent(lblCreateAccount))
                    .addGroup(panelCreateAccountLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panelCreateAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblUserId)
                            .addComponent(lblInitialBalance))
                        .addGap(18, 18, 18)
                        .addGroup(panelCreateAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtInitialBalance)
                            .addComponent(txtUserId, javax.swing.GroupLayout.DEFAULT_SIZE, 521, Short.MAX_VALUE))))
                .addContainerGap())
            .addGroup(panelCreateAccountLayout.createSequentialGroup()
                .addGap(265, 265, 265)
                .addComponent(btnCreate)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelCreateAccountLayout.setVerticalGroup(
            panelCreateAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCreateAccountLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(lblCreateAccount)
                .addGap(18, 18, 18)
                .addGroup(panelCreateAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUserId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblUserId))
                .addGap(18, 18, 18)
                .addGroup(panelCreateAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtInitialBalance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblInitialBalance))
                .addGap(18, 18, 18)
                .addComponent(btnCreate)
                .addContainerGap(163, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Create Account", panelCreateAccount);

        lblMakeTransaction.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblMakeTransaction.setText("Make Transaction");

        lblType.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblType.setText("Type");

        lblSourceAccount.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblSourceAccount.setText("Source Account");

        lblDestinationAccount.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblDestinationAccount.setText("Destination Account");

        lblAmount.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblAmount.setText("Amount");

        txtDestinationAccount.setToolTipText("");

        comboType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Deposit", "Withdraw", "Transfer" }));

        btnExecute.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        btnExecute.setText("Execute");
        btnExecute.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExecuteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelMakeTransactionLayout = new javax.swing.GroupLayout(panelMakeTransaction);
        panelMakeTransaction.setLayout(panelMakeTransactionLayout);
        panelMakeTransactionLayout.setHorizontalGroup(
            panelMakeTransactionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMakeTransactionLayout.createSequentialGroup()
                .addGroup(panelMakeTransactionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelMakeTransactionLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panelMakeTransactionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblType)
                            .addComponent(lblAmount)
                            .addComponent(lblDestinationAccount)
                            .addComponent(lblSourceAccount))
                        .addGap(18, 18, 18)
                        .addGroup(panelMakeTransactionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtDestinationAccount, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtSourceAccount, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(comboType, 0, 485, Short.MAX_VALUE)
                            .addComponent(txtAmount, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(panelMakeTransactionLayout.createSequentialGroup()
                        .addGap(227, 227, 227)
                        .addComponent(lblMakeTransaction)))
                .addContainerGap())
            .addGroup(panelMakeTransactionLayout.createSequentialGroup()
                .addGap(255, 255, 255)
                .addComponent(btnExecute)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelMakeTransactionLayout.setVerticalGroup(
            panelMakeTransactionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMakeTransactionLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(lblMakeTransaction)
                .addGap(18, 18, 18)
                .addGroup(panelMakeTransactionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblType))
                .addGap(18, 18, 18)
                .addGroup(panelMakeTransactionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSourceAccount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSourceAccount))
                .addGap(18, 18, 18)
                .addGroup(panelMakeTransactionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDestinationAccount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDestinationAccount))
                .addGap(18, 18, 18)
                .addGroup(panelMakeTransactionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAmount))
                .addGap(18, 18, 18)
                .addComponent(btnExecute)
                .addContainerGap(83, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Make Transaction", panelMakeTransaction);

        lblListUsers.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblListUsers.setText("List Users");

        tableListUsers.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Fullname", "Age", "Number of Accounts"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Long.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tableListUsers);

        btnRefreshUsers.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        btnRefreshUsers.setText("Refresh");
        btnRefreshUsers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshUsersActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelListUsersLayout = new javax.swing.GroupLayout(panelListUsers);
        panelListUsers.setLayout(panelListUsersLayout);
        panelListUsersLayout.setHorizontalGroup(
            panelListUsersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelListUsersLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelListUsersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelListUsersLayout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 616, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(panelListUsersLayout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(lblListUsers)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnRefreshUsers)
                        .addGap(88, 88, 88))))
        );
        panelListUsersLayout.setVerticalGroup(
            panelListUsersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelListUsersLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(panelListUsersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblListUsers)
                    .addComponent(btnRefreshUsers))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 264, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("List Users", panelListUsers);

        lblListAccounts.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblListAccounts.setText("List Accounts");

        TableAccounts.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID", "User ID", "Balance"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Long.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane3.setViewportView(TableAccounts);

        btnRefreshAccounts.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        btnRefreshAccounts.setText("Refresh");
        btnRefreshAccounts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshAccountsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelListAccountsLayout = new javax.swing.GroupLayout(panelListAccounts);
        panelListAccounts.setLayout(panelListAccountsLayout);
        panelListAccountsLayout.setHorizontalGroup(
            panelListAccountsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelListAccountsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 616, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(panelListAccountsLayout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(lblListAccounts)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnRefreshAccounts)
                .addGap(90, 90, 90))
        );
        panelListAccountsLayout.setVerticalGroup(
            panelListAccountsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelListAccountsLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(panelListAccountsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblListAccounts)
                    .addComponent(btnRefreshAccounts))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 264, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("List Accounts", panelListAccounts);

        lblListTransactions.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblListTransactions.setText("List Transactions");

        tableTransactions.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Type", "Source Account ID", "Destination Account ID", "Amount"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tableTransactions);

        btnRefreshTransactions.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        btnRefreshTransactions.setText("Refresh");
        btnRefreshTransactions.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshTransactionsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelListTransactionsLayout = new javax.swing.GroupLayout(panelListTransactions);
        panelListTransactions.setLayout(panelListTransactionsLayout);
        panelListTransactionsLayout.setHorizontalGroup(
            panelListTransactionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelListTransactionsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 616, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(panelListTransactionsLayout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(lblListTransactions)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnRefreshTransactions)
                .addGap(89, 89, 89))
        );
        panelListTransactionsLayout.setVerticalGroup(
            panelListTransactionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelListTransactionsLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(panelListTransactionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblListTransactions)
                    .addComponent(btnRefreshTransactions))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 264, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("List Transactions", panelListTransactions);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegisterUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterUserActionPerformed
        // TODO add your handling code here:
        String id = txtID.getText();
        String firstname = txtFirstname.getText();
        String lastname = txtLastname.getText();
        String age = txtAge.getText();
        Response response = UserController.createUser(id, firstname, lastname, age);
        if (response.getStatus() >= 500) {
            JOptionPane.showMessageDialog(null, response.getMessage(), "Error " + response.getStatus(), JOptionPane.ERROR_MESSAGE);
        } else if (response.getStatus() >= 400) {
            JOptionPane.showMessageDialog(null, response.getMessage(), "Error " + response.getStatus(), JOptionPane.WARNING_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, response.getMessage(), "Response Message", JOptionPane.INFORMATION_MESSAGE);
            txtID.setText("");
            txtFirstname.setText("");
            txtLastname.setText("");
            txtAge.setText("");
        }
    }//GEN-LAST:event_btnRegisterUserActionPerformed

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        // TODO add your handling code here:
        String id = txtUserId.getText();
        String initialBalance = txtInitialBalance.getText();
        Response response = AccountController.createAccount(id, initialBalance);
        if (response.getStatus() >= 500) {
            JOptionPane.showMessageDialog(null, response.getMessage(), "Error " + response.getStatus(), JOptionPane.ERROR_MESSAGE);
        } else if (response.getStatus() >= 400) {
            JOptionPane.showMessageDialog(null, response.getMessage(), "Error " + response.getStatus(), JOptionPane.WARNING_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, response.getMessage(), "Response Message", JOptionPane.INFORMATION_MESSAGE);
            txtUserId.setText("");
            txtInitialBalance.setText("");
        }
    }//GEN-LAST:event_btnCreateActionPerformed

    private void btnExecuteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExecuteActionPerformed
        // TODO add your handling code here:
        String type = comboType.getItemAt(comboType.getSelectedIndex());
        String sourceAccountId = txtSourceAccount.getText();
        String destinationAccountId = txtDestinationAccount.getText();
        String amount = txtAmount.getText();
        Response response = TransactionController.createTransaction(type, sourceAccountId, destinationAccountId, amount);
        if (response.getStatus() >= 500) {
            JOptionPane.showMessageDialog(null, response.getMessage(), "Error " + response.getStatus(), JOptionPane.ERROR_MESSAGE);
        } else if (response.getStatus() >= 400) {
            JOptionPane.showMessageDialog(null, response.getMessage(), "Error " + response.getStatus(), JOptionPane.WARNING_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, response.getMessage(), "Response Message", JOptionPane.INFORMATION_MESSAGE);
            txtSourceAccount.setText("");
            txtDestinationAccount.setText("");
            txtAmount.setText("");
        }
    }//GEN-LAST:event_btnExecuteActionPerformed

    private void btnRefreshUsersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshUsersActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) tableListUsers.getModel();
        model.setRowCount(0);
        Response response = UserController.sortUser();
        if (response.getStatus() >= 500) {
            JOptionPane.showMessageDialog(null, response.getMessage(), "Error " + response.getStatus(), JOptionPane.ERROR_MESSAGE);
        } else if (response.getStatus() >= 400) {
            JOptionPane.showMessageDialog(null, response.getMessage(), "Error " + response.getStatus(), JOptionPane.WARNING_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, response.getMessage(), "Response Message", JOptionPane.INFORMATION_MESSAGE);
            model = UserController.showUsers(response);
            tableListUsers.setModel(model);
        }
    }//GEN-LAST:event_btnRefreshUsersActionPerformed

    private void btnRefreshAccountsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshAccountsActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) TableAccounts.getModel();
        model.setRowCount(0);
        Response response = AccountController.sortAccount();
        if (response.getStatus() >= 500) {
            JOptionPane.showMessageDialog(null, response.getMessage(), "Error " + response.getStatus(), JOptionPane.ERROR_MESSAGE);
        } else if (response.getStatus() >= 400) {
            JOptionPane.showMessageDialog(null, response.getMessage(), "Error " + response.getStatus(), JOptionPane.WARNING_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, response.getMessage(), "Response Message", JOptionPane.INFORMATION_MESSAGE);
            model = AccountController.showAccounts(response);
            TableAccounts.setModel(model);
        }
    }//GEN-LAST:event_btnRefreshAccountsActionPerformed

    private void btnRefreshTransactionsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshTransactionsActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) tableTransactions.getModel();
        model.setRowCount(0);
        Response response = TransactionController.sortTransaction();
        if (response.getStatus() >= 500) {
            JOptionPane.showMessageDialog(null, response.getMessage(), "Error " + response.getStatus(), JOptionPane.ERROR_MESSAGE);
        } else if (response.getStatus() >= 400) {
            JOptionPane.showMessageDialog(null, response.getMessage(), "Error " + response.getStatus(), JOptionPane.WARNING_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, response.getMessage(), "Response Message", JOptionPane.INFORMATION_MESSAGE);
            model = TransactionController.showTransactions(response);
            tableTransactions.setModel(model);
        }
    }//GEN-LAST:event_btnRefreshTransactionsActionPerformed

    private void txtAgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAgeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAgeActionPerformed

    private void txtIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIDActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TableAccounts;
    private javax.swing.JButton btnCreate;
    private javax.swing.JButton btnExecute;
    private javax.swing.JButton btnRefreshAccounts;
    private javax.swing.JButton btnRefreshTransactions;
    private javax.swing.JButton btnRefreshUsers;
    private javax.swing.JButton btnRegisterUser;
    private javax.swing.JComboBox<String> comboType;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lblAge;
    private javax.swing.JLabel lblAmount;
    private javax.swing.JLabel lblCreateAccount;
    private javax.swing.JLabel lblDestinationAccount;
    private javax.swing.JLabel lblFirstname;
    private javax.swing.JLabel lblID;
    private javax.swing.JLabel lblInitialBalance;
    private javax.swing.JLabel lblLastname;
    private javax.swing.JLabel lblListAccounts;
    private javax.swing.JLabel lblListTransactions;
    private javax.swing.JLabel lblListUsers;
    private javax.swing.JLabel lblMakeTransaction;
    private javax.swing.JLabel lblRegisterUser;
    private javax.swing.JLabel lblSourceAccount;
    private javax.swing.JLabel lblType;
    private javax.swing.JLabel lblUserId;
    private javax.swing.JPanel panelCreateAccount;
    private javax.swing.JPanel panelListAccounts;
    private javax.swing.JPanel panelListTransactions;
    private javax.swing.JPanel panelListUsers;
    private javax.swing.JPanel panelMakeTransaction;
    private javax.swing.JPanel panelRegisterUser;
    private javax.swing.JTable tableListUsers;
    private javax.swing.JTable tableTransactions;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtAmount;
    private javax.swing.JTextField txtDestinationAccount;
    private javax.swing.JTextField txtFirstname;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtInitialBalance;
    private javax.swing.JTextField txtLastname;
    private javax.swing.JTextField txtSourceAccount;
    private javax.swing.JTextField txtUserId;
    // End of variables declaration//GEN-END:variables
}
