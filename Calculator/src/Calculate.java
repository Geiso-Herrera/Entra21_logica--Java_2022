public class Calculate {

    public static void main(String[] args) {
        int x = Integer.parseInt(args[1]);
        int y = Integer.parseInt(args[2]);


        if (args[0].equals("somar")) {
            sum(x, y);
        } else if (args[0].equals("subtrair")){
            sub(x, y);
        } else if (args[0].equals("multiplicar")){
            mult(x, y);
        } else if (args[0].equals("dividir")){
            div(x, y);
        } else{
            System.out.println("-ERRO- : Insira uma das 4 opera��es b�sicas da matem�tica.");
        }
    }

    static void sum(int x, int y){
        System.out.println("A soma dos n�meros inseridos � igual a: " + (x + y));
    }
    static void sub(int x, int y){
        System.out.println("A subtra��o dos n�meros inseridos � igual a: " + (x - y));
    }
    static void mult(int x, int y){
        System.out.println("A multiplica��o dos n�meros inseridos � igual a: " + (x * y));
    }
    static void div(int x, int y){
        System.out.println("A divis�o dos n�meros inseridos � igual a: " + (x / y));
    }
}