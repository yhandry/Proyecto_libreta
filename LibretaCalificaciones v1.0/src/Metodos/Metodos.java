/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Metodos;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;
import org.jdom2.output.Format;
import org.jdom2.output.XMLOutputter;

public class Metodos {

    String estudiante;
    String cedula;
    String modalidad;
    String nivel;
    String periodo;
    String titulacion;
    String nombreMa;
    String bim1;
    String bim2;
    String total;
    String sup1;
    String sup2;
    String nFinal;
    String acreditacion;
    String asis1;
    String asis2;
    String nFinalAsistencia;
    String acreditacionAsistencia;
    String promocion;

    public void crearXmlComponente(String cedula, String nombre, String bim1,
            String bim2, String total, String sup1, String sup2, String nFinal,
            String acreditacion, String asis1, String asis2, String aFinal,
            String acreditacionA, String promocion) {
        this.cedula = cedula;
        this.nombreMa = nombre;
        this.bim1 = bim1;
        this.bim2 = bim2;
        this.total = total;
        this.sup1 = sup1;
        this.sup2 = sup2;
        this.nFinal = nFinal;
        this.acreditacion = acreditacion;
        this.asis1 = asis1;
        this.asis2 = asis2;
        this.nFinalAsistencia = aFinal;
        this.acreditacionAsistencia = acreditacionA;
        this.promocion = promocion;


        //Creamos un elemento root
        Element root = new Element("Libreta");
//		Element root = new Element("javahispano");
        //Creamos un hijo para el root
        Element materia = new Element("Materia");
        Element identificacion = new Element("Identificacion").setText(this.cedula);
        Element nombreMateria = new Element("Nombre").setText(this.nombreMa);
        Element bime1 = new Element("Bimestre1").setText(this.bim1);
        Element bime2 = new Element("Bimestre2").setText(this.bim2);
        Element totalB = new Element("TotalBimestre").setText(this.total);
        Element suple1 = new Element("Supletorio1").setText(this.sup1);
        Element suple2 = new Element("Supletorio2").setText(this.sup2);
        Element finalSuple = new Element("TotalSupletorio").setText(this.nFinal);
        Element acreditacionNotas = new Element("AcreditacionNotas").setText(this.acreditacion);
        Element asist1 = new Element("Asistencia1").setText(this.asis1);
        Element asist2 = new Element("Asistencia2").setText(this.asis2);
        Element finalAsist = new Element("TotalAsistencia").setText(this.nFinalAsistencia);
        Element acreditacionAsist = new Element("AcreditacionAsistencia").setText(this.acreditacionAsistencia);
        Element promocionF = new Element("Promocion").setText(this.promocion);
        materia.addContent(identificacion);
        materia.addContent(nombreMateria);
        materia.addContent(bime1);
        materia.addContent(bime2);
        materia.addContent(totalB);
        materia.addContent(suple1);
        materia.addContent(suple2);
        materia.addContent(finalSuple);
        materia.addContent(acreditacionNotas);
        materia.addContent(asist1);
        materia.addContent(asist2);
        materia.addContent(finalAsist);
        materia.addContent(acreditacionAsist);
        materia.addContent(promocionF);
        root.addContent(materia);
        Document doc = new Document(root);
        try {
            XMLOutputter out = new XMLOutputter(Format.getPrettyFormat());
            FileOutputStream file = new FileOutputStream("ComponenteEducativo.xml");
            out.output(doc, file);
            file.flush();
            file.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void agregarNodoComponente(String cedula, String nombre, String bim1,
            String bim2, String total, String sup1, String sup2, String nFinal,
            String acreditacion, String asis1, String asis2, String aFinal,
            String acreditacionA, String promocion) {
        this.cedula = cedula;
        this.nombreMa = nombre;
        this.bim1 = bim1;
        this.bim2 = bim2;
        this.total = total;
        this.sup1 = sup1;
        this.sup2 = sup2;
        this.nFinal = nFinal;
        this.acreditacion = acreditacion;
        this.asis1 = asis1;
        this.asis2 = asis2;
        this.nFinalAsistencia = aFinal;
        this.acreditacionAsistencia = acreditacionA;
        this.promocion = promocion;

        //Creamos un hijo para el root
        Element materia = new Element("Materia");
        Element identificacion = new Element("Identificacion").setText(this.cedula);
        Element nombreMateria = new Element("Nombre").setText(this.nombreMa);
        Element bime1 = new Element("Bimestre1").setText(this.bim1);
        Element bime2 = new Element("Bimestre2").setText(this.bim2);
        Element totalB = new Element("TotalBimestre").setText(this.total);
        Element suple1 = new Element("Supletorio1").setText(this.sup1);
        Element suple2 = new Element("Supletorio2").setText(this.sup2);
        Element finalSuple = new Element("TotalSupletorio").setText(this.nFinal);
        Element acreditacionNotas = new Element("AcreditacionNotas").setText(this.acreditacion);
        Element asist1 = new Element("Asistencia1").setText(this.asis1);
        Element asist2 = new Element("Asistencia2").setText(this.asis2);
        Element finalAsist = new Element("TotalAsistencia").setText(this.nFinalAsistencia);
        Element acreditacionAsist = new Element("AcreditacionAsistencia").setText(this.acreditacionAsistencia);
        Element promocionF = new Element("Promocion").setText(this.promocion);
        materia.addContent(identificacion);
        materia.addContent(nombreMateria);
        materia.addContent(bime1);
        materia.addContent(bime2);
        materia.addContent(totalB);
        materia.addContent(suple1);
        materia.addContent(suple2);
        materia.addContent(finalSuple);
        materia.addContent(acreditacionNotas);
        materia.addContent(asist1);
        materia.addContent(asist2);
        materia.addContent(finalAsist);
        materia.addContent(acreditacionAsist);
        materia.addContent(promocionF);
        SAXBuilder builder = new SAXBuilder();
        // Construimos el arbol DOM a partir del fichero xml
        Document doc = null;
        try {
            doc = builder.build(new FileInputStream("ComponenteEducativo.xml"));
        } catch (JDOMException ex) {
            Logger.getLogger(Metodos.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Metodos.class.getName()).log(Level.SEVERE, null, ex);
        }
        Element root = doc.getRootElement();
        root.addContent(materia);
        try {
            XMLOutputter out = new XMLOutputter(Format.getPrettyFormat());
            FileOutputStream file = new FileOutputStream("ComponenteEducativo.xml");
            out.output(doc, file);
            file.flush();
            file.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void crearXmlEstudiante(String nombre, String identificacion, String modalidad, String nivel, String periodo, String titulacion) {
        this.estudiante = nombre;
        this.cedula = identificacion;
        this.modalidad = modalidad;
        this.nivel = nivel;
        this.periodo = periodo;
        this.titulacion = titulacion;

        //Creamos un elemento root
        Element root = new Element("Libreta");
//		Element root = new Element("javahispano");
        //Creamos un hijo para el root
        Element estudianteE = new Element("Estudiante");
        Element nombreEstu = new Element("Nombre").setText(this.estudiante);
        Element cedulaE = new Element("Cedula").setText(this.cedula);
        Element modalidadE = new Element("Modalidad").setText(this.modalidad);
        Element nivelA = new Element("Nivel").setText(this.nivel);
        Element periodoA = new Element("Periodo").setText(this.periodo);
        Element titulacionE = new Element("Titulacion").setText(this.titulacion);
        estudianteE.addContent(nombreEstu);
        estudianteE.addContent(cedulaE);
        estudianteE.addContent(modalidadE);
        estudianteE.addContent(nivelA);
        estudianteE.addContent(periodoA);
        estudianteE.addContent(titulacionE);
        root.addContent(estudianteE);
        Document doc = new Document(root);
        try {
            XMLOutputter out = new XMLOutputter(Format.getPrettyFormat());
            FileOutputStream file = new FileOutputStream("Estudiante.xml");
            out.output(doc, file);
            file.flush();
            file.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void agregarNodoEstudiante(String nombre, String identificacion, String modalidad, String nivel, String periodo, String titulacion) {
        this.estudiante = nombre;
        this.cedula = identificacion;
        this.modalidad = modalidad;
        this.nivel = nivel;
        this.periodo = periodo;
        this.titulacion = titulacion;

        //Creamos un hijo para el root
        Element estudianteE = new Element("Estudiante");
        Element nombreEstu = new Element("Nombre").setText(this.estudiante);
        Element cedulaE = new Element("Cedula").setText(this.cedula);
        Element modalidadE = new Element("Modalidad").setText(this.modalidad);
        Element nivelA = new Element("Nivel").setText(this.nivel);
        Element periodoA = new Element("Periodo").setText(this.periodo);
        Element titulacionE = new Element("Titulacion").setText(this.titulacion);
        estudianteE.addContent(nombreEstu);
        estudianteE.addContent(cedulaE);
        estudianteE.addContent(modalidadE);
        estudianteE.addContent(nivelA);
        estudianteE.addContent(periodoA);
        estudianteE.addContent(titulacionE);
        // Creamos el builder basado en SAX
        SAXBuilder builder = new SAXBuilder();
        // Construimos el arbol DOM a partir del fichero xml
        Document doc = null;
        try {
            doc = builder.build(new FileInputStream("Estudiante.xml"));
        } catch (JDOMException ex) {
            Logger.getLogger(Metodos.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Metodos.class.getName()).log(Level.SEVERE, null, ex);
        }
        Element root = doc.getRootElement();
        root.addContent(estudianteE);
        try {
            XMLOutputter out = new XMLOutputter(Format.getPrettyFormat());
            FileOutputStream file = new FileOutputStream("Estudiante.xml");
            out.output(doc, file);
            file.flush();
            file.close();
//			out.output(doc,System.out);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
