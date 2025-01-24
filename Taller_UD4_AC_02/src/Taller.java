import java.util.Map;
import java.util.HashMap;
public class Taller {

Map<String, String> alumnos = new HashMap<String, String>();











private String matricula;
String añadirElemento;
String eliminarElemento;
String visualizarMatricula;
String visualizarCoche;
String visuañizarTaller;

public Taller(String matricula,String añadirElemto, String eliminarElemento, String visualizarMatricula, String visualizarCoche, String visualizarTaller) {
    this.matricula = matricula;
    this.añadirElemento =;
    this.eliminarElemento =;
    this.visualizarMatricula =;
    this.visualizarCoche =;
    this.visuañizarTaller =;
    
}

public String getMatricula() {
    return matricula;
}

public void setMatricula(String matricula) {
    this.matricula = matricula;
}

public String getAñadirElemento() {
    return añadirElemento;
}

public void setAñadirElemento(String añadirElemento) {
    this.añadirElemento = añadirElemento;
}

public String getEliminarElemento() {
    return eliminarElemento;
}

public void setEliminarElemento(String eliminarElemento) {
    this.eliminarElemento = eliminarElemento;
}

public String getVisualizarMatricula() {
    return visualizarMatricula;
}

public void setVisualizarMatricula(String visualizarMatricula) {
    this.visualizarMatricula = visualizarMatricula;
}

public String getVisualizarCoche() {
    return visualizarCoche;
}

public void setVisualizarCoche(String visualizarCoche) {
    this.visualizarCoche = visualizarCoche;
}

public String getVisuañizarTaller() {
    return visuañizarTaller;
}

public void setVisuañizarTaller(String visuañizarTaller) {
    this.visuañizarTaller = visuañizarTaller;
}


}
