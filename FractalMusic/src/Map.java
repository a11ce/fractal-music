
import java.awt.List;
import java.util.ArrayList;

public class Map {
	 ArrayList<Integer> mapping;
	
	Map(int range)
	{
		mapping = new ArrayList<Integer>();
		int mapLength =   (int )(Math.random() * 5 + 1);
		for(int i = 0; i < mapLength; i++)
		{
			mapping.add((int)(Math.random() * range ));
		}
	}
	public String toString()
	{
		return(mapping.toString());
	}
	public int getLength()
	{
		return mapping.size();
	}
	public Integer getAt(int i)
	{
		return mapping.get(i);
	}
	
}
