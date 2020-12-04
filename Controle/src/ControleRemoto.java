import javax.swing.JOptionPane;

/*@Author DIEGO LINS;
*/
public class ControleRemoto {

	static String ligada;
	static String strCanal;
	static String strVolume;
	static int intCanal;
	static int intVolume;
	static String strAumentarCanal;
	static String strAumentarVolume;

	public static void main(String[] args) {

		ligada = JOptionPane.showInputDialog("Deseja ligar a televisão(sim/não)?");
		if (ligada.equalsIgnoreCase("Sim")) {

			Televisao TV = new Televisao();
			TV.setLigada(true);

			strCanal = JOptionPane.showInputDialog("Digite o canal:");
			strVolume = JOptionPane.showInputDialog("Digite o Volume:");

			intCanal = Integer.parseInt(strCanal);
			intVolume = Integer.parseInt(strVolume);

			TV.setCanal(intCanal);
			TV.setVolume(intVolume);

			intCanal = TV.getCanal();
			intVolume = TV.getVolume();

			JOptionPane.showMessageDialog(null, "O canal : " + intCanal);
			JOptionPane.showMessageDialog(null, "O Volume : " + intVolume);

			strAumentarCanal = JOptionPane.showInputDialog("Deseja aumentar o canal(sim/não)?");
			if (strAumentarCanal.equalsIgnoreCase("sim")) {
				TV.setAumentarCanal();
			} else {
				TV.setDiminuirCanal();
			}

			strAumentarVolume = JOptionPane.showInputDialog("Deseja aumentar o volume(sim/não)?");
			if (strAumentarVolume.equalsIgnoreCase("sim")) {
				TV.setAumentarVolume();
			} else {
				TV.setDiminuirVolume();
			}

			intCanal = TV.getCanal();
			intVolume = TV.getVolume();

			JOptionPane.showMessageDialog(null, "O canal : " + intCanal);
			JOptionPane.showMessageDialog(null, "O Volume : " + intVolume);

		}

	}
}
