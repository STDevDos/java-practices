package mathbook;

public class AppMathBook {

    public static void main(String[] args) {
        System.out.println("001: " + checkMayorMenorIgual(2d/3d,1d/4d));
        System.out.println("002: " + checkMayorMenorIgual(3d/5d,7d/8d));
        System.out.println("003: " + checkMayorMenorIgual(-1d/6d,-1d/2d));
        System.out.println("004: " + checkMayorMenorIgual(7d/9d,21d/27d));
        System.out.println("005: " + checkMayorMenorIgual(11d/4d,12d/5d));
        System.out.println("006: " + checkMayorMenorIgual(6d/4d,18d/12d));

        System.out.println("007: " + checkMayorMenorIgual(-7d/7d,0d));
        System.out.println("008: " + checkMayorMenorIgual(-5d/10d,13d/26d));
        System.out.println("009: " + checkMayorMenorIgual(5d/2d,1d));
        System.out.println("010: " + checkMayorMenorIgual(17d/6d,3d));
        System.out.println("011: " + checkMayorMenorIgual(-3d,-39/13d));
        System.out.println("012: " + checkMayorMenorIgual(4d/3d,4d/9d));

    }

    private static String checkMayorMenorIgual(double a, double b) {
        if(a < b){
            return "a: "+a+" ((<)) b: "+b;
        }else if(a == b){
            return "a: "+a+" ((=)) b: "+b;
        } else if(a > b){
            return "a: "+a+" ((>)) b: "+b;
        } else {
            return "ERROR";
        }
    }

}