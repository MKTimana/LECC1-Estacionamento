import java.util.*;

public class Arrancar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nomeCondutor, marca, modelo, matricula, cor;
        int numPortas, dia, mes, ano, tipo;
        Calendar date = Calendar.getInstance();
        Veiculo v;
        Vector carros = new Vector(5);
        OperacoesImplementadas op = new OperacoesImplementadas();

        System.out.println("=============Bem vindo ao Estacionamento MK============");
        for (int i = 0; i < carros.capacity(); i++) {
            System.out.print("Qual é o seu nome: ");
            nomeCondutor = input.nextLine();
            System.out.println("Possui um carro ou uma moto? \n1 - Carro \n2 - Moto");
            tipo = input.nextInt();

            if (tipo == 1) {
                System.out.println("Insira o numero de portas:");
                numPortas = input.nextInt();

            }
            input.nextLine();
            System.out.println("Qual é a marca do seu veiculo?");
            marca = input.nextLine();
            System.out.println("Qual é o modelo do " + marca);
            modelo = input.nextLine();
            System.out.println("Por favor inisra a matricula");
            matricula = input.nextLine();
            System.out.println("E qual é a car do carro");
            cor = input.nextLine();

            System.out.println("Por favor indique a data de entrada da viatura");
            System.out.print("Dia: ");
            dia = input.nextInt();
            date.set(Calendar.DAY_OF_MONTH, dia);
            System.out.print("Mês: ");
            mes = input.nextInt();
            date.set(Calendar.MONTH, mes);
            System.out.print("Ano: ");
            ano = input.nextInt();
            date.set(Calendar.YEAR, ano);

            if (tipo == 1) {

                v = new Carro(nomeCondutor, marca, modelo, matricula, cor, date, numPortas);
                op.insertVehicle(carros, v);
            } else {
                v = new Moto(nomeCondutor, marca, modelo, matricula, cor, date);
                op.insertVehicle(carros, v);
            }
        }
        op.listVehicle(carros);
    }
}
