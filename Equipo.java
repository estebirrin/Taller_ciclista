import java.util.List;

public class Equipo{
    private String nombreEquipo;
    private String paisEquipo;
    private static double sumaTiempos;
    private List<String> integrantes;

    public Equipo(String nombreEquipo, String paisEquipo) {
        this.nombreEquipo = nombreEquipo;
        this.paisEquipo = paisEquipo;        
    }

    public String getNombreEquipo() {
        return nombreEquipo;
    }
    public void setNombreEquipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }
    public String getPaisEquipo() {
        return paisEquipo;
    }
    public void setPaisEquipo(String paisEquipo) {
        this.paisEquipo = paisEquipo;
    }
    public static double getSumaTiempos() {
        return sumaTiempos;
    }
    public static void setSumaTiempos(double sumaTiempos) {
        Equipo.sumaTiempos = sumaTiempos;
    }
    protected void añadirCiclista(String nombreCiclista){
        //agregar cada uno de los ciclistas
        integrantes.add(nombreCiclista);
    }
    protected void listarEquipo(){
        // Nombre del equipo
        System.out.println("Nombre del equipo: " + nombreEquipo);
        
        // País del equipo
        System.out.println("País del equipo: " + paisEquipo);

        // Integrantes del equipo
        System.out.println("Integrantes del equipo:");
        for (String integrante : integrantes) {
            System.out.println(integrante);
        }
        }

    }


