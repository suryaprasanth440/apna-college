import java.util.ArrayList;
import java.util.List;

public class Helloworld {
	
	
	private static Helloworld instance;
	
	private Helloworld() {}
	
	public static synchronized Helloworld getInstance() {
		if(instance==null) {
			instance=new Helloworld();
		}
		return instance;
	}

    public static void main(String[] args) {
          }

   
}
