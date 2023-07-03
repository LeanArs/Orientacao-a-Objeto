package visao;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPanel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import controle.ControllerEstudante;
import controle.ControllerUsuario;

import javax.swing.JList;
import javax.swing.JOptionPane;

import modelo.BancoDeDados;
import modelo.Estudante;

public class HomeEstudante extends JFrame implements ActionListener{
		
	private JButton deslogarAdministrador = new JButton();
	private JLabel text = new JLabel();
	private JLabel textBuscarQuestao = new JLabel();
	private JTextField buscarQuestaoTextField = new JTextField();
	private JButton buscarQuestao = new JButton();
	private JPanel panel = new JPanel();
	private JList<String> listaQuestoes = new JList<String>();
	private JLabel enunciadoQuestao = new JLabel();
	private JLabel itemAQuestao = new JLabel();
	private JLabel itemBQuestao = new JLabel();
	private JLabel itemCQuestao = new JLabel();
	private JLabel itemDQuestao = new JLabel();
	private JLabel textResponderQuestao = new JLabel();
	private JTextField responderQuestaoTextField = new JTextField();
	private JButton responderQuestao = new JButton();
	
	private Estudante estudante;
	
	public HomeEstudante(Estudante usuario, String string) {
		
		estudante = usuario;
		
		setVisible(true);
		setResizable(false);
		setTitle("Saber+");
		setSize(800,650);
		setLayout(null);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		getContentPane().setBackground(new java.awt.Color(26, 37, 48));
		
		this.deslogarAdministrador.setBounds(630, 30, 125, 30);
		this.deslogarAdministrador.setText("Logout");
		this.deslogarAdministrador.addActionListener(this);
		add(this.deslogarAdministrador);
		
		
		String nome = estudante.getNome();
		this.text.setText("Bem Vindo, " + nome);
		text.setForeground(new java.awt.Color(255, 255, 255));
		this.text.setBounds(45, 35, 100, 20);
		add(this.text);
		
		this.textBuscarQuestao.setText("Digite uma matéria");
		textBuscarQuestao.setForeground(new java.awt.Color(255, 255, 255));
		this.textBuscarQuestao.setBounds(100, 88, 200, 20);
		add(this.textBuscarQuestao);
		
		this.buscarQuestaoTextField.setBounds(100, 108, 420, 20);
		this.buscarQuestaoTextField.setText(string);
		add(this.buscarQuestaoTextField);
		
		this.buscarQuestao.setBounds(560, 100, 125, 30);
		this.buscarQuestao.setText("Buscar");
		this.buscarQuestao.addActionListener(this);
		add(this.buscarQuestao);
		
		panel.setBackground(new Color(37, 51, 66));
		panel.setBounds(100, 140, 585, 400);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		listaQuestoes = new JList<String>(ControllerUsuario.buscarListaQuestoes(string));
		listaQuestoes.setBounds(0, 0, 150, 400);
		listaQuestoes.setBackground(new java.awt.Color(255, 255, 255));
		panel.add(listaQuestoes);
		
		enunciadoQuestao.setForeground(new java.awt.Color(255, 255, 255));
		enunciadoQuestao.setBounds(180, 20, 300, 20);
		panel.add(enunciadoQuestao);
		
		itemAQuestao.setForeground(new java.awt.Color(255, 255, 255));
		itemAQuestao.setBounds(180, 70, 300, 20);
		panel.add(itemAQuestao);
		
		itemBQuestao.setForeground(new java.awt.Color(255, 255, 255));
		itemBQuestao.setBounds(180, 100, 300, 20);
		panel.add(itemBQuestao);

		itemCQuestao.setForeground(new java.awt.Color(255, 255, 255));
		itemCQuestao.setBounds(180, 130, 300, 20);
		panel.add(itemCQuestao);

		itemDQuestao.setForeground(new java.awt.Color(255, 255, 255));
		itemDQuestao.setBounds(180, 160, 300, 20);
		panel.add(itemDQuestao);
		
		textResponderQuestao.setForeground(new java.awt.Color(255, 255, 255));
		textResponderQuestao.setBounds(180, 340, 300, 20);
		panel.add(textResponderQuestao);
		
		panel.add(responderQuestaoTextField);
		
		panel.add(responderQuestao);
		responderQuestao.addActionListener(this);
		
		listaQuestoes.addListSelectionListener(new ListSelectionListener() {
			@Override
			public void valueChanged(ListSelectionEvent e) {
				
				int index = listaQuestoes.getSelectedIndex();
				
				if (buscarQuestaoTextField.getText().isEmpty() == false) {
					index = ControllerUsuario.buscarQuestoes(buscarQuestaoTextField.getText(), index);
				}
				
				enunciadoQuestao.setText("( " + BancoDeDados.getQuestoes().get(index).getNomeConcurso() + " / " + BancoDeDados.getQuestoes().get(index).getAnoAplicacao() + " ) "  + BancoDeDados.getQuestoes().get(index).getEnunciado());
				itemAQuestao.setText("A) " + BancoDeDados.getQuestoes().get(index).getItemA());
				itemBQuestao.setText("B) " + BancoDeDados.getQuestoes().get(index).getItemB());
				itemCQuestao.setText("C) " + BancoDeDados.getQuestoes().get(index).getItemC());
				itemDQuestao.setText("D) " + BancoDeDados.getQuestoes().get(index).getItemD());
				
				responderQuestao.setBounds(440, 350, 125, 30);
				responderQuestao.setText("Responder");
				
				textResponderQuestao.setText("Insira sua resposta");
				
				responderQuestaoTextField.setBounds(180, 360, 240, 20);
			}
		});
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == this.deslogarAdministrador) {
			new Login();
			this.dispose();
		}
		if(e.getSource() == this.buscarQuestao) {
			new HomeEstudante(estudante, buscarQuestaoTextField.getText());
			this.dispose();
		}
		if(e.getSource() == this.responderQuestao) {
			String resposta = responderQuestaoTextField.getText();
			
			int numero = listaQuestoes.getSelectedIndex();
			if (buscarQuestaoTextField.getText().isEmpty() == false) {
				numero = ControllerUsuario.buscarQuestoes(buscarQuestaoTextField.getText(), numero);
			}
			
			if (ControllerEstudante.responderQuestao(resposta, numero) == true) {
				JOptionPane.showMessageDialog(null, "Resposta correta!");
			}
			else {
				JOptionPane.showMessageDialog(null, "Resposta incorreta! Saiba que a resposta deve ser escrita igual está na opção.");
			}
		}
	}
	
}
