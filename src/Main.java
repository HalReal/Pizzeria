import model.Sucursal;

public class Main {
    public static void main(String[] args) {
        Sucursal suc = new Sucursal(1, "Matagalpa", "Sucursal de Matagalpa");
        suc.setId(1);
        suc.setName("Matagalpa");
        suc.setDescription("Local de Matagalpa");
        System.out.printf(suc.toString());


    }
}