package com.cd.bot.orchestrator.trigger;

import org.springframework.scheduling.Trigger;
import org.springframework.scheduling.TriggerContext;

import java.util.Date;

/**
 * Created by Cory on 5/29/2017.
 */
public class SellTrigger implements Trigger {
    @Override
    public Date nextExecutionTime(TriggerContext triggerContext) {
        return null;
    }
}
