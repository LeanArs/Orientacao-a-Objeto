package visao;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class EscolherUsuario extends JFrame implements ActionListener{
	
	private JButton botaoCadastrarEstudante = new JButton();
	private JButton botaoCadastrarAdministrador = new JButton();
	private JButton botaoPossuoConta = new JButton();
	
	public EscolherUsuario() {
		setVisible(true);
		setResizable(false);
		setTitle("Saber+");
		setSize(800,650);
		setLayout(null);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		getContentPane().setBackground(new java.awt.Color(26, 37, 48));
		
		this.botaoCadastrarEstudante.setBounds(190, 270, 200, 30);
		this.botaoCadastrarEstudante.setText("Sou Estudante");
		this.botaoCadastrarEstudante.addActionListener(this);
		add(this.botaoCadastrarEstudante);
		
		this.botaoCadastrarAdministrador.setBounds(410, 270, 200, 30);
		this.botaoCadastrarAdministrador.setText("Faço Parte da Empresa");
		this.botaoCadastrarAdministrador.addActionListener(this);
		add(this.botaoCadastrarAdministrador);
		
		this.botaoPossuoConta.setBounds(300, 320, 200, 30);
		this.botaoPossuoConta.setText("Já possuo uma conta");
		this.botaoPossuoConta.addActionListener(this);
		add(this.botaoPossuoConta);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == this.botaoCadastrarEstudante) {
			new CadastroEstudante();
			this.dispose();
		}
		if(e.getSource() == this.botaoCadastrarAdministrador) {
			new CadastroAdministrador();
			this.dispose();
		}
		if(e.getSource() == this.botaoPossuoConta) {
			new Login();
			this.dispose();
		}
	}
	
}
