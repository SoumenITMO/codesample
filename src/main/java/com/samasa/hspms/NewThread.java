package com.samasa.hspms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NewThread extends Thread {

    public void run() {
        long startTime = System.currentTimeMillis();
        int i = 0;
        while (i < 1 ) {
            System.out.println(this.getName() + ": New Thread is running..." + i++);
            try {
                //Wait for one sec so it doesn't print too fast
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            // code
        }
    }
}

