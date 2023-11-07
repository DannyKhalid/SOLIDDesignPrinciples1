package fileHandler;

public class FileHandlerApp {
    public static void main(String[] args) {
        try {
            FileReader reader = new FileReader("src/main/resources/sample.txt");
            FileWriter writer = new FileWriter("src/main/resources/sample.txt");
            ContentFormatter formatter = new ContentFormatter();


            String content = reader.readFile();
            System.out.println(content);

            String jsonContent = "{\"name\": \"John\", \"age\": 30}";
            String xmlContent = formatter.jsonToXml(jsonContent);

            writer.writeFile(xmlContent);
            System.out.println(xmlContent);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
