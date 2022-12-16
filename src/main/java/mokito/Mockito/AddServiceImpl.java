package mokito.Mockito;

public class AddServiceImpl {

	@Override
	public int add(int num1, int num2) {
		System.out.println("**--- AddServiceImpl add executed ---**");
		return num1 + num2;
	}
	
}
