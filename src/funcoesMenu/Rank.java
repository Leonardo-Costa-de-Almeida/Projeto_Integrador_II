package funcoesMenu;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;

import menus.MenuUsuario;
import usuario.Usuario;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Rank {
	private static JPanel panel;
	public static JFrame frameRank;
	

	
	/**
	 * @wbp.parser.entryPoint
	 */
	public static void rank(){
		
		
		List<Usuario> rank = new ArrayList<Usuario>(CadastrarUsuario.userMap.values());
		Collections.sort(rank, Comparator.comparing(Usuario::getPontos));
		
		panel = new JPanel();
		panel.setForeground(Color.RED);
		panel.setBackground(Color.BLACK);
	
		frameRank = new JFrame();
		frameRank.getContentPane().setBackground(Color.BLACK);
		frameRank.setSize(750, 500);
		
		frameRank.setLocation(500, 250);
		frameRank.getContentPane().setLayout(null);
	
			
		JLabel lblNewLabel = new JLabel(rank.get(rank.size()-1).getNome(null));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setForeground(Color.GREEN);
		lblNewLabel.setBounds(311, 132, 117, 14);
		frameRank.getContentPane().add(lblNewLabel);
		
		
		
		
		JLabel lblNewLabel_1 = new JLabel(rank.get(rank.size()-2).getNome(null));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1.setForeground(Color.GREEN);
		lblNewLabel_1.setBounds(311, 167, 117, 14);
		frameRank.getContentPane().add(lblNewLabel_1);
		
		JLabel label = new JLabel(rank.get(rank.size()-3).getNome(null));
		label.setForeground(Color.GREEN);
		label.setFont(new Font("Tahoma", Font.PLAIN, 12));
		label.setBounds(311, 194, 117, 14);
		frameRank.getContentPane().add(label);
		
		JLabel lblNewLabel_2 = new JLabel("Rank 1 - ");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_2.setForeground(Color.GREEN);
		lblNewLabel_2.setBounds(241, 132, 74, 14);
		frameRank.getContentPane().add(lblNewLabel_2);
		
		JLabel lblRank = new JLabel("Rank 2   - ");
		lblRank.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblRank.setForeground(Color.GREEN);
		lblRank.setBounds(241, 166, 74, 14);
		frameRank.getContentPane().add(lblRank);
		
		JLabel lblNewLabel_3 = new JLabel("RANK TOP 3 JOGADORES!!!");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 33));
		lblNewLabel_3.setForeground(Color.GREEN);
		lblNewLabel_3.setBounds(141, 60, 530, 26);
		frameRank.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Rank 3     -");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_4.setForeground(Color.GREEN);
		lblNewLabel_4.setBounds(241, 193, 74, 14);
		frameRank.getContentPane().add(lblNewLabel_4);
		
		
		
		JLabel lblPontos = new JLabel("Pontos:");
		lblPontos.setForeground(Color.GREEN);
		lblPontos.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblPontos.setBounds(438, 134, 74, 14);
		frameRank.getContentPane().add(lblPontos);
		
		JLabel label_1 = new JLabel(String.valueOf(rank.get(rank.size()-1).getPontos()));
		label_1.setForeground(Color.GREEN);
		label_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		label_1.setBounds(522, 134, 117, 14);
		frameRank.getContentPane().add(label_1);
		
		JLabel lblPontos_1 = new JLabel("Pontos:");
		lblPontos_1.setForeground(Color.GREEN);
		lblPontos_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblPontos_1.setBounds(438, 168, 74, 14);
		frameRank.getContentPane().add(lblPontos_1);
		
		JLabel label_2 = new JLabel(String.valueOf(rank.get(rank.size()-2).getPontos()));
		label_2.setForeground(Color.GREEN);
		label_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		label_2.setBounds(522, 168, 117, 14);
		frameRank.getContentPane().add(label_2);
		
		JLabel lblPontos_2 = new JLabel("Pontos:");
		lblPontos_2.setForeground(Color.GREEN);
		lblPontos_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblPontos_2.setBounds(438, 194, 74, 14);
		frameRank.getContentPane().add(lblPontos_2);
		
		JLabel label_3 = new JLabel(String.valueOf(rank.get(rank.size()-3).getPontos()));
		label_3.setForeground(Color.GREEN);
		label_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		label_3.setBounds(522, 194, 117, 14);
		frameRank.getContentPane().add(label_3);
		
		JButton btnNewButton = new JButton("Voltar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				MenuUsuario.menu2();
				frameRank.dispose();
			}
		});
		btnNewButton.setBackground(Color.GRAY);
		btnNewButton.setForeground(Color.GREEN);
		btnNewButton.setBounds(595, 396, 89, 23);
		frameRank.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_5 = new JLabel(LoginUsuario.usuarioLogado[0]);
		lblNewLabel_5.setForeground(Color.GREEN);
		lblNewLabel_5.setBounds(46, 346, 83, 14);
		frameRank.getContentPane().add(lblNewLabel_5);
		
		JLabel lblUserlog = new JLabel(LoginUsuario.usuarioLogado[1]);
		lblUserlog.setForeground(Color.GREEN);
		lblUserlog.setBounds(154, 346, 83, 14);
		frameRank.getContentPane().add(lblUserlog);
		
		JLabel lblNewLabel_6 = new JLabel("Sua pontua\u00E7\u00E3o:");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_6.setForeground(Color.GREEN);
		lblNewLabel_6.setBounds(46, 309, 191, 26);
		frameRank.getContentPane().add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel(String.valueOf(CadastrarUsuario.userMap.get(LoginUsuario.usuarioLogado[0]).getPontos()));
		lblNewLabel_7.setForeground(Color.GREEN);
		lblNewLabel_7.setBounds(46, 379, 83, 14);
		frameRank.getContentPane().add(lblNewLabel_7);
		
		JLabel lblPontosuser = new JLabel(String.valueOf(CadastrarUsuario.userMap.get(LoginUsuario.usuarioLogado[1]).getPontos()));
		lblPontosuser.setForeground(Color.GREEN);
		lblPontosuser.setBounds(154, 379, 83, 14);
		frameRank.getContentPane().add(lblPontosuser);
		
		JLabel label_4 = new JLabel("Monster Dama!");
		label_4.setForeground(Color.GREEN);
		label_4.setFont(new Font("Tahoma", Font.BOLD, 30));
		label_4.setBounds(241, 11, 233, 38);
		frameRank.getContentPane().add(label_4);
		
		frameRank.setVisible(true);
		
	}
}
