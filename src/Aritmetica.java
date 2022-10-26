public class Aritmetica implements ICalcMedia{
    public double CalcularMedia(double P1, double P2){
        return (P1+P2)/2;

    }
    public String Situacao(double Media){

        if(Media > 5){
            return "Aprovado";
        }
        else{
            return "Reprovado";
        }



    }
}
