import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		
		List<String> items = new ArrayList<String>();
		items.add("Pen");
		items.add("Pencil");
		items.add("Box");
		
		for(String i:items){
			if(i.indexOf("P")==0){
				System.out.println(i.indexOf("P"));
				continue;
			}else{
				System.out.println(i+" ");
			}
		}
		
		int i = 23;
		int n = 25;
		do{
		     System.out.println(i + " ");
		}while (i < n);
		i = i-5;
}
}
