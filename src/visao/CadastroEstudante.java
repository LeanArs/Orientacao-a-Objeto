package visao;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import controle.ControllerEstudante;

public class CadastroEstudante extends JFrame implements ActionListener {

	private JLabel textCadastroEstudante = new JLabel();
	private JLabel textNome = new JLabel();
	private JTextField nomeTextField = new JTextField();
	private JLabel textEmail = new JLabel();
	private JTextField emailTextField = new JTextField();
	private JLabel textSenha = new JLabel();
	private JTextField senhaTextField = new JTextField();
	private JLabel textMatricula = new JLabel();
	private JTextField matriculaTextField = new JTextField();
	private JButton botaoCadastrar = new JButton();
	private JButton botaoPossuoConta = new JButton();
	
	public CadastroEstudante() {
		setVisible(true);
		setResizable(false);
		setTitle("Saber+");
		setSize(800,650);
		setLayout(null);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		getContentPane().setBackground(new java.awt.Color(26, 37, 48));
		
		this.textCadastroEstudante.setText("Cadastrar Estudante");
		textCadastroEstudante.setForeground(new java.awt.Color(255, 255, 255));
		this.textCadastroEstudante.setBounds(341, 120, 200, 20);
		add(this.textCadastroEstudante);
		
		this.textNome.setText("Nome");
		textNome.setForeground(new java.awt.Color(255, 255, 255));
		this.textNome.setBounds(300, 150, 200, 20);
		add(this.textNome);
		
		this.nomeTextField.setBounds(300, 170, 200, 30);
		add(this.nomeTextField);
		
		this.textEmail.setText("E-mail");
		textEmail.setForeground(new java.awt.Color(255, 255, 255));
		this.textEmail.setBounds(300, 205, 200, 20);
		add(this.textEmail);
		
		this.emailTextField.setBounds(300, 225, 200, 30);
		add(this.emailTextField);
		
		this.textSenha.setText("Senha");
		textSenha.setForeground(new java.awt.Color(255, 255, 255));
		this.textSenha.setBounds(300, 260, 200, 20);
		add(this.textSenha);
		
		this.senhaTextField.setBounds(300, 280, 200, 30);
		add(this.senhaTextField);
		
		this.textMatricula.setText("Matricula");
		textMatricula.setForeground(new java.awt.Color(255, 255, 255));
		this.textMatricula.setBounds(300, 315, 200, 20);
		add(this.textMatricula);
		
		this.matriculaTextField.setBounds(300, 335, 200, 30);
		add(this.matriculaTextField);
		
		this.botaoCadastrar.setBounds(300, 390, 200, 30);
		this.botaoCadastrar.setText("Cadastrar");
		this.botaoCadastrar.addActionListener(this);
		add(this.botaoCadastrar);

		this.botaoPossuoConta.setBounds(300, 430, 200, 30);
		this.botaoPossuoConta.setText("Já Possuo Conta");
		this.botaoPossuoConta.addActionListener(this);
		add(this.botaoPossuoConta);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == this.botaoCadastrar) {
			String nomeEstudante = nomeTextField.getText();
			String emailEstudante = emailTextField.getText();
			String senhaEstudante = senhaTextField.getText();
			int matriculaEstudante = Integer.parseInt(matriculaTextField.getText());
			
			ControllerEstudante.adicionarEstudanteLista(nomeEstudante, emailEstudante, senhaEstudante, matriculaEstudante);
			JOptionPane.showMessageDialog(null, "Estudante cadastrado com sucesso!");
			
			new Login();
			this.dispose();
		}
		if(e.getSource() == this.botaoPossuoConta) {
			new Login();
			this.dispose();
		}
	}

}
