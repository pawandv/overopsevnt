package com.overops.examples.service;

import org.springframework.stereotype.Service;

@Service
public class LoggedErrorService extends AbstractEventService {


    @Override
    void fireEvent(boolean generateEvent) {

        if (!generateEvent) {
            return;
        }

        /*

            Error Scenario:

            OverOps captures detailed snapshots when calls to log.error are made.

        */


        log.error("log.error() called!");
    }
}
