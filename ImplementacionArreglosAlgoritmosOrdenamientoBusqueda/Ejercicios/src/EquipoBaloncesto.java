import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;


public class EquipoBaloncesto {
    public static String[] nombres = new String[5];
    public static int count, edad;
    public static double estatura;
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] estaturas = new double[5];
        int[] edad = new int[5];
        double[] velocidades = new double[5];
        double[] saltos = new double[5];
        double[] pesos = new double[5];
        double[] envergaduras = new double[5];

        // Capturar datos de los jugadores
        for (int i = 0; i < 5; i++) {
            System.out.println("Ingrese los datos para el jugador " + (i + 1) + ":");
            System.out.print("Nombre: ");
            nombres[i] = scanner.nextLine();
            System.out.print("Estatura (cm): ");
            while (count < 3) {
                        try {
                            do {
                                estaturas[i] = scanner.nextDouble();
                                if ((estaturas[i] < 1 || estaturas[i] > 230) && count < 3) {
                                    System.out.println("El valor ingresado esta fuera de los rango de estatura");
                                    System.out.println("Ingrese la estatura otra vez: ");
                                    count++; 
                                }
                                if(count == 3){
                                    break;
                                }
                            } while ((estaturas[i] < 1 || estaturas[i] > 220) && count != 3);
                            break;
                        } catch (InputMismatchException e) {
                            System.out.println("No puede ingresar un valor no numerico.");
                            count++;
                        }
            }
            if(count == 3){
                System.out.println("Demasiados intentos, el programa termino");
                break;
            }
            
            System.out.print("Edad: ");
            while (count < 3) {
                try {
                    do {
                        edad[i] = scanner.nextInt();
                        if ((edad[i] < 15 || edad[i] > 40) && count < 3) {
                            System.out.println("El valor ingresado esta fuera de los rangos de edad");
                            System.out.println("Ingrese la edad otra vez: ");
                            count++; 
                        }
                        if(count == 3){
                            break;
                        }
                    } while ((edad[i] < 15 || edad[i] > 50) && count != 3);
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("No puede ingresar un valor no numerico.");
                    count++;
                }
            }
            if(count == 3){
                    System.out.println("Demasiados intentos, el programa termino");
                    break;
            }

            System.out.print("Velocidad (km/h): ");

            while (count < 3) {
                try {
                    do {
                        velocidades[i] = scanner.nextDouble();
                        if ((velocidades[i] < 1 || velocidades[i] > 40) && count < 3) {
                            System.out.println("El valor ingresado esta fuera de los rangos de velocidad");
                            System.out.println("Ingrese la velocidad otra vez: ");
                            count++; 
                        }
                        if(count == 3){
                            break;
                        }
                    } while ((velocidades[i] < 1 || velocidades[i] > 40) && count != 3);
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("No puede ingresar un valor no numerico.");
                    count++;
                }
            }
            if(count == 3){
                    System.out.println("Demasiados intentos, el programa termino");
                    break;
            }

            System.out.print("Salto (cm): ");

            while (count < 3) {
                try {
                    do {
                        saltos[i] = scanner.nextDouble();
                        if ((saltos[i] < 1 || saltos[i] > 130) && count < 3) {
                            System.out.println("El valor ingresado esta fuera de los rangos de alcance en salto");
                            System.out.println("Ingrese el alcance otra vez: ");
                            count++; 
                        }
                        if(count == 3){
                            break;
                        }
                    } while ((saltos[i] < 1 || saltos[i] > 130) && count != 3);
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("No puede ingresar un valor no numerico.");
                    count++;
                }
            }
            if(count == 3){
                    System.out.println("Demasiados intentos, el programa termino");
                    break;
            }

            System.out.print("Peso (kg): ");

            while (count < 3) {
                try {
                    do {
                        pesos[i] = scanner.nextDouble();
                        if ((pesos[i] < 1 || pesos[i] > 130) && count < 3) {
                            System.out.println("El valor ingresado esta fuera de los rangos de peso");
                            System.out.println("Ingrese el peso otra vez: ");
                            count++; 
                        }
                        if(count == 3){
                            break;
                        }
                    } while ((pesos[i] < 1 || pesos[i] > 130) && count != 3);
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("No puede ingresar un valor no numerico.");
                    count++;
                }
            }
            if(count == 3){
                    System.out.println("Demasiados intentos, el programa termino");
                    break;
            }
            
            System.out.print("Envergadura (cm): ");

            while (count < 3) {
                try {
                    do {
                        envergaduras[i] = scanner.nextDouble();
                        if ((envergaduras[i] < 1 || envergaduras[i] > 230) && count < 3) {
                            System.out.println("El valor ingresado esta fuera de los rangos de envergadura");
                            System.out.println("Ingrese la envergadura otra vez: ");
                            count++; 
                        }
                        if(count == 3){
                            break;
                        }
                    } while ((envergaduras[i] < 1 || envergaduras[i] > 230) && count != 3);
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("No puede ingresar un valor no numerico.");
                    count++;
                }
            }
            if(count == 3){
                    System.out.println("Demasiados intentos, el programa termino");
                    break;
            }

            scanner.nextLine(); // Limpiar el buffer del scanner
        }

        if (count == 3) {
            scanner.close();
        } else {
        System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
        // 1. Listado de los nombres ordenados por velocidad
        ordenarPorVelocidad(nombres, velocidades);

        // 2. Promedio de estatura
        double promedioEstatura = calcularPromedio(estaturas);
        System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
        System.out.println("Promedio de estatura: " + promedioEstatura + " cm");

        // 3. Jugador más completo
        int jugadorCompleto = encontrarJugadorMasCompleto(estaturas, velocidades, saltos, pesos, envergaduras);
        System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
        System.out.println("El jugador más completo es: " + nombres[jugadorCompleto]);

        // 4. Jugadores capacitados para clavar el balón
        System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
        listarJugadoresCapacitados(estaturas, envergaduras, saltos);

        // 5. Ordenar jugadores por IMC
        System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
        ordenarPorIMC(nombres, pesos, estaturas);

        scanner.close();
        }
       
    }

    private static void ordenarPorVelocidad(String[] nombres, double[] velocidades) {
        // Copiar arrays para no modificar los originales
        String[] nombresOrdenados = Arrays.copyOf(nombres, nombres.length);
        double[] velocidadesOrdenadas = Arrays.copyOf(velocidades, velocidades.length);

        // Ordenar los arrays según las velocidades
        for (int i = 0; i < velocidadesOrdenadas.length - 1; i++) {
            for (int j = 0; j < velocidadesOrdenadas.length - i - 1; j++) {
                if (velocidadesOrdenadas[j] < velocidadesOrdenadas[j + 1]) {
                    // Intercambiar nombres
                    String tempNombre = nombresOrdenados[j];
                    nombresOrdenados[j] = nombresOrdenados[j + 1];
                    nombresOrdenados[j + 1] = tempNombre;
                    // Intercambiar velocidades
                    double tempVelocidad = velocidadesOrdenadas[j];
                    velocidadesOrdenadas[j] = velocidadesOrdenadas[j + 1];
                    velocidadesOrdenadas[j + 1] = tempVelocidad;
                }
            }
        }     

    // Mostrar el resultado
    
    System.out.println("Listado de nombres ordenados por velocidad (mayor a menor):");
        for (int i = 0; i < nombresOrdenados.length; i++) {
            System.out.println(nombresOrdenados[i] + ": " + velocidadesOrdenadas[i]);
        }
    }

    private static double calcularPromedio(double[] valores) {
        double suma = 0;
        for (double valor : valores) {
            suma += valor;
        }
        return suma / valores.length;
    }

    private static int encontrarJugadorMasCompleto(double[] estaturas, double[] velocidades, double[] saltos,
                                                   double[] pesos, double[] envergaduras) {
        double[] puntajes = new double[5];

        // Calcular puntaje para cada jugador
        for (int i = 0; i < 5; i++) {
            puntajes[i] = 0.25 * velocidades[i] + 0.25 * estaturas[i] + 0.2 * saltos[i] + 0.1 * pesos[i] + 0.2 * envergaduras[i];
        }

        // Encontrar el índice del jugador con el puntaje más alto
        int indiceJugadorCompleto = 0;
        for (int i = 1; i < 5; i++) {
            if (puntajes[i] > puntajes[indiceJugadorCompleto]) {
                indiceJugadorCompleto = i;
            }
        }

        return indiceJugadorCompleto;
    }

    private static void listarJugadoresCapacitados(double[] estaturas, double[] envergaduras, double[] saltos) {
        System.out.println("Jugadores capacitados para clavar el balón:");
        for (int i = 0; i < 5; i++) {
            double alturaCanasta = 305; // Altura del aro en centímetros
            double alturaTotal = estaturas[i] + ((envergaduras[i] / 2) * 0.7) + saltos[i];
            if (alturaTotal >= alturaCanasta) {
                System.out.println("- " + nombres[i]);
            }
        }
    }

    private static void ordenarPorIMC(String[] nombres, double[] pesos, double[] estaturas) {
        // Calcular el IMC para cada jugador
        double[] imc = new double[5];
        for (int i = 0; i < 5; i++) {
            imc[i] = pesos[i] / ((estaturas[i] / 100) * (estaturas[i] / 100));
        }

        // Ordenar los jugadores por IMC
        for (int i = 0; i < imc.length - 1; i++) {
            for (int j = 0; j < imc.length - i - 1; j++) {
                if (imc[j] > imc[j + 1]) {
                    // Intercambiar nombres
                    String tempNombre = nombres[j];
                    nombres[j] = nombres[j + 1];
                    nombres[j + 1] = tempNombre;
                    // Intercambiar IMC
                    double tempIMC = imc[j];
                    imc[j] = imc[j + 1];
                    imc[j + 1] = tempIMC;
                }
            }
        }

        // Mostrar el resultado
        System.out.println("Listado de jugadores ordenados por IMC (menor a mayor):");
        for (int i = 0; i < nombres.length; i++) {
            System.out.println("- "+nombres[i]);
        }
    }
}
