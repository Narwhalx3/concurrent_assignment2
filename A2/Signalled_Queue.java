package concurrent_assignment2.A2;

import concurrent_assignment2.A_intro.Queue;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Use the synchronized keyword and signals so that
 * you do not need to busy wait.
 * But of course you still need your variable to know
 * whose's turn it is.
 *
 */
 
class Signalled_Queue implements Queue{
	int n=0;
        private boolean reader_working = false;
        
	@Override
	synchronized public void read() {
		if (!reader_working){
                    try {
                        wait();
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Signalled_Queue.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                System.out.println(n);
                reader_working = false;
                notify();		
	}

	@Override
	synchronized public void write(int x) {
		if(reader_working){
                    try {
                        wait();
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Signalled_Queue.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                n=x;
                System.out.println(n);
                reader_working=true;
                notify();
        }

	@Override
	public void read(int ID) {
		// no need to implement this
		
	}
	
	
}

