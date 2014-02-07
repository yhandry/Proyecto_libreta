
package libreta;

/**
 *
 * 
 */
public class Materia {
    private String nombreMateria;
    private int nota;
    private Integer idAlumno;

    /**
     * 
     */
    public String getNombreMateria() {
        return nombreMateria;
    }

    /**
     * @param nombreMateria the nombreMateria to set
     */
    public void setNombreMateria(String nombreMateria) {
        this.nombreMateria = nombreMateria;
    }

    /**
     * @return the nota
     */
    public int getNota() {
        return nota;
    }

    /**
     * @param nota the nota to set
     */
    public void setNota(int nota) {
        this.nota = nota;
    }

    /**
     * @return the idAlumno
     */
    public Integer getIdAlumno() {
        return idAlumno;
    }

    /**
     * @param idAlumno the idAlumno to set
     */
    public void setIdAlumno(Integer idAlumno) {
        this.idAlumno = idAlumno;
    }

}
