/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package trabalho01_restaurante;

/**
 *
 * @author PICHAU
 */
public class Cardapio extends javax.swing.JFrame {

    /**
     * Creates new form Cardapio
     */
    public Cardapio() {
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

        jPanel1 = new javax.swing.JPanel();
        lCardapio1 = new javax.swing.JLabel();
        lIcon = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        tCodCardapio = new javax.swing.JTextField();
        lCodCardapio = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableCliente = new javax.swing.JTable();
        tNomeCardapio = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        lSelecaoProduto = new javax.swing.JLabel();
        cbProdutos = new javax.swing.JComboBox<>();
        lProdutosSelecionados = new javax.swing.JLabel();
        bRemoveProdutoSelecionado = new javax.swing.JButton();
        bSalvarCardapio = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        lSelecaoCardapio = new javax.swing.JLabel();
        cbCardapio = new javax.swing.JComboBox<>();
        sPaneProdutos = new javax.swing.JScrollPane();
        jPanel4 = new javax.swing.JPanel();
        jpProduto01 = new javax.swing.JPanel();
        lIconProduto = new javax.swing.JLabel();
        lNomeProduto = new javax.swing.JLabel();
        lPrecoProduto = new javax.swing.JLabel();
        lMedida = new javax.swing.JLabel();
        jpProduto2 = new javax.swing.JPanel();
        lIconProduto1 = new javax.swing.JLabel();
        lNomeProduto1 = new javax.swing.JLabel();
        lPrecoProduto1 = new javax.swing.JLabel();
        lMedida1 = new javax.swing.JLabel();
        jpProduto5 = new javax.swing.JPanel();
        lIconProduto4 = new javax.swing.JLabel();
        lNomeProduto4 = new javax.swing.JLabel();
        lPrecoProduto4 = new javax.swing.JLabel();
        lMedida4 = new javax.swing.JLabel();
        jpProduto6 = new javax.swing.JPanel();
        lIconProduto5 = new javax.swing.JLabel();
        lNomeProduto5 = new javax.swing.JLabel();
        lPrecoProduto5 = new javax.swing.JLabel();
        lMedida5 = new javax.swing.JLabel();
        jpProduto7 = new javax.swing.JPanel();
        lIconProduto6 = new javax.swing.JLabel();
        lNomeProduto6 = new javax.swing.JLabel();
        lPrecoProduto6 = new javax.swing.JLabel();
        lMedida6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cardápio");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(219, 82, 82));

        lCardapio1.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        lCardapio1.setText("Cardápio");

        lIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/trabalho01_restaurante/imagens/cardapio.png"))); // NOI18N

        jPanel2.setBackground(new java.awt.Color(219, 82, 82));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cadastro de novo cardápio", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Light", 0, 14))); // NOI18N

        tCodCardapio.setEditable(false);
        tCodCardapio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tCodCardapioActionPerformed(evt);
            }
        });

        lCodCardapio.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        lCodCardapio.setForeground(new java.awt.Color(39, 39, 39));
        lCodCardapio.setText("Codigo Cardápio:");

        tableCliente.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        tableCliente.setForeground(new java.awt.Color(39, 39, 39));
        tableCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Id", "Nome", "Preço"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tableCliente);

        tNomeCardapio.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(39, 39, 39));
        jLabel1.setText("Nome:");

        lSelecaoProduto.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        lSelecaoProduto.setForeground(new java.awt.Color(39, 39, 39));
        lSelecaoProduto.setText("Selecione os Produtos:");

        lProdutosSelecionados.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        lProdutosSelecionados.setForeground(new java.awt.Color(39, 39, 39));
        lProdutosSelecionados.setText("Produtos Selecionados:");

        bRemoveProdutoSelecionado.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        bRemoveProdutoSelecionado.setForeground(new java.awt.Color(39, 39, 39));
        bRemoveProdutoSelecionado.setText("Remover Seleção");

        bSalvarCardapio.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        bSalvarCardapio.setForeground(new java.awt.Color(39, 39, 39));
        bSalvarCardapio.setText("Salvar Novo Cardápio");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbProdutos, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(lProdutosSelecionados)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(lSelecaoProduto))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lCodCardapio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(tCodCardapio))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tNomeCardapio, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(bRemoveProdutoSelecionado)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(bSalvarCardapio)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lCodCardapio)
                    .addComponent(jLabel1))
                .addGap(6, 6, 6)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tCodCardapio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tNomeCardapio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addComponent(lSelecaoProduto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lProdutosSelecionados)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bRemoveProdutoSelecionado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bSalvarCardapio))
        );

        jPanel3.setBackground(new java.awt.Color(219, 82, 82));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cardápios", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Light", 0, 14))); // NOI18N

        lSelecaoCardapio.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        lSelecaoCardapio.setForeground(new java.awt.Color(39, 39, 39));
        lSelecaoCardapio.setText("Selecione um Cardápio:");

        sPaneProdutos.setBackground(new java.awt.Color(219, 82, 82));
        sPaneProdutos.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        sPaneProdutos.setForeground(new java.awt.Color(219, 82, 82));
        sPaneProdutos.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        jpProduto01.setBackground(new java.awt.Color(219, 82, 82));
        jpProduto01.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(39, 39, 39)));
        jpProduto01.setPreferredSize(new java.awt.Dimension(180, 90));

        lIconProduto.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        lIconProduto.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lIconProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/trabalho01_restaurante/imagens/comida.png"))); // NOI18N

        lNomeProduto.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        lNomeProduto.setText("Batata Frita");

        lPrecoProduto.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        lPrecoProduto.setText("R$ 25.99");

        lMedida.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        lMedida.setText("Porção: 1 uni");

        javax.swing.GroupLayout jpProduto01Layout = new javax.swing.GroupLayout(jpProduto01);
        jpProduto01.setLayout(jpProduto01Layout);
        jpProduto01Layout.setHorizontalGroup(
            jpProduto01Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpProduto01Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lIconProduto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpProduto01Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lNomeProduto)
                    .addComponent(lPrecoProduto)
                    .addComponent(lMedida))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        jpProduto01Layout.setVerticalGroup(
            jpProduto01Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpProduto01Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpProduto01Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpProduto01Layout.createSequentialGroup()
                        .addComponent(lNomeProduto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lPrecoProduto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lMedida))
                    .addComponent(lIconProduto))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jpProduto2.setBackground(new java.awt.Color(219, 82, 82));
        jpProduto2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(39, 39, 39)));
        jpProduto2.setPreferredSize(new java.awt.Dimension(180, 90));

        lIconProduto1.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        lIconProduto1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lIconProduto1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/trabalho01_restaurante/imagens/comida.png"))); // NOI18N

        lNomeProduto1.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        lNomeProduto1.setText("Strogonoff frango");
        lNomeProduto1.setToolTipText("");

        lPrecoProduto1.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        lPrecoProduto1.setText("R$ 43.80");

        lMedida1.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        lMedida1.setText("Prato: 1 uni");

        javax.swing.GroupLayout jpProduto2Layout = new javax.swing.GroupLayout(jpProduto2);
        jpProduto2.setLayout(jpProduto2Layout);
        jpProduto2Layout.setHorizontalGroup(
            jpProduto2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpProduto2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lIconProduto1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpProduto2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lNomeProduto1)
                    .addComponent(lPrecoProduto1)
                    .addComponent(lMedida1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpProduto2Layout.setVerticalGroup(
            jpProduto2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpProduto2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpProduto2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpProduto2Layout.createSequentialGroup()
                        .addComponent(lNomeProduto1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lPrecoProduto1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lMedida1))
                    .addComponent(lIconProduto1))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jpProduto5.setBackground(new java.awt.Color(219, 82, 82));
        jpProduto5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(39, 39, 39)));
        jpProduto5.setPreferredSize(new java.awt.Dimension(180, 90));

        lIconProduto4.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        lIconProduto4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lIconProduto4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/trabalho01_restaurante/imagens/bebida.png"))); // NOI18N

        lNomeProduto4.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        lNomeProduto4.setText("Coca Cola");

        lPrecoProduto4.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        lPrecoProduto4.setText("R$ 12.50");

        lMedida4.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        lMedida4.setText("Litros: 2");

        javax.swing.GroupLayout jpProduto5Layout = new javax.swing.GroupLayout(jpProduto5);
        jpProduto5.setLayout(jpProduto5Layout);
        jpProduto5Layout.setHorizontalGroup(
            jpProduto5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpProduto5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lIconProduto4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpProduto5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lNomeProduto4)
                    .addComponent(lPrecoProduto4)
                    .addComponent(lMedida4))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        jpProduto5Layout.setVerticalGroup(
            jpProduto5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpProduto5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpProduto5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpProduto5Layout.createSequentialGroup()
                        .addComponent(lNomeProduto4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lPrecoProduto4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lMedida4))
                    .addComponent(lIconProduto4))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jpProduto6.setBackground(new java.awt.Color(219, 82, 82));
        jpProduto6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(39, 39, 39)));
        jpProduto6.setPreferredSize(new java.awt.Dimension(180, 90));

        lIconProduto5.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        lIconProduto5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lIconProduto5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/trabalho01_restaurante/imagens/comida.png"))); // NOI18N

        lNomeProduto5.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        lNomeProduto5.setText("Risoto de tomate");

        lPrecoProduto5.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        lPrecoProduto5.setText("R$ 40.10");

        lMedida5.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        lMedida5.setText("Prato: 1 uni");

        javax.swing.GroupLayout jpProduto6Layout = new javax.swing.GroupLayout(jpProduto6);
        jpProduto6.setLayout(jpProduto6Layout);
        jpProduto6Layout.setHorizontalGroup(
            jpProduto6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpProduto6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lIconProduto5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpProduto6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lNomeProduto5)
                    .addComponent(lPrecoProduto5)
                    .addComponent(lMedida5))
                .addContainerGap(8, Short.MAX_VALUE))
        );
        jpProduto6Layout.setVerticalGroup(
            jpProduto6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpProduto6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpProduto6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpProduto6Layout.createSequentialGroup()
                        .addComponent(lNomeProduto5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lPrecoProduto5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lMedida5))
                    .addComponent(lIconProduto5))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jpProduto7.setBackground(new java.awt.Color(219, 82, 82));
        jpProduto7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(39, 39, 39)));
        jpProduto7.setPreferredSize(new java.awt.Dimension(180, 90));

        lIconProduto6.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        lIconProduto6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lIconProduto6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/trabalho01_restaurante/imagens/bebida.png"))); // NOI18N

        lNomeProduto6.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        lNomeProduto6.setText("Fanta Laranja");

        lPrecoProduto6.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        lPrecoProduto6.setText("R$ 8.50");

        lMedida6.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        lMedida6.setText("Litros: 1");

        javax.swing.GroupLayout jpProduto7Layout = new javax.swing.GroupLayout(jpProduto7);
        jpProduto7.setLayout(jpProduto7Layout);
        jpProduto7Layout.setHorizontalGroup(
            jpProduto7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpProduto7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lIconProduto6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpProduto7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lNomeProduto6)
                    .addComponent(lPrecoProduto6)
                    .addComponent(lMedida6))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        jpProduto7Layout.setVerticalGroup(
            jpProduto7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpProduto7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpProduto7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpProduto7Layout.createSequentialGroup()
                        .addComponent(lNomeProduto6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lPrecoProduto6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lMedida6))
                    .addComponent(lIconProduto6))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jpProduto01, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jpProduto2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jpProduto6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jpProduto5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jpProduto7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(240, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jpProduto2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jpProduto01, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jpProduto6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jpProduto5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jpProduto7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(195, Short.MAX_VALUE))
        );

        sPaneProdutos.setViewportView(jPanel4);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sPaneProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(lSelecaoCardapio)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbCardapio, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 70, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lSelecaoCardapio)
                    .addComponent(cbCardapio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(sPaneProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lIcon)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lCardapio1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lCardapio1)
                    .addComponent(lIcon))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tCodCardapioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tCodCardapioActionPerformed

    }//GEN-LAST:event_tCodCardapioActionPerformed

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
            java.util.logging.Logger.getLogger(Cardapio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cardapio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cardapio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cardapio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cardapio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bRemoveProdutoSelecionado;
    private javax.swing.JButton bSalvarCardapio;
    private javax.swing.JComboBox<String> cbCardapio;
    private javax.swing.JComboBox<String> cbProdutos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel jpProduto01;
    private javax.swing.JPanel jpProduto2;
    private javax.swing.JPanel jpProduto5;
    private javax.swing.JPanel jpProduto6;
    private javax.swing.JPanel jpProduto7;
    private javax.swing.JLabel lCardapio1;
    private javax.swing.JLabel lCodCardapio;
    private javax.swing.JLabel lIcon;
    private javax.swing.JLabel lIconProduto;
    private javax.swing.JLabel lIconProduto1;
    private javax.swing.JLabel lIconProduto4;
    private javax.swing.JLabel lIconProduto5;
    private javax.swing.JLabel lIconProduto6;
    private javax.swing.JLabel lMedida;
    private javax.swing.JLabel lMedida1;
    private javax.swing.JLabel lMedida4;
    private javax.swing.JLabel lMedida5;
    private javax.swing.JLabel lMedida6;
    private javax.swing.JLabel lNomeProduto;
    private javax.swing.JLabel lNomeProduto1;
    private javax.swing.JLabel lNomeProduto4;
    private javax.swing.JLabel lNomeProduto5;
    private javax.swing.JLabel lNomeProduto6;
    private javax.swing.JLabel lPrecoProduto;
    private javax.swing.JLabel lPrecoProduto1;
    private javax.swing.JLabel lPrecoProduto4;
    private javax.swing.JLabel lPrecoProduto5;
    private javax.swing.JLabel lPrecoProduto6;
    private javax.swing.JLabel lProdutosSelecionados;
    private javax.swing.JLabel lSelecaoCardapio;
    private javax.swing.JLabel lSelecaoProduto;
    private javax.swing.JScrollPane sPaneProdutos;
    private javax.swing.JTextField tCodCardapio;
    private javax.swing.JTextField tNomeCardapio;
    private javax.swing.JTable tableCliente;
    // End of variables declaration//GEN-END:variables
}