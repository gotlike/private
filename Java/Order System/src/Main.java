import javax.swing.UIManager;

public class Main {
	public static void main(String[]arg) {
		 try {
             UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
         } catch (Exception e) {
         } 
		 
		LoginWindows.init();
	}
}
