package com.company.dip.after;

import com.company.dip.before.TextLogger;

public class DIPClient {

    public void execute(ILogger logger) {
        logger.log();
    }
}
