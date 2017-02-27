import java.util.ArrayList;

public class Driver {

	public static void main(String[] args) {
		String[] intToString = {"A","B","C","D","E","F","G"};
		//String[] intToString = {"C","Cm","C7","Cmaj7","C7sus4","C6","Cm6","C9","D","Dm","Dsus2","Dsus4","Em","Em7","Em6","Fm","F","Faug","F#9","F#m9","G","G7","Gm7","Gmaj7","Gsus2","G6","Gm6","Gdim","A","Am","A7","Am7","Amaj7","Asus4","A7sus4","Am6","A9","Am9","A#","A#dim"};
		
		Transformer test = new Transformer(intToString.length);
		System.out.println(test);
		ArrayList<Integer> testIn = new ArrayList<Integer>();
		testIn.add(1);
		testIn.add(2);
		System.out.println(testIn);
		for(int j = 0; j < 2; j ++)
		{
			
			testIn = test.transform(testIn);
			System.out.println(testIn);
		}
		
		for(int k = 0; k < testIn.size(); k++)
		{
			System.out.print(intToString[testIn.get(k)]);
			System.out.print(" ");
		}

	}

}
