public class SingltonTest {

	public static void main(String[] args){

	Renban renbanA = Renban.getInstance();
	Renban renbanB = Renban.getInstance();

	System.out.println( (String.format("%04d", renbanA.getNumber() )));
	System.out.println( (String.format("%04d", renbanB.getNumber() )));
	System.out.println( (String.format("%04d", renbanB.getNumber() )));
	System.out.println( (String.format("%04d", renbanA.getNumber() )));
	System.out.println( (String.format("%04d", renbanB.getNumber() )));
	}
}

class Renban{
    private static Renban renban = new Renban();
    public static int i;

    private Renban() {
        i=0;
    }

    public static Renban getInstance() {
        return renban;
    }

    public static int getNumber(){
        i++;
		return i;
	}
                
}