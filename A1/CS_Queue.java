package concurrent_assignment2.A1;

import concurrent_assignment2.A_intro.Queue;

/**
 * Use condition synchronization by means of busy wait.
 *
 * What kind of variable do you need to implement busy wait synchronization?
 *
 * Set a meaningful name for such variable.
 *
 */
class CS_Queue implements Queue {

    int n = 0;
    volatile boolean reader_working = false;

    @Override
    public void read() {
        while (!reader_working) {
        }
        System.out.println(n);
        reader_working = false;

    }

    @Override
    public void write(int x) {
        while (reader_working) {
        }
        n = x;
        System.out.println(n);
        reader_working = true;

    }

    @Override
    public void read(int ID) {
        // no need to implement this

    }
}


