package lab2p2_brandonhernandez;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JColorChooser;

public class Lab2P2_BrandonHernandez {

    static Scanner sc = new Scanner(System.in);
    static Scanner sc2 = new Scanner(System.in);
    static ArrayList<Jugador> jugadores = new ArrayList();
    static ArrayList<Carro> carros = new ArrayList();

    public static void main(String[] args) {

        boolean menu = true;

        while (menu) {

            System.out.print("""
                               == MENU ==
                               1. Crear Jugadores
                               2. Crear Carros
                               3. Listar Jugadores
                               4. Listar Carros por Jugador
                               5. Modificar Jugadores
                               6. Tunear Carros
                               7. Eliminar Jugador
                               8. Eliminar Carros
                               9. Compra y venta de carros
                               10. Salir
                               Ingrese una opcion: """);
            int opcion = sc.nextInt();

            switch (opcion) {

                case 1:

                    crearJugador();

                    break;

                case 2:

                    crearCarro();

                    break;

                case 3:
                    if (jugadores.isEmpty()) {
                        System.out.println("No hay jugadores");
                    } else {
                        listarJugadores(jugadores);
                    }

                    break;

                case 4:

                    if (jugadores.isEmpty()) {
                        System.out.println("No hay jugadores");
                    } else {
                        printPlayer(jugadores);
                        System.out.print("Ingrese su jugador: ");
                        int ju = sc.nextInt() - 1;

                        if (jugadores.get(ju).getListaCarros().isEmpty()) {
                            System.out.println("No tiene carros");
                        } else {
                            printCarrosJ(jugadores.get(ju).getListaCarros());
                        }

                    }

                    break;

                case 5:

                    System.out.print("""
                                       1. Nombre
                                       2. Reputacion
                                       3. Saldo
                                       Ingrese una opcion:  """);
                    int op = sc.nextInt();

                    modificarJugador(jugadores, op);

                    break;

                case 6:

                    if (jugadores.isEmpty()) {
                        System.out.println("No hay jugadores");
                    } else {
                        printPlayer(jugadores);
                        System.out.print("Escoja su jugador: ");
                        int jugador = sc.nextInt() - 1;

                        if (jugadores.get(jugador).getListaCarros().isEmpty()) {
                            System.out.println("No tiene carros");
                        } else {
                            printCarrosJ(jugadores.get(jugador).getListaCarros());
                            System.out.print("Escoja el carro que desea tunear: ");
                            int car = sc.nextInt() - 1;

                            if (jugadores.get(jugador).getListaCarros().get(car).getMarcador().equals("reconstruido")) {

                                System.out.print("""
                                       1. Spoiler - 3,500
                                       2. Side Skirts - 1,800
                                       3. Front Bumper - 2,000
                                       4. Back Bumper - 1,500
                                       5. Super Builds - 8,800
                                       Ingrese una mejora: """);
                                int opc = sc.nextInt();

                                switch (opc) {

                                    case 1:

                                        if (jugadores.get(jugador).getSaldo() < 3500) {
                                            System.out.println("No tienes plata pa esta modificacion pa");
                                        } else {
                                            jugadores.get(jugador).setSaldo(jugadores.get(jugador).getSaldo() - 3500);
                                            jugadores.get(jugador).getListaCarros().get(car).setPrecio(jugadores.get(jugador).getListaCarros().get(car).getPrecio() + 3500);
                                            jugadores.get(jugador).getListaCarros().get(car).getMejoras().add("Spoiler");
                                            System.out.println("Modificacion exitosa");
                                        }

                                        break;

                                    case 2:

                                        if (jugadores.get(jugador).getSaldo() < 1800) {
                                            System.out.println("No tienes plata pa esta modificacion pa");
                                        } else {
                                            jugadores.get(jugador).setSaldo(jugadores.get(jugador).getSaldo() - 1800);
                                            jugadores.get(jugador).getListaCarros().get(car).setPrecio(jugadores.get(jugador).getListaCarros().get(car).getPrecio() + 1800);
                                            jugadores.get(jugador).getListaCarros().get(car).getMejoras().add("Side Skirts");
                                            System.out.println("Modificacion exitosa");
                                        }

                                        break;

                                    case 3:

                                        if (jugadores.get(jugador).getSaldo() < 2000) {
                                            System.out.println("No tienes plata pa esta modificacion pa");
                                        } else {
                                            jugadores.get(jugador).setSaldo(jugadores.get(jugador).getSaldo() - 2000);
                                            jugadores.get(jugador).getListaCarros().get(car).setPrecio(jugadores.get(jugador).getListaCarros().get(car).getPrecio() + 2000);
                                            jugadores.get(jugador).getListaCarros().get(car).getMejoras().add("Front Bumper");
                                            System.out.println("Modificacion exitosa");
                                        }

                                        break;

                                    case 4:

                                        if (jugadores.get(jugador).getSaldo() < 1500) {
                                            System.out.println("No tienes plata pa esta modificacion pa");
                                        } else {
                                            jugadores.get(jugador).setSaldo(jugadores.get(jugador).getSaldo() - 1500);
                                            jugadores.get(jugador).getListaCarros().get(car).setPrecio(jugadores.get(jugador).getListaCarros().get(car).getPrecio() + 1500);
                                            jugadores.get(jugador).getListaCarros().get(car).getMejoras().add("Back Bumper");
                                            System.out.println("Modificacion exitosa");
                                        }

                                        break;

                                    case 5:

                                        if (jugadores.get(jugador).getSaldo() < 8800) {
                                            System.out.println("No tienes plata pa esta modificacion pa");
                                        } else {
                                            jugadores.get(jugador).setSaldo(jugadores.get(jugador).getSaldo() - 8800);
                                            jugadores.get(jugador).getListaCarros().get(car).setPrecio(jugadores.get(jugador).getListaCarros().get(car).getPrecio() + 8800);
                                            jugadores.get(jugador).getListaCarros().get(car).getMejoras().add("Super Builds");
                                            System.out.println("Modificacion exitosa");
                                        }

                                        break;

                                    default:
                                        System.out.println("Opcion Invalida");

                                }

                            } else {
                                System.out.print("""
                                       1. Spoiler - 3,500
                                       2. Side Skirts - 1,800
                                       3. Front Bumper - 2,000
                                       4. Back Bumper - 1,500                                      
                                       Ingrese una mejora: """);
                                int opc = sc.nextInt();

                                switch (opc) {

                                    case 1:

                                        if (jugadores.get(jugador).getSaldo() < 3500) {
                                            System.out.println("No tienes plata pa esta modificacion pa");
                                        } else {
                                            jugadores.get(jugador).setSaldo(jugadores.get(jugador).getSaldo() - 3500);
                                            jugadores.get(jugador).getListaCarros().get(car).setPrecio(jugadores.get(jugador).getListaCarros().get(car).getPrecio() + 3500);
                                            jugadores.get(jugador).getListaCarros().get(car).getMejoras().add("Spoiler");
                                            System.out.println("Modificacion exitosa");
                                        }

                                        break;

                                    case 2:

                                        if (jugadores.get(jugador).getSaldo() < 1800) {
                                            System.out.println("No tienes plata pa esta modificacion pa");
                                        } else {
                                            jugadores.get(jugador).setSaldo(jugadores.get(jugador).getSaldo() - 1800);
                                            jugadores.get(jugador).getListaCarros().get(car).setPrecio(jugadores.get(jugador).getListaCarros().get(car).getPrecio() + 1800);
                                            jugadores.get(jugador).getListaCarros().get(car).getMejoras().add("Side Skirts");
                                            System.out.println("Modificacion exitosa");
                                        }

                                        break;

                                    case 3:

                                        if (jugadores.get(jugador).getSaldo() < 2000) {
                                            System.out.println("No tienes plata pa esta modificacion pa");
                                        } else {
                                            jugadores.get(jugador).setSaldo(jugadores.get(jugador).getSaldo() - 2000);
                                            jugadores.get(jugador).getListaCarros().get(car).setPrecio(jugadores.get(jugador).getListaCarros().get(car).getPrecio() + 2000);
                                            jugadores.get(jugador).getListaCarros().get(car).getMejoras().add("Front Bumper");
                                            System.out.println("Modificacion exitosa");
                                        }

                                        break;

                                    case 4:

                                        if (jugadores.get(jugador).getSaldo() < 1500) {
                                            System.out.println("No tienes plata pa esta modificacion pa");
                                        } else {
                                            jugadores.get(jugador).setSaldo(jugadores.get(jugador).getSaldo() - 1500);
                                            jugadores.get(jugador).getListaCarros().get(car).setPrecio(jugadores.get(jugador).getListaCarros().get(car).getPrecio() + 1500);
                                            jugadores.get(jugador).getListaCarros().get(car).getMejoras().add("Back Bumper");
                                            System.out.println("Modificacion exitosa");
                                        }

                                        break;

                                    default:
                                        System.out.println("Opcion Invalida");

                                }

                            }

                        }

                    }

                    break;

                case 7:

                    printPlayer(jugadores);
                    System.out.print("Ingrese el numero del jugador a eliminar: ");
                    int index = sc.nextInt() - 1;
                    jugadores.remove(index);
                    System.out.println("Carro eliminado exitosamente");

                    break;

                case 8:

                    printCarros(carros);
                    System.out.print("Ingrese el numero del carro a eliminar: ");
                    int inde = sc.nextInt() - 1;
                    carros.remove(inde);
                    System.out.println("Carro eliminado exitosamente");

                    break;

                case 9:

                    System.out.print("""
                                       1. Comprar Carros
                                       2. Vender Carros
                                       Ingrese una opcion: """);
                    int opci = sc.nextInt();

                    switch (opci) {

                        case 1:
                            if (carros.isEmpty()) {
                                System.out.println("No hay carros");
                                break;
                            } else {
                                printPlayer(jugadores);
                                System.out.print("Ingrese su jugador: ");
                                int player = sc.nextInt()-1;

                                printCarros(carros);
                                System.out.print("Elija que carro desea comprar: ");
                                int op2 = sc.nextInt()-1;

                                if (jugadores.get(player).getSaldo() < carros.get(op2).getPrecio()) {
                                    System.out.println("No tienes suficiente plata pa comprar este perraso carro");
                                    System.out.println("PD: solo metele plata papi");
                                } else {
                                    jugadores.get(player).getListaCarros().add(carros.get(op2));                                   
                                    jugadores.get(player).setSaldo(jugadores.get(player).getSaldo() - carros.get(op2).getPrecio());
                                    int cont = jugadores.get(player).getCantCarros();
                                    cont++;
                                    jugadores.get(player).setCantCarros(cont);
                                    carros.remove(op2);
                                    System.out.println("Carro comprado exitosamente");
                                    System.out.println("size = " + jugadores.get(player).getListaCarros().size());
                                }
                            }

                            break;

                        case 2:

                            if (jugadores.isEmpty()) {
                                System.out.println("No hay jugadores");
                            } else {
                                listarJugadores(jugadores);
                                System.out.print("Ingrese su jugador: ");
                                int player2 = sc.nextInt() - 1;

                                if (jugadores.get(player2).getListaCarros().isEmpty()) {
                                    System.out.println("El jugador no tiene carros");
                                } else {
                                    printCarrosJ(jugadores.get(player2).getListaCarros());
                                    System.out.print("Escoja el carro a vender: ");
                                    int i = sc.nextInt() - 1;

                                    jugadores.get(player2).getListaCarros().remove(i);
                                    jugadores.get(player2).setSaldo(jugadores.get(player2).getSaldo() + jugadores.get(player2).getListaCarros().get(i).getPrecio());
                                    int cont = jugadores.get(player2).getCantCarros();
                                    cont--;
                                    jugadores.get(player2).setCantCarros(cont);
                                    System.out.println("Carro vendido exitosamente");

                                }
                            }

                            break;

                        default:
                            System.out.println("Opcion Invalida");

                    }

                    break;

                case 10:
                    menu = false;
                    break;

                default:
                    System.out.println("Opcion Invalida");

            }

        }

    }

