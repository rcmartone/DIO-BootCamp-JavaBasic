package edu.rafael.Curso.StreamAPI;

import java.util.ArrayList;
import java.util.List;

/*public class CarrinhoDeCompras {
    //Atributo Item List
    private List<Item> itemList;

    //ArrayList vazio do atributo ItensList
    public CarrinhoDeCompras () {
        this.itemList = new ArrayList<>();
    }

    //Metodo que adiciona um novo item a lista com nome, preço e quantidade especificada
    public void adicionarItem(String name, double price, int quantityEspec){
        Item item = new Item(name, price, quantityEspec);
        this.itemList.add(item);
    }

    //Metodo para remover um item com base no nome
    public void removerItem (String name){
        //Criando uma lista de itens que serão removidos
        List<Item> itensParaRemover = new ArrayList<>();

        //Condição de não vazio
        if (!itemList.isEmpty()) {
          //Condição de comparação entre o nome passado e os nomes da lista  
          for (Item i : itemList) {
            if (i.getName().equalsIgnoreCase(name)) {
              itensParaRemover.add(i);
            }
          }
          //Ação de remoção dos nomes que forem iguais
          itemList.removeAll(itensParaRemover);
        } else {
          //Caso o !itemList.isEmpty() retorne false, no caso, quando a lista estiver vazia  
          System.out.println("A lista está vazia!");
        }
    }

    @Override
    public String toString() {
      return "CarrinhoDeCompras{" +
          "itens=" + itemList +
          '}';
    }

    //Metodo para calcular o valor total do carrinho de compras

    public double calcularValorTotal(){
        double valTotal = 0d;
        if (!itemList.isEmpty()) {
            for (Item item : itemList) {
              double valorItem = item.getPrice() * item.getQuantityEspec();
              valTotal = valTotal + valorItem; //valorTotal = valorTotal + valorItem;
            }
            return valTotal;
          } else {
            //Condição de erro - RuntimeException com mensagem
            throw new RuntimeException("A lista está vazia!!!");
          }
        }


    //Exibe os itens no carrinho com nome, preço e quantidade de cada
    public void exibirItens(){
        //Condição para verificar se a lista está vazia
        if (!itemList.isEmpty()) {
            System.out.println(this.itemList);
          } else {
            //Caso !itemList.isEmpty() retorne FALSE ou seja, vazio.
            System.out.println("A lista está vazia!!!");
          }
    }

    //Testando os métodos
    public static void main(String[] args) {

        //Criando o objeto carrinhoDeCompras do tipo CarrinhoDeCompras
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

        //verificando o se o carrinho possui algum item ou está vazio
        carrinhoDeCompras.exibirItens();
        carrinhoDeCompras.adicionarItem("Arroz", 10.0, 3);
        carrinhoDeCompras.adicionarItem("Feijao", 40.0, 6);
        carrinhoDeCompras.adicionarItem("Carne", 60.0, 9);
        carrinhoDeCompras.adicionarItem("Arroz", 13.0, 1);
        carrinhoDeCompras.exibirItens();
        System.out.println("Calculo do valor total no carrinho= R$ " + carrinhoDeCompras.calcularValorTotal());


        //Removendo um item do carrinho pelo nome, repitido ou não
        carrinhoDeCompras.removerItem("Feijao");
        System.out.println("Removendo item do carrinho");
        carrinhoDeCompras.exibirItens();

        //Calculando o valor total no carrinho
        System.out.println("Calculo do valor total no carrinho= R$ " + carrinhoDeCompras.calcularValorTotal());

    }
}
*/
public class CarrinhoDeCompras {
  //atributos
  private List<Item> itemList;
  //construtor
  public CarrinhoDeCompras() {
    this.itemList = new ArrayList<>();
  }
  
     public void adicionarItem(String name, double price, int quantityEspec){
        Item item = new Item(name, price, quantityEspec);
        this.itemList.add(item);
    }

  //método para calcular valor total dos itens utilizando o Stream API
  public double calcularValorTotal() {
    if (itemList.isEmpty()) {
      throw new RuntimeException("A lista está vazia!");
    }
    return itemList.stream().mapToDouble(item -> item.getPrice() * item.getQuantityEspec()).sum();
  }
}