package five.array;

public class MultiDimensionalArray {
    public static void main(String[] args) {
        /** [] -> prve uglaste zagrade sluze da oznace NIZ
         * [][] -> DRUGE uglaste zagrade sluze da nam oznace niz unutar niza. ->
         * (svaki clan u nizu je ustvari novi niz)
         */

        String[][] fullNames = new String[5][2];
        fullNames[0][0] = "Admir";
        fullNames[0][1] = "Rizvanovic";
        fullNames[1][0] = "Azemina";
        fullNames[1][1] = "Beganovic";
        fullNames[2][0] = "Davud";
        fullNames[2][1] = "Rizvanovic";
        fullNames[3][0] = "Asija";
        fullNames[3][1] = "Rizvanovic";
        fullNames[4][0] = "Halid";
        fullNames[4][1] = "Rizvanovic";

        System.out.println(fullNames);

        }

    }

