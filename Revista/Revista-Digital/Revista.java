import java.util.Scanner;

public class Revista {
    public static void main(String[] args) {
        boolean reporteIncidentes = false;
        boolean detallesIncidente = false;
        boolean notificarAutoridades = false;
        boolean reconectarLinea = false;
        boolean asistenciaSocial = false;
        boolean solicitaAsistencia = false;
        boolean peligroGenero = false;
        boolean verificarAutenticidad = false;
        boolean recibeAlerta = false;

        Scanner scanner = new Scanner(System.in);

        System.out.println("¿Permitir el reporte de incidentes? (Si/No)");
        String respuesta = scanner.nextLine();
        if (respuesta.equalsIgnoreCase("Si")) {
            reporteIncidentes = true;
            detallesIncidente = true;
        }

        if (detallesIncidente) {
            System.out.println("¿Registrar los detalles del incidente? (S/N)");
            respuesta = scanner.nextLine();
            if (respuesta.equalsIgnoreCase("Si")) {
                notificarAutoridades = true;
            }
        }

        if (notificarAutoridades) {
            System.out.println("¿Reconectar la línea en una víctima de corte? (S/N)");
            respuesta = scanner.nextLine();
            if (respuesta.equalsIgnoreCase("Si")) {
                reconectarLinea = true;
            }
        }

        System.out.println("¿Proporcionar asistencia social? (S/N)");
        respuesta = scanner.nextLine();
        if (respuesta.equalsIgnoreCase("Si")) {
            asistenciaSocial = true;
            System.out.println("¿La persona afectada solicita asistencia? (Si/No)");
            respuesta = scanner.nextLine();
            if (respuesta.equalsIgnoreCase("S")) {
                solicitaAsistencia = true;
                System.out.println("¿Persona en peligro de violencia de género? (Si/No)");
                respuesta = scanner.nextLine();
                if (respuesta.equalsIgnoreCase("Si")) {
                    peligroGenero = true;
                }
            }
        }

        if (peligroGenero || solicitaAsistencia) {
            verificarAutenticidad = true;
        }

        System.out.println("¿Se recibe una alerta? (Si/No)");
        respuesta = scanner.nextLine();
        if (respuesta.equalsIgnoreCase("Si")) {
            recibeAlerta = true;
        }

        scanner.close();
    }
}

