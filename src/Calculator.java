public class Calculator {
    public Calculator(){
    }

    public double roundedToHundredth(double toRound){
        return Math.round(toRound*100)/100.0;
    }//round method

    public double add(double a, double b){
        return roundedToHundredth(a+b);
    }

    public double subtract(double a, double b){
        return roundedToHundredth(a-b);
    }

    public double multiply(double a, double b){
        return roundedToHundredth(a*b);
    }

    public double divide(double a, double b){
        return roundedToHundredth(a/b);
    }

    public double mod(double a, double b){
        return roundedToHundredth(a%b);
    }

    public double exponent(double a, double power){
        return roundedToHundredth(Math.pow(a, power));
    }
}
