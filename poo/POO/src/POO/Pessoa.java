package POO;

public class Pessoa {
    private String nome;
    private int idade;
    private double altura;
    private double peso;

    public Pessoa() {
        this.nome = "Sem nome";
        this.idade = 0;
        this.altura = 0.0;
        this.peso = 0.0;
    }

    public Pessoa(String nome, int idade, double altura, double peso) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
        this.peso = peso;
    }

    public void setNome( String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setIdade( int idade) {
        this.idade = idade;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setAltura( double altura) {
        this.altura = altura;
    }

    public double getAltura() {
        return this.altura;
    }

    public void setPeso( double peso) {
        this.peso = peso;
    }

    public double getPeso() {
        return this.peso;
    }

    public double calcularImc() {
        return peso / (altura * altura);
    }

    public String classificacaoDeImc() {
        double imc = calcularImc();

        if (imc < 18.5) return "Abaixo do peso";
        if (imc < 25.0) return "Peso normal";
        if (imc < 30) return "Sobrepeso";
        return "Obesidade";
    }

    public String apresentar() {
        return "Olá, me chamo "+ nome +", eu tenho "+idade+" anos, peso "+ peso + " kg e tenho "+ altura+"m de altura!";
    }
}

