import java.util.StringTokenizer;
//STRING TOKENIZER
public class StringTokenizerDemo {

	public static void main(String[] args) {
		String s = "Hola,que,tal,buenas,tardes,adios,bye,lol";
		//Constructor can receive one parameter and separate string by spaces StringTokenizer(s)
		//Or constructor can receive two parameters and separate string by second parameter StringTokenizer(s,",")
		//It can also receive three parameters to return the delimiter too StringTokenizer(s,",",true)
		StringTokenizer st = new StringTokenizer(s,",",true);
		
		while(st.hasMoreTokens()){
			System.out.print(st.nextToken());
		}
	}

}
