package com.cd.bot.model.domain.repository;

import com.cd.bot.model.domain.trade.NpcTradeableCard;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Cory on 5/15/2017.
 */
@Repository
public interface NpcTradeableCardRepository extends JpaRepository<NpcTradeableCard, Long> { }
