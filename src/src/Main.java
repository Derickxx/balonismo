public class Main {

    public static void main(String[] args) {


        balao b1 = new balao();

        String resposta = b1.voar(new Combustievel());

        System.out.println(resposta);
        balao b2 = new balao();
                Combustievel alcool = new Combustievel();
        System.out.println(b2.voar(alcool));
    }

}