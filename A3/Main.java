package concurrent_assignment2.A3;

import concurrent_assignment2.A_intro.Reader;
import concurrent_assignment2.A_intro.Writer;



public class Main {

	public static void main(String args[]){
		Signalled_2Readers_Queue queue;
		
		queue=new Signalled_2Readers_Queue();
		
		new Writer(queue);
		new Reader(queue);
	

		
		//cola=new ColaSynchronized();
		//cola=new ColaBusyWait();
		//cola=new ColaConSeñales();
		//queue=new ColaConSeñalesVariosConsumidores();
		//cola=new ColaActivaVariosConsumidores();
		
		//new Consumidor(cola);
		
		
		
	}
}
