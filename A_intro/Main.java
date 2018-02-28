package concurrent_assignment2.A_intro;



public class Main {

	public static void main(String args[]){
		UnprotectedQueue queue;
		
		queue=new UnprotectedQueue();
		
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
