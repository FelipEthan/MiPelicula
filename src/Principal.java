import com.andresfelipe.minetflix.modelos.Calculadora;
import com.andresfelipe.minetflix.modelos.Pelicula;
import com.andresfelipe.minetflix.modelos.Serie;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Principal {
    public void iniciarMenu() {
        int numeroOpcion = 0;
        Scanner teclado = new Scanner(System.in);
        while (numeroOpcion != 9) {
            try {
                String menu = """
                        BIENVENIDO AL SISTEMA MI NETFLIX
                        1) Crear pelicula 
                        2) Crear serie
                        3) Calcular tiempo de serie
                        9) Salir 
                                            
                        Por favor ingrese una opción:                
                        """;
                System.out.println(menu);
                numeroOpcion = teclado.nextInt();
                teclado.nextLine();
                switch (numeroOpcion) {
                    case 1:
                        Pelicula pelicula = new Pelicula();
                        pelicula.crearPelicula();
                        break;
                    case 2:
                        Serie serie = new Serie();
                        serie.crearSerie();
                        break;
                    case 3:
                        Calculadora calculadora = new Calculadora();
                        calculadora.calcularSerie();
                        break;
                    case 9:
                        System.out.println("Saliendo del sistema");
                        break;
                    default:
                        System.out.println("Opcion invalida");
                }
            } catch (InputMismatchException e) {
                throw new InputMismatchException("Se ha ingresado un caracter invalido, se esperan caracteres numericos ");
            }
        }
    }
}
