import layout.Layout;
import javax.swing.JFrame;

@SuppressWarnings("serial")
class Main extends JFrame{

	public static void main(String[] args) {
		Thread thread = new Thread(new Layout());
		thread.start();
	}

}
