package visao;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import controle.ControllerAdministrador;
import controle.ControllerEstudante;

public class Login extends JFrame implements ActionListener {
	
	private JLabel textEmail = new JLabel();
	private JTextField emailTextField = new JTextField();
	private JLabel textSenha = new JLabel();
	private JTextField senhaTextField = new JTextField();
	private JCheckBox checkBox = new JCheckBox();
	private JLabel textFuncionario = new JLabel();
	private JButton botaoEntrar = new JButton();
	private JLabel textCriarConta = new JLabel();
	private JButton botaoCadastrar = new JButton();
	
	public Login() {
		setVisible(true);
		setResizable(false);
		setTitle("Saber+");
		setSize(800,650);
		setLayout(null);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		getContentPane().setBackground(new java.awt.Color(26, 37, 48));
		
		this.textEmail.setText("E-mail");
		textEmail.setForeground(new java.awt.Color(255, 255, 255));
		this.textEmail.setBounds(300, 190, 100, 20);
		add(this.textEmail);
		
		this.emailTextField.setBounds(300, 210, 200, 30);
		add(this.emailTextField);
		
		this.textSenha.setText("Senha");
		textSenha.setForeground(new java.awt.Color(255, 255, 255));
		this.textSenha.setBounds(300, 240, 100, 20);
		add(this.textSenha);
		
		this.senhaTextField.setBounds(300, 260, 200, 30);
		add(this.senhaTextField);
		
		this.checkBox.setBounds(315, 305, 20, 20); 
		add(this.checkBox);
		
		this.textFuncionario.setText("Faço parte da empresa.");
		textFuncionario.setForeground(new java.awt.Color(255, 255, 255));
		this.textFuncionario.setBounds(340, 305, 200, 20);
		add(this.textFuncionario);
		
		this.botaoEntrar.setBounds(300, 345, 200, 30);
		this.botaoEntrar.setText("Entrar");
		this.botaoEntrar.addActionListener(this);
		add(this.botaoEntrar);
		
		this.textCriarConta.setText("Ainda não possui uma conta?");
		textCriarConta.setForeground(new java.awt.Color(255, 255, 255));
		this.textCriarConta.setBounds(316, 380, 200, 20);
		add(this.textCriarConta);
		
		this.botaoCadastrar.setBounds(300, 405, 200, 30);
		this.botaoCadastrar.setText("Criar conta");
		this.botaoCadastrar.addActionListener(this);
		add(this.botaoCadastrar);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == this.botaoEntrar) {
			String emailUsuario = emailTextField.getText();
			String senhaUsuario = senhaTextField.getText();
			
			if(emailUsuario.isEmpty() == true || senhaUsuario.isEmpty() == true) {
				JOptionPane.showMessageDialog(null, "E-mail e senha devem estar preenchidos.");
			}
			else {
				if (checkBox.isSelected()) {
					if (ControllerAdministrador.logarAdministrador(emailUsuario, senhaUsuario) == false) {
						JOptionPane.showMessageDialog(null, "Usuário e/ou senha inválido.");
					}
					else {
						this.dispose();
					}
				}
				else {
					if (ControllerEstudante.logarEstudante(emailUsuario, senhaUsuario) == false) {
						JOptionPane.showMessageDialog(null, "Usuário e/ou senha inválido.");
					}
					else {
						this.dispose();
					}
				}
			}	
		}
		if(e.getSource() == this.botaoCadastrar) {
			new EscolherUsuario();
			this.dispose();
		}
	}
	
}
