/* 
 * @Author DIEGO LINS
 */

public class Televisao {

	private int canal, volume;
	private boolean ligada = false;

	public int getCanal() {
		return canal;
	}

	public void setCanal(int canal) {
		this.canal = canal;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	public boolean isLigada() {
		return ligada;
	}

	public void setLigada(boolean ligada) {
		this.ligada = ligada;
	}

	public void setAumentarVolume() {
		this.volume = this.volume + 1;
	}

	public void setDiminuirVolume() {
		this.volume = this.volume - 1;
	}

	public void setAumentarCanal() {
		this.canal = this.canal + 1;
	}

	public void setDiminuirCanal() {
		this.canal = this.canal - 1;
	}

}
