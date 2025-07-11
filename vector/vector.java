public class Vector{
    int length;
    int angle;
    int[] cords;



    public Vector(){
        cords = new int[2];
    }

    public Vector(int x, int y){
        cords = new int[2];
        cords[0] = x;
        cords[1] = y;
    }


	public static void main(String[] args){



		Vector vectorA = new Vector();
		Vector vectorB = new Vector(3,4);
        vectorB.length = (int) Math.sqrt(Math.pow(vectorB.cords[0], 2) + Math.pow(vectorB.cords[1], 2));

        System.out.println("vector coordinates: " + "(" + vectorB.cords[0] + "; " + vectorB.cords[1] + ")" );
        System.out.println("vector length: " + vectorB.length);


	} 
}