package tsn_java_domxml;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class Launch {

    public static void main(String[] args) {
        try {
            Document document = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(new File("students.xml"));
            document.getDocumentElement().normalize();
            NodeList nodeList = document.getElementsByTagName("Student");

            List<Students> langList = new ArrayList<>();
            for (int i = 0; i < nodeList.getLength(); i++) {
                langList.add(getNode(nodeList.item(i)));
            }

            for (Students lang : langList) {
                System.out.println(lang.toString());
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private static Students getNode(Node node) {
        Students student = new Students();
        if (node.getNodeType() == Node.ELEMENT_NODE) {
            student.setName(getValue("name", (Element) node));
            student.setAge(Integer.parseInt(getValue("age", (Element) node)));
        }
        return student;
    }

    private static String getValue(String tag, Element element) {
        return element.getElementsByTagName(tag).item(0).getChildNodes().item(0).getNodeValue();
    }

}
