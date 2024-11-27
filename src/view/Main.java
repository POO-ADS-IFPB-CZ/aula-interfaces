package view;

import model.Aviao;
import model.Passaro;
import model.Planavel;

public class Main {
    public static void main(String[] args) {

        Planavel planavel = new Passaro("Pica pau",
                "Verelho");
        Planavel planavel1 = new Aviao("Airbus",
                2020);

        planavel.voar();
        planavel1.voar();

    }
}