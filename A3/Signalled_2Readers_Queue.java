package concurrent_assignment2.A3;

import concurrent_assignment2.A_intro.Queue;

/**
 * Use the synchronized keyword and signals.
 * 
 * You cannot decide whose's turn it is based on 
 * a 2 states variables, so know use a variable which
 * allows for more values (you need 3 states, that is, 3 turns).
 *
 */
 
class Signalled_2Readers_Queue implements Queue{
	int n=0;
	
	@Override
	public void read() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void write(int x) {
		// TODO Auto-generated method stub
		
	}
	
	
}


