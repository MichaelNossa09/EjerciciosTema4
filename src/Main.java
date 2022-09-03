public class Main {

    public static void main(String[] args) {
        System.out.println("----------PrimerPunto----------------");
        int numeroIf = 0;
        if(numeroIf<0){
            System.out.println("Numero negativo");
        }else if(numeroIf == 0){
            System.out.println("Numero igual a 0");
        }else{
            System.out.println("Numero positivo");
        }
        System.out.println("----------SegundoPunto---------------");
        int numeroWhile=0;
        while (numeroWhile<3){
            numeroWhile++;
            System.out.println(numeroWhile);
        }
        System.out.println("----------TercerPunto---------------");
        do {
            numeroWhile++;
            System.out.println(numeroWhile);
        }while(numeroWhile<3);
        System.out.println("----------CuartoPunto---------------");
        for (int numeroFor=0; numeroFor<=3;numeroFor++){
            System.out.println(numeroFor);
        }
        System.out.println("----------QuintoPunto--------------");
        String estacion = "otoño";
        switch (estacion){
            case "verano":
                System.out.println("Estamos en Verano");
                break;
            case "otoño":
                System.out.println("Estamos en Otoño");
                break;
            case "invierno":
                System.out.println("Estamos en Invierno");
                break;
            case "primavera":
                System.out.println("Estamos en primavera");
                break;
            default:
                System.out.println("estacion erronea");
                break;
        }

    }
}
