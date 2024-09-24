public class MathCalc {
    public static void main(String[] args) {
        double earthDiameter = 7600.0; 
        double sunDiameter = 865000.0; 

        
        double earthRadious = (earthDiameter/2);
        double sunRadious = (sunDiameter/2);

        
        double earthVolume = (4.0 / 3.0) * Math.PI * Math.pow(earthRadious, 3);
        double sunVolume = (4.0 / 3.0) * Math.PI * Math.pow(sunRadious, 3);

        double ratio = sunVolume / earthVolume;

        System.out.println("The volume of the Earth is " + earthVolume + " cubic miles.");
        System.out.println("The volume of the Sun is " + sunVolume + " cubic miles.");
        System.out.println("The ratio of the volume of the Sun to the volume of the Earth is " + ratio + ".");


        }
}

