import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // vc deve escolher quantas pessoas você quer adicionar
        System.out.println("Quantas pessoas serão digitadas?: ");
        int n = sc.nextInt(); // O número que o usuario digitar, vai ser atribuido para "n" .

        //inicializando os vetores 'nomes' 'idades' 'alturas' com o tamanho de "n".

        String[] nomes = new String[n]; // esse "n" é o tamanho de cada array. É especificado pelo usuário.
        int[] idades = new int[n];
        double[] alturas = new double[n];

        // esse "for" faz a iteração sobre todos os arrays criados 'nome' 'idade' 'altura'. usando o tamanho de 'n'

        for (int i=0; i<n; i++){

            System.out.println("Dados da " + (i + 1) + "a pessoa: "); // foi feito i+1 para q ñ começe do 0 e sim do 1.
            System.out.println("Nome: ");
            nomes[i] = sc.next(); // o nome digitado  vai ser atribuido a variavel i

            System.out.println("Idades: ");
            idades[i] = sc.nextInt(); // A idade digitada  vai ser atribuido a variavel i

            System.out.println("Altura: ");
            alturas[i] = sc.nextDouble(); // A altura digitada  vai ser atribuido a variavel i

        }
        // realizando a soma e as médias das alturas;
        double soma = 0.0;
        for (int i = 0; i< n; i++){
            soma += alturas[i];  //A cada volta do 'for' Acumula o valor que já tem + o proximo.
        }
        double mediaAlturas = soma / n;
        System.out.println();
        System.out.printf(" A média das alturas é: %.2f%n ", mediaAlturas);

        //pega as idades que são menores de 16 anos
        int cont = 0;
        for(int i = 0; i < n; i++){
            if(idades[i] < 16){
                cont += 1;

            }
        }
        //porcentagem do grupo de pessoas que são menores que 16 anos
        double percent = cont * 100.0 /n;
        System.out.printf("Pessoas com menos de 16 anos: %.1f%%%n", percent);

        //imprime os nomes das pessoas que tem as idades abaixo de 16 anos;
        for(int i = 0; i < n; i++){
            if(idades[i]< 16){
                System.out.println(nomes[i]);
            }
        }

         sc.close();
    }
}