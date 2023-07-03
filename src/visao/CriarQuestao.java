package visao;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import controle.ControllerAdministrador;
import modelo.Administrador;

public class CriarQuestao extends JFrame implements ActionListener{

	private JLabel textTitulo = new JLabel();
	private JButton botaoCancelar = new JButton();
	private JLabel textEnunciado = new JLabel();
	private JTextField enunciadoTextField = new JTextField();
	private JLabel textItemA = new JLabel();
	private JTextField itemATextField = new JTextField();
	private JLabel textItemB = new JLabel();
	private JTextField itemBTextField = new JTextField();
	private JLabel textItemC = new JLabel();
	private JTextField itemCTextField = new JTextField();
	private JLabel textItemD = new JLabel();
	private JTextField itemDTextField = new JTextField();
	private JLabel textGabarito = new JLabel();
	private JTextField gabaritoTextField = new JTextField();
	private JLabel textMateria = new JLabel();
	private JTextField materiaTextField = new JTextField();
	private JLabel textAno = new JLabel();
	private JTextField anoTextField = new JTextField();
	private JLabel textConcurso = new JLabel();
	private JTextField concursoTextField = new JTextField();
	private JButton botaoCriarQuestao = new JButton();
	
	private Administrador administrador;
	
	public CriarQuestao(Administrador usuario) {
		
		administrador = usuario;
		
		setVisible(true);
		setResizable(false);
		setTitle("Saber+");
		setSize(800,650);
		setLayout(null);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		getContentPane().setBackground(new java.awt.Color(26, 37, 48));
		
		this.botaoCancelar.setBounds(630, 25, 125, 30);
		this.botaoCancelar.setText("Cancelar");
		this.botaoCancelar.addActionListener(this);
		add(this.botaoCancelar);
		
		this.textTitulo.setText("Criar Questao");
		textTitulo.setForeground(new java.awt.Color(255, 255, 255));
		this.textTitulo.setBounds(350, 60, 100, 20);
		add(this.textTitulo);
		
		this.textEnunciado.setText("Enunciado");
		textEnunciado.setForeground(new java.awt.Color(255, 255, 255));
		this.textEnunciado.setBounds(150, 95, 200, 20);
		add(this.textEnunciado);
		
		this.enunciadoTextField.setBounds(150, 115, 500, 30);
		add(this.enunciadoTextField);
		
		this.textItemA.setText("Item A");
		textItemA.setForeground(new java.awt.Color(255, 255, 255));
		this.textItemA.setBounds(150, 155, 200, 20);
		add(this.textItemA);
		
		this.itemATextField.setBounds(150, 175, 500, 30);
		add(this.itemATextField);
		
		this.textItemB.setText("Item B");
		textItemB.setForeground(new java.awt.Color(255, 255, 255));
		this.textItemB.setBounds(150, 205, 200, 20);
		add(this.textItemB);
		
		this.itemBTextField.setBounds(150, 225, 500, 30);
		add(this.itemBTextField);
		
		this.textItemC.setText("Item C");
		textItemC.setForeground(new java.awt.Color(255, 255, 255));
		this.textItemC.setBounds(150, 255, 200, 20);
		add(this.textItemC);
		
		this.itemCTextField.setBounds(150, 275, 500, 30);
		add(this.itemCTextField);
		
		this.textItemD.setText("Item D");
		textItemD.setForeground(new java.awt.Color(255, 255, 255));
		this.textItemD.setBounds(150, 305, 200, 20);
		add(this.textItemD);
		
		this.itemDTextField.setBounds(150, 325, 500, 30);
		add(this.itemDTextField);
		
		this.textGabarito.setText("Gabarito");
		textGabarito.setForeground(new java.awt.Color(255, 255, 255));
		this.textGabarito.setBounds(150, 365, 200, 20);
		add(this.textGabarito);
		
		this.gabaritoTextField.setBounds(150, 385, 500, 30);
		add(this.gabaritoTextField);
		
		this.textMateria.setText("Materia");
		textMateria.setForeground(new java.awt.Color(255, 255, 255));
		this.textMateria.setBounds(150, 425, 200, 20);
		add(this.textMateria);
		
		this.materiaTextField.setBounds(150, 445, 125, 30);
		add(this.materiaTextField);
		
		this.textConcurso.setText("Concurso");
		textConcurso.setForeground(new java.awt.Color(255, 255, 255));
		this.textConcurso.setBounds(335, 425, 200, 20);
		add(this.textConcurso);
		
		this.concursoTextField.setBounds(335, 445, 125, 30);
		add(this.concursoTextField);
		
		this.textAno.setText("Ano");
		textAno.setForeground(new java.awt.Color(255, 255, 255));
		this.textAno.setBounds(520, 425, 200, 20);
		add(this.textAno);
		
		this.anoTextField.setBounds(520, 445, 125, 30);
		add(this.anoTextField);
		
		this.botaoCriarQuestao.setBounds(295, 500, 200, 30);
		this.botaoCriarQuestao.setText("Criar Questao");
		this.botaoCriarQuestao.addActionListener(this);
		add(this.botaoCriarQuestao);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == this.botaoCancelar) {
			new HomeAdministrador(administrador, "");
			this.dispose();
		}
		if(e.getSource() == this.botaoCriarQuestao) {
			String enunciado = enunciadoTextField.getText();
			String itemA = itemATextField.getText();
			String itemB = itemBTextField.getText();
			String itemC = itemCTextField.getText();
			String itemD = itemDTextField.getText();
			String gabarito = gabaritoTextField.getText();
			String materia = materiaTextField.getText();
			String concurso = concursoTextField.getText();
			int ano = Integer.parseInt(anoTextField.getText());
			
			if(enunciado.isEmpty() == true || itemA.isEmpty() == true || itemB.isEmpty() == true || itemC.isEmpty() == true || itemD.isEmpty() == true || gabarito.isEmpty() == true || materia.isEmpty() == true || concurso.isEmpty() == true || ano == 0) {
				JOptionPane.showMessageDialog(null, "Todos os campos devem estar preenchidos.");
			}
			else {
				ControllerAdministrador.criarQuestao(enunciado, itemA, itemB, itemC, itemD, gabarito, materia, concurso, ano);
				JOptionPane.showMessageDialog(null, "Questao criada!");
				new HomeAdministrador(administrador, "");
				this.dispose();
			}
		}
	}
	
}
