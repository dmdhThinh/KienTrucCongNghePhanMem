package Bai03;

public class TestAdapter {
    public static void main(String[] args) {
        XMLSystemOld xmlSystem = new XMLSystemOld();

        XMLToJsonAdapter adapter = new XMLToJsonAdapter(xmlSystem);

        adapter.saveXML("<name>Example</name><value>123</value>");

        adapter.saveJson("{\"name\": \"Example\", \"value\": \"123\"}");
    }
}
