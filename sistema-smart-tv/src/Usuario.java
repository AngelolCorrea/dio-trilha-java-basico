public class Usuario {
        public static void main(String[] args) {
        SmartTv smartTv = new SmartTv();
            System.out.println("Tv Ligada? " + smartTv.ligada);
            System.out.println("Canal Atual: " + smartTv.canal);
            System.out.println("Volume Atual: " + smartTv.volume);

            System.out.println("----------------------------------------");
            smartTv.aumentarVolume();
            smartTv.ligar();
            System.out.println("Tv Ligada? " + smartTv.ligada);
            System.out.println("Volume Atual: " + smartTv.volume);

            System.out.println("----------------------------------------");

            smartTv.mudarCanal(13);
            System.out.println("Canal Atual: " + smartTv.canal);



    }
}
