package exercicio;

interface Strategy {
    double apply(double a, double b);
}

class Maximo implements Strategy {

    @Override
    public double apply(double a, double b) {
        return a > b ? a : b;
    }
}

class Minimo implements Strategy {

    @Override
    public double apply(double a, double b) {
        return a < b ? a : b;
    }
}

class Context {
    private final Strategy strategy;

    Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public double execute(double a, double b) {
        return strategy.apply(a, b);
    }
}

public class FuncionalLambda {
    public static void main(String[] args) {
        Minimo minimo = new Minimo();
        Context context = new Context(minimo);
        System.out.println("Mínimo de dois números: " + context.execute(4.0, 5.0));
        Maximo maximo = new Maximo();
        Context context1 = new Context(maximo);
        System.out.println("Maximo de dois números: " + context1.execute(3.2, 7.9));

        //Usando lambda
        System.out.println("Minimo de dois números: " + new Context(Math::min).execute(1.2, 7.9));
        System.out.println("Maximo de dois números: " + new Context(Math::max).execute(9.2, 7.9));

        //Média
        System.out.println("Média de dois números: " + new Context((a, b) -> (a + b) / 2).execute(9, 5));
    }
}
