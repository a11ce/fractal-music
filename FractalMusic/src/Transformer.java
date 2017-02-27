import java.util.*;

public class Transformer {

	List<Map> maps;

	Transformer(int size)
	{
		maps = new ArrayList<Map>();
		for(int i = 0; i < size; i ++)
		{
			maps.add(new Map(size));
		}
	}
	public String toString()
	{
		String output = "";
		for(int i = 0; i < maps.size(); i++)
		{
			output += i + " ";
			output += maps.get(i).toString();
			output += "\n";
		}
		return output;
	}
	public ArrayList<Integer> transform(ArrayList<Integer> input)
	{
		//System.out.println("Input size: " + input.size());
		ArrayList<Integer> output = new ArrayList<Integer>();
		for(Integer i : input)
		{
		//	System.out.println("I: " + i);
			Map w = maps.get(i);
		//	System.out.println(w);
		//	System.out.println();
			for(int j = 0; 
					j < w.getLength();
					j++)
			{
			//	System.out.println("J: " + j);
				int toBeAdded = w.getAt(j);
				output.add(toBeAdded);
			}
		}
//		for(int k = 0; k < output.size(); k++)
//		{
//			output.set(k, element)
//		}
		return output;
	}

}
