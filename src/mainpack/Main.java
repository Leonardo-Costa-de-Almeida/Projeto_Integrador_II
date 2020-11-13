package mainpack;
import menus.Menu_Principal;


import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Font;





public class Main implements ActionListener {
	
	
	private static JTextField textField;
	private static JFrame frameMain;
	
	/**
	 * @wbp.parser.entryPoint
	 */
	public static void main(String[] args) {
//		Tabuleiro  tabuleiro = new Tabuleiro();
		
//	tabuleiro.criar();
		
		JPanel panel = new JPanel();
		panel.setForeground(Color.RED);
		panel.setBackground(Color.BLACK);
		frameMain = new JFrame();
		frameMain.setSize(750, 500);
		frameMain.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frameMain.setLocation(500, 250);
		
		frameMain.getContentPane().add(panel);
		panel.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(294, 179, 37, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("Escolher");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton.setForeground(Color.GREEN);
		btnNewButton.setBackground(Color.GRAY);
		btnNewButton.setBounds(341, 178, 91, 23);
		btnNewButton.addActionListener(new Main());
		panel.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("1 - CADASTRAR");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel.setForeground(Color.GREEN);
		lblNewLabel.setBounds(284, 63, 111, 14);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("2 - LOGIN");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1.setForeground(Color.GREEN);
		lblNewLabel_1.setBounds(284, 88, 79, 14);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("3 - TUTORIAL");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_2.setForeground(Color.GREEN);
		lblNewLabel_2.setBounds(284, 113, 100, 14);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("4 - SAIR");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_3.setForeground(Color.GREEN);
		lblNewLabel_3.setBounds(294, 145, 79, 14);
		panel.add(lblNewLabel_3);
		
		JLabel lblCriadoPorLeonardo = new JLabel("Desenvolvido por Leonardo Almeida e Rafel Kampa");
		lblCriadoPorLeonardo.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		lblCriadoPorLeonardo.setForeground(Color.GREEN);
		lblCriadoPorLeonardo.setBounds(395, 430, 317, 20);
		panel.add(lblCriadoPorLeonardo);
		
		JLabel lblBemvindosAMonster = new JLabel("Bem-vindos a Monster Dama!");
		lblBemvindosAMonster.setForeground(Color.GREEN);
		lblBemvindosAMonster.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblBemvindosAMonster.setBounds(224, 11, 317, 38);
		panel.add(lblBemvindosAMonster);
		
		
		frameMain.setVisible(true);
		
		
	}


	@Override
	public void actionPerformed(ActionEvent arg0) {
		String escolha = textField.getText();
		switch (escolha) {
		
		case "1":
			Menu_Principal.Cadastrar();
			frameMain.dispose();
			break;
			
		case "2": 
			Menu_Principal.Login();
			frameMain.dispose();
			break;
			
		case "3":
			Menu_Principal.Tutorial();
			frameMain.dispose();
			break;
		
			
		
		case "4":
			
			System.exit(0);
			break;
		default:
			
			
			
		}
	
	}
}
