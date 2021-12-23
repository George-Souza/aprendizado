public class Motor {
    boolean ligado = false;
    double injecaoMotor = 1;

    int giro(){
        if(!ligado) return 0;
        else{
            return (int) Math.round(injecaoMotor * 3000);
        }
    }

}