    public static void crearJugador() {

        System.out.print("Ingrese el nombre del jugador: ");
        String name = sc2.next();

        System.out.print("Ingrese su reputacion: ");
        int reputa = sc.nextInt();

        while (reputa < 0) {
            System.out.println("La reputacion no puede ser menor a 0");
            System.out.print("Ingrese su reputacion: ");
            reputa = sc.nextInt();
        }

        System.out.print("Ingrese su saldo: ");
        double saldo = sc.nextDouble();

        while (saldo < 0) {
            System.out.println("El saldo no puede ser menor a 0");
            System.out.print("Ingrese su saldo: ");
            saldo = sc.nextDouble();
        }

        jugadores.add(new Jugador(name, reputa, saldo));

        System.out.println("Se ha creado el jugaodor exitosamente");

    }

    public static void crearCarro() {

        System.out.print("Ingrese la marca del carro: ");
        String marca = sc2.next();

        System.out.print("Ingrese el modelo del carro: ");
        String modelo = sc2.next();

        System.out.print("""
                           Ingrese el marcador del carro:
                         1. Carro de agencia
                         2. Carro reconstruido
                         Ingrese una opcion: """);
        int op = sc.nextInt();
        String marcador = "";

        while (op != 1 && op != 2) {
            System.out.print("""
                           Ingrese el marcador del carro:
                         1. Carro de agencia
                         2. Carro reconstruido""");
            op = sc.nextInt();

        }
        if (op == 1) {
            marcador = "agencia";
        } else {
            marcador = "reconstruido";
        }

        Color color = JColorChooser.showDialog(null, "Escoja el color del carro", Color.gray);

        System.out.print("Ingrese el precio del carro: ");
        double precio = sc.nextDouble();

        while (precio <= 0) {
            System.out.println("El precio del carro no puede ser 0 o menor ");
            System.out.print("Ingrese el precio del carro: ");
            precio = sc.nextDouble();
        }

        carros.add(new Carro(marca, modelo, marcador, color, precio));

        System.out.println("Se ha creado el carro exitosamente");

    }

