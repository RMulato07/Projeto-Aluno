package prjAluno;
import java.util.Scanner;
public class Principal {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Aluno aluno = new Aluno();
		
		for(int i=0; i<4;i++) {
			System.out.println("digite a " + (i+1)+ " notas ");
			aluno.notas[i] = in.nextDouble();
		}
		
		aluno.calcularMedia();
		System.out.println("media é "+ aluno.media);
	}

}
