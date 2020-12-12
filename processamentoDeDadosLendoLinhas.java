import java.util.Scanner;

public class processamentoDeDadosLendoLinhas {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String s1, s2, s3;
		int x;

		x = sc.nextInt();
		sc.nextLine();
		s1 = sc.nextLine(); // lê um texto até a quebra de linha
		s2 = sc.nextLine(); // lê um texto até a quebra de linha
		s3 = sc.nextLine(); // lê um texto até a quebra de linha

		System.out.println("DADOS DIGITADOS:");
		System.out.println(x);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);

		sc.close();
	}
}