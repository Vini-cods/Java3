public class Produto {

    public String name;
    public double price;
    public int quantity;

//     Método para adicionar ao estoque
    public void addStock(int novoProduto) {
        quantity += novoProduto;
    }

//     Método para vender o produto
    public void sellProduct(int vendaProduto) {
        if (vendaProduto > quantity) {
            System.out.println("Estoque insuficiente! Estoque atual: " + quantity);
        } else {
            quantity -= vendaProduto;
            System.out.println(vendaProduto + " unidades vendidas. Estoque restante: " + quantity);
        }
    }
}
