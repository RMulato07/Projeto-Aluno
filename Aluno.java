package prjAluno;
import java.util.Scanner;
public class Aluno {
	String nome;
	String ra;
	double media;
	double notas[] = new double [4];
	
	
	public void calcularMedia(){
		for(int i=0; i<4; i++) {
			media = media + notas[i];
		}
		media = media/4;
	}
	
	
	
	
}