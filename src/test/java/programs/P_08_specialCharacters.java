package programs;

public class P_08_specialCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String r = "$123";
		
	//	r = r.replaceAll("[^a-zA-Z0-9]", " ");
		
		r=r.replace("$", "");
		
		System.out.println(r);

		
	}

}
