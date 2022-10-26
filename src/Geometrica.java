public class Geometrica implements ICalcMedia{
    public double CalcularMedia(double P1, double P2){
        return Math.sqrt(P1*P2);
    }
    public String Situacao(double Media){
        if(Media > 7){
            return "Aprovado";
        }
        else{
            return "Reprovado";
        }

    }
}
