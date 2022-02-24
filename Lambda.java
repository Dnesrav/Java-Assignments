import java.lang.annotation.*;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.jdt.annotation.NonNull;

interface expressable
{
	public String happy(String name);
}

public class Lambda {
//org.eclipse.jdt.annotation
	public static void main(String[] args) 
	{
		@NonNull String str;
		//@Open - open the connection
		//@Encrypted 
		//List<@NonNegative Integer> list=new ArrayList<>();
		expressable obj= (name) ->
		{
			return "hello "+name;
		};
		System.out.print(obj.happy("edubridge"));
		List<@NonNull String> list=new ArrayList<>();
	}

}
