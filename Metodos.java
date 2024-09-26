class Positivoounegativo {// Classe para verificar se um número é positivo ou negativo
    private int num; // Atributo privado para armazenar o número

    public Positivoounegativo(int num) {// Construtor que inicializa o número
        this.num = num; // Atribui o número ao atributo da classe
        VerificaNumero(); // Chama o método que verifica o número
    }

    private void VerificaNumero() {// Método privado que verifica se o número é positivo ou negativo
        if (num >= 0) {
            System.out.println(num + " é positivo");// Número maior ou igual a zero
        } else {
            System.out.println(num + " é negativo");// Número menor que zero
        }
    }
}

class Mediaaritmetica {// Classe para calcular a média aritmética
    private int x;
    private int y;
    private int z;

    public Mediaaritmetica(int x, int y, int z) {// Construtor que inicializa os valores
        this.x = x; // Atribui o primeiro valor
        this.y = y; // Atribui o segundo valor
        this.z = z; // Atribui o terceiro valor
    }

    private double Calculomedia() {// Método privado que calcula a média aritmética
        return (x + y + z) / 3.0; // Realiza a soma e a divisão
    }

    public String Media() {// Método público que retorna a descrição da média
        return "O cálculo da média aritmética é: " + Calculomedia();
    }
}

class Maior {// Classe para encontrar o maior número em uma lista
    int[] maiornumero;

    public Maior(int[] numeros) {// Construtor que inicializa a lista de números
        this.maiornumero = numeros;
    }

    private static int Encontrarmaior(int[] maiornumero) {// Método privado que encontra o maior número na lista
        int x = maiornumero[0];// Inicia com o primeiro número
        for (int j = 0; j < maiornumero.length; j++) {// Percorre toda a lista
            if (maiornumero[j] > x) {
                x = maiornumero[j];// Atualiza x se encontrar um número maior
            }
        }
        return x;// Retorna o maior número encontrado
    }

    int Resultado() {// Método público que retorna o resultado do maior número
        return Encontrarmaior(maiornumero);
    }
}

class Potencia {// Classe para calcular potências
    private double a;
    private double b;

    public Potencia(double a, double b) {// Construtor que inicializa os valores da potência
        this.a = a;
        this.b = b;
    }

    private double Calpotenc() {// Método privado que calcula a potência
        return Math.pow(a, b);// Calcula a potência usando Math.pow
    }

    String Resultado() {// Método público que retorna a descrição do resultado da potência
        return "O cálculo da potência " + a + " elevado a " + b + " é " + Calpotenc();
    }
}

class Horas {// Classe para converter minutos em horas
    private int min;

    public Horas(int min) {// Construtor que inicializa a quantidade de minutos
        this.min = min;
    }

    private int Calculohoras() {// Método privado que calcula a quantidade de horas
        return min / 60; // Converte minutos em horas
    }

    private int Calculominutos() {    // Método privado que calcula a quantidade de minutos restantes
        return min % 60; // Calcula os minutos restantes
    }

    public String Descricao() {// Método público que retorna a descrição da conversão
        return min + " minutos em horas e minutos são " + Calculohoras() + " hora(s) e " + Calculominutos() + " minuto(s).";
    }
}

class Fatorial {// Classe para calcular o fatorial de um número
    int num;

    public Fatorial(int num) {// Construtor que inicializa o número

        this.num = num;
    }

    private int Calfat() {// Método privado que calcula o fatorial
        int resultado = 1; // Inicializa o resultado
        for (int i = 1; i <= num; i++) { // Loop de 1 até o número
            resultado *= i; // Multiplica o resultado pelo contador
        }
        return resultado; // Retorna o resultado final
    }

    String Resultado() {// Método público que retorna a descrição do resultado do fatorial
        int fatorial = Calfat(); // Chama o método para calcular o fatorial
        return "O fatorial de " + num + " é " + fatorial + "."; // Retorna a frase formatada
    }
}

public class Metodos {// Classe principal
    public static void main(String[] args) {
        Positivoounegativo pn1 = new Positivoounegativo(237);// Cria um objeto para verificar se o número é positivo ou negativo
        Mediaaritmetica ma1 = new Mediaaritmetica(3, 7, 7);// Cria um objeto para calcular a média aritmética
        System.out.println(ma1.Media());// Exibe o resultado da média

        
        int[] numeros = {6, 4, 13};// Cria um array de números
        Maior m1 = new Maior(numeros);// Cria um objeto para encontrar o maior número
        System.out.println("O maior número é: " + m1.Resultado());// Exibe o maior número

        
        Potencia p1 = new Potencia(5, 6);// Cria um objeto para calcular a potência
        System.out.println(p1.Resultado());// Exibe o resultado da potência
        
        Horas h1 = new Horas(130);// Cria um objeto para converter minutos em horas

        System.out.println(h1.Descricao());// Exibe o resultado da conversão
        
        Fatorial f1 = new Fatorial(7);// Cria um objeto para calcular o fatorial

        System.out.println(f1.Resultado());// Exibe o resultado do fatorial

    }
}