    public static void listarJugadores(ArrayList<Jugador> jugadores) {

        for (Jugador jugador : jugadores) {
            System.out.println("\nJugador " + (jugadores.indexOf(jugador) + 1) + "\n" + jugador);
        }

    }

    public static void printPlayer(ArrayList<Jugador> jugadores) {

        for (Jugador jugador : jugadores) {
            System.out.println("\nJugador " + (jugadores.indexOf(jugador) + 1) + ": " + jugador.getNombre());
        }

    }

    public static void printCarros(ArrayList<Carro> carros) {

        for (Carro carro : carros) {
            System.out.println("Carro " + (carros.indexOf(carro) + 1) + "\n" + carro);
        }

    }

    public static void modificarJugador(ArrayList<Jugador> jugadores, int op) {

        switch (op) {

            case 1:
                printPlayer(jugadores);
                System.out.print("Ingrese el numero del jugador: ");
                int index = sc.nextInt();

                System.out.print("Ingrese el nuevo nombre: ");
                String name = sc2.next();
                jugadores.get(index - 1).setNombre(name);
                System.out.println("Modificacion exitosa");

                break;

            case 2:

                printPlayer(jugadores);
                System.out.print("Ingrese el numero del jugador: ");
                int index2 = sc.nextInt();

                System.out.print("Ingrese la nueva reputacion: ");
                int reputa = sc.nextInt();
                jugadores.get(index2 - 1).setPuntosRep(reputa);
                System.out.println("Modificacion exitosa");

                break;

            case 3:

                printPlayer(jugadores);
                System.out.print("Ingrese el numero del jugador: ");
                int index3 = sc.nextInt();

                System.out.print("Ingrese el nuevo nombre: ");
                double saldo = sc.nextDouble();
                jugadores.get(index3 - 1).setSaldo(saldo);
                System.out.println("Modificacion exitosa");

                break;

            default:
                System.out.println("Opcion invalida");

        }

    }

    public static void printCarrosJ(ArrayList<Carro> carros) {

        for (Carro carro : carros) {

            System.out.println("\nCarro " + (carros.indexOf(carro)+1) + "\n" + carro);

        }

    }

}
