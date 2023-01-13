public class Operadores {
    public static void main(String[] args){
        // Como em outras linguagens utilizando o + em uma string você tem uma concatenação.
        String nomeCompleto = "Linguagem " + "Java";
        System.out.println(nomeCompleto);

        // para acrescentar +1 em um numero podemos usar: ex. (numero ++)
        // para inverter um valor boolean é só colocar o ! para alterar.
        //Ternário

        int a, b;

        a = 5;
        b = 6;

        String resultado = a==b ? "verdadeiro" : "falso";
        /*
        if (a==b)
            resultado = "verdadeiro";
        else
            resultado = "falso";
        */
        System.out.println(resultado);

        // operadores relacionais;
        // mesma utilização que em outras linguagens. ==, !=, <, >, <=, >=
        //ao fazer uma comparação de um objeto podemos utilizar o metodo equals

        //operadores lógicos; mesma utilização que em outras linguagens. &&, ||
    }
}
