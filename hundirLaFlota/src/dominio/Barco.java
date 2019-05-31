package dominio;

public class Barco {

	//Atributos	
	public int[][] posiciones;
	private int[] valores;	
	private boolean hundido;
	private int tamanyo;
	
	
	// Barco de 2
	
	// posiciones  { {0,0}, 
	//       		 {0,1} 
	//				}
		
	// valores	   {  0   ,  3    }
	// hundido     false
	// tamanyo     2
	
	
	//Constructor	
	public Barco(int tamanyo) {
	
		this.tamanyo = tamanyo;
		this.hundido = false;
		
		this.valores = new int[tamanyo];
		
		this.posiciones = new int[tamanyo][2];
		
		if (tamanyo == 2) {
			//POSICION X				POSICION Y
			this.posiciones[0][0] = 0; this.posiciones[0][1] = 0;					
			this.posiciones[1][0] = 0; this.posiciones[1][1] = 1;
			
		}
		else {
			//POSICION X				POSICION Y
			this.posiciones[0][0] = 3; this.posiciones[0][1] = 3;					
			this.posiciones[1][0] = 3; this.posiciones[1][1] = 4;
			this.posiciones[2][0] = 3; this.posiciones[2][1] = 5;
						
		}
				
	}


	public int[][] getPosiciones() {
		
		return this.posiciones;
	}


	public void setPosiciones(int[][] posiciones) {
		this.posiciones = posiciones;
	}
	
}