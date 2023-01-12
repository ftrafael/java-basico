public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        double salarioMinimo = 2500;

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal;

        // uma conts em java inicia sempre com a expressão "final" seguida do tipo  e o nome todo em maiusculo (ex.: VALOR_DE_PI)

        final double VALOR_DE_PI = 3.14;
        // VALOR_DE_PI = 10.75; não é possível mudar.
    }
}
