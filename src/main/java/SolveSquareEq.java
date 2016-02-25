/**
 * Created by QH on 25.02.2016.
 */
public class SolveSquareEq {
    private static final double DELTA = 0.000000001;
    public static double[] solve(double a, double b, double c) {
        if (Math.abs(a) < DELTA) {
            if(Math.abs(b)<DELTA)
            {
                if(Math.abs(c)>= DELTA)
                    return new double[]{};
            }
            return new double[]{-c/b};
        }


        double D = Math.pow(b, 2)-4*a*c;
        //one decision
        if (Math.abs(D)<DELTA)
        {
            return new double[]{-b/(2*a)};
        }
        //two decisions
        if (D> 0)
        {
            return new double[]{
                    (-b + Math.sqrt(D))/(2*a),
                    (-b - Math.sqrt(D))/(2*a)
            };
        }
        //without decisions
        return new double[]{};

    }
}
