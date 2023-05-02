package Week10;

import java.io.IOException;

class Organ {
    public void operate() throws IOException {
        throw new RuntimeException("Not supported");
    }
}

class Heart extends Organ {
    public void operate() throws Exception {
        System.out.print("beat");
    }

    public static void main(String... c) throws Exception {
        try {
            new Heart().operate();
        } finally {
            System.out.print("!");
        }
    }
}