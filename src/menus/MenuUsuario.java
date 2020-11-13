package menus;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import funcoesMenu.ComoJogar;
import funcoesMenu.Dama;
import funcoesMenu.LoginUsuario;
import funcoesMenu.Rank;
import funcoesMenu.TelaInfoPartida;
import mainpack.Main;
import java.awt.Font;

public class MenuUsuario implements ActionListener{
	
	private static JTextField textField;
	private static JFrame frameMenuUsuario;
	
	/**
	 * @wbp.parser.entryPoint
	 */
	public static void menu2(){
		JPanel panel = new JPanel();
		panel.setForeground(Color.RED);
		panel.setBackground(Color.BLACK);
		frameMenuUsuario = new JFrame();
		frameMenuUsuario.setSize(750, 500);
		frameMenuUsuario.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		frameMenuUsuario.setLocation(500, 250);
		
		frameMenuUsuario.getContentPane().add(panel);
		panel.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(213, 200, 37, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("Escolher");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton.setForeground(Color.GREEN);
		btnNewButton.setBackground(Color.GRAY);
		btnNewButton.setBounds(260, 199, 89, 23);
		btnNewButton.addActionListener(new MenuUsuario());
		panel.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("1 - JOGAR");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel.setForeground(Color.GREEN);
		lblNewLabel.setBounds(207, 81, 97, 14);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("2 - RANK");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1.setForeground(Color.GREEN);
		lblNewLabel_1.setBounds(207, 106, 167, 14);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("3 - COMO JOGAR");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_2.setForeground(Color.GREEN);
		lblNewLabel_2.setBounds(207, 131, 117, 14);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("4 - LOGOUT");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_3.setForeground(Color.GREEN);
		lblNewLabel_3.setBounds(217, 156, 79, 14);
		panel.add(lblNewLabel_3);
		
		JLabel lblBemVindo = new JLabel("Bem - vindos");
		lblBemVindo.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblBemVindo.setForeground(Color.GREEN);
		lblBemVindo.setBounds(509, 59, 124, 14);
		panel.add(lblBemVindo);
		
		JLabel lblNewLabel_4 = new JLabel("New label");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_4.setForeground(Color.GREEN);
		lblNewLabel_4.setBounds(509, 84, 152, 23);
		panel.add(lblNewLabel_4);
		frameMenuUsuario.setVisible(true);
		lblNewLabel_4.setText(LoginUsuario.usuarioLogado[0]);
		
		JLabel label = new JLabel((String)LoginUsuario.usuarioLogado[1]);
		label.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label.setForeground(Color.GREEN);
		label.setBounds(509, 109, 152, 23);
		panel.add(label);
		
		JLabel label_1 = new JLabel("Monster Dama!");
		label_1.setForeground(Color.GREEN);
		label_1.setFont(new Font("Tahoma", Font.BOLD, 30));
		label_1.setBounds(186, 11, 233, 38);
		panel.add(label_1);
	}


	@Override
	public void actionPerformed(ActionEvent arg0) {
		String escolha = textField.getText();
		switch (escolha) {
		
		case "1":
			frameMenuUsuario.dispose();
			Dama.pontosBranco = 0;
			Dama.pontosVerde = 0;
			TelaInfoPartida.submenu();
			Dama.dama();
			
			break;
		case "2": 
			frameMenuUsuario.dispose();
			Rank.rank();
			break;
		case "3":
			frameMenuUsuario.dispose();
			ComoJogar.comoJogar();
			break;
		case "4":
			Main.main(null);
			frameMenuUsuario.dispose();
			break;
		default:
			
			
			
		}
		
	}
}
