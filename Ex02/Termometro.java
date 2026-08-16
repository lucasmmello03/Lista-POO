package Ex02;

public class Termometro {

    private double temperatura = 0;

    public void aumentar(double delta) {

        if(delta <= 0) {
            return;
        }
      
          
        temperatura += delta;

    }

    public void diminuir(double delta) {

        if (delta <= 0) {
            return;    
        }

        temperatura -= delta;
    }

    public double emCelsius() {

        return temperatura;
    }


    public double emFahrenheit() {

        double fahreinheit = (temperatura * 9 / 5) + 32;

        return fahreinheit;
    }


}