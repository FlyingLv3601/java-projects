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
        vectorB.length = 50;
        vectorB.angle = 100;

        System.out.println("(" + vectorB.cords[0] + " ; " + vectorB.cords[1] + ")" + " length:"  + vectorB.length + " vector angle: " + vectorB.angle);


	} 
}