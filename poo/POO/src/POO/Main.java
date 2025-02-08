package POO;

public class Main {
    public static void main(String[] args) {

        Pessoa pessoa1 = new Pessoa();

        pessoa1.setNome("Alunnno");
        pessoa1.setIdade(33);
        pessoa1.setPeso(80.3);
        pessoa1.setAltura(1.78);

        System.out.println(pessoa1.getNome() + " "+ pessoa1.getIdade()
        + " "+ pessoa1.getPeso() + " "+ pessoa1.getAltura());
    }
}
