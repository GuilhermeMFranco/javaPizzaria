package Program;

import java.util.Locale;
import java.util.Scanner;
import entities.Bebida;
import entities.Pizza;
import java.util.ArrayList;
import java.util.List;

public class Principal {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Pizza> cardapioPizza = new ArrayList<>();
        List<Bebida> cardapioBebida = new ArrayList<>();

        while (true) {
            System.out.println("##### MENU #####");
            System.out.println("1 - Cadastrar pizza");
            System.out.println("2 - Cadastrar bebida");
            System.out.println("3 - Ver itens cadastrados");
            System.out.println("4 - Sair");
            System.out.print("Escolha uma das opções acima: ");
            int op = sc.nextInt();
            sc.nextLine(); 

            if (op == 1) {
                System.out.print("Digite o sabor da pizza: ");
                String name = sc.nextLine();
                System.out.print("Digite o valor da pizza: ");
                double price = sc.nextDouble();
                cardapioPizza.add(new Pizza(name, price));
                System.out.println("Pizza cadastrada com sucesso!");
                sc.nextLine(); 

            } else if (op == 2) {
                System.out.print("Digite o sabor da bebida e quantidade em litros: ");
                String name = sc.nextLine();
                System.out.print("Digite o valor da bebida: ");
                double price = sc.nextDouble();
                cardapioBebida.add(new Bebida(name, price));
                System.out.println("Bebida cadastrada com sucesso!");
                sc.nextLine(); 

            } else if (op == 3) {
                if (cardapioPizza.isEmpty() && cardapioBebida.isEmpty()) {
                    System.out.println("O cardápio está vazio!");
                } else {
                    System.out.println("Cardápio: ");
                    for (Pizza pizza : cardapioPizza) {
                        System.out.println("Pizza de: " + pizza.getName() + " - R$ " + pizza.getPrice());
                    }

                    for (Bebida bebida : cardapioBebida) {
                        System.out.println(bebida.getName() + " - R$ " + bebida.getPrice());
                    }
                }
            } else if (op == 4) {
                System.out.println("Saindo do programa...");
                break; 
            } else {
                System.out.println("Opção inválida! Tente novamente.");
            }
        }

        sc.close();
    }
}
