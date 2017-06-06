package ProjetoQuiz;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class Quiz extends JFrame implements ActionListener{
	String [][] perguntas = new String[20][6];
	JRadioButton [] questoes = new JRadioButton[4];
	JLabel jlPergunta = new JLabel("");
	JLabel jlPontuacao = new JLabel("Pontuação: 0");
        JLabel jlChances = new JLabel("Chances: 3");
	int posAtual = 0;
	int pontos = 0;
        int chances = 3;
	JButton jbResponder = new JButton("Responder");
	ButtonGroup bgOp = new ButtonGroup();
	public Quiz() {
		super(" T.I S H O W");
		setLayout(new GridLayout(8,3));
		
                carregaPerguntas();
		
                for (int id=0;id<20;id++){
			questoes[id] = new JRadioButton();
			bgOp.add(questoes[id]);
		}
		montaTela();
		jlPontuacao.setHorizontalAlignment(JTextField.RIGHT);
		add(jlPergunta);
		add(questoes[0]);
		add(questoes[1]);
		add(questoes[2]);
		add(questoes[3]);
		add(jlPontuacao);
                add(jlChances);       
		add(jbResponder);
		jbResponder.addActionListener(this);
		pack();
		setLocationRelativeTo(null);
		setVisible(true);
	}
	public void carregaPerguntas(){
		perguntas[0][0] = "Qanto é 1 + 1?";
		perguntas[0][1] = "2";
		perguntas[0][2] = "3";
		perguntas[0][3] = "6";
		perguntas[0][4] = "1";
		perguntas[0][5] = "1";
		
		perguntas[1][0] = "Batman ou Superman?";
		perguntas[1][1] = "Superman";
		perguntas[1][2] = "Batman";
		perguntas[1][3] = "Aquaman";
		perguntas[1][4] = "Cresce menino";
		perguntas[1][5] = "2";
		
		perguntas[2][0] = "Java ou PHP?";
		perguntas[2][1] = "Vb.net";
		perguntas[2][2] = "PHP";
		perguntas[2][3] = "Java";
		perguntas[2][4] = "Algoritmo";
		perguntas[2][5] = "3";
                
                perguntas[3][0] = "Java ou PHP?";
		perguntas[3][1] = "Vb.net";
		perguntas[3][2] = "PHP";
		perguntas[3][3] = "Java";
		perguntas[3][4] = "Algoritmo";
		perguntas[3][5] = "4";
                
                perguntas[4][0] = "Qanto é 1 + 1?";
		perguntas[4][1] = "2";
		perguntas[4][2] = "3";
		perguntas[4][3] = "6";
		perguntas[4][4] = "1";
		perguntas[4][5] = "1";
		
		perguntas[5][0] = "Batman ou Superman?";
		perguntas[5][1] = "Superman";
		perguntas[5][2] = "Batman";
		perguntas[5][3] = "Aquaman";
		perguntas[5][4] = "Cresce menino";
		perguntas[5][5] = "2";
		
		perguntas[6][0] = "Java ou PHP?";
		perguntas[6][1] = "Vb.net";
		perguntas[6][2] = "PHP";
		perguntas[6][3] = "Java";
		perguntas[6][4] = "Algoritmo";
		perguntas[6][5] = "3";
                
                perguntas[7][0] = "Java ou PHP?";
		perguntas[7][1] = "Vb.net";
		perguntas[7][2] = "PHP";
		perguntas[7][3] = "Java";
		perguntas[7][4] = "Algoritmo";
		perguntas[7][5] = "4";
                
                perguntas[8][0] = "Qanto é 1 + 1?";
		perguntas[8][1] = "2";
		perguntas[8][2] = "3";
		perguntas[8][3] = "6";
		perguntas[8][4] = "1";
		perguntas[8][5] = "1";
		
		perguntas[9][0] = "Batman ou Superman?";
		perguntas[9][1] = "Superman";
		perguntas[9][2] = "Batman";
		perguntas[9][3] = "Aquaman";
		perguntas[9][4] = "Cresce menino";
		perguntas[9][5] = "2";
		
		perguntas[10][0] = "Java ou PHP?";
		perguntas[10][1] = "Vb.net";
		perguntas[10][2] = "PHP";
		perguntas[10][3] = "Java";
		perguntas[10][4] = "Algoritmo";
		perguntas[10][5] = "3";
                
                perguntas[11][0] = "Java ou PHP?";
		perguntas[11][1] = "Vb.net";
		perguntas[11][2] = "PHP";
		perguntas[11][3] = "Java";
		perguntas[11][4] = "Algoritmo";
		perguntas[11][5] = "4";
                
                perguntas[12][0] = "Qanto é 1 + 1?";
		perguntas[12][1] = "2";
		perguntas[12][2] = "3";
		perguntas[12][3] = "6";
		perguntas[12][4] = "1";
		perguntas[12][5] = "1";
		
		perguntas[13][0] = "Batman ou Superman?";
		perguntas[13][1] = "Superman";
		perguntas[13][2] = "Batman";
		perguntas[13][3] = "Aquaman";
		perguntas[13][4] = "Cresce menino";
		perguntas[13][5] = "2";
		
		perguntas[14][0] = "Java ou PHP?";
		perguntas[14][1] = "Vb.net";
		perguntas[14][2] = "PHP";
		perguntas[14][3] = "Java";
		perguntas[14][4] = "Algoritmo";
		perguntas[14][5] = "3";
                
                perguntas[15][0] = "Java ou PHP?";
		perguntas[15][1] = "Vb.net";
		perguntas[15][2] = "PHP";
		perguntas[15][3] = "Java";
		perguntas[15][4] = "Algoritmo";
		perguntas[15][5] = "4";
                
                perguntas[16][0] = "Java ou PHP?";
		perguntas[16][1] = "Vb.net";
		perguntas[16][2] = "PHP";
		perguntas[16][3] = "Java";
		perguntas[16][4] = "Algoritmo";
		perguntas[16][5] = "3";
                
                perguntas[17][0] = "Java ou PHP?";
		perguntas[17][1] = "Vb.net";
		perguntas[17][2] = "PHP";
		perguntas[17][3] = "Java";
		perguntas[17][4] = "Algoritmo";
		perguntas[17][5] = "4";
                
                perguntas[18][0] = "Qanto é 1 + 1?";
		perguntas[18][1] = "2";
		perguntas[18][2] = "3";
		perguntas[18][3] = "6";
		perguntas[18][4] = "1";
		perguntas[18][5] = "1";
		
		perguntas[19][0] = "Batman ou Superman?";
		perguntas[19][1] = "Superman";
		perguntas[19][2] = "Batman";
		perguntas[19][3] = "Aquaman";
		perguntas[19][4] = "Cresce menino";
		perguntas[19][5] = "2";
		
                
	}
	public void montaTela() {
		jlPergunta.setText(perguntas[posAtual][0]);
		for (int id=0;id<4;id++){
			questoes[id].setText(perguntas[posAtual][id+1]);
		}
	}
	public static void main(String [] args){
		new Main();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		int respostaCerta = Integer.parseInt(perguntas[posAtual][5]);
		

		if (questoes[respostaCerta-1].isSelected()){
			pontos = pontos + 100;
                        chances = chances;
		} else{
			pontos = pontos - 100;
                        chances = chances - 1;
                }
		jlPontuacao.setText("Pontuação: " + pontos);
                jlChances.setText("Chances: " + chances);
                if ( posAtual == 19){
                        JOptionPane.showMessageDialog(null, "Você ganhou " );
                        }else{
                        JOptionPane.showMessageDialog(null, "Você perdeu");
                        }
                if (posAtual<20){
			posAtual++;
                        
                }else
			JOptionPane.showMessageDialog(null, "Fim de Jogo");
		montaTela();
		
		
	}
}
