class Persona {
    String nombre;
    String paterno;
    String materno;
    String ci;
    int edad;
}

class Estudiante extends Persona {
    String ru;
    String matricula;
    Carrera carrera;
}

class Carrera {
    String nombre;
    java.util.ArrayList<Estudiante> estudiantes = new java.util.ArrayList<>();
    
    int contarEstudiantes() {
        return estudiantes.size();
    }
}

class Rector extends Persona {
    int añosExperiencia;
    double sueldo;
}

class Facultad {
    String nombre;
    java.util.ArrayList<Carrera> carreras = new java.util.ArrayList<>();
    
    int contarEstudiantes() {
        int total = 0;
        for (Carrera carrera : carreras) {
            total += carrera.estudiantes.size();
        }
        return total;
    }
}

class Universidad {
    String nombre;
    String direccion;
    java.util.ArrayList<Facultad> facultades = new java.util.ArrayList<>();
    
    Estudiante buscarEstudiante(String matricula) {
        for (Facultad facultad : facultades) {
            for (Carrera carrera : facultad.carreras) {
                for (Estudiante estudiante : carrera.estudiantes) {
                    if (estudiante.matricula.equals(matricula)) {
                        return estudiante;
                    }
                }
            }
        }
        return null;
    }
    
    void cambioCarrera(Estudiante estudiante, Carrera nuevaCarrera) {
        estudiante.carrera.estudiantes.remove(estudiante);
        nuevaCarrera.estudiantes.add(estudiante);
        estudiante.carrera = nuevaCarrera;
    }
    
    void listarEstudiantesFacultad(String nombreFacultad) {
        for (Facultad facultad : facultades) {
            if (facultad.nombre.equals(nombreFacultad)) {
                System.out.println("Estudiantes de " + nombreFacultad + ":");
                for (Carrera carrera : facultad.carreras) {
                    for (Estudiante estudiante : carrera.estudiantes) {
                        System.out.println("- " + estudiante.nombre + " " + estudiante.paterno);
                    }
                }
            }
        }
    }
    
    Facultad facultadConMasEstudiantes() {
        Facultad mayor = null;
        for (Facultad facultad : facultades) {
            if (mayor == null || facultad.contarEstudiantes() > mayor.contarEstudiantes()) {
                mayor = facultad;
            }
        }
        return mayor;
    }
}

public class Main {
    public static void main(String[] args) {
        Universidad u1 = new Universidad();
        u1.nombre = "UMSS";
        u1.direccion = "Cochabamba";
        
        Universidad u2 = new Universidad();
        u2.nombre = "UMSA"; 
        u2.direccion = "La Paz";
        
        Facultad ingenieria = new Facultad();
        ingenieria.nombre = "Ingeniería";
        
        Facultad medicina = new Facultad();
        medicina.nombre = "Medicina";
        
        Carrera sistemas = new Carrera();
        sistemas.nombre = "Sistemas";
        
        Carrera civil = new Carrera();
        civil.nombre = "Civil";
        
        Carrera enfermeria = new Carrera();
        enfermeria.nombre = "Enfermería";
        
        ingenieria.carreras.add(sistemas);
        ingenieria.carreras.add(civil);
        medicina.carreras.add(enfermeria);
        
        u1.facultades.add(ingenieria);
        u1.facultades.add(medicina);
        
        Estudiante est1 = new Estudiante();
        est1.nombre = "Juan";
        est1.paterno = "Perez";
        est1.matricula = "MAT001";
        est1.carrera = sistemas;
        
        Estudiante est2 = new Estudiante();
        est2.nombre = "Maria";
        est2.paterno = "Lopez"; 
        est2.matricula = "MAT002";
        est2.carrera = sistemas;
        
        sistemas.estudiantes.add(est1);
        sistemas.estudiantes.add(est2);
        
        System.out.println("Estudiantes en Sistemas: " + sistemas.contarEstudiantes());
        
        Estudiante encontrado = u1.buscarEstudiante("MAT001");
        if (encontrado != null) {
            System.out.println("Encontrado: " + encontrado.nombre);
        }
        
        u1.listarEstudiantesFacultad("Ingeniería");
        
        Facultad mayor = u1.facultadConMasEstudiantes();
        System.out.println("Facultad con más estudiantes: " + mayor.nombre);
    }
}