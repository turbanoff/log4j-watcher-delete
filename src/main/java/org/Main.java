package org;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * @author Andrey Turbanov
 * @since 23.06.2021
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {
        Logger log = LogManager.getLogger(Main.class);
        for (long i = 0; i < System.currentTimeMillis(); i++) {
            Thread.sleep(2000);
            log.info("Sleep a bit");
        }
    }
}
