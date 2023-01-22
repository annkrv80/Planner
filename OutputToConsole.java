import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class OutputToConsole {
    public void outputToConcole() {
        try (BufferedReader csvReader = new BufferedReader(new FileReader("plan.cvs"))) {
            String row;
            while ((row = csvReader.readLine()) != null) {
                String[] data = row.split(",");
                for (int i = 0; i < data.length; i++) {
                    System.out.println(data[i]);
                }
            }
            csvReader.close();
        } catch (IOException e) {

            e.printStackTrace();
        }
    }

}
