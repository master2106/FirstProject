import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by QH on 25.02.2016.
 */
public class MainClass {
    public static void main(String[] args) throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double a = Double.parseDouble(reader.readLine());
        double b = Double.parseDouble(reader.readLine());
        double c = Double.parseDouble(reader.readLine());


        double [] solves = SolveSquareEq.solve(a, b, c);
        for (double solution : solves)
        {
            System.out.println(solution);
        }
    }
}
