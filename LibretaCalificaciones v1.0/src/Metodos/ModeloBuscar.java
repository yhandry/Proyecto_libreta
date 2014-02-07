/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Metodos;

/**
 *
 * @author 
 */

import java.awt.Component;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Vector;
import javax.swing.table.AbstractTableModel;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;

public class ModeloBuscar extends AbstractTableModel {

    String[] titulos = {"COMPONENTE \n EDUCATIVO", "BIM1", "BIM2", "TOTAL", "SUP1",
        "SUP2", "FINAL", "ACREDITACION", "ASIS1", "ASIS2", "FINAL", "ACREDITACION", "PROMOCION"};
    String datoR;
    private List<Element> datosL;
    private Vector<Element> datosV;
    private Metodos operacion = new Metodos();
    private Component frame;

    public ModeloBuscar() {
        datosV = new Vector<Element>();
    }

    public ModeloBuscar(String dato) {
        datoR = dato;
        datosV = new Vector();
        datosL = recuperarDatos(dato);
        for (Object materia : datosL) {
            getDatosV().add(materia);
        }
    }

    public List recuperarDatos(String dato) {
        List<Element> list = null;
        SAXBuilder builder = new SAXBuilder();
        File fichero1 = new File("ComponenteEducativo.xml");
        try {
            //Se crea el documento a traves del archivo
            Document document = (Document) builder.build(fichero1);

            //Se obtiene la raiz 'tables'
            Element rootNode = (Element) document.getRootElement();

            //Se obtiene la lista de hijos de la raiz 'tables'
            list = rootNode.getChildren("Materia");

        } catch (IOException io) {
            System.out.println(io.getMessage());
        } catch (JDOMException jdomex) {
            System.out.println(jdomex.getMessage());
        }
        return list;
    }

    public Object getValueAt(int rowIndex, int columnIndex) {
        Element campo = (Element) getDatosV().get(rowIndex);
        String cedula = campo.getChildTextTrim("Identificacion");
        if (cedula.equals(datoR)) {
            if (columnIndex == 0) {
                return campo.getChildTextTrim("Nombre");
            }
            if (columnIndex == 1) {
                return campo.getChildTextTrim("Bimestre1");
            }
            if (columnIndex == 2) {
                return campo.getChildTextTrim("Bimestre2");
            }
            if (columnIndex == 3) {
                return campo.getChildTextTrim("TotalBimestre");
            }
            if (columnIndex == 4) {
                return campo.getChildTextTrim("Supletorio1");
            }
            if (columnIndex == 5) {
                return campo.getChildTextTrim("Supletorio2");
            }
            if (columnIndex == 6) {
                return campo.getChildTextTrim("TotalSupletorio");
            }
            if (columnIndex == 7) {
                return campo.getChildTextTrim("AcreditacionNotas");
            }
            if (columnIndex == 8) {
                return campo.getChildTextTrim("Asistencia1");
            }
            if (columnIndex == 9) {
                return campo.getChildTextTrim("Asistencia2");
            }
            if (columnIndex == 10) {
                return campo.getChildTextTrim("TotalAsistencia");
            }
            if (columnIndex == 11) {
                return campo.getChildTextTrim("AcreditacionAsistencia");
            }
            if (columnIndex == 12) {
                return campo.getChildTextTrim("Promocion");
            }
        }
        return campo;
    }

    public int getRowCount() {
        return getDatosV().size();
    }

    public int getColumnCount() {
        return titulos.length;
    }

    public Object getObject(Integer index) {
        return datosV.get(index);
    }

    public String getColumnName(int column) {
        return titulos[column];
    }

    /**
     * @return the datosL
     */
    public List getDatosL() {
        return datosL;
    }

    /**
     * @param datosL the datosL to set
     */
    public void setDatosL(List datosL) {
        this.datosL = datosL;
    }

    /**
     * @return the datosV
     */
    public Vector getDatosV() {
        return datosV;
    }

    /**
     * @param datosV the datosV to set
     */
    public void setDatosV(Vector datosV) {
        this.datosV = datosV;
    }
}
