package com.cd.bot.model.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

/**
 * Created by Cory on 5/20/2017.
 */
@Entity
public class NpcTradeableCard extends TradeableCard {

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="bot_id")
    private NpcBot npcBot;

    public NpcBot getPlayerBot() {
        return npcBot;
    }

    public void setPlayerBot(NpcBot npcBot) {
        this.npcBot = npcBot;
    }
}