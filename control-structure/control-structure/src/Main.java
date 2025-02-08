public class Main {
    // exemplos de controle
    public static void main(String[] args) {
    //if else

        int idade = 18;

        if (idade >= 18) {
            System.out.println("Você é maior de idade.");
        } else {
            System.out.println("Você não é maior de idade");
        }

        int hora = 19;

        if(hora < 12) {
            System.out.println("Bom dia!");
        } else if(hora < 18){
            System.out.println("Boa tarde!");
        } else {
            System.out.println("Boa noite!");
        }

        int x = 10;
        int y = 5;

        System.out.println("x == y: " + (x == y ));
        System.out.println("x != y: " + (x != y ));
        System.out.println("x > y: " + (x > y ));
        System.out.println("x < y: " + (x < y ));
        System.out.println("x >= y: " + (x >= y ));
        System.out.println("x <= y: " + (x <= y ));

        boolean o = true;

        if (o){
            System.out.println("é verdadeiro");
        }

        // && = true se todas as opções forem true
        // || = true se ao menos uma for true
        // ! = altera o valor para o contrário false se torna true...

        boolean temDinheiro = true;
        boolean temTempo = false;

        if (temDinheiro && temTempo) {
            System.out.println("Pode viajar");
        } else {
            System.out.println("Não pode viajar.");
        }

        int contador = 1;

        while(contador <= 5) {
            System.out.println(contador);
            contador++;
        }

        for (int i = 1; i <= 5; i++) {
            System.out.println("i: "+i);
        }

        int[] numeros = {1,2,3,4,5,6,7,8,9};

        int somaPar = 0;
        int somaImpar = 0;

        for(int num : numeros){
            if (num % 2 == 0) {
                somaPar += num;
            } else {
                somaImpar += num;
            }

            if (num % 3 == 0 ) {
                System.out.println("O número "+ num + " é múltiplo de 3.");
            }

            if (num > 5 && num < 7 ) {
                System.out.println("O número está entre 5 e 7 = "+ num);
            }
        }
        System.out.println("Soma dos Pares: " + somaPar);
        System.out.println("Soma dos Impares: " + somaImpar);

        for (int i = 1; i <= 10; i++){
            if(i==2){
                continue;
            }
            if (i == 5 ){
                break;
            }
            System.out.println(i);
        }
    }
}