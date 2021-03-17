package core;
import core.hashmapscripts.*;

import java.io.*;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.print("¿Qué sabor quiere elegir? ");
        String flv=br.readLine();
        System.out.print("¿Qué semestre desea ver? ");
        String selTms=br.readLine();
        String[] tms={"Enero-Marzo", "Abril-Junio", "Julio-Septiembre", "Octubre-Diciembre"};
        String[] tsts={"Chocolate", "Vainilla", "Fresa", "Oreo"};
        
        for(int i=0; i<4; i++){
            HashMapInit.hmi(HashMaps.choco, HashMapVals.chocoVals[i], tms[i]);
        } for(int i=0; i<4; i++){
            HashMapInit.hmi(HashMaps.vanilla, HashMapVals.vanillaVals[i], tms[i]);
        } for(int i=0; i<4; i++){
            HashMapInit.hmi(HashMaps.swberry, HashMapVals.swberryVals[i], tms[i]);
        } for(int i=0; i<4; i++){
            HashMapInit.hmi(HashMaps.oreo, HashMapVals.oreoVals[i], tms[i]);
        }
        
        HashMaps.hmContainer.add(HashMaps.choco);
        HashMaps.hmContainer.add(HashMaps.vanilla);
        HashMaps.hmContainer.add(HashMaps.swberry);
        HashMaps.hmContainer.add(HashMaps.oreo);
        
        for(int i=0; i<4; i++){
            System.out.println("Trimestre: "+tms[i]);
            for(int j=0; j<4; j++){
                System.out.println("\tVentas "+tsts[j]+": "+HashMaps.hmContainer.get(i).get(tms[j]));
            }
        }
    }
}
