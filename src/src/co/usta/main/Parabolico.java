package src.co.usta.main;

import javax.swing.JPanel;

public class Parabolico extends JPanel{

    private static final long serialVersionUID = 1L;

	// Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
	
	
	public Parabolico() {
		super();
		initComponents();
	}

	@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    public void initComponents() {  

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setBackground(new java.awt.Color(0, 0, 0));
        setForeground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(800, 600));

        jButton1.setFont(new java.awt.Font("Agency FB", 1, 18));
        jButton1.setText("Ver grafica");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
//                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Agency FB", 1, 18));
        jButton2.setText("Ir a simulaci�n");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jScrollPane1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jTextArea1.setBackground(new java.awt.Color(0, 0, 0));
        jTextArea1.setColumns(20);
        jTextArea1.setEditable(false);
        jTextArea1.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jTextArea1.setForeground(new java.awt.Color(255, 255, 255));
        jTextArea1.setRows(5);
        jTextArea1.setText("Se denomina movimiento parab�lico al realizado por un objeto cuya trayectoria describe una par�bola. Se \ncorresponde con la trayectoria ideal de un proyectil que se mueve en un medio que no ofrece resistencia al \navance y que est� sujeto a un campo gravitatorio uniforme. Tambi�n es posible demostrar que puede ser \nanalizado como la composici�n de dos movimientos rectil�neos, un movimiento rectil�neo uniforme horizontal\ny un movimiento rectil�neo uniformemente acelerado vertical. Las ecuaciones de este movimiento son la \nsiguientes:\n\nLa velocidad de un cuerpo que sigue una trayectoria parab�lica se puede obtener integrando la siguiente \necuaci�n:     V(0) = Vox *(�) +  Voy *(j)\n\nLa �nica aceleraci�n que interviene en este movimiento es la de la gravedad, que corresponde a la ecuaci�n:\n     a  = -g *(�) \n\nPartiendo de la ecuaci�n que establece la velocidad del m�vil con relaci�n al tiempo y de la definici�n de \nvelocidad, la posici�n puede ser encontrada integrando la siguiente ecuaci�n diferencial:\n\n   V = Vox *(�)  + ( Voy - g*t )*j\n\n  \n\n");
        jTextArea1.setPreferredSize(new java.awt.Dimension(836, 364));
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(235, 235, 235)
                        .addComponent(jButton1)
                        .addGap(110, 110, 110)
                        .addComponent(jButton2))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 917, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2)
                    .addComponent(jButton1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
	
	
	 private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
//	        Baloncesto frame = new Baloncesto();
//	        frame.setVisible(true);
//	    }//GEN-LAST:event_jButton2ActionPerformed
//
//	    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
//	        Grafica_Parabolico grafica = new Grafica_Parabolico();
//	        grafica.setVisible(true);
	    }//GEN-LAST:event_jButton1ActionPerformed
}