import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Main {

    static void saveInsurance(Insurance insurance) throws IOException {
        PrintWriter output = new PrintWriter(new FileWriter("insurance.txt", true), true);
        output.println(insurance.toString());

        // will not compile
        // output.println(insurance.getCarAge())
        if (insurance.getClass().toString().equals("class AutoInsurance"))
            output.println(">>>Car age: " + ((AutoInsurance) insurance).getCarAge());

        output.close();
    }

    public static void main(String args[]) {
        try {
            AutoInsurance i1 = new AutoInsurance("John Doe", 30, 15000, 2);
            System.out.println(i1.toString());
            LifeInsurance i2 = new LifeInsurance("John Doe", 30, 1000000);
            System.out.println(i2.toString());

            saveInsurance(i1);
            saveInsurance(i2);
        } catch (IOException ioe) {
            System.out.println("IOException");
        }
    }
}
