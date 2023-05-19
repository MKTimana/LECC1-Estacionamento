import java.util.*;

public class OperacoesImplementadas implements Operacoes {
    @Override
    public void insertVehicle(Vector vector, Veiculo v) {
        vector.add(v);
        System.out.println("Carro estacionado!");
    }

    public void listVehicle(Vector vector) {
        System.out.println("Abaixo a lista de todos os veiculos disponiveis no estacionamento:");
        for (int i = 0; i < vector.size(); i++) {
            System.out.println(((Veiculo) vector.get(i)));
        }
    }

    public void searchPlate(Vector vector, String plate) {
        System.out.println("Carro com a matricula: "+plate);
        for (int i = 0; i < vector.size(); i++) {
            if (((Veiculo) vector.get(i)).getMatricula().equals(plate)) {
                System.out.println(((Veiculo) vector.get(i)));
            }
        }
    }

    public void searchBrand(Vector vector, String brand) {
        System.out.println("Abaixo a lista de todos os veiculos da marca "+brand+" disponiveis no estacionamento: ");
        for (int i = 0; i < vector.size(); i++) {
            if (((Veiculo) vector.get(i)).getMarca().equals(brand)) {
                System.out.println(((Veiculo) vector.get(i)));
            }
        }
    }

    public void searchByDate(Vector vector, Date date){
        System.out.println("Abaixo a lista de todos os veiculos que deram entrada em: "+date+" disponiveis no estacionamento: ");
        for (int i = 0; i < vector.size(); i++){
            if(((Veiculo) vector.get(i)).getData().equals(date)){
                System.out.println(((Veiculo) vector.get(i)));
            }
        }
    }
}
