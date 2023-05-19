import java.util.*;

public interface Operacoes {

     void insertVehicle(Vector vector, Veiculo v);

     void listVehicle(Vector vector);

     void searchPlate(Vector v, String plateNumber);

     void searchBrand(Vector v, String brand);

     void searchByDate(Vector v, Date date);

}
