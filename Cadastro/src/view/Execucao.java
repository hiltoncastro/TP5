package view;
import model.Professor;
import javax.swing.JOptionPane;

public class Execucao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Professor professor = new Professor();
		int dis=0,cur=0;
		
		
		professor.setNome(JOptionPane.showInputDialog(null, "Nome: "));
		professor.setEndereco(JOptionPane.showInputDialog(null, "Endereco: "));
		professor.setBairro(JOptionPane.showInputDialog(null, "Bairro: "));
		professor.setCep(Integer.parseInt(JOptionPane.showInputDialog(null, "CEP: ")));
		professor.setCidade(JOptionPane.showInputDialog(null, "Cidade: "));
		professor.setEstado(JOptionPane.showInputDialog(null, "Estado: "));
		professor.setRg(Long.parseLong(JOptionPane.showInputDialog(null, "RG: ")));
		professor.setCpf(Long.parseLong(JOptionPane.showInputDialog(null, "CPF: ")));
		
				
		System.out.println(professor.getNome());
		System.out.println(professor.getEndereco());
		System.out.println(professor.getBairro());
		System.out.println(professor.getCep());
		System.out.println(professor.getCidade());
		System.out.println(professor.getEstado());
		System.out.println(professor.getRg());
		System.out.println(professor.getCpf());
		
		
			
		
		try {
			dis = Integer.parseInt(JOptionPane.showInputDialog(null, "Quantas disciplinas voc� possui?"));
			String disciplinas[] = new String[100];
			for (int i = 0; i < dis; i++) {
				disciplinas[i] = JOptionPane.showInputDialog(null, "Digite a disciplina " + (i+1));
			}
			professor.setDisciplinas(disciplinas);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try {
			 cur = Integer.parseInt(JOptionPane.showInputDialog(null, "Quantos cursos voc� possui?"));
			String cursos[] = new String[100];
			for (int i= 0; i < cur; i++) {
				cursos[i] = JOptionPane.showInputDialog(null, "Digite o curso: " + (i+1));
			}
			professor.setCursos(cursos);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try {
			System.out.println("");
			for (int i = 0; i < dis; i++) {
				System.out.println(professor.getDisciplinas()[i]);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try {
			System.out.println("");
			for (int i= 0; i < cur; i++) {
				System.out.println(professor.getCursos()[i]);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
			
		
		
	}

}
