//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Produto produtos = new Produto();

        produtos.name = "Placa mãe";
        produtos.quantity = 37;
        produtos.price = 780.99;

        produtos.addStock(10);
        produtos.sellProduct(37);
        produtos.sellProduct(57);

        System.out.println();


        Estudantes estudantes1 = new Estudantes();
        estudantes1.name = "Vinicius";
        estudantes1.grade1 = 8;
        estudantes1.grade2 = 10;

        Estudantes estudantes2 = new Estudantes();
        estudantes2.name = "Victor";
        estudantes2.grade1 = 10;
        estudantes2.grade2 = 8.5;


        System.out.println(estudantes1.name + " tem média: " + estudantes1.calculateAverage());
        System.out.println(estudantes2.name + " tem média: " + estudantes2.calculateAverage());

    }
}