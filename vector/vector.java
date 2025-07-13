/*
*
* @FlyingLv3601
*
*/


public class Vector{

    int[] coordinates;



    public int numberGenerator(){
        int number;
        number = (int) (Math.random() * 1001);
        return number;
    }



    public int vectorSum(int pos1, int pos2){
        return (int) Math.sqrt(math.poe(pos1, 2) + Math.pow(pos2, 2));
    }

    public int vectorLength(int posX, int posY){
        return (int) Math.sqrt(Math.pow(posX, 2) + Math.pow(posY, 2));
    }



    public static void main(String[] args){

        Vector VectorA = new Vector();
        Vector VectorB = new Vector();

        VectorA.coordinates = new int[2];
        VectorB.coordinates = new int[2];


        VectorA.coordinates[0] = VectorA.numberGenerator();
        VectorA.coordinates[1] = VectorA.numberGenerator();

        VectorB.coordinates[0] = VectorB.numberGenerator();
        VectorB.coordinates[1] = VectorB.numberGenerator();


        int posXa = VectorA.coordinates[0];
        int posYa = VectorA.coordinates[1];

        int posXb = VectorB.coordinates[0];
        int posYb = VectorB.coordinates[1];


        int vectorAlength = VectorA.vectorLength(posXa, posYa);
        int vectorBlength = VectorB.vectorLength(posXb, posYb);


        String positionA = "(" + posXa + ";" + posYa + ")"; 
        String positionB = "(" + posXb + ";" + posYb + ")"; 


        int vectorsSum = VectorA.vectorSum(posXa, posYb);
        System.out.println("-----------------------------");

        System.out.println("coordinates vector a: " + positionA + " vector a length: " + vectorAlength + "\n"+ "coordinates vector b: "  + positionB + "vector b length: " + vectorBlength + "\n" + "sum of two vectors: " + vectorsSum);
\

        System.out.println("-----------------------------");
    } 
}