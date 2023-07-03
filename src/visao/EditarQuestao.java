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
import modelo.Questao;

public class EditarQuestao extends JFrame implements ActionListener{

	
	private Administrador administrador;
	private Questao questao;
	
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
	private JButton botaoEditarQuestao = new JButton();
	
	public EditarQuestao(Administrador user, Questao question) {
		
		questao = question;
		administrador = user;
		
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
		
		this.textTitulo.setText("Editar Questao");
		textTitulo.setForeground(new java.awt.Color(255, 255, 255));
		this.textTitulo.setBounds(350, 60, 100, 20);
		add(this.textTitulo);
		
		this.textEnunciado.setText("Enunciado");
		textEnunciado.setForeground(new java.awt.Color(255, 255, 255));
		this.textEnunciado.setBounds(150, 95, 200, 20);
		add(this.textEnunciado);
		
		this.enunciadoTextField.setBounds(150, 115, 500, 30);
		this.enunciadoTextField.setText(question.getEnunciado());
		add(this.enunciadoTextField);
		
		this.textItemA.setText("Item A");
		textItemA.setForeground(new java.awt.Color(255, 255, 255));
		this.textItemA.setBounds(150, 155, 200, 20);
		add(this.textItemA);
		
		this.itemATextField.setBounds(150, 175, 500, 30);
		this.itemATextField.setText(question.getItemA());
		add(this.itemATextField);
		
		this.textItemB.setText("Item B");
		textItemB.setForeground(new java.awt.Color(255, 255, 255));
		this.textItemB.setBounds(150, 205, 200, 20);
		add(this.textItemB);
		
		this.itemBTextField.setBounds(150, 225, 500, 30);
		this.itemBTextField.setText(question.getItemB());
		add(this.itemBTextField);
		
		this.textItemC.setText("Item C");
		textItemC.setForeground(new java.awt.Color(255, 255, 255));
		this.textItemC.setBounds(150, 255, 200, 20);
		add(this.textItemC);
		
		this.itemCTextField.setBounds(150, 275, 500, 30);
		this.itemCTextField.setText(question.getItemC());
		add(this.itemCTextField);
		
		this.textItemD.setText("Item D");
		textItemD.setForeground(new java.awt.Color(255, 255, 255));
		this.textItemD.setBounds(150, 305, 200, 20);
		add(this.textItemD);
		
		this.itemDTextField.setBounds(150, 325, 500, 30);
		this.itemDTextField.setText(question.getItemD());
		add(this.itemDTextField);
		
		this.textGabarito.setText("Gabarito");
		textGabarito.setForeground(new java.awt.Color(255, 255, 255));
		this.textGabarito.setBounds(150, 365, 200, 20);
		add(this.textGabarito);
		
		this.gabaritoTextField.setBounds(150, 385, 500, 30);
		this.gabaritoTextField.setText(question.getGabarito());
		add(this.gabaritoTextField);
		
		this.textMateria.setText("Materia");
		textMateria.setForeground(new java.awt.Color(255, 255, 255));
		this.textMateria.setBounds(150, 425, 200, 20);
		add(this.textMateria);
		
		this.materiaTextField.setBounds(150, 445, 125, 30);
		this.materiaTextField.setText(question.getMateria());
		add(this.materiaTextField);
		
		this.textConcurso.setText("Concurso");
		textConcurso.setForeground(new java.awt.Color(255, 255, 255));
		this.textConcurso.setBounds(335, 425, 200, 20);
		add(this.textConcurso);
		
		this.concursoTextField.setBounds(335, 445, 125, 30);
		this.concursoTextField.setText(question.getNomeConcurso());
		add(this.concursoTextField);
		
		this.textAno.setText("Ano");
		textAno.setForeground(new java.awt.Color(255, 255, 255));
		this.textAno.setBounds(520, 425, 200, 20);
		add(this.textAno);
		
		this.anoTextField.setBounds(520, 445, 125, 30);
		this.anoTextField.setText(Integer.toString(question.getAnoAplicacao()));
		add(this.anoTextField);
		
		this.botaoEditarQuestao.setBounds(295, 500, 200, 30);
		this.botaoEditarQuestao.setText("Editar Questao");
		this.botaoEditarQuestao.addActionListener(this);
		add(this.botaoEditarQuestao);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == this.botaoCancelar) {
			new HomeAdministrador(administrador, "");
			this.dispose();
		}
		if(e.getSource() == this.botaoEditarQuestao) {
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
				ControllerAdministrador.editarQuestao(questao, enunciado, itemA, itemB, itemC, itemD, gabarito, materia, concurso, ano);
				JOptionPane.showMessageDialog(null, "Questao editada!");
				new HomeAdministrador(administrador, "");
				this.dispose();
			}
		}
	}
	
}
