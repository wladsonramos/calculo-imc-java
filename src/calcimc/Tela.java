package calcimc;

import javax.swing.*;

public class Tela extends JFrame {
	private static final long serialVersionUID = 1L;
	private JTextField pesoField;
	private JTextField alturaField;
    private JLabel resultadoLabel;
    
    public Tela() {
        
        pesoField = new JTextField(20);
        alturaField = new JTextField(20);
        resultadoLabel = new JLabel();
        JButton botaoCalc = new JButton("Calcular IMC");
        
        botaoCalc.addActionListener(e -> {
            double peso = Double.parseDouble(pesoField.getText());
            double altura = Double.parseDouble(alturaField.getText());
            double resultado = peso/(altura*altura);
            String df = String.format("%.2f", resultado);
            resultadoLabel.setText("Seu IMC é: " + df);
        });
        
        JPanel painel = new JPanel();
        painel.add(new JLabel("Digite seu peso:"));
        painel.add(pesoField);
        painel.add(new JLabel("Digite sua altura:"));
        painel.add(alturaField);
        painel.add(botaoCalc);
        painel.add(resultadoLabel);
       
        add(painel);
        
        pack();
        setSize(300,200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}
