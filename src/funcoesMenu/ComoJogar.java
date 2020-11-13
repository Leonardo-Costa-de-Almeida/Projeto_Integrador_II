package funcoesMenu;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import mainpack.Main;
import menus.MenuUsuario;

public class ComoJogar {
	private static JPanel panel;
	public static JFrame frameComoJogar;
	
	/**
	 * @wbp.parser.entryPoint
	 */
	public static void comoJogar(){
		
		panel = new JPanel();
		panel.setForeground(Color.RED);
		panel.setBackground(Color.BLACK);
	
		frameComoJogar = new JFrame();
		frameComoJogar.getContentPane().setBackground(Color.BLACK);
		frameComoJogar.setSize(723, 458);
		
		frameComoJogar.setLocation(500, 250);
		frameComoJogar.getContentPane().setLayout(null);
		frameComoJogar.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		
		JLabel lblNewLabel = new JLabel("Como Jogar Monster Dama!");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setForeground(Color.GREEN);
		lblNewLabel.setBounds(249, 11, 233, 38);
		frameComoJogar.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel("Pe\u00E7as:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_2.setForeground(Color.GREEN);
		lblNewLabel_2.setBounds(118, 60, 471, 25);
		frameComoJogar.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Cada jogador recebera 12 pe\u00E7as no tabuleiro, sendo elas VERDES ou BRANCAS");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_3.setForeground(Color.GREEN);
		lblNewLabel_3.setBounds(118, 84, 518, 25);
		frameComoJogar.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Os jogadores ser\u00E3o informados de suas respectivas cores na janela de informa\u00E7\u00E3o \u00E0 direita do tabuleiro.");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_4.setForeground(Color.GREEN);
		lblNewLabel_4.setBounds(118, 109, 579, 25);
		frameComoJogar.getContentPane().add(lblNewLabel_4);
		
		JLabel lblVolteParaO = new JLabel("Movimentos: ");
		lblVolteParaO.setForeground(Color.GREEN);
		lblVolteParaO.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblVolteParaO.setBounds(118, 147, 471, 25);
		frameComoJogar.getContentPane().add(lblVolteParaO);
		
		JLabel lblParaVoltarAo = new JLabel("Cada jogador poder\u00E1 mover apenas 1 pe\u00E7a por turno.");
		lblParaVoltarAo.setForeground(Color.GREEN);
		lblParaVoltarAo.setBounds(118, 175, 445, 14);
		frameComoJogar.getContentPane().add(lblParaVoltarAo);
		
		JLabel lblParaEfutarO = new JLabel("Caso uma jogada possa resultar em capturar uma pe\u00E7a esteja dispon\u00EDvel, ser\u00E1 indicado no tabuleiro.");
		lblParaEfutarO.setForeground(Color.GREEN);
		lblParaEfutarO.setBounds(118, 188, 579, 25);
		frameComoJogar.getContentPane().add(lblParaEfutarO);
		
		JLabel lblLogin = new JLabel("Pontos:");
		lblLogin.setForeground(Color.GREEN);
		lblLogin.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblLogin.setBounds(118, 236, 422, 25);
		frameComoJogar.getContentPane().add(lblLogin);
		
		JLabel lblColoqueSeuNome = new JLabel("Cada jogador ira ganhar 200 pontos por cada pe\u00E7a capturada.");
		lblColoqueSeuNome.setForeground(Color.GREEN);
		lblColoqueSeuNome.setBounds(118, 259, 445, 14);
		frameComoJogar.getContentPane().add(lblColoqueSeuNome);
		
		JLabel lblCliqueEmLogin = new JLabel("Para receber seus pontos no Rank a partida deve ser finalizada. ");
		lblCliqueEmLogin.setForeground(Color.GREEN);
		lblCliqueEmLogin.setBounds(118, 272, 486, 20);
		frameComoJogar.getContentPane().add(lblCliqueEmLogin);
		
		JLabel lblGg = new JLabel("Vit\u00F3ria!");
		lblGg.setForeground(Color.GREEN);
		lblGg.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblGg.setBounds(118, 315, 422, 25);
		frameComoJogar.getContentPane().add(lblGg);
		
		JLabel lblOJogoFoi = new JLabel("O primeiro jogador que comer todas as pe\u00E7as do advers\u00E1rio GANHA a partida!");
		lblOJogoFoi.setForeground(Color.GREEN);
		lblOJogoFoi.setBounds(118, 339, 445, 20);
		frameComoJogar.getContentPane().add(lblOJogoFoi);
		
		JButton btnNewButton = new JButton("Voltar");
		btnNewButton.setForeground(Color.GREEN);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				MenuUsuario.menu2();
				frameComoJogar.dispose();
				
			}
		});
		btnNewButton.setBackground(Color.GRAY);
		btnNewButton.setBounds(569, 376, 89, 23);
		frameComoJogar.getContentPane().add(btnNewButton);
		
		JLabel lblPormOMovimento = new JLabel("Por\u00E9m o movimento de comer pe\u00E7a n\u00E3o ser\u00E1 obrigat\u00F3rio. ");
		lblPormOMovimento.setForeground(Color.GREEN);
		lblPormOMovimento.setBounds(118, 211, 445, 14);
		frameComoJogar.getContentPane().add(lblPormOMovimento);
		
		JLabel lblCasoOsJogadores = new JLabel("Caso os jogadores decidam por cancelar a partida, os mesmo n\u00E3o receberam os Pontos de Rank.");
		lblCasoOsJogadores.setForeground(Color.GREEN);
		lblCasoOsJogadores.setBounds(118, 284, 563, 20);
		frameComoJogar.getContentPane().add(lblCasoOsJogadores);
		
		frameComoJogar.setVisible(true);
	}
}

